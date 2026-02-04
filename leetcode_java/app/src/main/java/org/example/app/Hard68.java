package org.example.app;

import java.util.ArrayList;
import java.util.List;

public class Hard68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            int space = maxWidth;
            StringBuffer sb = new StringBuffer();
            while (space >= 0 & i < words.length) {
                if (words[i].length() + 1 <= space) {
                    if (sb.length() == 0) {
                        sb.append(words[i]);
                        space -= words[i].length();
                    } else {
                        sb.append(" " + words[i]);
                        space -= words[i].length() + 1;
                    }

                    i++;
                } else {
                    break;
                }
            }

            int expended = 0;
            while (space > 0) {
                if (i == words.length - 1) {
                    while (space > 0) {
                        sb.append(' ');
                        space -= 1;
                    }
                }
                for (int j = 0; j < sb.length() & space > 0; j++) {
                    if (sb.charAt(j) == ' ') {
                        sb.insert(j, ' ');
                        space -= 1;
                        expended += 1;
                        j += expended;
                    }
                }
                if (expended == 0) {
                    while (space > 0) {
                        sb.append(' ');
                        space -= 1;
                    }
                }
            }

            res.add(sb.toString());
        }
        return res;
    }
}
