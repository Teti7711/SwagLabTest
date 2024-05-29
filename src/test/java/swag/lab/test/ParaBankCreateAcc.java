package swag.lab.test;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Random;

public class ParaBankCreateAcc {

    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://parabank.parasoft.com/parabank/index.htm";
    }

    @Test
    public void ParaBankCreateAcc() {
        driver.get(baseURL);

    // Click on Register
    driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
    //Verify that SignUp Form is visible
    driver.findElement(By.xpath("//h1[contains(text(),'Signing up is easy!')]")).isDisplayed();

    String prefixFirstName = "myFirstName_";
    String myFirstName = prefixFirstName + RandomStringUtils.randomAlphanumeric(7).toLowerCase();

    //Click on First Name
    driver.findElement(By.xpath("//input[@id='customer.firstName']")).click();
    //Enter First Name
    driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(myFirstName);

    String prefixLastName = "myLastName_";
    String myLastName = prefixLastName + RandomStringUtils.randomAlphanumeric(7).toLowerCase();

        //Click on Last Name
        driver.findElement(By.xpath("//input[@id='customer.lastName']")).click();
        //Enter First Name
        driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(myLastName);

    String prefixAddress = "myAddress_";
    String myAddress = prefixAddress + RandomStringUtils.randomAlphanumeric(30).toLowerCase();

        //Click on Address
        driver.findElement(By.xpath("//input[@id='customer.address.street']")).click();
        //Enter Address
        driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys(myAddress);

    String prefixCity = "myCity_";
    String myCity = prefixCity + RandomStringUtils.randomAlphanumeric(15).toLowerCase();

        //Click on City
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).click();
        //Enter City
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys(myCity);




    }

    @AfterTest
    public void endTest(){
        driver.quit();
    }


}
