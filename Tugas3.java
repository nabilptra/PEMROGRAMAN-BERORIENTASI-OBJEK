/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nabil2305380.tugas3;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Tugas3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //soal nomor 1
       /* System.out.print("Masukkan tiga angka: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        System.out.println("Apakah angka pertama ribuan? " + (num1 >= 1000 && num1 < 10000));
        System.out.println("Apakah angka kedua ribuan? " + (num2 >= 1000 && num2 < 10000));
        System.out.println("Apakah angka ketiga ribuan? " + (num3 >= 1000 && num3 < 10000));*/
       
       //soal nomor 2
       /*System.out.print("Masukkan angka pertama: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Masukkan angka ketiga: ");
        int num3 = scanner.nextInt();
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("Angka terbesar adalah: " + max);*/
       
       //nomor 3
       System.out.print("Masukkan jam masuk: ");
        int jamMasuk = scanner.nextInt();
        System.out.print("Masukkan jam keluar: ");
        int jamKeluar = scanner.nextInt();
        int lamaParkir = jamKeluar - jamMasuk; 
        int biaya;
        if (lamaParkir <= 2) {
            biaya = 1500;
            } else {
            biaya = 1500 + (lamaParkir - 2) * 1000; 
        } 
        System.out.println("Lama parkir: " + lamaParkir + " jam");
        System.out.println("Biaya parkir: Rp " + biaya);

        scanner.close(); 
        
        
        
        
    }
}
