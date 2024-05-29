package swag.lab.test.page_object_model;

import org.openqa.selenium.By;

public class LoginPageObject {

    public static By userNameField = By.id("user-name");
    public static By passwordField = By.id("password");
    public static String validUser = "standard_user";
    public static String userPassword = "secret_sauce";
    public static By loginButton = By.id("login-button");

    //eto kak konstanti, mi mozem ih peretashit v dr klassi, naprimer esli developeri pomenyali kod i chtob ne menyat 100
    //klassov, menyem tolko zdes, naprimer id usera ili password


}
