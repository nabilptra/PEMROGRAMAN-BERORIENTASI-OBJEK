/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nabil2305380.tugas4;

import java.util.Scanner;

public class Tugas4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Soal Nomor 1
        /*System.out.println("Masukkan jumlah perulangan (N): ");
        int N = scanner.nextInt();
        
        for (int i = 1; i <= N; i++){
            System.out.println("Saya senang belajar bahasa java");
        }*/
        
        //Soal nomor 2
        /*System .out.print("Masukkan Batas Awal: ");
        int batasAwal = scanner.nextInt();
        
        System .out.print("Masukkan Batas Akhir: ");
        int batasAkhir = scanner.nextInt();
        
        int jumlah= 0;
        
        System.out.println("Bilangan genap: ");
        for (int i = batasAwal; i <= batasAkhir; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
                jumlah +=i;
            }
        }
        System.out.println("\njumlah deret bilang genap: "+ jumlah);*/
        
        //Soal Nomor 3
        System.out.print("Masukkan bilangan pertama (a): ");
        int a = scanner.nextInt();
        
        System.out.print("Masukkan bilangan kedua (b): ");
        int b = scanner.nextInt();
        int fpb = 1;
        int min = Math.min(a, b);
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                fpb = i;
            }
        }
         System.out.println("Faktor Persekutuan Terbesar (FPB) dari " + a + " dan " + b + " adalah: " + fpb);
    }
}
