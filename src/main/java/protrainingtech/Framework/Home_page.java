package protrainingtech.Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	WebDriver driver;
	@FindBy(linkText = "Best Sellers") //driver.findelement(by.linktext("");
	WebElement bestlinks;
	@FindBy(linkText = "Customer Service")
	WebElement customer;
	@FindBy(linkText = "New Releases")
	WebElement newrelease;
	@FindBy(xpath = "(//*[@class='nav-input'])[1]")
	WebElement search;
	@FindBy(id="twotabsearchtextbox")
	WebElement searchfieldproduct;
	public Home_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
public void bestlinksclick() {
	bestlinks.click();
}
public void customerofclick() {
	customer.click();
}
public void newreleaseclick() {
	newrelease.click();
}
public void searctoclick() {
	search.click();
}
public void searchfieldsendkeys(String search) {
	searchfieldproduct.clear();
	searchfieldproduct.sendKeys(search);
}
}
