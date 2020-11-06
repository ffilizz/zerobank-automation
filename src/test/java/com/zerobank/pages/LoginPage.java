package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id="user_login")
    private WebElement username;
    @FindBy(id = "user_password")
    private WebElement password;
    @FindBy(xpath = "//form[@id='login_form']/div[1]")
    private WebElement loginWarningMessage;

    public void login(){
        username.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);
    }
    public void login(String usernameValue, String passwordValue) {
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
        BrowserUtilities.waitForPageToLoad(5);
        BrowserUtilities.wait(3);
    }
    public  String login_WarningMessage(){
       String  errorMessage=loginWarningMessage.getText();
        return errorMessage;
    }

}
