package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 25);

    @FindBy(className = "icon-signin")
    protected WebElement signInButton;



    public void clickOnSignInButton(){
        BrowserUtilities.wait(3);
        wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();

    }

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

   // public abstract void login();

//    public String getSelectedOption(String id) {
//        return new Select(driver.findElement(By.id(id))).getFirstSelectedOption().getText();
//    }

}
