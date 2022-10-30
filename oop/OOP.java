/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop;

import java.util.Scanner;

/**
 *
 * @author 0869853661
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = 2 * ( a + b);
	int d = a * b;
	if( a <= 0 || b <= 0)
            System.out.println("0");
	else
            System.out.println(c + " " + d);
    }
    
}
