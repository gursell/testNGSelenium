package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class MyCoursedemyPage {
    public MyCoursedemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //mainPage> Quality Demy logo *
   @FindBy(xpath = "//*[@class='navbar-brand pt-2 mt-1']")
   public WebElement logo;
    //mainPage> Categories heading *
   @FindBy(xpath = "//*[@class='fw-500']")
   public WebElement categories;
   //mainPage> Sign Up link at top right>***
   @FindBy(xpath = "//*[@class='btn btn-sign-up']")
   public  WebElement signUpLink;
   //mainPage> Shopping cart icon at top right***
   @FindBy(xpath = "//*[@class='fas fa-shopping-cart']")
   public WebElement shoppingCartIcon;
   //mainPage> Search button named as "Search" *
    @FindBy(xpath = "(//button[@class='btn'])[2]")
    public WebElement searchButton;
    //mainPage> Search Icon next to Categories *

    @FindBy(xpath = "(//button[@class='btn'])[1]")
    public WebElement searchIcon;
    //mainPage> 57 Online Courses Text inside the box *
    @FindBy(xpath = "(//div[@class='home-fact-box mr-md-auto mr-auto'])[1]")
    public WebElement onlineCoursesText;
    //mainPage> Expert instruction text *
    @FindBy(xpath = "//*[text()='Expert instruction']")
    public WebElement expertInstructionText;
    //mainPage> Lifetime access text *
    @FindBy(xpath = "//*[text()='Lifetime access']")
    public WebElement lifetimeAccessText;
    //mainPage> Top categories text under Lifetime access text *
    @FindBy(xpath = "(//span[@class='header-underline-2'])[1]")
    public WebElement topCategoriesText;
    //mainPage> Top courses text *
    @FindBy(xpath = "(//span[@class='header-underline-2'])[2]")
    public WebElement topCoursesText;
    //mainPage> Top 10 Latest Courses text *
    @FindBy(xpath = "(//span[@class='header-underline-2'])[3]")
    public WebElement top10LatestCoursesText;
    //mainPage> Featured instructor text *
    @FindBy(xpath = "(//span[@class='header-underline-2'])[4]")
    public WebElement featuredInstructorText;
    //mainPage> Get started button *
    @FindBy(xpath = "//*[@class='btn btn-primary px-4 py-2']")
    public WebElement getStartedButton;
    //mainPage> Join now button *
    @FindBy(xpath = "//*[@class='btn btn-danger px-4 py-2']")
    public WebElement joinNowButton;
    //mainPage> About Us heading under "Help"*
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[10]")
    public WebElement aboutUs;
    //mainPage> aboutUs> Course List Area *
    @FindBy(xpath = "//*[@class='category-course-list-area']")
    public WebElement courseListArea;
    //mainPage> aboutUs> Quality Demy photo *
    @FindBy(xpath = "//div[@class='col']")
    public WebElement qualityDemy;
    //mainPage> Web Design for Web Developers heading under Top Categories*
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[1]")
    public WebElement webDesignForWebDevelopers;
    //mainPage> webDesignForWebDevelopers> Web Design for PHP Heading *
    @FindBy(xpath = "(//a[@class='course-title'])[1]")
    public WebElement webDesignForPHP;
    //mainPage> English Speaking Course heading under Top Categories**
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[2]")
    public WebElement englishSpeakingCourse;
    //mainPage> englishSpeakingCourse> Eng. Spe. Cou. heading*
    @FindBy(xpath = "(//a[@class='course-title'])[1]")
    public WebElement englishCourseLearnToSpeakTitle;
    //mainPage> hTML5AndCSS heading under Top Categories*
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[3]")
    public WebElement hTML5AndCSS;
    //mainPage> hTML5AndCSS> HTML5 and CSS heading *
    @FindBy(xpath = "//*[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement hTML5AndCSSHeading;
    //mainPage> piano heading under Top Categories *
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[4]")
    public WebElement piano;
    //mainPage> piano> "Learn Piano in WEEKS not years" subtitle *
    @FindBy(xpath = "(//div[@class='course-subtitle d-none d-md-block'])[1]")
    public WebElement learnPianoInWeeksNotYearsHeading;
    //mainPage> englishGrammar heading under Top Categories *
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[5]")
    public WebElement englishGrammar;
    //mainPage> englishGrammar> "Learn English Grammar" subtitle *
    @FindBy(xpath = "(//div[@class='course-subtitle d-none d-md-block'])[2]")
    public WebElement learnEnglishGrammar;
    //mainPage> aWSCertification heading under Top Categories *
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[6]")
    public WebElement aWSCertification;
    //mainPage>aWSCertification> "AWS Certification" subtitle *
    @FindBy(xpath = "//*[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement aWSCertificationHeading;
    //mainPage> blog heading under Useful links*
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[7]")
    public WebElement blog;
    //mainPage> blog> "Latest Blogs" heading *
    @FindBy(xpath = " (//div[@class='col-12'])[1]")
    public WebElement latestBlogHeading;
    //mainPage> allCourses heading under Useful links *
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[8]")
    public WebElement allCourses;
     //mainPage> signUp heading under Useful links *
     @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[9]")
     public WebElement signUpHeading;
     //mainPage> signUp> "Sign Up" button *
     @FindBy(xpath = "//*[@class='btn red radius-5 mt-4 w-100']")
     public WebElement signUpButton;
    //mainPage> privacyPolicy heading under Help *
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[11]")
    public WebElement privacyPolicy;
    //mainPage> privacyPolicy> "Privacy Policy" top title *
    @FindBy(xpath = "//*[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement privacyPolicyTopTitle;
    //mainPage> termsandCondition heading under Help *
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[12]")
    public WebElement termsAndCondition;
    //mainPage> termsandCondition> "Privacy Policy" top title *
    @FindBy(xpath = "//*[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement termsAndConditionTopTitle;
    //mainPage> refundPolicy heading under Help *
    @FindBy(xpath = "(//a[@class='link-secondary footer-hover-link'])[13]")
    public WebElement refundPolicy;
    //mainPage> refundPolicy> "Refund Policy" top title *
    @FindBy(xpath = "//*[@class='breadcrumb-item active text-light display-6 fw-bold']")
    public WebElement refundPolicyTopTitle;


 //mainPage> facebook icon *
 @FindBy(xpath = "//*[@class='fab fa-facebook-f']")
 public WebElement facebookIcon;
 //mainPage> twitter icon *
 @FindBy(xpath = "//*[@class='fab fa-twitter']")
 public WebElement twitterIcon;

 //mainPage> Log in link at top right *
 @FindBy(xpath = "//a[text()='Log in']")
 public WebElement loginLink;


    //Instructor *****

    //mainPage> loginLink> emailBox
    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement emailBox;

    //Accept my cookies
    @FindBy(xpath = "//a[text()='Accept']")
    public WebElement acceptMyCookies;

    //mainPage> loginLinki> passwordBox
    @FindBy(xpath = "//input[@id='login-password']")
    public WebElement passwordBox;

    //mainPage> loginLinki> emailBox> password> loginButton
    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

    //mainPage> loginLinki> emailBox> password> loginButton> instructorLink
    @FindBy(linkText = "Instructor")
    public WebElement instructorLink;

    //mainPage> loginLinki> emailBox> password> loginButton> instructorLink> salesReportLink
    @FindBy(xpath = "//span[text()='Sales report']")
    public WebElement salesReportLink;

    //mainPage> loginLinki> emailBox> password> loginButton> instructorLink> salesReportLink> salesReportSearchBox
    @FindBy(xpath = "//input[@type='search']")
    public WebElement salesReportSearchBox;

    //mainPage> loginLinki> emailBox> password> loginButton> instructorLink> salesReportLink> filterDropbox
    @FindBy(xpath = "//div[@id='reportrange']")
    public WebElement filterDropBox;

    //mainPage> loginLinki> emailBox> password> loginButton> instructorLink> salesReportLink> filterDropbox> lastMonthButton
    @FindBy(xpath = "//li[text()='Last Month']")
    public WebElement lastMonthButton;

    //mainPage> loginLinki> emailBox> password> loginButton> instructorLink> salesReportLink> filterButton
    @FindBy(xpath = "//button[@id='submit-button']")
    public WebElement filterButton;

    //mainPage> loginLinki> emailBox> password> loginButton> instructorLink> salesReportLink> noDataAvailableInTableHeading
    @FindBy(xpath = "//*[@class='dataTables_empty']")
    public WebElement noDataAvailableInTheTable;





    //
    @FindBy(xpath = "//*[text()='Course manager']")
    public WebElement courseManagerLinki;

    @FindBy(xpath = "//*[text()='Add new course']")
    public WebElement addNewCourseButonu;

    @FindBy(xpath = "//*[@id='course_title']")
    public WebElement courseTitleKutusu;

    @FindBy(xpath = "(//*[text()='Select a category'])[2]")
    public WebElement categoryMenusu;

    @FindBy(xpath = "(//*[text()='Web Design for Web Developers'])[2]")
    public WebElement categorySecimi;

    @FindBy(xpath = "//*[@class='mdi mdi-arrow-right-bold']")
    public WebElement ilkNextButonu;

    @FindBy(xpath = "//*[@placeholder='Enter course course price']")
    public WebElement coursePrice;

    @FindBy(xpath = "//*[@name='discounted_price']")
    public WebElement discountKutusu;

    @FindBy(xpath = "(//*[@placeholder='Write a keyword and then press enter button'])[2]")
    public WebElement metaKeywordsKutusu;

    @FindBy(xpath = "//*[text()='Submit']")
    public WebElement submitButonu;

    @FindBy(xpath = "//*[text()=' Back to course list']")
    public WebElement backToCourseListButonu;

    public void loginMethodu(){
        loginLink.click();
        emailBox.sendKeys(ConfigReader.getProperty("myGecerliEmail"));
        passwordBox.sendKeys(ConfigReader.getProperty("myGecerliPassword"));
        loginButton.click();
    }
}