/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nabil2305380.tugas8;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Tugas8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Masukkan nilai a: ");
        double a = input.nextDouble();
        System.out.print("Masukkan nilai b: ");
        double b = input.nextDouble();
        System.out.print("Masukkan nilai c: ");
        double c = input.nextDouble();
        System.out.print("Masukkan nilai d: ");
        double d = input.nextDouble();
        System.out.print("Masukkan nilai e: ");
        double e = input.nextDouble();
        System.out.print("Masukkan nilai f: ");
        double f = input.nextDouble();

        
        LinearEquation le = new LinearEquation(a, b, c, d, e, f);

        
        if (le.isSolvable()) {
            System.out.println("Solusi:");
            System.out.println("x = " + le.getX());
            System.out.println("y = " + le.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi");
        }
    }
}