package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends LoginPage {

   @FindBy(className="board-header")
   private List<WebElement> accountTypes;

    @FindBy(xpath="//div[3]//div[1]//table[1]//thead[1]//tr[1]//th")
    private List<WebElement> creditAccountNames;


    public String getAccountSummaryTitle(){
        BrowserUtilities.waitForPageToLoad(5);
        BrowserUtilities.wait(2);
        return Driver.getDriver().getTitle();
    }
    public List<String> getAccountTypeNames(){

        BrowserUtilities.waitForPageToLoad(20);
        return BrowserUtilities.getTextFromWebElements(accountTypes);

    }

    public List<String>getCreditAccountsNames(){
        BrowserUtilities.waitForPageToLoad(20);
        return BrowserUtilities.getTextFromWebElements(creditAccountNames);
    }

}
