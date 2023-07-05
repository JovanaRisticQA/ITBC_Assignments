package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SignUpPage extends BasePage {

    /**
     * Page fields
     */
    private By nameField = By.id("name");
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By confirmPasswordField = By.id("confirmPassword");
    private By signMeUpButton = By.xpath("//span[contains(text(), 'Sign me up')]");

    /**
     * Error messages
     */

    private By nameIsRequiredMsg = By.xpath("/html/body/div/div/main/div/div[2]/div/div/div[2]/span/form/div/div[1]/span/div/div/div[2]/div/div/div");
    private By emailIsRequiredMsg = By.xpath("//*[@id='app']/div/main/div/div[2]/div/div/div[2]/span/form/div/div[2]/span/div/div/div[2]/div/div/div");
    private By passwordIsRequiredMsg = By.xpath("/html/body/div/div/main/div/div[2]/div/div/div[2]/span/form/div/div[3]/span/div/div/div[2]/div/div/div");
    private By confirmPasswordIsRequiredMsg = By.xpath("/html/body/div/div/main/div/div[2]/div/div/div[2]/span/form/div/div[4]/span/div/div/div[2]/div/div/div");
    private By validEmailIsRequiredMsg = By.xpath("//div[contains(text(), 'Valid email is required')]");
    private By shortPasswordMsg = By.xpath("/html/body/div/div/main/div/div[2]/div/div/div[2]/span/form/div/div[3]/span/div/div/div[2]/div/div/div");
    private By passwordsMustMatchMsg = By.xpath("//div[contains(text(),'Passwords must match')]");


    /**
     * Constructor
     */
    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    /**
     * Page methods
     */
    public void enterName(String name){
        getDriver().findElement(nameField).sendKeys(name);
    }
    public void enterEmail(String email){
        getDriver().findElement(emailField).sendKeys(email);
    }
    public void enterPassword(String password){
        getDriver().findElement(passwordField).sendKeys(password);
    }
    public void reEnterPassword(String password){
        getDriver().findElement(confirmPasswordField).sendKeys(password);
    }
    public void clickSignMeUpButton(){
        getDriver().findElement(signMeUpButton).click();
    }


    public void assertNameIsRequiredMsgIsDisplayed(){
        getWait().until(ExpectedConditions.visibilityOf(getDriver().findElement(nameIsRequiredMsg)));
        Assert.assertTrue(getDriver().findElement(nameIsRequiredMsg).isDisplayed());
    }
    public void assertEmailIsRequiredMsgIsDisplayed(){
        getWait().until(ExpectedConditions.visibilityOf(getDriver().findElement(emailIsRequiredMsg)));
        Assert.assertTrue(getDriver().findElement(emailIsRequiredMsg).isDisplayed());
    }
    public void assertPasswordIsRequiredMsgIsDisplayed(){
        getWait().until(ExpectedConditions.visibilityOf(getDriver().findElement(passwordIsRequiredMsg)));
        Assert.assertTrue(getDriver().findElement(passwordIsRequiredMsg).isDisplayed());
    }
    public void assertConfirmPasswordIsRequiredMsgIsDisplayed(){
        getWait().until(ExpectedConditions.visibilityOf(getDriver().findElement(confirmPasswordIsRequiredMsg)));
        Assert.assertTrue(getDriver().findElement(confirmPasswordIsRequiredMsg).isDisplayed());
    }
    public void assertValidEmailIsRequiredMsgIsDisplayed(){
        getWait().until(ExpectedConditions.visibilityOf(getDriver().findElement(validEmailIsRequiredMsg)));
        Assert.assertTrue(getDriver().findElement(validEmailIsRequiredMsg).isDisplayed());
    }
    public void assertShortPasswordMsgIsDisplayed(){
        getWait().until(ExpectedConditions.visibilityOf(getDriver().findElement(shortPasswordMsg)));
        Assert.assertTrue(getDriver().findElement(shortPasswordMsg).isDisplayed());
    }
    public void assertPasswordsMustMatchMsgIsDisplayed(){
        getWait().until(ExpectedConditions.visibilityOf(getDriver().findElement(passwordsMustMatchMsg)));
        Assert.assertTrue(getDriver().findElement(passwordsMustMatchMsg).isDisplayed());
    }


    public boolean assertEmailFieldsTypeIsEmail(){
        return  "email".equals(getDriver().findElement(emailField).getAttribute("type"));
    }
    public boolean assertPasswordFieldsTypeIsPassword(){
        return  "password".equals(getDriver().findElement(passwordField).getAttribute("type"));
    }

}
