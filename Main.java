/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication51;

import java.util.Scanner;

/**
 *
 * @author abiyy
 */
public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Nama : Abiyyu Dwi Fawwazy");
        System.out.println("NIM  : 215150707111042");
        System.out.println();
        System.out.println("======= Data Pegawai Tetap =======\n");
        Pegawai ttp1 = new PegawaiTetap("Bayu", "350728490327424892342", 2000000.0);
        System.out.print(ttp1.toString());
        System.out.println();
        Pegawai ttp2 = new PegawaiTetap("Ilham", "350728490327424892345", 2500000.0);
        System.out.print(ttp2.toString());
        System.out.println();
        Pegawai ttp3 = new PegawaiTetap("Windah", "350728490327424892346", 3500000.0);
        System.out.print(ttp3.toString());
        System.out.println();

        System.out.println(); 
        System.out.println("======= Data Pegawai Harian =======");
        Pegawai hrn1 = new PegawaiHarian("Edo", "350728490327424892343", 8500.0, 40);
        System.out.print(hrn1.toString());
        System.out.println();
        Pegawai hrn2 = new PegawaiHarian("Bunga", "350728490327424892349", 9000.0, 36);
        System.out.print(hrn2.toString());
        System.out.println();
        Pegawai hrn3 = new PegawaiHarian("Dhilla", "350728490327424892348", 8000.0, 42);
        System.out.print(hrn3.toString());
        System.out.println();

        System.out.println();
        System.out.println("======= Data Sales =======");
        Pegawai sales1 = new Sales("Tika", "350728490327424892344", 50, 50000.0);
        System.out.print(sales1.toString());
        System.out.println();
        Pegawai sales2 = new Sales("Beliana", "350728490327424892340", 71, 34000.0);
        System.out.print(sales2.toString());
        System.out.println();
        Pegawai sales3 = new Sales("Rudang", "350728490327424892347", 46, 62000.0);
        System.out.print(sales3.toString());
        System.out.println();
    }
}
