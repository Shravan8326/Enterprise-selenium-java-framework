package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulProviderLogin() {
        // Initialize the page object using the driver from your BaseTest
        LoginPage loginPage = new LoginPage(driver);

        // Execute the login workflow using your existing method
        loginPage.login("ProviderAdmin", "SecurePass123!");

        // Add an assertion to prove the login worked 
        // (You can update the expected title to match whatever portal you test against)
        String expectedTitle = "EHR Dashboard";
        Assert.assertEquals(driver.getTitle(), expectedTitle, "Login failed or dashboard did not load.");
    }
}
