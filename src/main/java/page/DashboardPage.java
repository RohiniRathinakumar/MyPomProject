package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage extends BasePage {
	WebDriver driver;
	 
	public  DashboardPage(WebDriver driver) {
		this.driver=driver;
	}

	@FindBy(how=How.XPATH,using="//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[3]/a") WebElement CUSTOMER_MENU_ELEMENT;
	@FindBy(how=How.XPATH,using="//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement ADD_CUSTOMER_ELEMENT;
	
	public void verifyDashboardPage(String message) {
		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(),message,"Dashboard is not found");
	}
	public void clickOnCustomer() throws InterruptedException {
		Thread.sleep(2000);
		CUSTOMER_MENU_ELEMENT.click();;
	}
	public void clickOnAddCustomer() {
		ADD_CUSTOMER_ELEMENT.click();
	}
	
}

