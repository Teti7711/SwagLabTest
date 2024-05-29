package swag.lab.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class CheckOutTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;

    @BeforeTest
    public void setUp() {
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
        driver.findElement(By.id("user-name")).click();
        //Enter Username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //Click on Password Field
        driver.findElement(By.id("password")).click();
        //Enter Password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //CLick on Login Button
        driver.findElement(By.id("login-button")).click();
        //Verify that PLP is displayed
        driver.findElement(By.xpath("//span[contains(text(),'Products')]")).isDisplayed();

        //Click on an item "Sauce Lab Pack"
        driver.findElement(By.id("item_4_title_link")).click();

        //Click on "Add to Cart"
        driver.findElement(By.id("add-to-cart")).click();

        // Click on Shopping Cart
        driver.findElement(By.id("shopping_cart_container")).click();

        //Verify that the item is added to Shopping Cart
        driver.findElement(By.xpath("//div[@id='']")).isDisplayed();

        //Click on Check Out Button
        driver.findElement(By.id("checkout")).click();

        //Verify if Checkout Info is displayed
        driver.findElement(By.xpath("//span[contains(text(),'Checkout: Your Information')]")).isDisplayed();

        //Click on First Name Field
        driver.findElement(By.id("first-name")).click();
        //Enter First Name
        driver.findElement(By.id("first-name")).sendKeys("Tetiana");

        //Click on Last Name
        driver.findElement(By.id("last-name")).click();
        //Enter Last Name
        driver.findElement(By.id("last-name")).sendKeys("Kozachok");

        //Click on Zip Code
        driver.findElement(By.id("postal-code")).click();
        //Enter Zip Code
        driver.findElement(By.id("postal-code")).sendKeys("11090");

        //Click on Continue Button
        driver.findElement(By.id("continue")).click();

        //Verify if Checkout Overview is displayed
        driver.findElement(By.xpath("//span[contains(text(),'Checkout: Overview')]")).isDisplayed();

        //Click on Finish Button
        driver.findElement(By.id("finish")).click();
        //Verify if Order is done
        driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your order!')]")).isDisplayed();

        //Click on "burger" Button
        driver.findElement(By.id("react-burger-menu-btn")).click();

        //Click on Logout
        driver.findElement(By.id("logout_sidebar_link")).click();

        //Verify that the Login Page visible
        driver.findElement(By.xpath("//div[contains(text(),'Swag Labs')]")).isDisplayed();





    }

    @AfterTest
    public void endTest() {
        driver.quit();

    }
}