package org.example.app.arrayOrString;

import java.util.HashMap;

public class Easy13 {
    public int romanToInt(String s) {

        int total = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        return total;
    }
}
