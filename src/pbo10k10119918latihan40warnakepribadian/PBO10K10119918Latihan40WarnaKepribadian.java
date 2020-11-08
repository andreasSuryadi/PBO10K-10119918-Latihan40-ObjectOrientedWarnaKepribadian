/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan40warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Andreas Suryadi
 * KELAS    : IF-10K
 * NIM      : 10119918
 * Deskripsi Program : Menampilkan hasil kepribadian dari warna yang dipilih
 *
 */

public class PBO10K10119918Latihan40WarnaKepribadian {
    private static String warna, nama;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WarnaKepribadian warnaKepribadian = new WarnaKepribadian();
        
        String normal = "\u001b[0m";
        String merah = "\u001b[31m";
        String bmerah = "\u001b[41m";
        String hijau = "\u001b[32m";
        String bhijau = "\u001b[42m";
        String kuning = "\u001b[33m";
        String bkuning = "\u001b[43m";
        String birumuda = "\u001b[36m";
        String ungu = "\u001b[35m";
        String bungu = "\u001b[45m";
        String biru = "\u001b[34m";
        String bbiru = "\u001b[44m";
        String putih = "\u001b[37m";
        
        System.out.println(merah + "YUK " + hijau + "CEK " + kuning + "KEPRIBADIAN " + birumuda + "DARI " + ungu + "WARNA " + biru + "FAVORITMU" + normal);
        System.out.print("\n");
        System.out.println(bmerah + putih + "         MERAH        " + normal);
        System.out.println(bhijau + putih + "         HIJAU        " + normal);
        System.out.println(bkuning + putih + "         KUNING       " + normal);
        System.out.println(bbiru + putih + "         BIRU         " + normal);
        System.out.println(bungu + putih + "         UNGU         " + normal);
        System.out.print("\n");
        System.out.print("PILIH WARNA FAVORITMU : ");
        warna = scanner.next();
        warna = warna.toUpperCase();
        System.out.print("NAMA KAMU : ");
        nama = scanner.next();
        nama = nama.toUpperCase();
        
        System.out.print("\n");
        
        System.out.println("===HASIL TEST KEPRIBADIAN " + nama + "===");
        
        if(warna.equals("MERAH")) {
            System.out.println("Warna Favoritmu adalah " + merah + warna + normal);
            warnaKepribadian.warnaMerah();
        } else if(warna.equals("HIJAU")) {
            System.out.println("Warna Favoritmu adalah " + hijau + warna + normal);
            warnaKepribadian.warnaHijau();
        } else if(warna.equals("KUNING")) {
            System.out.println("Warna Favoritmu adalah " + kuning + warna + normal);
            warnaKepribadian.warnaKuning();
        } else if(warna.equals("BIRU")) {
            System.out.println("Warna Favoritmu adalah " + biru + warna + normal);
            warnaKepribadian.warnaBiru();
        } else if(warna.equals("UNGU")) {
            System.out.println("Warna Favoritmu adalah " + ungu + warna + normal);
            warnaKepribadian.warnaUngu();
        } else {
            System.out.println("Oops.. Belum terindentifikasi");
        }
    }
    
}
