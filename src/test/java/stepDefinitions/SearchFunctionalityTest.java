package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import basePkg.MainClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;
import pageFactory.SearchResultPage;

public class SearchFunctionalityTest extends MainClass{
	String product = "apple";
	String invalidProduct = "873483724983278429HKHFEHFEHFJHJAHFLDFLK";
	HomePage hp = new HomePage();
	SearchResultPage srp = new SearchResultPage();

	@Given("guest customer is in homepage")
	public void guest_customer_is_in_homepage() {
		Assert.assertEquals(hp.getHomePageTitle(), prop.getProperty("homepageTitle"));
	}

	@When("customer enters valid product in search box")
	public void customer_enters_valid_product_in_search_box() {
		hp.enterProductInSearchTxtBox(product);
	}

	@And("customer clicks search button")
	public void customer_clicks_search_button() {
	   hp.clickSearchBtn();
	}

	@Then("related products should be displayed in search result page")
	public void related_products_should_be_displayed_in_search_result_page() {
		Assert.assertTrue(srp.returnSearchResultPageTitle().contains(product));
		Assert.assertTrue(srp.returnSearchResultHeader().contains(product));
	}
	
	@When("customer hits enter key")
	public void customer_hits_entery_key() {
	    srp.hitEnterKey();
	}
	
	@When ("customer enters invalid product in search box")
	public void customer_enters_invalid_product_in_search_box() {
		hp.enterProductInSearchTxtBox(invalidProduct);
	}
	
	@Then ("no search result error message should be displayed")
	public void no_search_result_error_message_should_be_displayed() {
		Assert.assertTrue(srp.visibilityOfNoResultErrorMsg());
	}
	
	 @And("^customer should be in search result page$") // old snippet format with expression
	    public void customer_should_be_in_search_result_page() {
	        Assert.assertTrue(srp.returnSearchResultPageTitle().contains(invalidProduct));
	    }

	 @When("^customer enters valid (.+) in search box$") // (.+) -> expression representing parameterized step
	    public void customer_enters_valid_in_search_box(String product) {
			hp.enterProductInSearchTxtBox(product);
	    }

	 @Then("^related (.+) should be displayed in search result page$")
	    public void related_should_be_displayed_in_search_result_page(String product) {
		 	Assert.assertTrue(srp.returnSearchResultPageTitle().contains(product));
			Assert.assertTrue(srp.returnSearchResultHeader().contains(product));
	    }
	 
	 @When("customer enters {string} in search box")
	 public void customer_enters_in_search_box(String invalidProduct) {
			hp.enterProductInSearchTxtBox(invalidProduct);
	 }

	 @And("customer should be in {string} search result page")
	 public void customer_should_be_in_search_result_page(String invalidProduct) {
	     Assert.assertTrue(srp.returnSearchResultPageTitle().contains(invalidProduct));
	 }
	
	 @Then ("{string} error message should be displayed")
	 public void error_message_should_be_displayed(String errorMsg) {
		 WebElement noResultErrorMsg = driver.findElement(By.xpath("//span[text()='No results for ']"));
		 Assert.assertTrue(srp.visibilityOfNoResultErrorMsg());
		 Assert.assertEquals(srp.noResultErrorMsgTxt(), errorMsg);
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
