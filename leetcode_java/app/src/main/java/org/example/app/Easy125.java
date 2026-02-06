package org.example.app;

public class Easy125 {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            String lChar = String.valueOf(s.charAt(l)).toLowerCase();
            if (!lChar.matches("[a-zA-Z0-9]")) {
                l += 1;
                continue;
            }
            String rChar = String.valueOf(s.charAt(r)).toLowerCase();
            if (!rChar.matches("[a-zA-Z0-9]")) {
                r -= 1;
                continue;
            }

            if (!lChar.equals(rChar)) {
                return false;
            }
            l += 1;
            r -= 1;
        }

        return true;
    }
}
