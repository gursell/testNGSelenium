package tests.day13_testNGFramework;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_TestNGIlktest extends TestBase {
    /*
    TestNG test method larini isim sirasina göre calistirir.
    eger siralamayi degistirmek isterseniz
   priority kullanabiliriz.

   priority yazan method lar kucukten buyuge göre siralanir.
   eger priority belirtilmeyen method varsa, sona atmaz
   priority=0 kabul edilir.

   ayni priority degerine sahip birden fazla method varsa,
   bunlar harf sirasina göre calisir.
     */

    @Test(priority = 10)
    public void ilkTest(){
        driver.get("https://www.amazon.com");
    }

    @Test
    public void ikinciTest(){
        driver.get("https://www.youtube.com");
    }

    @Test
    public void ucuncuTest(){
        driver.get("https://www.wisequarter.com");
    }

}
