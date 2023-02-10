package tests.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C03_BenimKendiSoftAssert {

    @Test
    public void softAssertTesti(){

    // 1- Ilk harf Buyuk harf olmali

    // A.adim softAssert objesi olustur
    SoftAssert softAssert= new SoftAssert();

    // B.istenen tum assertion'lari softAssert objesini kullanarak yapin
    String sifre="JvAcsJava";

    // 1- Ilk harf Buyuk harf olmali
    boolean ilkHarfKontrolu= sifre.charAt(0)>='A' && sifre.charAt(0)<='Z';
    softAssert.assertTrue(ilkHarfKontrolu, "Ilk harf buyuk olmali");

    // 2- Son harf kucuk harf olmali
        boolean sonHarfKontrolu= sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(0)<='a';
        softAssert.assertTrue(sonHarfKontrolu,"Son harf kucuk olmali");

        // 3- sifre bosluk icermemeli
        softAssert.assertFalse(sifre.contains(" "), "Sifre bosluk icermemeli");

        // 4- uzunlugu en az 8 karakter olmali
        softAssert.assertTrue(sifre.length()>=8,"Sifre en az 8 karakter olmali");

        // C. Tum testler bitince, isimiz bitti yapilan tum assert'leri raporla dememiz gerekir
        //    bir tane bile failed varsa bu satirda kodun calismasi durdurulur
        softAssert.assertAll();

        // 5- tum sartlari sagliyorsa sifre basari ile kaydedildi yazdirin
        System.out.println("Sifreniz basari ile kaydedildi");









    }

}
