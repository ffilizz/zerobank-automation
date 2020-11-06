package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AccountActivity extends LoginPage {

    @FindBy(id="aa_accountId")
    private WebElement dropDownContent;

    @FindBy(linkText = "Account Activity")
    private WebElement acac;

    @FindBy(xpath="//table[@class='table table-condensed table-hover']//th")
    private List<WebElement> transactionsColumn;

    public String getAccountActivityTitle(){
        BrowserUtilities.waitForPageToLoad(5);
        BrowserUtilities.wait(2);
        acac.click();
        System.out.println(Driver.getDriver().getTitle());
        return Driver.getDriver().getTitle();
    }
     public String getDefaultDRopDownOption(){
       BrowserUtilities.waitForPageToLoad(5);
         Select select=new Select(dropDownContent);
         System.out.println("in get default");
       return select.getFirstSelectedOption().getText();

     }
    public List<String> getDropdownOptions(){
        List <String> s = new ArrayList<>();
        Select select=new Select(dropDownContent);
        System.out.println("in get options");
        List <WebElement> Alloptions = select.getOptions();
        for (int i =1 ; i<Alloptions.size(); i++)
        {
            System.out.println(Alloptions.get(i).getText());
            s.add(Alloptions.get(i).getText());
        }

    return s;


    }

    public List<String>getTransactionsColumnNames(){
        BrowserUtilities.waitForPageToLoad(20);
        return BrowserUtilities.getTextFromWebElements(transactionsColumn);
    }


}
