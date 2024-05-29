package swag.lab.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class LUMACreateAcc {

    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://magento.softwaretestingboard.com/";
    }

    @Test
    public void validLoginTest() {

        driver.get(baseURL);

        //Click on Create Account
        driver.findElement(By.xpath("//header/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
        //Verify that "CreateNewCustomerAccount" visible
        driver.findElement(By.xpath("//span[contains(text(),'Create New Customer Account')]")).isDisplayed();

        //Click on First Name Field
        driver.findElement(By.id("firstname")).click();
        //Enter Name
        driver.findElement(By.id("firstname")).sendKeys("Tetiana");

        //Click on Last Name Field
        driver.findElement(By.id("lastname")).click();
        //Enter Last Name
        driver.findElement(By.id("lastname")).sendKeys("Kozachok");

        //CLick on Email Field
        driver.findElement(By.id("email_address")).click();
        //Enter email
        driver.findElement(By.id("email_address")).sendKeys("tanjakozachokiui6@yopmail.com");

        //CLick on Password
        driver.findElement(By.id("password")).click();
        //Enter Password
        driver.findElement(By.id("password")).sendKeys("Kozachok1");

        //Click on Confirm Password
        driver.findElement(By.xpath("//input[@id='password-confirmation']")).click();
        //Enter Password once again
        driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("Kozachok1");

        //Click on Confirm Password
        driver.findElement(By.xpath("//body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]")).click();
        //Verify that Account is created
        driver.findElement(By.xpath("//div[contains(text(),'Thank you for registering with Main Website Store.')]")).isDisplayed();



    }

    @AfterTest
    public void endTest() {
        driver.quit();
    }

}
