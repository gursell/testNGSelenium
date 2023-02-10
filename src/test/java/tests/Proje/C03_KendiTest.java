package tests.Proje;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyCoursedemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C03_KendiTest {

    @Test
    public void locationTesti(){
        // Enter the web page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        MyCoursedemyPage qualityDemyPage_user=new MyCoursedemyPage();
        qualityDemyPage_user.acceptMyCookies.click();

        //About Us, Login, HTML5AndCSS, Piano, AWS Certification  headings should be clickable

        //Login is clickable
        qualityDemyPage_user.loginLink.click();
        //To be sure for clickable, we can search if login redirects to emailKutusu in the next page.
        Assert.assertTrue(qualityDemyPage_user.emailBox.isDisplayed());


        //About Us is clickable.
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.bekle(5);
        qualityDemyPage_user.aboutUs.click();
        //To be sure clickable, we can search if login redirects the next page.
        Assert.assertTrue(qualityDemyPage_user.courseListArea.isDisplayed());
        Driver.getDriver().navigate().back();

        qualityDemyPage_user.hTML5AndCSS.click();
        //After clicking, in the second page "HTML5 And CSS"
        // heading can be seen to be sure redirect the new page.
        Assert.assertTrue(qualityDemyPage_user.hTML5AndCSSHeading.isDisplayed());
        Driver.getDriver().navigate().back();

        qualityDemyPage_user.piano.click();
        //After clicking, in the second page "Learn Piano Iin Weeks not years"
        //subtitle can be seen to be sure redirect the new page.
        Assert.assertTrue(qualityDemyPage_user.learnPianoInWeeksNotYearsHeading.isDisplayed());
        Driver.getDriver().navigate().back();

        qualityDemyPage_user.aWSCertification.click();
        //After clicking, in the second page "AWS Certification"
        // heading can be seen to be sure redirect the new page.
        Assert.assertTrue(qualityDemyPage_user.aWSCertificationHeading.isDisplayed());


        Driver.closeDriver();




    }
}


