package swag.lab.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import swag.lab.test.page_object_model.LoginPageObject;

import java.time.Duration;

public class ValidLoginTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://www.saucedemo.com/";

    }

    @Test
    public void validLoginTest() {

        driver.get(baseURL);

        //Click on User Field
        driver.findElement(LoginPageObject.userNameField).click();
        //Enter Username
        driver.findElement(LoginPageObject.userNameField).sendKeys("standard_user");

        //Click on Password Field
        driver.findElement(By.id("password")).click();
        //Enter Password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //CLick on Login Button
        driver.findElement(By.id("login-button")).click();
        //Verify that PLP is displayed
        driver.findElement(By.xpath("//span[contains(text(),'Products')]")).isDisplayed();









    }

    @AfterTest
    public void endTest(){
        driver.quit();

    }






}
