package tests.day18_testNGReports_paralelTesting;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyCoursedemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C04_SmokeTestRaporlu extends TestBaseRapor {
    MyCoursedemyPage myCoursedemyPage=new MyCoursedemyPage();
    // uc farkli test method'u ile yanlis bilgilerle giris yapilamadigini test edin
    @Test
    public void yanlisKullaniciTesti(){
        // Mycoursedemy anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        // login linkine basin
        myCoursedemyPage.loginLink.click();
        extentTest=extentReports.createTest("yanlis kullanici adi","yanlis kullanici adi ile giris yapilamaz");
        // 1- yanlis kullanici adi, gecerli password
        myCoursedemyPage.emailBox.sendKeys(ConfigReader.getProperty("myYanlisEmail"));
        extentTest.info("kullanici adi olarak yanlis email yazildi");
        myCoursedemyPage.passwordBox.sendKeys(ConfigReader.getProperty("myGecerliPassword"));
        extentTest.info("Password olarak gecerli password yazildi");
        // Login butonuna basarak login olmaya calisin
        myCoursedemyPage.loginButton.click();
        extentTest.info("Login butonuna basildi");
        // Basarili olarak giris yapilamadigini test edin
        // bunun icin hala login linklinin gorunur oldugunu test edelim
        Assert.assertTrue(myCoursedemyPage.loginLink.isEnabled());
        extentTest.pass("Giris yapilamadigi test edildi");
    }
    @Test
    public void yanlisPasswordTesti(){
        // Mycoursedemy anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        // login linkine basin
        myCoursedemyPage.loginLink.click();
        extentTest=extentReports.createTest("yanlis password","yanlis password ile giris yapilamaz");
        // 2- gecerli kullanici adi, yanlis password
        myCoursedemyPage.emailBox.sendKeys(ConfigReader.getProperty("myGecerliEmail"));
        extentTest.info("kullanici adi olarak gecerli email yazildi");
        myCoursedemyPage.passwordBox.sendKeys(ConfigReader.getProperty("myYanlisPassword"));
        extentTest.info("Password olarak yanlis password yazildi");
        // Login butonuna basarak login olmaya calisin
        myCoursedemyPage.loginButton.click();
        extentTest.info("Login butonuna basildi");
        // Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(myCoursedemyPage.loginLink.isEnabled());
        extentTest.pass("Giris yapilamadigi test edildi");
    }
    @Test
    public void yanlisEmailSifreTesti(){
        // Mycoursedemy anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        // login linkine basin
        myCoursedemyPage.loginLink.click();
        extentTest=extentReports.createTest("yanlis kullanici adi ve password","yanlis kullanici adi ve yanlis password ile giris yapilamaz");
        // 3- yanlis kullanici adi, yanlis password
        myCoursedemyPage.emailBox.sendKeys(ConfigReader.getProperty("myYanlisEmail"));
        extentTest.info("kullanici adi olarak yanlis email yazildi");
        myCoursedemyPage.passwordBox.sendKeys(ConfigReader.getProperty("myYanlisPassword"));
        extentTest.info("Password olarak yanlis password yazildi");
        // Login butonuna basarak login olmaya calisin
        myCoursedemyPage.loginButton.click();
        extentTest.info("Login butonuna basildi");
        // Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(myCoursedemyPage.loginLink.isEnabled());
        extentTest.pass("Giris yapilamadigi test edildi");
    }
}

