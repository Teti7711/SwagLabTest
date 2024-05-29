package org.tools.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class UploadTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://demoqa.com/upload-download";
    }

    @Test
    public void UploadTest() throws InterruptedException {
        driver.get(baseURL);

    //Upload File
        WebElement uploadFileButton = driver.findElement(By.id("uploadFile"));
    //Uploading the file using sendKeys
        uploadFileButton.sendKeys("C:\\Users\\QA1.2\\Desktop\\tiger.jpg");
        Thread.sleep(10000);
        driver.findElement(By.id("//p[@id='uploadedFilePath']")).isDisplayed();




}


    @AfterTest
    public void endTest(){
        driver.quit();
    }

}

