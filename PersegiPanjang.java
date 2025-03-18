/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nabil2305380.tugas6;

/**
 *
 * @author lenovo
 */
public class PersegiPanjang {
    private int panjang;
    private int lebar;

   
    public PersegiPanjang() {
        this.panjang = 0;
        this.lebar = 0;
    }


    public PersegiPanjang(int panjangBaru, int lebarBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
    }

    
    public int getLuas() {
        return panjang * lebar;
    }

    
    public int getKeliling() {
        return 2 * (panjang + lebar);
    }

    
    public void setPanjang(int panjangBaru) {
        this.panjang = panjangBaru;
    }

    
    public void setLebar(int lebarBaru) {
        this.lebar = lebarBaru;
    }
}
