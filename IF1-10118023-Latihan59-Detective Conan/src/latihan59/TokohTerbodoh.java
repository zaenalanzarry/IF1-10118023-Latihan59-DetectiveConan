/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan59;

/**
 *
 * @author Zaenal PC
 */
public class TokohTerbodoh extends DetectiveConan{
    public void tampilTokohTerbodoh(){
        System.out.println("\n=====Tokoh Terbodoh=====");
        tampilNama();
        Penampilan();
    }
    
    @Override
    public void tampilNama(){
        System.out.println("Nama Anggota Tokoh Terbodoh :");
        System.out.println("1. Kogoro Mouri");
        System.out.println("2. Juzo Megure");
        System.out.println("3. Misao Yamamura");
        System.out.println("4. Detective Boys Group (Minus Ai dan Conan)");
    }
    @Override
    public void Penampilan(){
        System.out.println("\nPenampilan Anggota Tokoh Terbodoh :");
        System.out.println("1. Kogoro Mouri     : Menggunakan jas biru dengan dasi coklat");
        System.out.println("2. Juzo Megure      : Menggunakan jas coklat dengan topi coklat");
        System.out.println("3. Misao Yamamura   : Menggunakan jas hijau dengan dasi kuning");
        System.out.println("4. Detective Boys Group (Minus Ai dan Conan) : Menggunakan pakaian anak kecil");
    }

}
