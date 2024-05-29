package swag.lab.test.fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import swag.lab.test.page_object_model.ProductPageListingObj;

public class PLPFun {

    public static void clickOnFirstPLP (WebDriver driver, WebDriverWait wait) {

        driver.findElement(ProductPageListingObj.firstProductFromList).isDisplayed();

        driver.findElement(ProductPageListingObj.firstProductFromList).click();


        }


    }

