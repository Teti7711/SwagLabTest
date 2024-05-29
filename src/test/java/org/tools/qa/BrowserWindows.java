package org.tools.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BrowserWindows {

    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://demoqa.com/browser-windows";
    }

    @Test
    public void BrowserWindows() throws InterruptedException {
        driver.get(baseURL);

    //New Tab Button
        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(2000);
    //List of Tabs
        List<String> browserTabs = new ArrayList(driver.getWindowHandles());
    //Switch to new tab
        driver.switchTo().window(browserTabs.get(1));
    //Check if it is a correct page
        String myURL = driver.getCurrentUrl();
        System.out.println(myURL);
        Assert.assertNotEquals(myURL, baseURL);
        driver.findElement(By.xpath("//h1[@id='sampleHeading']")).isDisplayed();
    //Close tab and get back
        driver.close();
        driver.switchTo().window(browserTabs.get(0));

    //New Window Button D/Z
        driver.findElement(By.id("windowButton")).click();
        Thread.sleep(2000);
    //List of Windows
        List<String> browserWindows = new ArrayList(driver.getWindowHandles());
    //Switch to new tab
        driver.switchTo().window(browserWindows.get(1));
    //Check if it is a correct window
        String myWindowURL =  driver.getCurrentUrl();
        System.out.println(myWindowURL);
        Assert.assertNotEquals(myWindowURL, baseURL);
        driver.findElement(By.xpath("//h1[@id='sampleHeading']")).isDisplayed();
    //Close new Window
    driver.close();
        driver.switchTo().window(browserTabs.get(0));

    //New Window Message D/Z
        driver.findElement(By.id("messageWindowButton")).click();
        Thread.sleep(2000);
    //List of windows


    }

    @AfterTest
    public void endTest(){
        driver.quit();
    }

}
