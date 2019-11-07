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
public class TokohPendukung extends DetectiveConan{
    public void tampilTokohPendukung(){
        System.out.println("\n=====Tokoh Pendukung=====");
        tampilNama();
    }
    
    @Override
    public void tampilNama(){
        System.out.println("1. Eisuke Hondo");
        System.out.println("2. Eri Kisaki");
        System.out.println("3. Heiji Hattori");
        System.out.println("4. Kazuha Toyama");
        System.out.println("5. Kid si Pencuri");
        System.out.println("6. Sonoko Suzuki");
        System.out.println("7. Yusaku Kudo");
        System.out.println("8. Yukiko Kudo");
        System.out.println("9. Masumi Sera");
        System.out.println("10. Makoto Kyogoku");
    }
    
}
