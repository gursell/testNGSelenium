package tests.Proje;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyCoursedemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_KendiTest {

    @Test
    public void homePageTest(){

        //I should be able to access the home page
        //https://qualitydemy.com/
        //The home page must be accessible when the URL is entered

        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        //The home page must be accessible when the URL is entered
        //In order to be sure for the home page as accesible, we show that we are able to log in
        // at the home page.
        MyCoursedemyPage myCoursedemyPage=new MyCoursedemyPage();

        Assert.assertTrue(myCoursedemyPage.loginLink.isEnabled());

        ReusableMethods.bekle(5);
        Driver.closeDriver();


    }

}
