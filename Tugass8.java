/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nabil2305380.tugass8;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */


class GeometricObject {
    private String color = "white";
    private boolean filled;

    public GeometricObject() {}

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Warna: " + color + ", Terisi: " + filled;
    }
}

class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this(1.0, 1.0, 1.0);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        double areaSquared = s * (s - side1) * (s - side2) * (s - side3);
        return areaSquared > 0 ? Math.sqrt(areaSquared) : 0; // menghindari error sqrt dari bilangan negatif
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Segitiga: sisi1 = " + side1 + " sisi2 = " + side2 + " sisi3 = " + side3;
    }
}

public class Tugass8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi1: ");
        double side1 = input.nextDouble();

        System.out.print("Masukkan sisi2: ");
        double side2 = input.nextDouble();

        System.out.print("Masukkan sisi3: ");
        double side3 = input.nextDouble();

        // Validasi apakah segitiga valid
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            System.out.println("Sisi-sisi tidak membentuk segitiga yang valid.");
            return;
        }

        input.nextLine(); // buang newline dari input sebelumnya

        System.out.print("Masukkan warna: ");
        String color = input.nextLine(); // agar bisa baca warna yang mengandung spasi

        System.out.print("Apakah segitiga terisi? (true/false): ");
        boolean filled = input.nextBoolean();

        Triangle segitiga = new Triangle(side1, side2, side3);
        segitiga.setColor(color);
        segitiga.setFilled(filled);

        System.out.println("\n" + segitiga.toString());
        System.out.println("Luas: " + segitiga.getArea());
        System.out.println("Keliling: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getColor());
        System.out.println("Terisi: " + segitiga.isFilled());
    }
}
