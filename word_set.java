/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author HP
 */
public class word_set {
    static class WordSet{
        private String line;
        private String[] arr;

        public WordSet(String line) {
            this.line = line;
            line = line.toLowerCase();
            arr = line.split("\\s+");
        }
        public String union(WordSet other){
            Set<String> set = new TreeSet<>();
            for(int i=0;i<this.arr.length;i++){
                set.add(this.arr[i]);
            }
            for(int i=0;i<other.arr.length;i++){
                set.add(other.arr[i]);
            }
            String res = "";
            for(String i : set){
                res+= i + " ";
            }
            return res;
        }
        public String intersection(WordSet other){
            Map<String,Integer> map = new TreeMap<>();
            for(int i=0;i<this.arr.length;i++){
                map.put(this.arr[i], 1);
            }
            for(int i=0;i<other.arr.length;i++){
                if(map.containsKey(other.arr[i]))
                    map.replace(other.arr[i], 2);
            }
            String res="";
            for (Map.Entry<String,Integer> entry : map.entrySet()) {
                if(entry.getValue()==2)
                    res += entry.getKey() + " ";
            }
            return res;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
