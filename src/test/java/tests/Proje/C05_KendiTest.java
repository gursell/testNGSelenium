package tests.Proje;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyCoursedemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.File;

public class C05_KendiTest {

    //Course should be able to get selected from the search box
    // When the course name is clicked, it should redirect to the page of the relevant course.
    // The course should be listed when the desired date is selected
    // from the filter dropbox and the filter button is pressed.


    @Test
    public void Test1() {

        //Go to qualitydemy home page
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
        MyCoursedemyPage qualityDemyPage_user = new MyCoursedemyPage();
        //QualityDemyPage_Instructor qualityDemyPage_instructor = new QualityDemyPage_Instructor();

        qualityDemyPage_user.acceptMyCookies.click();

        ReusableMethods.bekle(5);

        //Click to Login Link
        qualityDemyPage_user.loginLink.click();
        //qualityDemyPage_instructor.loginLink.click();

        //Click to email box and enter your instructor email adress and password
        qualityDemyPage_user.emailBox.sendKeys(ConfigReader.getProperty("gurselValidEmail"));
        qualityDemyPage_user.passwordBox.sendKeys(ConfigReader.getProperty("gurselValidPassword"));

        ReusableMethods.bekle(2);

        // Click to Login button
        qualityDemyPage_user.loginButton.click();
        ReusableMethods.bekle(2);

        //Click to Instructor link
        qualityDemyPage_user.instructorLink.click();
        ReusableMethods.bekle(2);

        //Click to Sales Report Link
        qualityDemyPage_user.salesReportLink.click();
        ReusableMethods.bekle(2);

            //Click to Sales Report Search box
            qualityDemyPage_user.salesReportSearchBox.click();
            ReusableMethods.bekle(2);

            //1.Course should be able to get selected from the search box

            qualityDemyPage_user.salesReportSearchBox.sendKeys(ConfigReader.getProperty("gurselCourseTitle"));
            Assert.assertTrue(qualityDemyPage_user.noDataAvailableInTheTable.isDisplayed());
            ReusableMethods.bekle(3);
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            File source = ts.getScreenshotAs(OutputType.FILE);
            ReusableMethods.bekle(3);

            Driver.getDriver().navigate().back();

            //2.When the course name is clicked, it should redirect to the page of the relevant course.
            qualityDemyPage_user.salesReportLink.click();
            Assert.assertTrue(qualityDemyPage_user.noDataAvailableInTheTable.isDisplayed());
            ReusableMethods.bekle(3);
            TakesScreenshot ts1 = (TakesScreenshot) Driver.getDriver();
            File source1 = ts.getScreenshotAs(OutputType.FILE);
            ReusableMethods.bekle(3);
        

        //The course should be listed when the desired date is selected
        //from the filter dropbox and the filter button is pressed.

        //Press the filter dropbox, we select last month for a wide time interval.
        qualityDemyPage_user.filterDropBox.click();
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(qualityDemyPage_user.lastMonthButton).click().perform();
        //Press filter button.
        qualityDemyPage_user.filterButton.click();
        ReusableMethods.bekle(3);
        Assert.assertTrue(qualityDemyPage_user.noDataAvailableInTheTable.isDisplayed());
        ReusableMethods.bekle(2);
        TakesScreenshot ts2 = (TakesScreenshot) Driver.getDriver();
        File source2 = ts.getScreenshotAs(OutputType.FILE);
        ReusableMethods.bekle(3);
        Driver.closeDriver();
    }
}




