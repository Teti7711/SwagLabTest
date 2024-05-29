package swag.lab.test.fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import swag.lab.test.page_object_model.HamburgerPageObject;
import swag.lab.test.page_object_model.LoginPageObject;
import swag.lab.test.page_object_model.PLPObject;

public class LoginPageFun {

    public static void ValidLoginLogOutTest (WebDriver driver, WebDriverWait wait) {

        driver.findElement(LoginPageObject.userNameField).click();
        driver.findElement(LoginPageObject.userNameField).sendKeys("standard_user");
        driver.findElement(LoginPageObject.passwordField).click();
        driver.findElement(LoginPageObject.passwordField).sendKeys("secret_sauce");
        driver.findElement(LoginPageObject.loginButton).click();
        //check if PLP is displayed
        wait.until(ExpectedConditions.visibilityOfElementLocated(PLPObject.productsText));

        //logout
    }
        public static void LogOutFun (WebDriver driver, WebDriverWait wait) {
            driver.findElement(HamburgerPageObject.hamburgerMenu).click();
            driver.findElement(HamburgerPageObject.logOutButton).click();
            driver.findElement(HamburgerPageObject.startPage).click();

        }

    }

