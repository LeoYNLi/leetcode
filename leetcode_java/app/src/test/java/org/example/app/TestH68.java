package org.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.example.app.arrayOrString.Hard68;
import org.junit.jupiter.api.Test;

public class TestH68 {
        @Test
        void case1() {
                String[] words = { "This", "is", "an", "example", "of", "text", "justification." };
                Hard68 inst = new Hard68();
                List<String> res = inst.fullJustify(words, 16);
                assertEquals(List.of("This    is    an",
                                "example  of text",
                                "justification.  "), res);
        }

        @Test
        void case2() {
                String[] words = { "What", "must", "be", "acknowledgment", "shall", "be" };
                Hard68 inst = new Hard68();
                List<String> res = inst.fullJustify(words, 16);
                assertEquals(List.of("What   must   be",
                                "acknowledgment  ",
                                "shall be        "), res);
        }

        @Test
        void case3() {
                String[] words = { "Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to",
                                "a",
                                "computer.", "Art", "is", "everything", "else", "we", "do" };
                Hard68 inst = new Hard68();
                List<String> res = inst.fullJustify(words, 20);
                assertEquals(List.of(
                                "Science  is  what we",
                                "understand      well",
                                "enough to explain to",
                                "a  computer.  Art is",
                                "everything  else  we",
                                "do                  "), res);
        }

        @Test
        void case4() {
                String[] words = { "Listen", "to", "many,", "speak", "to", "a", "few." };
                Hard68 inst = new Hard68();
                List<String> res = inst.fullJustify(words, 6);
                assertEquals(List.of(
                                "Listen",
                                "to    ",
                                "many, ",
                                "speak ",
                                "to   a",
                                "few.  "), res);
        }

        @Test
        void case5() {
                String[] words = { "ask", "not", "what", "your", "country", "can", "do", "for", "you", "ask", "what",
                                "you",
                                "can", "do", "for", "your", "country" };
                Hard68 inst = new Hard68();
                List<String> res = inst.fullJustify(words, 16);
                assertEquals(List.of(
                                "ask   not   what", "your country can", "do  for  you ask", "what  you can do",
                                "for your country"),
                                res);
        }

}