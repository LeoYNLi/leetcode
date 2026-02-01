package org.example.app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PickQuestion {

    private String relativeOrAbsoluteDir = "leetcode_java/app/src/main/java/org/example/app";

    public List<String> pickQuestion(int k) {
        List<String> files = this.findAllFilenamesUnderCwd(relativeOrAbsoluteDir);
        List<String> unique = new ArrayList<>(new LinkedHashSet<>(files));
        int n = unique.size();
        Random rnd = ThreadLocalRandom.current();
        Set<Integer> idx = new HashSet<>(5 * 2);
        while (idx.size() < k) {
            idx.add(rnd.nextInt(n));
        }

        List<String> out = new ArrayList<>(k);
        for (int i : idx) {
            out.add(unique.get(i));
            System.out.println(unique.get(i));
        }
        return out;
    }

    public List<String> findAllFilenamesUnderCwd(String targetPath) {
        Path root = Paths.get(relativeOrAbsoluteDir).toAbsolutePath().normalize();

        if (!Files.exists(root)) {
            throw new IllegalArgumentException("Path does not exist: " + root);
        }
        if (!Files.isDirectory(root)) {
            throw new IllegalArgumentException("Path is not a directory: " + root);
        }

        try (Stream<Path> stream = Files.walk(root)) {
            Set<String> excludedNames = Set.of("App.java", "PickQuestion.java");

            return stream
                    .filter(Files::isRegularFile)
                    .filter(p -> !excludedNames.contains(p.getFileName().toString()))
                    .map(p -> p.getFileName().toString())
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException("Failed to walk directory: " + root, e);
        }
    }
}
