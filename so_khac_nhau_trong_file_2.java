package test;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author HP
 */
public class so_khac_nhau_trong_file_2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream dts = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] cnt = new int[1005];
        for(int i = 0; i < 100000; i++) cnt[dts.readInt()]++;
        for(int i = 0; i < 1005; i++){
            if(cnt[i] > 0)
                System.out.println(i + " " + cnt[i]);
        }
        dts.close();
    }
}
