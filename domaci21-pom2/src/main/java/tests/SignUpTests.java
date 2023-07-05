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
        getSignUpPage().enterName(getName())
                .clickSignMeUpButton()
                .assertEmailIsRequiredMsgIsDisplayed()
                .assertPasswordIsRequiredMsgIsDisplayed()
                .assertConfirmPasswordIsRequiredMsgIsDisplayed();
    }

    @Test
    public void testSigningUpWithAllButName() {
        getSignUpPage().enterEmail(getEmail())
                .enterPassword(getValidPassword())
                .reEnterPassword(getValidPassword())
                .clickSignMeUpButton()
                .assertNameIsRequiredMsgIsDisplayed();
    }

    @Test
    public void testSigningUpWithInvalidEmail(){
        getSignUpPage().enterName(getName())
                .enterEmail(getInvalidEmail())
                .enterPassword(getValidPassword())
                .reEnterPassword(getValidPassword())
                .assertValidEmailIsRequiredMsgIsDisplayed();
    }

    @Test
    public void testSigningUpWithTooShortPassword(){
        getSignUpPage().enterName(getName())
                .enterEmail(getEmail())
                .enterPassword(getShortPassword())
                .reEnterPassword(getShortPassword())
                .assertShortPasswordMsgIsDisplayed();
    }

    @Test
    public void testSigningUpWhenConfirmPasswordDoesntMatch(){
        getSignUpPage().enterName(getName())
                .enterEmail(getEmail())
                .enterPassword(getValidPassword())
                .reEnterPassword(getInvalidPassword())
                .assertPasswordsMustMatchMsgIsDisplayed();
    }
}