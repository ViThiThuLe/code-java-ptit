package oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class liet_ke_tu_khac_nhau {

    static class WordSet {

        private String filename;

        public WordSet(String filename) {
            this.filename = filename;
        }

        @Override
        public String toString() {
            String res = "";
            try {
                Scanner sc = new Scanner(new File(filename));
                Set<String> s = new TreeSet<>();
                while (sc.hasNext()) {
                    s.add(sc.next().toLowerCase());
                }
                for (String i : s) {
                    res += i + "\n";
                }
            } catch (FileNotFoundException e) {

            }
            return res;
        }

    }

    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
