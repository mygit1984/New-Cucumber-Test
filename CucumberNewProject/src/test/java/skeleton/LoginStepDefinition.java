package skeleton;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition{
	WebDriver driver;
	@Given("The URL of demo web shop application")
	public void the_URL_of_demo_web_shop_application() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driverfiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/login");
	}

	@When("User enters {word} as username")
	public void user_enters_kannan_gmail_com_as_username(String s1) {
		driver.findElement(By.id("Email")).sendKeys(s1);
	}

	@When("User enters {word} as password")
	public void user_enters_test_as_password(String s2) {
		driver.findElement(By.id("Password")).sendKeys(s2);
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}

	@Then("User login shall be success along with {word} displayed in next page")
	public void user_login_shall_be_success_along_with_kannan_gmail_com_displayed_in_next_page(String s1) {
		 String s2=driver.findElement(By.className("account")).getText();
		 Assert.assertEquals(s1, s2);
	   
	}

	
}