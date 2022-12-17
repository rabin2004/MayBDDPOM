package stepDefinitions;

import org.testng.Assert;

import basePkg.MainClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage;
import pageFactory.MainMenuNavPage;

public class TopNavMenuOptionFunctionalityTest extends MainClass{
	HomePage hp = new HomePage();
	MainMenuNavPage mmnp = new MainMenuNavPage();

	@When("clicks on top navigation {string}")
	public void clicks_on_top_navigation(String MenuOption) {
	    hp.clickEachNavOption(MenuOption);
	}
	@Then("customer should be take to {string} related page")
	public void customer_should_be_take_to_related_page(String MenuOption) {
	    Assert.assertTrue(mmnp.validateNavPageTitle(MenuOption));
	    Assert.assertTrue(mmnp.validateNavPageUrl(MenuOption));
	}




}
