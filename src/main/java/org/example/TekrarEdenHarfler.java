package org.example;
import java.util.*;

public class TekrarEdenHarfler {
    public static void main(String[] args) {

        String kelime = "haaatiiiceeee gggünnnnnay";

        int kelimeninUzunlugu = kelime.length();

        ArrayList<Character> sadelesmisKelime = new ArrayList();

        System.out.println("Kelimenin normal hali: " + kelime);

        for(int i = 0 ; i < kelimeninUzunlugu ; i++) {
            char harf1 = kelime.charAt(i);
            char harf2 = ' ';

            if(i != kelimeninUzunlugu - 1) {
                harf2 = kelime.charAt(i + 1);
            }

            if(harf1 == harf2 && !sadelesmisKelime.contains(harf2)) {
                sadelesmisKelime.add(harf2);
            }
        }

        System.out.println("Kelimenin sadeleşmiş hali: " + sadelesmisKelime);

        String finalString = "";

        for(Character chr: sadelesmisKelime) {
            finalString += chr;
        }

        System.out.println("Kelimenin sadeleşmiş hali: " + finalString);
    }

}


