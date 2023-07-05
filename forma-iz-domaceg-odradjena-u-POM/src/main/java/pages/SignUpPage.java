package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BasePage {
    private By nameField = By.id("name");
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By confirmPasswordField = By.id("confirmPassword");
    private By signMeUpBtn = By.xpath("//button[@type='submit']");

    private String name = getFaker().name().firstName();
    private String email = getFaker().internet().emailAddress();
    private String password = getFaker().internet().password();

    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void enterName(){
        getDriver().findElement(nameField).sendKeys(this.name);
    }

    public void enterEmail(){
        getDriver().findElement(emailField).sendKeys(this.email);
    }

    public void enterPassword(){
        getDriver().findElement(passwordField).sendKeys(this.password);
    }

    public void confirmPassword(){
        getDriver().findElement(confirmPasswordField).sendKeys(this.password);
    }

    public void clickSignMeUpBtn(){
        getDriver().findElement(signMeUpBtn).click();
    }

}
