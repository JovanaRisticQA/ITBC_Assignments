package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SignUpPage extends BasePage {

    /**
     * Page fields
     */
    @FindBy(id = "name")
    WebElement nameField;
    @FindBy(id = "email")
    WebElement emailField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(id = "confirmPassword")
    WebElement confirmPasswordField;
    @FindBy(xpath = "//span[contains(text(), 'Sign me up')]")
    WebElement signMeUpButton;

    /**
     * Error messages
     */

    @FindBy(xpath = "/html/body/div/div/main/div/div[2]/div/div/div[2]/span/form/div/div[1]/span/div/div/div[2]/div/div/div")
    WebElement nameIsRequiredMsg;
    @FindBy(xpath = "//*[@id='app']/div/main/div/div[2]/div/div/div[2]/span/form/div/div[2]/span/div/div/div[2]/div/div/div")
    WebElement emailIsRequiredMsg;
    @FindBy(xpath = "/html/body/div/div/main/div/div[2]/div/div/div[2]/span/form/div/div[3]/span/div/div/div[2]/div/div/div")
    WebElement passwordIsRequiredMsg;
    @FindBy(xpath = "/html/body/div/div/main/div/div[2]/div/div/div[2]/span/form/div/div[4]/span/div/div/div[2]/div/div/div")
    WebElement confirmPasswordIsRequiredMsg;
    @FindBy(xpath = "//div[contains(text(), 'Valid email is required')]")
    WebElement validEmailIsRequiredMsg;
    @FindBy(xpath = "/html/body/div/div/main/div/div[2]/div/div/div[2]/span/form/div/div[3]/span/div/div/div[2]/div/div/div")
    WebElement shortPasswordMsg;
    @FindBy(xpath = "//div[contains(text(),'Passwords must match')]")
    WebElement passwordsMustMatchMsg;


    /**
     * Constructor
     */
    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(getDriver(), this);
    }

    /**
     * Page methods
     */
    public void enterName(String name){
        nameField.sendKeys(name);
    }
    public void enterEmail(String email){
        emailField.sendKeys(email);
    }
    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }
    public void reEnterPassword(String password){
        confirmPasswordField.sendKeys(password);
    }
    public void clickSignMeUpButton(){
        signMeUpButton.click();
    }


    public void assertNameIsRequiredMsgIsDisplayed(){
        getWait().until(ExpectedConditions.visibilityOf(nameIsRequiredMsg));
        Assert.assertTrue(nameIsRequiredMsg.isDisplayed());
    }
    public void assertEmailIsRequiredMsgIsDisplayed(){
        getWait().until(ExpectedConditions.visibilityOf(emailIsRequiredMsg));
        Assert.assertTrue(emailIsRequiredMsg.isDisplayed());
    }
    public void assertPasswordIsRequiredMsgIsDisplayed(){
        getWait().until(ExpectedConditions.visibilityOf(passwordIsRequiredMsg));
        Assert.assertTrue(passwordIsRequiredMsg.isDisplayed());
    }
    public void assertConfirmPasswordIsRequiredMsgIsDisplayed(){
        getWait().until(ExpectedConditions.visibilityOf(confirmPasswordIsRequiredMsg));
        Assert.assertTrue(confirmPasswordIsRequiredMsg.isDisplayed());
    }
    public void assertValidEmailIsRequiredMsgIsDisplayed(){
        getWait().until(ExpectedConditions.visibilityOf(validEmailIsRequiredMsg));
        Assert.assertTrue(validEmailIsRequiredMsg.isDisplayed());
    }
    public void assertShortPasswordMsgIsDisplayed(){
        getWait().until(ExpectedConditions.visibilityOf(shortPasswordMsg));
        Assert.assertTrue(shortPasswordMsg.isDisplayed());
    }
    public void assertPasswordsMustMatchMsgIsDisplayed(){
        getWait().until(ExpectedConditions.visibilityOf(passwordsMustMatchMsg));
        Assert.assertTrue(passwordsMustMatchMsg.isDisplayed());
    }


    public boolean assertEmailFieldsTypeIsEmail(){
        return  "email".equals(emailField.getAttribute("type"));
    }
    public boolean assertPasswordFieldsTypeIsPassword(){
        return  "password".equals(passwordField.getAttribute("type"));
    }

}
