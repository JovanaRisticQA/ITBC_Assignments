package tests;

import org.testng.annotations.Test;

public class SignUpTests extends BaseTest {

    @Test
    public void emailAndPasswordAttributes() {
        getSignUpPage().assertEmailFieldsTypeIsEmail();
        getSignUpPage().assertPasswordFieldsTypeIsPassword();
    }

    @Test
    public void testSigningUpWithOnlyName(){
        getSignUpPage().enterName(getName());
        getSignUpPage().clickSignMeUpButton();
        getSignUpPage().assertEmailIsRequiredMsgIsDisplayed();
        getSignUpPage().assertPasswordIsRequiredMsgIsDisplayed();
        getSignUpPage().assertConfirmPasswordIsRequiredMsgIsDisplayed();
    }

    @Test
    public void testSigningUpWithAllButName() {
        getSignUpPage().enterEmail(getEmail());
        getSignUpPage().enterPassword(getValidPassword());
        getSignUpPage().reEnterPassword(getValidPassword());
        getSignUpPage().clickSignMeUpButton();
        getSignUpPage().assertNameIsRequiredMsgIsDisplayed();
    }

    @Test
    public void testSigningUpWithInvalidEmail(){
        getSignUpPage().enterName(getName());
        getSignUpPage().enterEmail(getInvalidEmail());
        getSignUpPage().enterPassword(getValidPassword());
        getSignUpPage().reEnterPassword(getValidPassword());
        getSignUpPage().assertValidEmailIsRequiredMsgIsDisplayed();
    }

    @Test
    public void testSigningUpWithTooShortPassword(){
        getSignUpPage().enterName(getName());
        getSignUpPage().enterEmail(getEmail());
        getSignUpPage().enterPassword(getShortPassword());
        getSignUpPage().reEnterPassword(getShortPassword());
        getSignUpPage().assertShortPasswordMsgIsDisplayed();
    }

    @Test
    public void testSigningUpWhenConfirmPasswordDoesntMatch(){
        getSignUpPage().enterName(getName());
        getSignUpPage().enterEmail(getEmail());
        getSignUpPage().enterPassword(getValidPassword());
        getSignUpPage().reEnterPassword(getInvalidPassword());
        getSignUpPage().assertPasswordsMustMatchMsgIsDisplayed();
    }
}