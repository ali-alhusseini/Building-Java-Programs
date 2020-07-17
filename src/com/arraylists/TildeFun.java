package com.arraylists;

import java.util.ArrayList;

public class TildeFun {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("four");
        words.add("score");
        words.add("and");
        words.add("seven");
        words.add("years");
        words.add("ago");
        System.out.println("words = " + words);

        // insert one tilde in-front of each word
        for (int i = 0; i < words.size(); i += 2) {
            words.add(i, "~");
        }
        System.out.println("loop with tildes = " + words);

        // removing the tildes added in the previous loop
        for (int i = 0; i < words.size(); i++) {
            words.remove(i);
        }
        System.out.println("loop with tildes removed = " + words);
    }
}
