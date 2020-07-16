package com.arraylists;

import java.util.ArrayList;

public class Replace {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("to");
        list.add("be");
        list.add("or");
        list.add("not");
        list.add("to");
        list.add("be");
    }

    public static void replace(ArrayList<String> list, String target, String replacement){
        int index = list.indexOf(target);
        if (index >= 0) {
            list.set(index, replacement);
        }
    }
}
