package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.MainPage;
import Pages.RegistrationPage;
import Pages.TooltipPage;

public class TestPage {
	
	WebDriver driver;

	@Before
	public void testSetup() {
		driver = new FirefoxDriver();
	}

	@After
	public void testShutDown() {
		driver.quit();
	}

	@Test
	
	public void GeneralDemoQATest() throws InterruptedException {
		
		MainPage onMainPage = new MainPage(driver);
		onMainPage = onMainPage.navigateToMainPage();
		onMainPage.clickOnTab();
		onMainPage.checkTable();
		
		TooltipPage onTooltipPage = new TooltipPage(driver);
		onTooltipPage = onTooltipPage.navigateToTooltipPage();
		onTooltipPage.moveToTooltip();
		onTooltipPage.printToolTipText();
		
		RegistrationPage onRegistrationPage = new RegistrationPage(driver);
		onRegistrationPage = onRegistrationPage.navigateRegistrationPage();
		onRegistrationPage.registerUser();
				
		}
		
	}

