/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.util.*;
import java.io.*;
/**
 *
 * @author Admin
 */
class WordSet{
    Set<String> s = new TreeSet<>();
    public WordSet(String file) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while(sc.hasNext()){
            s.add(sc.next().toLowerCase());
        }
    }
    @Override
    public String toString(){
        String x = "";
        for(String i : s){
            x+=i + "\n";
        }
        return x;
    }
}
public class LietKeTuKhacNhau {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
