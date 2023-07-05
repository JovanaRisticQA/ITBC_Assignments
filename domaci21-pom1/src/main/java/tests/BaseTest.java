package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.LandingPage;
import pages.SignUpPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private LandingPage landingPage;
    private SignUpPage signUpPage;

    /**
     * Faker and faker-generated data
     */
    Faker faker = new Faker();
    String name = faker.name().firstName();
    String email = faker.internet().emailAddress();
    String invalidEmail = "j@hgmail";
    String validPassword = faker.internet().password();
    String invalidPassword = faker.internet().password();
    String shortPassword = faker.internet().password(1, 4);


    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",
                "C://Users//jovan//IdeaProjects//ChromeDriver//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        landingPage = new LandingPage(driver, wait);
        signUpPage = new SignUpPage(driver, wait);
    }

    @BeforeMethod
    public void beforeEachMethod(){
        getLandingPage().goToPage();
        getLandingPage().clickSignUpButton();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public LandingPage getLandingPage() {
        return landingPage;
    }

    public SignUpPage getSignUpPage() {
        return signUpPage;
    }

    @AfterClass
    public void cleanUp(){
        getDriver().close();
    }
}
