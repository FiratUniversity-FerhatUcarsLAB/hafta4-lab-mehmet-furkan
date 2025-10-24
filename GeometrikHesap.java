/*
 * Ad Soyad: Mehmet Furkan AKYAR
 * Ogrenci No: 240541056
 * Tarih: 10/24/2025
 * Aciklama: Geometrik Hesap
 */


import java.util.Scanner;

public class GeometrikHesap {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //yarıçap bilgisi al

        System.out.println("=== GEOMETRİK HESAPLAYİCİ ===");
        System.out.print("Daire yaricapini giriniz(cm): ");
        double yaricap = input.nextDouble();

        //Pi tanımla
        float pi = 3.1415f;


        System.out.println("SONUCLAR: ");
        System.out.println("----------------");
        //matematiksel işlemler
        double alan = pi * Math.pow(yaricap,2);
        System.out.printf("\nDaire alani: %.2f cm^2", alan);


        double cevre = 2 * pi * yaricap;
        System.out.printf("\nDaire cevre: %.2f cm", cevre);


        double cap = 2 * yaricap;
        System.out.printf("\nDaire capı: %.2f cm", cap);


        double kure_hacmi = 4.0/3.0 * Math.pow(yaricap, 3);
        System.out.printf("\nKure hacmi: %.2f cm^3", kure_hacmi);


        double kure_yuzey_alani = 4 * pi *  yaricap * yaricap;
        System.out.printf("\nKure yuzey alani: %.2f cm^2", kure_yuzey_alani);


        input.close();



    }
}

