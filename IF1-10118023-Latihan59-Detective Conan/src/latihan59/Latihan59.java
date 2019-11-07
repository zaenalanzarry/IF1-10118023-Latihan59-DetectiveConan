/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan59;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Detective Conan
 */

public class Latihan59 {

    public static void main(String[] args) {
        System.out.println("=====Detective Conan======");
        System.out.println("\n=====Sekilas Info=====");
        DetectiveConan conan = new DetectiveConan();
        conan.tampilNama();
        conan.Karakteristik();
        conan.Penampilan();
        
        TokohUtama tUtama = new TokohUtama();
        tUtama.tampihTokohUtama();
        
        TokohPendukung tPendukung = new TokohPendukung();
        tPendukung.tampilTokohPendukung();
        
        TokohTerbodoh tBodoh = new TokohTerbodoh();
        tBodoh.tampilTokohTerbodoh();
        
    }
    
}
