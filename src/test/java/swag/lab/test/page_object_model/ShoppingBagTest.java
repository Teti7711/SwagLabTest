package swag.lab.test.page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import swag.lab.test.fun.LoginPageFun;
import swag.lab.test.fun.PLPFun;
import utility.BeforeAll;

public class ShoppingBagTest extends BeforeAll {


   @Test
   public void shoppingBagTest(){

       LoginPageFun.ValidLoginLogOutTest(driver,wait);

       //Click on chosen Item
       PLPFun.clickOnFirstPLP(driver,wait);

       //Check PDP name of product
       PDPFun.getNameOfProduct(driver, wait);

       //Click on add to cart
       PDPFun.clickOnAddToCart(driver, wait);

       //Click on shopping bag
       CartFun.clickOnCart(driver, wait);

       //Check name product in Cart
       CartFun.checkNameInCart(driver, wait);

        //Check if names are matching on PDP and in Cart
        Assert.assertEquals("Sauce Labs Backpack", "Sauce Labs Backpack");








    }
}
