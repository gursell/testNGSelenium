package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MyCoursedemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class NegatifLoginTesti {
    MyCoursedemyPage myCoursedemyPage=new MyCoursedemyPage();

    @BeforeClass
    public void setup(){
        // Mycoursedemy anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        // login linkine basin
        myCoursedemyPage.loginLink.click();
    }


    // uc farkli test method'u ile yanlis bilgilerle giris yapilamadigini test edin
    @Test
    public void yanlisKullaniciTesti(){
        // 1- yanlis kullanici adi, gecerli password
        myCoursedemyPage.acceptMyCookies.click();
        //Önce cookies leri kabul edelim, ki giris yapsin.
        myCoursedemyPage.emailBox.sendKeys(ConfigReader.getProperty("myYanlisEmail"));
        myCoursedemyPage.passwordBox.sendKeys(ConfigReader.getProperty("myGecerliPassword"));
        // Login butonuna basarak login olmaya calisin
        myCoursedemyPage.loginButton.click();
        // Basarili olarak giris yapilamadigini test edin
        // bunun icin hala login linklinin gorunur oldugunu test edelim
        Assert.assertTrue(myCoursedemyPage.loginLink.isEnabled());
        //Bu su demek, hala Log in linki görunuyorsa, demek ki giris yapilamamis.
    }

    @Test
    public void yanlisPasswordTesti(){
        // 2- gecerli kullanici adi, yanlis password
        myCoursedemyPage.emailBox.sendKeys(ConfigReader.getProperty("myGecerliEmail"));
        myCoursedemyPage.passwordBox.sendKeys(ConfigReader.getProperty("myYanlisPassword"));

        Assert.assertTrue(myCoursedemyPage.loginLink.isEnabled());
        // Login butonuna basarak login olmaya calisin
        myCoursedemyPage.loginButton.click();
        // Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(myCoursedemyPage.loginLink.isEnabled());
        //Burada is.Enabled veya is.Displayed kullanilabilir.
    }

    @Test
    public void yanlisEmailSifreTesti(){
        // 3- yanlis kullanici adi, yanlis password
        myCoursedemyPage.emailBox.sendKeys(ConfigReader.getProperty("myYanlisEmail"));
        myCoursedemyPage.passwordBox.sendKeys(ConfigReader.getProperty("myYanlisPassword"));
        // Login butonuna basarak login olmaya calisin
        myCoursedemyPage.loginButton.click();
        // Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(myCoursedemyPage.loginLink.isEnabled());
    }




    @AfterClass
    public void teardown(){
        ReusableMethods.bekle(5);
        Driver.closeDriver();
    }
}
