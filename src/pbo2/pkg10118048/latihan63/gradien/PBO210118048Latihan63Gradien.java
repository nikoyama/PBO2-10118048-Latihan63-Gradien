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
        
        Koordinat koordinat = new Koordinat(0, 0, 0, 0);
        koordinat.setX1(2);
        koordinat.setY1(10);
        koordinat.setX2(5);
        koordinat.setY2(7);
        System.out.println("Garis yang melalui titik (" + koordinat.getX1() + "," + koordinat.getY1() +
                ") dan (" + koordinat.getX2() + "," + koordinat.getY2() + ") memiliki gradien sebesar " + koordinat.hitungGradien());
        
        koordinat.setX1(5);
        koordinat.setY1(1);
        koordinat.setX2(3);
        koordinat.setY2(12);
        System.out.println("Garis yang melalui titik (" + koordinat.getX1() + "," + koordinat.getY1() +
                ") dan (" + koordinat.getX2() + "," + koordinat.getY2() + ") memiliki gradien sebesar " + koordinat.hitungGradien());
    }

}
