package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtilities;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryStepDefinitions {

    AccountSummaryPage accountSummaryPage=new AccountSummaryPage();

    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        accountSummaryPage.login();

    }

    @Then("Page title shows {string}")
    public void page_title_shows(String string) {
        //System.out.println(accountSummaryPage.getAccountSummaryTitle());
        Assert.assertEquals(string,accountSummaryPage.getAccountSummaryTitle());

    }

    @Then("Account summary page should have to following account types:")
    public void account_summary_page_should_have_to_following_account_types(List<String> dataTable) {
        //System.out.println(accountSummaryPage.getAccountTypeNames());
        Assert.assertEquals(dataTable, accountSummaryPage.getAccountTypeNames());

    }

    @Then("Credit Accounts table must have columns Account, Credit Card and Balance")
    public void credit_Accounts_table_must_have_columns_Account_Credit_Card_and_Balance(List<String> dataTable) {
        //System.out.println(accountSummaryPage.getCreditAccountsNames());
        System.out.println(accountSummaryPage.getCreditAccountsNames());
        System.out.println(dataTable.toString());
        Assert.assertEquals(dataTable,accountSummaryPage.getCreditAccountsNames());
    }

}
