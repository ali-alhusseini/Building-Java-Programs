package com.arraylists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StopWords {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> stopWords = new ArrayList<>();
        stopWords.add("a");
        stopWords.add("be");
        stopWords.add("by");
        stopWords.add("how");
        stopWords.add("in");
        stopWords.add("is");
        stopWords.add("it");
        stopWords.add("of");
        stopWords.add("on");
        stopWords.add("or");
        stopWords.add("that");
        stopWords.add("the");
        stopWords.add("this");
        stopWords.add("to");
        stopWords.add("why");

        Scanner file = new Scanner(new File("speech.txt"));
        while (file.hasNext()) {
            String next = file.next();
            if (!stopWords.contains(next.toLowerCase())) {
                System.out.print(next + " ");
            }
        }

    }
}
