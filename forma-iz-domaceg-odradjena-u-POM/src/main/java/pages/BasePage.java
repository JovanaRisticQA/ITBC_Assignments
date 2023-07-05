package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private Faker faker = new Faker();

    public BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebDriver getDriver(){
        return this.driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public Faker getFaker() {
        return faker;
    }
}
