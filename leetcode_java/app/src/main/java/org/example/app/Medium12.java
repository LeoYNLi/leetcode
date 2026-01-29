package org.example.app;

import java.util.HashMap;

public class Medium12 {
    public String intToRoman(int num) {
        StringBuffer res = new StringBuffer();
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "I");
        hm.put(5, "V");
        hm.put(10, "X");
        hm.put(50, "L");
        hm.put(100, "C");
        hm.put(500, "D");
        hm.put(1000, "M");
        Integer numClass = Integer.valueOf(num);
        String numsString = numClass.toString();
        int[] intArr = new int[numsString.length()];

        for (int i = 0; i < numsString.length(); i++) {
            String s = String.valueOf(numsString.charAt(i));
            intArr[i] = Integer.parseInt(s);
        }

        for (int i = 0; i < intArr.length; i++) {
            int real = intArr[i] * (int) Math.pow(10, intArr.length - 1 - i);
            if (i < 3) {
                int key = real / intArr[i];
                for (int j = 0; j < intArr[i]; j++) {
                    res.append(hm.get(key));
                }
            }
        }

        return res.toString();

    }

}
