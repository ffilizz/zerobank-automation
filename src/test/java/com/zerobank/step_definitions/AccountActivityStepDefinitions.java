package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivity;
import io.cucumber.core.internal.gherkin.StringUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AccountActivityStepDefinitions {

    AccountActivity accountActivity=new AccountActivity();



    @Given("the user is logged in to Acccount activity")
    public void the_user_is_logged_in_to_Acccount_activity() {
        accountActivity.login();
    }

    @Then("ActivityPage title shows {string}")
    public void Activitypage_title_shows(String string) {
        //System.out.println(accountSummaryPage.getAccountSummaryTitle());
        Assert.assertEquals(string,accountActivity.getAccountActivityTitle());

    }

    @Then("Account drop down default should be {string}:")
    public void account_drop_down_default_should_be(String string) {
        //System.out.println( accountActivity.getDefaultDRopDownOption() );
        Assert.assertEquals(string,accountActivity.getDefaultDRopDownOption());


    }

    @Then("Account drop down should have the following options")
    public void account_drop_down_should_have_the_following_options(List<String> dataTable) {
        int size =accountActivity.getDropdownOptions().size();
        System.out.println(dataTable.size());
        System.out.println(size);
        Assert.assertTrue(dataTable.containsAll(accountActivity.getDropdownOptions()));
        //Assert.assertEquals(dataTable,accountActivity.getDropdownOptions());

    }

    @Then("Transactions table should have column names")
    public void transactions_table_should_have_column_names(List<String> dataTable) {

//        String actual= StringUtils.join(",", accountActivity.getTransactionsColumnNames());
//        String expected = dataTable.toString().replace("[","").replace("]","").replace(", "," ");
//       Assert.assertEquals(expected, actual);
        Assert.assertEquals(dataTable,accountActivity.getTransactionsColumnNames());
    }


}
