package oop;

import java.util.Scanner;

public class sap_xep {

//    public static void sapxepdoichotructiep(int [] a, int n){
//        for(int i = 0; i < n - 1; i++){
//            System.out.print("Buoc " + (i + 1) + ": " );
//            for(int j = i + 1; j < n; j++)
//                if(a[j] < a[i]){
//                    int temp = a[j];
//                    a[j] = a[i];
//                    a[i] = temp;
//                }
//            for(int k = 0; k < n; k++)
//                System.out.print(a[k] + " ");
//            System.out.print("\n");
//        }
//    }
//    public static void sapxepchon(int[] a, int n) {
//        for (int i = 0; i < n - 1; i++) {
//            int min = a[i];
//            int vt = i;
//            System.out.print("Buoc " + (i + 1) + ": ");
//            for (int j = i + 1; j < n; j++) {
//                if (a[j] < min) {
//                    min = a[j];
//                    vt = j;
//                }
//            }
//
//            int temp = a[i];
//            a[i] = a[vt];
//            a[vt] = temp;
//
//            for (int k = 0; k < n; k++) {
//                System.out.print(a[k] + " ");
//            }
//            System.out.println("\n");
//        }
//    }
    public static void sapxepchen(int a[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (a[j] > a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print("Buoc " + i + ": ");
            for (int k = 0; k <= i; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println("\n");
        }
    }
//    public static void sapxepnoibot(int a[], int n) {
//        int check;
//        for (int i = 0; i < n - 1; i++) {
//            check = 0;
//            for (int j = 0; j < n - i - 1; j++) {
//                if (a[j] > a[j + 1]) {
//                    int temp = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = temp;
//                    check = 1;
//                }
//            }
//            if (check == 0) {
//                break;
//            }
//            System.out.print("Buoc " + (i + 1) + ": ");
//            for (int k = 0; k < n; k++) {
//                System.out.print(a[k] + " ");
//            }
//            System.out.println("\n");
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sapxepchen(a, n);
    }
}
