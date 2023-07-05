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
        getSignUpPage().enterName(name);
        getSignUpPage().clickSignMeUpButton();
        getSignUpPage().assertEmailIsRequiredMsgIsDisplayed();
        getSignUpPage().assertPasswordIsRequiredMsgIsDisplayed();
        getSignUpPage().assertConfirmPasswordIsRequiredMsgIsDisplayed();
    }

    @Test
    public void testSigningUpWithAllButName() {
        getSignUpPage().enterEmail(email);
        getSignUpPage().enterPassword(validPassword);
        getSignUpPage().reEnterPassword(validPassword);
        getSignUpPage().clickSignMeUpButton();
        getSignUpPage().assertNameIsRequiredMsgIsDisplayed();
    }

    @Test
    public void testSigningUpWithInvalidEmail(){
        getSignUpPage().enterName(name);
        getSignUpPage().enterEmail(invalidEmail);
        getSignUpPage().enterPassword(validPassword);
        getSignUpPage().reEnterPassword(validPassword);
        getSignUpPage().assertValidEmailIsRequiredMsgIsDisplayed();
    }

    @Test
    public void testSigningUpWithTooShortPassword(){
        getSignUpPage().enterName(name);
        getSignUpPage().enterEmail(email);
        getSignUpPage().enterPassword(shortPassword);
        getSignUpPage().reEnterPassword(shortPassword);
        getSignUpPage().assertShortPasswordMsgIsDisplayed();
    }

    @Test
    public void testSigningUpWhenConfirmPasswordDoesntMatch(){
        getSignUpPage().enterName(name);
        getSignUpPage().enterEmail(email);
        getSignUpPage().enterPassword(validPassword);
        getSignUpPage().reEnterPassword(invalidPassword);
        getSignUpPage().assertPasswordsMustMatchMsgIsDisplayed();
    }
}