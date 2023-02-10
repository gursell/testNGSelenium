package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyCoursedemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class PozitifLoginTesti {


    @Test
    public void pozitifLoginTesti(){
        // Mycoursedemy anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        // login linkine basin
        MyCoursedemyPage myCoursedemyPage=new MyCoursedemyPage();
        myCoursedemyPage.loginLink.click();
        // Kullanici email'i olarak valid email girin
        myCoursedemyPage.emailBox.sendKeys(ConfigReader.getProperty("myGecerliEmail"));
        ReusableMethods.bekle(2);
        // Kullanici sifresi olarak valid sifre girin
        myCoursedemyPage.passwordBox.sendKeys(ConfigReader.getProperty("myGecerliPassword"));
        myCoursedemyPage.acceptMyCookies.click();
        ReusableMethods.bekle(2);
        // Login butonuna basarak login olun
        myCoursedemyPage.loginButton.click();
        // Basarili olarak giris yapilabildigini test edin

        Assert.assertTrue(myCoursedemyPage.noDataAvailableInTheTable.isDisplayed());

        ReusableMethods.bekle(5);
        Driver.closeDriver();
    }
}
