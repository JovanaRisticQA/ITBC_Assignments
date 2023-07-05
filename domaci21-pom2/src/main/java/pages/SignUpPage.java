package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SignUpPage extends BasePage {

    /**
     * Page fields
     */
    private WebElement nameField;
    private WebElement emailField;
    private WebElement passwordField;
    private WebElement confirmPasswordField;
    private WebElement signMeUpButton;

    /**
     * Error messages
     */
    private WebElement nameIsRequiredMsg;
    private WebElement emailIsRequiredMsg;
    private WebElement passwordIsRequiredMsg;
    private WebElement confirmPasswordIsRequiredMsg;
    private WebElement validEmailIsRequiredMsg;
    private WebElement shortPasswordMsg;
    private WebElement passwordsMustMatchMsg;


    /**
     * Constructor
     */
    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    /**
     * Getters for page fields
     */
    public WebElement getNameField(){
        nameField = getDriver().findElement(By.id("name"));
        return nameField;
    }
    public WebElement getEmailField(){
        emailField = getDriver().findElement(By.id("email"));
        return emailField;
    }
    public WebElement getPasswordField(){
        passwordField = getDriver().findElement(By.id("password"));
        return passwordField;
    }
    public WebElement getConfirmPasswordField(){
        confirmPasswordField = getDriver().findElement(By.id("confirmPassword"));
        return confirmPasswordField;
    }
    public WebElement getSignMeUpButton(){
        signMeUpButton = getDriver().findElement(By.xpath("//span[contains(text(), 'Sign me up')]"));
        return signMeUpButton;
    }

    /**
     * Getters for error messages
     */
    public WebElement getNameIsRequiredMsg(){
        nameIsRequiredMsg = getDriver().findElement(By.xpath(
                "/html/body/div/div/main/div/div[2]/div/div/div[2]/span/form/div/div[1]/span/div/div/div[2]/div/div/div"));
        return nameIsRequiredMsg;
    }
    public WebElement getEmailIsRequiredMsg(){
        emailIsRequiredMsg = getDriver().findElement(By.xpath(
                "//*[@id='app']/div/main/div/div[2]/div/div/div[2]/span/form/div/div[2]/span/div/div/div[2]/div/div/div"));
        return emailIsRequiredMsg;
    }
    public WebElement getPasswordIsRequiredMsg(){
        passwordIsRequiredMsg = getDriver().findElement(By.xpath(
                "/html/body/div/div/main/div/div[2]/div/div/div[2]/span/form/div/div[3]/span/div/div/div[2]/div/div/div"));
        return passwordIsRequiredMsg;
    }
    public WebElement getConfirmPasswordIsRequiredMsg(){
        confirmPasswordIsRequiredMsg = getDriver().findElement(By.xpath(
                "/html/body/div/div/main/div/div[2]/div/div/div[2]/span/form/div/div[4]/span/div/div/div[2]/div/div/div"));
        return confirmPasswordIsRequiredMsg;
    }
    public WebElement getValidEmailIsRequiredMsg(){
        validEmailIsRequiredMsg = getDriver().findElement(By.xpath(
                "//div[contains(text(), 'Valid email is required')]"));
        return validEmailIsRequiredMsg;
    }
    public WebElement getShortPasswordMsg(){
        shortPasswordMsg = getDriver().findElement(By.xpath(
                "/html/body/div/div/main/div/div[2]/div/div/div[2]/span/form/div/div[3]/span/div/div/div[2]/div/div/div"));
        return shortPasswordMsg;
    }
    public WebElement getPasswordsMustMatchMsg(){
        passwordsMustMatchMsg = getDriver().findElement(By.xpath("//div[contains(text(),'Passwords must match')]"));
        return passwordsMustMatchMsg;
    }


    /**
     * Page methods
     */
    public SignUpPage enterName(String name){
        getNameField().sendKeys(name);
        return this;
    }
    public SignUpPage enterEmail(String email){
        getEmailField().sendKeys(email);
        return this;
    }
    public SignUpPage enterPassword(String password){
        getPasswordField().sendKeys(password);
        return this;
    }
    public SignUpPage reEnterPassword(String password){
        getConfirmPasswordField().sendKeys(password);
        return this;
    }
    public SignUpPage clickSignMeUpButton(){
        getSignMeUpButton().click();
        return this;
    }


    public SignUpPage assertNameIsRequiredMsgIsDisplayed(){
        getWait().until(ExpectedConditions.visibilityOf(getNameIsRequiredMsg()));
        Assert.assertTrue(getNameIsRequiredMsg().isDisplayed());
        return this;
    }
    public SignUpPage assertEmailIsRequiredMsgIsDisplayed(){
        getWait().until(ExpectedConditions.visibilityOf(getEmailIsRequiredMsg()));
        Assert.assertTrue(getEmailIsRequiredMsg().isDisplayed());
        return this;
    }
    public SignUpPage assertPasswordIsRequiredMsgIsDisplayed(){
        getWait().until(ExpectedConditions.visibilityOf(getPasswordIsRequiredMsg()));
        Assert.assertTrue(getPasswordIsRequiredMsg().isDisplayed());
        return this;
    }
    public SignUpPage assertConfirmPasswordIsRequiredMsgIsDisplayed(){
        getWait().until(ExpectedConditions.visibilityOf(getConfirmPasswordIsRequiredMsg()));
        Assert.assertTrue(getConfirmPasswordIsRequiredMsg().isDisplayed());
        return this;
    }
    public SignUpPage assertValidEmailIsRequiredMsgIsDisplayed(){
        getWait().until(ExpectedConditions.visibilityOf(getValidEmailIsRequiredMsg()));
        Assert.assertTrue(getValidEmailIsRequiredMsg().isDisplayed());
        return this;
    }
    public SignUpPage assertShortPasswordMsgIsDisplayed(){
        getWait().until(ExpectedConditions.visibilityOf(getShortPasswordMsg()));
        Assert.assertTrue(getShortPasswordMsg().isDisplayed());
        return this;
    }
    public SignUpPage assertPasswordsMustMatchMsgIsDisplayed(){
        getWait().until(ExpectedConditions.visibilityOf(getPasswordsMustMatchMsg()));
        Assert.assertTrue(getPasswordsMustMatchMsg().isDisplayed());
        return this;
    }


    public boolean assertEmailFieldsTypeIsEmail(){
        return  "email".equals(getEmailField().getAttribute("type"));
    }
    public boolean assertPasswordFieldsTypeIsPassword(){
        return  "password".equals(getPasswordField().getAttribute("type"));
    }

}