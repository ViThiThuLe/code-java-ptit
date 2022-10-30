package oop;

import java.util.Scanner;

public class wordset {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

class WordSet {
    String s;

    WordSet(String s) {
        this.s = s; 
    }

    public String union(WordSet s2) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String intersection(WordSet s2) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}

