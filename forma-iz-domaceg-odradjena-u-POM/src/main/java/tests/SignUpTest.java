package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest{

    @BeforeMethod
    public void beforeEachMethod(){
        getDriver().findElement(By.xpath("//span [contains(text(), ' Sign Up ')]")).click();
    }

    @Test
    public void verifyUrlContainsSignup(){
        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("/signup"));
    }

    @Test
    public void verifyUserCanSignUpWithValidData(){
        getSignUpPage().enterName();
        getSignUpPage().enterEmail();
        getSignUpPage().enterPassword();
        getSignUpPage().confirmPassword();
        getSignUpPage().clickSignMeUpBtn();
        WebElement verifyAccountPopUp = getDriver().findElement(By.xpath("//div[@class='v-card__title headline grey lighten-2 black--text dlgVerifyAccount']"));
        getWait().until(ExpectedConditions.visibilityOf(verifyAccountPopUp));
        Assert.assertNotNull(verifyAccountPopUp);
    }
}
