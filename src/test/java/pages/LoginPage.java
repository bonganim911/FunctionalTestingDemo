package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage  extends BasePage{

    By username = By.id(app_package_name + "edusername");
    By password = By.id(app_package_name + "edpassword");
    By login_Button = By.id(app_package_name + "btnsignin");
//    By showPassword = By.id(app_package_name + "showpassword");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage invalidLogin() {
        waitForVisibilityOf(username);
        driver.findElement(username).sendKeys("someone@yookos.com");
        driver.findElement(password).sendKeys("yookos123");
        //driver.findElement(showPassword).click();
        driver.findElement(login_Button).click();
        return new LoginPage(driver);
    }


}
