package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends BasePage {

    private WebElement signUpButton;

    public LandingPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getSignUpButton(){
        signUpButton = getDriver().findElement(By.xpath
                ("//span[contains(text(), ' Sign Up ')]"));
        return signUpButton;
    }

    public LandingPage goToPage(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/");
        return this;
    }

    public LandingPage clickSignUpButton(){
        getSignUpButton().click();
        return this;
    }
}