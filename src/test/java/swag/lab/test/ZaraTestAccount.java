package swag.lab.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ZaraTestAccount {

    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://www.zara.com/rs/en/";
    }

    @Test
    public void validLoginTest() {

        driver.get(baseURL);

        //Click on LogIn Button
        driver.findElement(By.xpath("//span[contains(text(),'LOG IN')]")).click();

        //Verify if required Login Info is visible
        driver.findElement(By.xpath("//span[contains(text(),'Log in to your account')]")).isDisplayed();

        //Click on Register Button
        driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();

        //Verify if Personal Detail Fields are visible
        driver.findElement(By.xpath("//span[contains(text(),'Personal details')]")).isDisplayed();

        //Click on Email Field
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).click();
        //Enter Email
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("tanjakozachok4@gmail.com");

        //Click on Password Field
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")).click();
        //Enter Password
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/main[1]/article[1]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Kozachok1");








    }

    @AfterTest
    public void endTest() {
        driver.quit();
    }

}
