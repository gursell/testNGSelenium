package tests.Proje;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyCoursedemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C02_KendiTest {
    /*
    -As a user I should be able to see the various titles when I enter the homepage.

    1) Logo,Categories,Log in, Sign Up,shopping cart icon,Search icon,Search button,
    10 Online courses text, Expert instruction text, Lifetime access text,
    Top categories text,Top courses text, Top 10 Latest courses text,
    Featured instructor text ,Get started button,Join now button,
    facebook icon, Twitter icon, should be visible.

     */


    @Test
    public void locationTesti(){
        // Enter the web page
        MyCoursedemyPage qualityDemyPage_user= new MyCoursedemyPage();
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        ReusableMethods.bekle(2);
        qualityDemyPage_user.acceptMyCookies.click();

        //Logo is visible

        Assert.assertTrue(qualityDemyPage_user.logo.isDisplayed());

        // login is visible
        Assert.assertTrue(qualityDemyPage_user.loginLink.isDisplayed());

        //Categories is visible
        Assert.assertTrue(qualityDemyPage_user.categories.isDisplayed());

        //Sign up is visible
        Assert.assertTrue(qualityDemyPage_user.signUpLink.isDisplayed());

        //shopping cart icon is visible
        Assert.assertTrue(qualityDemyPage_user.shoppingCartIcon.isDisplayed());

        //Search icon is visible
        Assert.assertTrue(qualityDemyPage_user.searchIcon.isDisplayed());

        //Search button is visible
        Assert.assertTrue(qualityDemyPage_user.searchButton.isDisplayed());

        //57 Online courses text is visible
        Assert.assertTrue(qualityDemyPage_user.onlineCoursesText.isDisplayed());

        //Expert instruction text is visible
        Assert.assertTrue(qualityDemyPage_user.expertInstructionText.isDisplayed());

        //Lifetime access text is visible
        Assert.assertTrue(qualityDemyPage_user.lifetimeAccessText.isDisplayed());

        //Top categories text is visible
        Assert.assertTrue(qualityDemyPage_user.topCategoriesText.isDisplayed());

        //Top courses text is visible
        Assert.assertTrue(qualityDemyPage_user.topCoursesText.isDisplayed());

        //Top 10 Latest courses text is visible
        Assert.assertTrue(qualityDemyPage_user.top10LatestCoursesText.isDisplayed());

        //Featured instructor text is visible
        Assert.assertTrue(qualityDemyPage_user.featuredInstructorText.isDisplayed());

        //Get started button is visible
        Assert.assertTrue(qualityDemyPage_user.getStartedButton.isDisplayed());

        //Join now button is visible
        Assert.assertTrue(qualityDemyPage_user.joinNowButton.isDisplayed());

        //facebook icon is visible
        Assert.assertTrue(qualityDemyPage_user.facebookIcon.isDisplayed());

        //twitter icon os visible
        Assert.assertTrue(qualityDemyPage_user.twitterIcon.isDisplayed());

        ReusableMethods.bekle(5);
        Driver.closeDriver();
    }

}
