// 13020210029, Andi Muaffivatul Fiqra //
//Jum'at/10-02-2023//
//21:52//
import java.util.Scanner;

public class KonversiWaktu {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int totalJam, jam, totalMenit, menit, detik, konversi;

        System.out.print("Masukkan total detik : ");
        konversi = input.nextInt();

        detik = konversi % 60;
        totalMenit = konversi / 60;
        menit = totalMenit % 60;
        totalJam = totalMenit / 60;
        jam = totalJam % 24;
        
        System.out.println("Detik sekarang  : " +detik+ " detik");
        System.out.println("Total menit     : " +totalMenit+ " menit");
        System.out.println("Menit sekarang  : " +menit+ " menit");
        System.out.println("Total jam       : " +totalJam+ " jam");
        System.out.println("Jam sekarang    : " +jam+ " jam");
        System.out.println("Tampil waktu    : " + jam + ":" + menit + ":" + detik);
    }
    
}