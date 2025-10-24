/*
 * Ad Soyad: Mehmet Furkan AKYAR
 * Ogrenci No: 240541056
 * Tarih: 10/24/2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {

        // Değişkenler alınıyor
        Scanner input = new Scanner(System.in);


        System.out.println("Adinizi Girin: ");
        String ad = input.nextLine();

        System.out.println("Soyadinizi Girin: ");
        String soyad = input.nextLine();

        System.out.println("Ogrenci numaraniz: ");
        int ogrenci_no = input.nextInt();

        System.out.println("Yasiniz: ");
        int yas = input.nextInt();

        System.out.println("GPA(0.00-4.00): ");
        float gpa = input.nextFloat();

        // Başarı durumunu belirlemek için bir değişken oluşturalım
        String durum;

        // GPA'ya göre durumu belirleyelim
        if (gpa >= 2.00) {
            durum = "Basarili Ogrenci";
        } else {
            durum = "Basarisiz Ogrenci";
        }


        System.out.println("===OGRENCİ BİLGİ SİSTEMİ===");
        System.out.printf("Ad Soyad: %s %s", ad, soyad);
        System.out.printf("\nOgrenci No: %d", ogrenci_no);
        System.out.printf("\nYaş: %d", yas);
        System.out.printf("\nGPA: %.2f", gpa);
        System.out.printf("\nDurum: %s", durum);


        input.close();

    }
}
