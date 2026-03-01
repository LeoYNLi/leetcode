package org.example.app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class PickQuestion {

    private String relativeOrAbsoluteDir = "leetcode_java/app/src/main/java/org/example/app";

    public Map<String, List<String>> pickQuestion() {
        Path root = Paths.get(relativeOrAbsoluteDir).toAbsolutePath().normalize();

        if (!Files.exists(root) || !Files.isDirectory(root)) {
            throw new IllegalArgumentException("Invalid path: " + root);
        }

        Map<String, List<String>> result = new LinkedHashMap<>();

        try {
            List<Path> topics = Files.list(root)
                    .filter(Files::isDirectory)
                    .sorted()
                    .collect(Collectors.toList());

            for (Path topic : topics) {
                List<String> files = Files.list(topic)
                        .filter(Files::isRegularFile)
                        .filter(p -> p.toString().endsWith(".java"))
                        .map(p -> p.getFileName().toString())
                        .collect(Collectors.toList());

                if (files.isEmpty()) continue;

                int pickCount = pickCount(files.size());
                Collections.shuffle(files, ThreadLocalRandom.current());
                List<String> picked = new ArrayList<>(files.subList(0, Math.min(pickCount, files.size())));

                result.put(topic.getFileName().toString(), picked);
            }
        } catch (IOException e) {
            throw new RuntimeException("Failed to walk directory: " + root, e);
        }

        for (Map.Entry<String, List<String>> entry : result.entrySet()) {
            System.out.println("- " + entry.getKey());
            for (String file : entry.getValue()) {
                System.out.println("    - " + file);
            }
        }

        return result;
    }

    private int pickCount(int total) {
        if (total <= 1) return 1;
        if (total > 20) return 4;
        if (total >= 15) return 3;
        return 2;
    }
}
