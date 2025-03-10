/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nabil2305380.tugas5;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Tugas5 {
    
    //nomor 1
   /* public static void cetakTeks(int N) {
        for (int i = 0; i < N; i++) {
            System.out.println("Saya senang belajar bahasa Java");
        }
    }

    public static void main(String[] args) {
        int N;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nilai N: ");
            N = scanner.nextInt();
        }

        cetakTeks(N);
    }
}*/

 //nomor2
    /* public static int hitungJumlahGenap(int batasAwal, int batasAkhir) {
        int jumlah = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) { 
                jumlah += i;
            }
        }
        return jumlah;
    }

    public static void main(String[] args) {
        int batasAwal;
        int batasAkhir;
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.print("Masukkan batas awal: ");
             batasAwal = scanner.nextInt();
             System.out.print("Masukkan batas akhir: ");
             batasAkhir = scanner.nextInt();
         }

        int hasil = hitungJumlahGenap(batasAwal, batasAkhir);
        System.out.println("Jumlah deret bilangan genap dari " + batasAwal + " hingga " + batasAkhir + " adalah: " + hasil);
    }
}*/
    
//nomor3
    public static int hitungPBB(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int a;
        int b;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan bilangan pertama (a): ");
            a = scanner.nextInt();
            System.out.print("Masukkan bilangan kedua (b): ");
            b = scanner.nextInt();
        }

        int hasilPBB = hitungPBB(a, b);
        System.out.println("PBB dari " + a + " dan " + b + " adalah: " + hasilPBB);
    }
}