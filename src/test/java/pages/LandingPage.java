package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage extends BasePage {

    By LogInButton = By.id(app_package_name + "btnlogin");

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void homePage() {
        LandingScreen();
    }

    private void LandingScreen() {
        waitForVisibilityOf(LogInButton);
        driver.findElement(LogInButton).click();
    }

}