package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class omayoLogin {
	
	public WebDriver driver = null;
	
	@Before("@omayoLogin")
	public void init() {
		System.setProperty("webdriver.chrome.driver","drivers//chromedriver.exe");
		driver = new ChromeDriver();		
		driver.manage().window().maximize();		
	}
	
	@Given("^I navigate to Omayo website$")
	public void i_navigate_to_Omayo_website() {
		driver.get("http://www.omayo.blogspot.com");			    
	}
	
	@When("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\" in the fields$")
	public void i_enter_username_and_password_in_the_fields(String username, String password) {
		driver.findElement(By.name("userid")).sendKeys(username);
		driver.findElement(By.name("pswrd")).sendKeys(password);
	}
	
	@And("^I click on Login button$")
	public void i_click_on_Login_button() throws InterruptedException {
		driver.findElement(By.cssSelector("input[type='button'][value='Login']")).click();
		Thread.sleep(2000);
	}
	
	@Then("^User should login based on expected ([^\"]*) value$")
	public void user_should_login_based_on_expected_loginStatus_value(String loginStatus) {
		String actualStatus=null;
		try {
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		
		if(alertText.equals("Error Password or Username")) {
			actualStatus = "failure";
		} else {
			actualStatus = "success";
			}
		} catch(Exception e) {
			actualStatus = "success";
		}
		if(actualStatus.equals(loginStatus)) {
			System.out.println("Tetscase passed");
		} else {
			Assert.fail("Actual login status is not equal to the expected login status");
		}		
	}
	
	@After("@omayoLogin")
	public void close() {
		driver.quit();
	}
}
