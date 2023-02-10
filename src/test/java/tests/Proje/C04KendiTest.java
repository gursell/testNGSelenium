package tests.Proje;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyCoursedemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C04KendiTest {
    //"Top categories" under the heading; Web Design for Web Developers,
    // Disney Magic English, English Speaking Course, English Conjunctions;
    // should be visible and clickable.
    // After clicking the .... icons, the company-related pages should be visible.

    MyCoursedemyPage qualityDemyPage_user = new MyCoursedemyPage();

    @Test
    public void testCase1() {

        //Go to Quality Demy webside.
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));

        qualityDemyPage_user.acceptMyCookies.click();

        ReusableMethods.bekle(5);

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        ReusableMethods.bekle(5);

        //English Speaking Course is visible and clickable
        Assert.assertTrue(qualityDemyPage_user.englishSpeakingCourse.isDisplayed());
        qualityDemyPage_user.englishSpeakingCourse.click();
        //After clicking, in the second page the "English Course Learn to Speak"
        // heading can be seen to be sure redirect the new page.
        Assert.assertTrue(qualityDemyPage_user.englishCourseLearnToSpeakTitle.isDisplayed());

        Driver.getDriver().navigate().back();

        //Web Design for Web Developers visible and clickable
        Assert.assertTrue(qualityDemyPage_user.webDesignForWebDevelopers.isDisplayed());
        qualityDemyPage_user.webDesignForWebDevelopers.click();
        //After clicking, in the second page "Web Design for PHP"
        // heading can be seen to be sure redirect the new page.
        Assert.assertTrue(qualityDemyPage_user.webDesignForPHP.isDisplayed());

        Driver.getDriver().navigate().back();

        //HTML5 and CSS is visible and clickable
        Assert.assertTrue(qualityDemyPage_user.hTML5AndCSS.isDisplayed());
        qualityDemyPage_user.hTML5AndCSS.click();
        //After clicking, in the second page "HTML5 And CSS"
        // heading can be seen to be sure redirect the new page.
        Assert.assertTrue(qualityDemyPage_user.hTML5AndCSSHeading.isDisplayed());

        Driver.getDriver().navigate().back();

        //Piano is visible and clickable
        Assert.assertTrue(qualityDemyPage_user.piano.isDisplayed());
        qualityDemyPage_user.piano.click();
        //After clicking, in the second page "Learn Piano Iin Weeks not years"
        //subtitle can be seen to be sure redirect the new page.
        Assert.assertTrue(qualityDemyPage_user.learnPianoInWeeksNotYearsHeading.isDisplayed());

        Driver.getDriver().navigate().back();

        //English Grammar is visible and clickable
        Assert.assertTrue(qualityDemyPage_user.englishGrammar.isDisplayed());
        qualityDemyPage_user.englishGrammar.click();
        //After clicking, in the second page "Learn Piano Iin Weeks not years"
        // heading can be seen to be sure redirect the new page.
        Assert.assertTrue(qualityDemyPage_user.learnEnglishGrammar.isDisplayed());

        Driver.getDriver().navigate().back();

        //AWS Certification is visible and clickable
        Assert.assertTrue(qualityDemyPage_user.aWSCertification.isDisplayed());
        qualityDemyPage_user.aWSCertification.click();
        //After clicking, in the second page "AWS Certification"
        // heading can be seen to be sure redirect the new page.
        Assert.assertTrue(qualityDemyPage_user.aWSCertificationHeading.isDisplayed());

        Driver.getDriver().navigate().back();

        ReusableMethods.bekle(5);
        Driver.closeDriver();
    }

        //"Useful links" under the heading; Blog, All courses, Sign up;
        //should be visible and clickable.
        //After clicking the .... icons, the company-related pages should be visible.

        @Test
        public void testCase2 () {
            //Go to Quality Demy webside.
            Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
            ReusableMethods.bekle(3);
            qualityDemyPage_user.acceptMyCookies.click();

            ReusableMethods.bekle(5);

            Actions actions = new Actions(Driver.getDriver());
            actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                    sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                    sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                    sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

            ReusableMethods.bekle(5);

            //Blog under the heading of "Useful links", is visible and clickable
            Assert.assertTrue(qualityDemyPage_user.blog.isDisplayed());
            qualityDemyPage_user.blog.click();
            //After clicking to "Blog", in the second page the "English Course Learn to Speak"
            // heading can be seen to be sure redirect the new page.
            Assert.assertTrue(qualityDemyPage_user.latestBlogHeading.isDisplayed());

            Driver.getDriver().navigate().back();

            //All courses under the heading of "Useful links", is visible and clickable
            Assert.assertTrue(qualityDemyPage_user.allCourses.isDisplayed());
            qualityDemyPage_user.allCourses.click();
            //After clicking to "All courses", in the second page the "Web Design for PHP"
            // heading can be seen to be sure redirect the new page.
            Assert.assertTrue(qualityDemyPage_user.webDesignForPHP.isDisplayed());

            Driver.getDriver().navigate().back();

            //Sign Up under the heading of "Useful links", is visible and clickable
            Assert.assertTrue(qualityDemyPage_user.signUpHeading.isDisplayed());
            qualityDemyPage_user.signUpHeading.click();
            //After clicking to "Sign Up", in the second page the "Sign Up Link"
            //can be seen to be sure redirect the new page.
            Assert.assertTrue(qualityDemyPage_user.signUpButton.isDisplayed());

            Driver.getDriver().navigate().back();

            ReusableMethods.bekle(5);
            Driver.closeDriver();
        }


            @Test
            public void testCase3 () {
                //Go to Quality Demy webside.
                Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
                ReusableMethods.bekle(3);
                qualityDemyPage_user.acceptMyCookies.click();

                ReusableMethods.bekle(3);

                Actions actions = new Actions(Driver.getDriver());
                actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                        sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                        sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                        sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

                ReusableMethods.bekle(3);

                //About Us under the heading of "Help", is visible and clickable
                Assert.assertTrue(qualityDemyPage_user.aboutUs.isDisplayed());
                qualityDemyPage_user.aboutUs.click();
                //After clicking to "About Us", in the second page the "Course List Area"
                //can be seen to be sure redirect the new page.
                Assert.assertTrue(qualityDemyPage_user.courseListArea.isDisplayed());

                Driver.getDriver().navigate().back();

                //Privacy Policy under the heading of "Help", is visible and clickable
                Assert.assertTrue(qualityDemyPage_user.privacyPolicy.isDisplayed());
                qualityDemyPage_user.privacyPolicy.click();
                //After clicking to "Privacy Policy", in the second page the "Privacy Policy" title
                //can be seen to be sure redirect the new page.
                Assert.assertTrue(qualityDemyPage_user.privacyPolicyTopTitle.isDisplayed());

                Driver.getDriver().navigate().back();

                //Terms and Condition under the heading of "Help", is visible and clickable
                Assert.assertTrue(qualityDemyPage_user.termsAndCondition.isDisplayed());
                qualityDemyPage_user.termsAndCondition.click();
                //After clicking to "Sig", in the second page the "Terms and Condition" title
                //can be seen to be sure redirect the new page.
                Assert.assertTrue(qualityDemyPage_user.termsAndConditionTopTitle.isDisplayed());

                Driver.getDriver().navigate().back();

                //Refund Policy under the heading of "Help", is visible and clickable
                Assert.assertTrue(qualityDemyPage_user.refundPolicy.isDisplayed());
                qualityDemyPage_user.refundPolicy.click();
                //After clicking to "Help", in the second page the "Refund Policy" title
                //can be seen to be sure redirect the new page.
                Assert.assertTrue(qualityDemyPage_user.refundPolicyTopTitle.isDisplayed());

                Driver.getDriver().navigate().back();

                ReusableMethods.bekle(5);
                Driver.closeDriver();


            }
        }


