package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(), ' Sign Up ')]")
    WebElement signUpButton;

    public LandingPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(getDriver(), this);
    }

    public void goToPage(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/");
    }

    public void clickSignUpButton(){
        signUpButton.click();
    }
}
