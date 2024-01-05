package org.example;


public class calisanTest {
    public static void main(String[] args) {

        calisan personel1 = new calisan();
        calisan personel2 = new calisan();
        calisan personel3 = new calisan();
        calisan personel4 = new calisan();

        personel1.ad = "Mehmet";
        personel1.soyad = "Yılmaz";


        personel2.ad = "Ayse";
        personel2.soyad = "Kaya";


        personel3.ad = "Sevgi";
        personel3.soyad = "Demir";


        personel4.ad = "Ali";
        personel4.soyad = "Şahin";


        personel1.kisiAdSoyad();
        personel2.kisiAdSoyad();
        personel3.kisiAdSoyad();
        personel4.kisiAdSoyad();

    }


}