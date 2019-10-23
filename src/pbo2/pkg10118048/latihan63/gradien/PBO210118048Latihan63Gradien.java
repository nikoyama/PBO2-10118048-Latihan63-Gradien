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
        
        Koordinat gl = new Koordinat(0, 0, 0, 0);
        gl.setX1(2);
        gl.setY1(10);
        gl.setX2(5);
        gl.setY2(7);
        System.out.println("Garis yang melalui titik (" + gl.getX1() + "," + gl.getY1() +
                ") dan (" + gl.getX2() + "," + gl.getY2() + ") memiliki gradien sebesar " + gl.hitungGradien());
        
        gl.setX1(5);
        gl.setY1(1);
        gl.setX2(3);
        gl.setY2(12);
        System.out.println("Garis yang melalui titik (" + gl.getX1() + "," + gl.getY1() +
                ") dan (" + gl.getX2() + "," + gl.getY2() + ") memiliki gradien sebesar " + gl.hitungGradien());
    }

}
