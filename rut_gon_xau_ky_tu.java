/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author HP
 */
public class rut_gon_xau_ky_tu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        int i=0;
        String temp = "";
        while(i<s.length()){
            if(st.empty() || s.charAt(i)!=st.peek()){
                st.add(s.charAt(i));
            }
            else st.pop();
            i++;
        }
        if(st.empty())
            System.out.println("Empty String");
        else{
            while(!st.empty()){
                temp = st.peek() +temp;
                st.pop();
            }
            System.out.println(temp);
        }
    }
}
