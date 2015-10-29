package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	
	protected WebDriver driver;
	
	By tab4 = By.id("ui-id-4");
	By tabTextBox = By.id("tabs-4");
	
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public MainPage navigateToMainPage() {
		
		driver.get("http://demoqa.com/");
		driver.manage().window().maximize();
		return new MainPage(driver);
		
	}
	
	public MainPage clickOnTab() {
		driver.findElement(tab4).click();
		return new MainPage(driver);
		}
	
	
	public MainPage checkTable() 
	{
		
		if (driver.findElement(tab4).getText().contains("Tab 4"))
		System.out.println("Yes, tab title is Tab 4");
		else 
		System.out.println("No, tab title is not Tab 4");	
		
		if (driver.findElement(tabTextBox).getText().contains("Content 4 Title"))
		System.out.println("Yes");
		else 
		System.out.println("No");
		return new MainPage(driver);
	}

}
