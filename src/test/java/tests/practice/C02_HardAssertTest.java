package tests.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_HardAssertTest {

    @Test
    public void hardAssetTest(){

        // Test if the all requirements fit well
        // 1- Ilk harf Buyuk harf olmali
        // 2- Son harf kucuk harf olmali
        // 3- sifre bosluk icermemeli
        // 4- uzunlugu en az 8 karakter olmali

        String sifre="JavAahjava";

        // 1- Ilk harf Buyuk harf olmali
        boolean ilkHarfKontrolu= sifre.charAt(0)>='A' && sifre.charAt(0)<='Z';
        Assert.assertTrue(ilkHarfKontrolu,"Ilk harf buyuk olmali");

        // 2- Son harf kucuk harf olmali
        boolean sonHarfKontrolu=sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z';
        Assert.assertTrue(sonHarfKontrolu, "Son harf kucuk olmali");

        // 3- sifre bosluk icermemeli
        Assert.assertFalse(sifre.contains(" "), "Sifre bosluk icermemeli");

        // 4- uzunlugu en az 8 karakter olmali
        Assert.assertTrue(sifre.length()>=8, "Uzunluk en az 8 karakter olmali");

        // 5- tum sartlari sagliyorsa sifre basari ile kaydedildi yazdirin
        System.out.println("Sifre basariyla kaydedildi");







    }


}
