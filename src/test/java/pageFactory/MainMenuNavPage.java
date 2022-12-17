package pageFactory;

import org.openqa.selenium.support.PageFactory;

import basePkg.MainClass;

public class MainMenuNavPage extends MainClass{
	
	public MainMenuNavPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateNavPageTitle(String menuNavOptionTxt) {
		System.out.println("Actual page title: "+driver.getTitle());
		return driver.getTitle().contains(menuNavOptionTxt);
	}
	
	public boolean validateNavPageUrl(String menuNavOptionTxt) {
		System.out.println("Actual page url: "+driver.getCurrentUrl());
		String[] menuTxtArry = menuNavOptionTxt.split(" ");
		String updateMenuOption = "";
		if(menuTxtArry.length<=2) {
			updateMenuOption = menuNavOptionTxt.replace(" ", "").toLowerCase();
		}else if(menuTxtArry.length>2) {
			updateMenuOption = menuNavOptionTxt.replace(" ", "-");
		}
		return driver.getCurrentUrl().contains(updateMenuOption);
	}

}
