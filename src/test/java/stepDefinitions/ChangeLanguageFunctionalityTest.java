package stepDefinitions;

import org.testng.Assert;
import basePkg.MainClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.ChangeLanguagePage;
import pageFactory.HomePage;

public class ChangeLanguageFunctionalityTest extends MainClass{
	HomePage hp = new HomePage();
	ChangeLanguagePage clp = new ChangeLanguagePage();

	@Given("customer is in change language")
	public void customer_is_in_change_language() {
		hp.clickLanguageChangeOption();
	}

	@When("customer clicks {string}")
	public void customer_clicks(String langSelected) {
		if(langSelected.equalsIgnoreCase("english")) {
			clp.clickEnglishLangOption();
		}else if(langSelected.equalsIgnoreCase("spanish")) {
			clp.clickSpanishLangOption();
		}
	}

	@Then("language of the page should change based on {string} selected")
	public void language_of_the_page_should_change_based_on_selected(String langSelected) {
		if(langSelected.equalsIgnoreCase("english")) {
			Assert.assertEquals(clp.languageSettingHeaderTxt(), prop.getProperty("languageHeaderEnglish"));
		}else if(langSelected.equalsIgnoreCase("spanish")) {
			Assert.assertEquals(clp.languageSettingHeaderTxt(), prop.getProperty("languageHeaderSpanish"));
		}
	}
}
