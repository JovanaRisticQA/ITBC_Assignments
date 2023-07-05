package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends BasePage {

    private By signUpButton = By.xpath("//span [contains(text(), ' Sign Up ')]");

    public LandingPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void goToPage(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/");
    }

    public void clickSignUpButton(){
        getDriver().findElement(signUpButton).click();
    }
}
