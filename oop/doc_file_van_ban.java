package oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class doc_file_van_ban {

public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) { // ktra xem sc có chứa dòng nào không
            String s = sc.nextLine(); // nếu có thì in ra
            System.out.println(s);
        }
    }
}
