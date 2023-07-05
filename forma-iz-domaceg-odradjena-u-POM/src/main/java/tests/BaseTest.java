package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.SignUpPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private SignUpPage signUpPage;

    public WebDriver getDriver() {
        return this.driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public SignUpPage getSignUpPage() {
        return this.signUpPage;
    }

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver",
                "C://Users//jovan//IdeaProjects//ChromeDriver//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        signUpPage = new SignUpPage(driver, wait);

        getDriver().get("https://vue-demo.daniel-avellaneda.com/");
    }

    @AfterClass
    public void cleanUp(){
        driver.close();
    }
}
