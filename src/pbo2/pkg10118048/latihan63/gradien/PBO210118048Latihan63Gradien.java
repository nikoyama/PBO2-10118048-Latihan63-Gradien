/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan63.gradien;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menghitung gradien garis lurus dari dua titik menggunakan
 * konsep interface
 */
public class PBO210118048Latihan63Gradien {

    public static void main(String[] args) {
        
        Koordinat koordinat = new Koordinat(2, 10, 5, 7);
        Koordinat koordinat2 = new Koordinat(5, 1, 3, 12);
        
        System.out.println("Garis yang melalui titik (" + koordinat.getX1() + "," + koordinat.getY1() +
                ") dan (" + koordinat.getX2() + "," + koordinat.getY2() + ")");
        koordinat.hitungGradien();
        System.out.println("Garis yang melalui titik (" + koordinat2.getX1() + "," + koordinat2.getY1() +
                ") dan (" + koordinat2.getX2() + "," + koordinat2.getY2() + ")");
        koordinat2.hitungGradien();
    }

}
