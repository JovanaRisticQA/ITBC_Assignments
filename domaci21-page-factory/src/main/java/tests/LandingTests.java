package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingTests extends BaseTest {

    @Test
    public void verifyUrlContainsSignup(){
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/signup"));
    }
}
