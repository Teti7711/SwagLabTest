package swag.lab.test.page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartFun {

    public static void clickOnCart (WebDriver driver, WebDriverWait wait){

        driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]"))
                .click();

    }

    public static void checkNameInCart (WebDriver driver, WebDriverWait wait){

        String checkNameInCart = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/a[1]/div[1]")).getText();


    }
}
