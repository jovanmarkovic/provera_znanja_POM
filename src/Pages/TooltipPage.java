package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TooltipPage {
	
	protected WebDriver driver;
	
	By mh = By.id("age");
	By ttt = By.xpath(".//*[@id='age']");
	
	
	public TooltipPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public TooltipPage navigateToTooltipPage() throws InterruptedException {
		
		driver.get("http://demoqa.com/");
		driver.manage().window().maximize();
		driver.navigate().to("http://demoqa.com/tooltip/");
		Thread.sleep(2000);
		return new TooltipPage(driver);
		
	}

	public TooltipPage moveToTooltip() {
		
		Actions action = new Actions(driver);
		WebElement MouseHover = driver.findElement(mh);
		action.moveToElement(MouseHover).build().perform();
		action.clickAndHold(MouseHover).perform();
		return new TooltipPage(driver);
		
	}
	
	public TooltipPage printToolTipText() {
		
		String tooltipText = driver.findElement(ttt).getAttribute("title");
		System.out.println(tooltipText);
		return new TooltipPage(driver);
		
	}
	
}
