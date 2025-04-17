/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nabil2305380.uts;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class UTS {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //nomor 1
        
        /*System.out.print("Masukan tiga digit integer : ");
        int angka = sc.nextInt();

        int angkaAwal = angka;

       
        int balik = 0;
        while (angka != 0) {
            int digit = angka % 10;
            balik = balik * 10 + digit;
            angka = angka / 10;
        }

        if (angkaAwal == balik) {
            System.out.println(angkaAwal + " adalah palindrom");
        } else {
            System.out.println(angkaAwal + " bukan palindrom");
        }*/
        
        //nomor 2
        //Patern A
       
        /*for (int baris = 1; baris <= 6; baris++) {
            for (int angka = 1; angka <= baris; angka++) {
                System.out.print(angka + " ");
            }
            System.out.println();
        }*/
        
        //Patern B
        /*for (int baris = 6; baris >= 1; baris--) {
            for (int angka = 1; angka <= baris; angka++) {
                System.out.print(angka + " ");
            }
            System.out.println();
        }*/
        
        //Patern C
         /*for (int baris = 1; baris <= 6; baris++) {
            // Spasi dulu
            for (int s = 1; s <= 6 - baris; s++) {
                System.out.print("  ");
            }
            // Angka mundur
            for (int angka = baris; angka >= 1; angka--) {
                System.out.print(angka + " ");
            }
            System.out.println();
        }*/
         
        //Patern D
        /*for (int baris = 6; baris >= 1; baris--) {
            // Spasi dulu
            for (int s = 1; s <= 6 - baris; s++) {
                System.out.print("  ");
            }
            // Angka naik
            for (int angka = 1; angka <= baris; angka++) {
                System.out.print(angka + " ");
            }
            System.out.println();
        }*/
        
       //Nomor 3
        /*public static int reverse(int number) {
        int sisa, hasil = 0;

        while(number != 0) {
            sisa = number % 10;
            hasil = hasil * 10 + sisa;
            number = number / 10;
        }

        return hasil;
    }

    public static boolean isPalindrome(int number) {
        int balik = reverse(number);

            return balik == number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan bilangan bulat: ");
        angka = input.nextInt();

        if(isPalindrome(angka)) {
            System.out.println(angka + " adalah palindrom");
        } else {
            System.out.println(angka + " bukan palindrom");
        }*/
    }
}
