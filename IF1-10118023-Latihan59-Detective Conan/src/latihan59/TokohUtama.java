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
public class TokohUtama extends DetectiveConan{
    public void tampihTokohUtama(){
        System.out.println("\n=====Tokoh Utama=====");
        tampilNama();
        Penampilan();
    }
    
    @Override
    public void tampilNama(){
        System.out.println("Nama Anggota Tokoh Utama :");
        System.out.println("1. Shinichi Kudo (Conan Edogawa)");
        System.out.println("2. Ran Mouri");
        System.out.println("3. Kogoro Mouri");
    }
    
    @Override
    public void  Penampilan(){
        System.out.println("\nPenampilan Anggota Tokoh Utama :");
        System.out.println("1. Shinichi Kudo    : Menggunakan jas biru dengan pita merah di leher");
        System.out.println("2. Ran Mouri        : Menggunakan jas Biru berdasi hijau dan rambut panjang");
        System.out.println("3. Kogoro mouri     : Menggunakan jas biru dengan dasi coklat");
    }
}
