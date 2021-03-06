package autotest;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
//import org.testng.Assert;


public class StepDefinitions
{
	
	// Create a new instance of the Firefox driver
	WebDriver driver = new FirefoxDriver();
	
	//IIQ URL
	//String baseUrl = "http://192.168.56.4:8080/";
	//String iiqUrl = baseUrl + "iiq/login.jsf?prompt=true";
	String baseUrl;
	String iiqUrl;
	String identityName;
	String entitlementValue;

	
	//Username and Password for IIQ
	String username="spadmin";
	String password="admin";

	
	@Given("^that the tests are to be run on \"([^\"]*)\" as env$")
	public void that_the_tests_are_to_be_run_on_as_env(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Test environment");
	}

	@Given("^the user is on-boarded in IIQ$")
	public void the_user_is_on_boarded_in_IIQ() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@Given("^is authorized to access IIQ$")
	public void is_authorized_to_access_IIQ() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

	@Given("^has the correct IIQ URL \"([^\"]*)\"$")
	public void has_the_correct_IIQ_URL(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		
	}
	
	@When("^user accesses the URL from the web browser$")
	public void user_accesses_the_URL_from_the_web_browser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.navigate().to(iiqUrl);
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException ex) {
        }
        driver.manage().window().maximize();
	}
	
	@When("^enters \"([^\"]*)\" as username$")
	public void enters_as_username(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
        try {
            Thread.sleep(5000);
        }
        catch(InterruptedException ex) {
        }
		driver.findElement(By.name("loginForm:accountId")).sendKeys(username);
		System.out.println("Username entered");
	}

	@When("^enters \"([^\"]*)\" as password$")
	public void enters_as_password(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("loginForm:password")).sendKeys(password);
		System.out.println("Password entered");
	}

	@When("^clicks on Login$")
	public void clicks_on_Login() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("loginForm:loginButton")).click();
	}
	
	@Then("^is redirected to IIQ's home page$")
	public void is_redirected_to_IIQ_s_home_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}
	
	@Then("^user runs aggregation$")
	public void user_runs_aggregation() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		
		try {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"menuMainDiv\"]/nav/div/ul[1]/li[7]/a")).click();
		}
		catch(NoSuchElementException ex) {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"menuMainDiv\"]/nav/div/ul[1]/li[7]/a")).click();
		}


		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"menuMainDiv\"]/nav/div/ul[1]/li[7]/ul/li[6]/a")).click();
		}
		catch(NoSuchElementException ex) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"menuMainDiv\"]/nav/div/ul[1]/li[7]/ul/li[6]/a")).click();
		}


		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"gridview-1026-bd-Account Aggregation\"]/td/table/tbody/tr[3]/td[1]")).click();
		}
		catch(NoSuchElementException ex) {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"gridview-1026-bd-Account Aggregation\"]/td/table/tbody/tr[3]/td[1]")).click();
		}

		try {
			Thread.sleep(5000);
			driver.findElement(By.id("editForm:validateBeforeExecuteButton")).click();
		}
		catch(NoSuchElementException ex) {
			Thread.sleep(5000);
			driver.findElement(By.id("editForm:validateBeforeExecuteButton")).click();
		}


		





		try {
			Thread.sleep(3000);
			driver.navigate().to( baseUrl + "iiq/monitor/tasks/viewTasks.jsf?resetTab=true");
		}
		catch(NoSuchElementException ex) {
			Thread.sleep(3000);
			driver.navigate().to( baseUrl + "iiq/monitor/tasks/viewTasks.jsf?resetTab=true");
		}
		

		try {
			Thread.sleep(60000);
			driver.findElement(By.xpath("//*[@id=\"gridview-1026-bd-Account Aggregation\"]/td/table/tbody/tr[2]/td[1]")).click();
		}
		catch(NoSuchElementException ex) {
			Thread.sleep(60000);
			driver.findElement(By.xpath("//*[@id=\"gridview-1026-bd-Account Aggregation\"]/td/table/tbody/tr[2]/td[1]")).click();
		}
		

		try {
			Thread.sleep(5000);
			driver.findElement(By.id("editForm:validateBeforeExecuteButton")).click();
		}
		catch(NoSuchElementException ex) {
			Thread.sleep(5000);
			driver.findElement(By.id("editForm:validateBeforeExecuteButton")).click();
		}

		



		
		try {
			Thread.sleep(3000);
			driver.navigate().to( baseUrl + "iiq/monitor/tasks/viewTasks.jsf?resetTab=true");
		}
		catch(NoSuchElementException ex) {

			Thread.sleep(3000);
			driver.navigate().to( baseUrl + "iiq/monitor/tasks/viewTasks.jsf?resetTab=true");
		}
		

		try {
			Thread.sleep(5000);
			driver.findElement(By.id("tasksSearchField-inputEl")).sendKeys("Full Text Index Refresh\n");
		}
		catch(NoSuchElementException ex) {
		
			Thread.sleep(5000);
			driver.findElement(By.id("tasksSearchField-inputEl")).sendKeys("Full Text Index Refresh\n");
		}
		

		try {
			Thread.sleep(60000);
			driver.findElement(By.xpath("//*[@id=\"gridview-1026-bd-System\"]/td/table/tbody/tr[2]/td[1]")).click();
		}
		catch(NoSuchElementException ex) {
		
			Thread.sleep(60000);
			driver.findElement(By.xpath("//*[@id=\"gridview-1026-bd-System\"]/td/table/tbody/tr[2]/td[1]")).click();
		}
		

		try {
			Thread.sleep(5000);
			driver.findElement(By.id("editForm:validateBeforeExecuteButton")).click();
			Thread.sleep(30000);
		}
		catch(NoSuchElementException ex) {
		
			Thread.sleep(5000);
			driver.findElement(By.id("editForm:validateBeforeExecuteButton")).click();
			Thread.sleep(30000);
		}


	}
	
	
	@Then("^user clicks on Manage User Access button$")
	public void user_clicks_on_Manage_User_Access_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(3000);
		driver.navigate().to(baseUrl + "iiq/home.jsf");

		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"ext-gen1035\"]/div[2]/div[2]/div/div/div/div[3]/div[1]/div/div/div[8]/div/a/div/div/div")).click();
		}
		catch(NoSuchElementException ex) {
		
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"ext-gen1035\"]/div[2]/div[2]/div/div/div/div[3]/div[1]/div/div/div[8]/div/a/div/div/div")).click();
		}
		
		
	}	
	
	@Then("^enters identity's name in Search Users text box$")
	public void enters_identity_s_name_in_Search_Users_text_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			Thread.sleep(5000);
			driver.findElement(By.id("userSearchText")).sendKeys(identityName+"\n");
		}
		catch(NoSuchElementException ex) {
		
			Thread.sleep(5000);
			driver.findElement(By.id("userSearchText")).sendKeys(identityName+"\n");
		}

		
	}
	
	@Then("^selects the identity displayed$")
	public void selects_the_identity_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"ext-gen1035\"]/div[2]/div[2]/div/div/div/div/section[2]/div[3]/div/div/div[1]/div/div[1]/div[1]/button")).click();
		}
		catch(NoSuchElementException ex) {
		
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"ext-gen1035\"]/div[2]/div[2]/div/div/div/div/section[2]/div[3]/div/div/div[1]/div/div[1]/div[1]/button")).click();
		}

	}	

	@Then("^clicks on Manage Access tab$")
	public void clicks_on_Manage_Access_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("flowManageAccessBtn")).click();
		}
		catch(NoSuchElementException ex) {
		
			Thread.sleep(3000);
			driver.findElement(By.id("flowManageAccessBtn")).click();
		}
	}

	@Then("^enters the entitlement to be requested$")
	public void enters_the_entitlement_to_be_requested() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("accessSearchText")).clear();
			Thread.sleep(500);
			driver.findElement(By.id("accessSearchText")).sendKeys(entitlementValue+"\n");
		}
		catch(NoSuchElementException ex) {
		
			Thread.sleep(3000);
			driver.findElement(By.id("accessSearchText")).clear();
			Thread.sleep(500);
			driver.findElement(By.id("accessSearchText")).sendKeys(entitlementValue+"\n");
		}

	}

	@Then("^selects the entitlement$")
	public void selects_the_entitlement() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			Thread.sleep(3000);			
			driver.findElement(By.xpath("//*[@id=\"ext-gen1035\"]/div[2]/div[2]/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div[1]/button")).click();
		}
		catch(NoSuchElementException ex) {
		
			Thread.sleep(3000);			
			driver.findElement(By.xpath("//*[@id=\"ext-gen1035\"]/div[2]/div[2]/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div[1]/button")).click();
		}

		
	}

	@Then("^clicks on Review tab$")
	public void clicks_on_Review_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("flowReviewBtn")).click();
		}
		catch(NoSuchElementException ex) {
		
			Thread.sleep(3000);
			driver.findElement(By.id("flowReviewBtn")).click();
		}

	}

	@Then("^clicks on Submit$")
	public void clicks_on_Submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			Thread.sleep(3000);
			driver.findElement(By.id("submitBtn")).click();
		}
		catch(NoSuchElementException ex) {
		
			Thread.sleep(3000);
			driver.findElement(By.id("submitBtn")).click();
		}
	}

	@Then("^complete access request$")
	public void complete_access_request() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			Thread.sleep(15000);
			driver.findElement(By.xpath("//*[@id=\"editForm\"]/div[4]/input[2]")).click();
		}
		catch(NoSuchElementException ex) {
		
			Thread.sleep(15000);
			driver.findElement(By.xpath("//*[@id=\"editForm\"]/div[4]/input[2]")).click();
		}

	}
	
	@Then("^the access request is submitted$")
	public void the_access_request_is_submitted() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		System.out.println("Access Request submitted successfully!");
		Thread.sleep(3000);
		driver.close();
	}
	
/*
	public static void main(String args[])throws Throwable{

		//System.out.println("args[0]"+args[0]);
		//new StepDefinitions(args[0]);
		new StepDefinitions("http://192.168.56.4:32266/");
		
	}

	public StepDefinitions(String baseUrlArg)throws Throwable {

		baseUrl = baseUrlArg;
		iiqUrl = baseUrl + "iiq/login.jsf?prompt=true";

		System.out.println("Entering: "+iiqUrl);

		user_accesses_the_URL_from_the_web_browser();
		
		enters_as_username("username");

		enters_as_password("password");

		clicks_on_Login();		

		user_runs_aggregation();

		
		//Access Review
		identityName = "Aaron Murphree";
		user_clicks_on_Manage_User_Access_button();
		
		enters_identity_s_name_in_Search_Users_text_box();
		
		selects_the_identity_displayed();

		clicks_on_Manage_Access_tab();

		
		
		
		
		//Select Entitlement
		entitlementValue = "Support, UserAdmin, SystemAdmin";		
		enters_the_entitlement_to_be_requested();

		selects_the_entitlement();

		//Select Entitlement
		entitlementValue = "Support,SystemAdmin";		
		enters_the_entitlement_to_be_requested();

		selects_the_entitlement();

		
		
		
		
		clicks_on_Review_tab();

		clicks_on_Submit();

		complete_access_request();
		
		the_access_request_is_submitted();
		
		System.out.println("Exiting");

	}
*/

	

	@Test(priority=1)
	@Parameters({"baseUrlArg"})
	public void testInitialize(String baseUrlArg)throws Throwable {

		baseUrl = baseUrlArg;
		iiqUrl = baseUrl + "iiq/login.jsf?prompt=true";

		System.out.println("Entering: "+iiqUrl);
		
	}

	@Test(priority=2)
	@Parameters({"baseUrlArg"})
	public void testLogin(String baseUrlArg)throws Throwable {

		user_accesses_the_URL_from_the_web_browser();
		
		enters_as_username("username");

		enters_as_password("password");

		clicks_on_Login();	
		
		System.out.println("Logged In");

		System.out.println(", baseUrl: "+baseUrl+" iiqurl: "+iiqUrl);
	}

	@Test(priority=3)
	@Parameters({"baseUrlArg"})
	public void testAggregation(String baseUrlArg)throws Throwable {

		System.out.println("In Aggregation, baseUrl: "+baseUrl+" iiqurl: "+iiqUrl);
		System.out.println("Page: "+driver.getTitle());

		user_runs_aggregation();		
	}

	@Test(priority=4)
	@Parameters({"baseUrlArg"})
	public void testAccessRequest(String baseUrlArg)throws Throwable {

		System.out.println("In Access Request");

		//Access Review
		identityName = "Aaron Rao";
		user_clicks_on_Manage_User_Access_button();
		
		enters_identity_s_name_in_Search_Users_text_box();
		
		selects_the_identity_displayed();

		clicks_on_Manage_Access_tab();

		
		
		
		
		//Select Entitlement
		entitlementValue = "Support, UserAdmin, SystemAdmin";		
		enters_the_entitlement_to_be_requested();

		selects_the_entitlement();

		//Select Entitlement
		entitlementValue = "Support,SystemAdmin";		
		enters_the_entitlement_to_be_requested();

		selects_the_entitlement();

		
		
		
		
		clicks_on_Review_tab();

		clicks_on_Submit();

		complete_access_request();
		
		the_access_request_is_submitted();
		
		System.out.println("Exiting");

	}


}
