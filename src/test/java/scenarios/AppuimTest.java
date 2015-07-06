package scenarios;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LandingPage;
import pages.LoginPage;

public class AppuimTest  extends AndroidSetup{

    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

//    @Test
//    public void testShouldClickSigninOnLandingPage() throws InterruptedException
//    {
//        new LandingPage(driver).homePage();
//    }

    @Test
    public void testShouldLogin() throws InterruptedException
    {
        new LandingPage(driver).homePage();
        new LoginPage(driver).invalidLogin();
    }

}
