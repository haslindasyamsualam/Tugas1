/*Nim              :13020210241
  Nama             :HASLINDA
  Hari/Tanggal     :Jumat,10 Maret 2023
  Waktu Pengerjaan :11.25
*/
package waktu;
import java.util.Scanner;
        
public class Waktu {

public static void main(String[] args){
    Scanner input = new Scanner(System.in);

        int totJam, jam, totMen, menit, detik, konversi;

        System.out.print("Masukkan total detik : ");
        konversi = input.nextInt();

        detik = konversi % 60;
        totMen = konversi / 60;
        menit = totMen % 60;
        totJam = totMen / 60;
        jam = totJam % 24;
        
        System.out.println("Detik sekarang  : " +detik+ " detik");
        System.out.println("Total menit     : " +totMen+ " menit");
        System.out.println("Menit sekarang  : " +menit+ " menit");
        System.out.println("Total jam       : " +totJam+ " jam");
        System.out.println("Jam sekarang    : " +jam+ " jam");
        System.out.println("Tampil waktu    : " + jam + ":" + menit + ":" + detik);
    }
        // TODO code application logic here
    }

        
    
