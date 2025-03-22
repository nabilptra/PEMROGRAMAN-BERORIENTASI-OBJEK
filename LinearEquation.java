/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nabil2305380.tugas8;

/**
 *
 * @author lenovo
 */
public class LinearEquation {
    
    private final double a, b, c, d, e, f;

    
    public LinearEquation() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
    }

    
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    
    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }
    public double getD() { return d; }
    public double getE() { return e; }
    public double getF() { return f; }

    
    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    
    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    
    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}

