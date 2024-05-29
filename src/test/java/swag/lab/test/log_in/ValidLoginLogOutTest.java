package swag.lab.test.log_in;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import swag.lab.test.fun.LoginPageFun;
import swag.lab.test.page_object_model.LoginPageObject;
import swag.lab.test.page_object_model.PLPObject;
import utility.BeforeAll;

public class ValidLoginLogOutTest extends BeforeAll {

@Test (priority = 1, description = "TC-001 - Valid Log in Test")
    public void validLoginLogOutTest() {

    //Valid Log In
    LoginPageFun.ValidLoginLogOutTest(driver, wait);
    //Log Out Test
    LoginPageFun.LogOutFun(driver, wait);

}







}
