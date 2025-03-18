/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nabil2305380.tugas6;

/**
 *
 * @author lenovo
 */
public class Tugas6 {

    public static void main(String[] args) {
        PersegiPanjang persegiPanjang1 = new PersegiPanjang(1, 1);
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(30, 40);
        PersegiPanjang persegiPanjang3 = new PersegiPanjang(25, 35);

        
        System.out.println("Luas persegiPanjang1: " + persegiPanjang1.getLuas());
        System.out.println("Keliling persegiPanjang1: " + persegiPanjang1.getKeliling());

        System.out.println("Luas persegiPanjang2: " + persegiPanjang2.getLuas());
        System.out.println("Keliling persegiPanjang2: " + persegiPanjang2.getKeliling());

        System.out.println("Luas persegiPanjang3: " + persegiPanjang3.getLuas());
        System.out.println("Keliling persegiPanjang3: " + persegiPanjang3.getKeliling());
    }
}
