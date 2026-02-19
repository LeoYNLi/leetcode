package org.example.app;

import java.util.HashMap;

public class Hard76 {
    public String minWindow(String s, String t) {
        int l = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int r = 0; r < s.length(); r++) {

        }
        return "";
    }
}
