package assignment.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateTestLead {

	public static void main(String[] args) {
		
		//Step 1: Manage driver
		
		WebDriverManager.chromedriver().setup();
		
		//Step 2: Launch browser
		
		ChromeDriver driver = new ChromeDriver();
		
		//Step 3: Open the TestLeaf application URL
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Step 4: Login using USername and Password
		
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		
		WebElement crmSfaLink = driver.findElement(By.linkText("CRM/SFA"));
		crmSfaLink.click();
		
		//Step 5: Create a Test Lead
		
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		
		//Step 6: Enter data in all the fields
		
		driver.findElement(By.id("createLeadForm_companyName"));
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName"));
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sample");
		
		driver.findElement(By.id("createLeadForm_lastName"));
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("AutomationLead");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal"));
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sample");
		
		driver.findElement(By.id("createLeadForm_lastNameLocal"));
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("AutomationLead");
		
		driver.findElement(By.id("createLeadForm_personalTitle"));
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		
		driver.findElement(By.id("createLeadForm_birthDate"));
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("09/09/1988");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle"));
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tech Lead");
		
		driver.findElement(By.id("createLeadForm_departmentName"));
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		
		driver.findElement(By.id("createLeadForm_annualRevenue"));
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("3500000");
		
		driver.findElement(By.id("createLeadForm_numberEmployees"));
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("250");
		
		driver.findElement(By.id("createLeadForm_sicCode"));
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("34QA77");
		
		driver.findElement(By.id("createLeadForm_tickerSymbol"));
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("ABC123");
		
		driver.findElement(By.id("createLeadForm_description"));
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Description");
		
		driver.findElement(By.id("createLeadForm_importantNote"));
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Test important note");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("34");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9823369887");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode"));
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("998");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension"));
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("518897");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName"));
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("SPOC");
		
		driver.findElement(By.id("createLeadForm_primaryEmail"));
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sample@abc.com");
		
		driver.findElement(By.id("createLeadForm_primaryWebUrl"));
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://sampleurl.com/");
		
		driver.findElement(By.id("createLeadForm_generalToName"));
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Sample");
		
		driver.findElement(By.id("createLeadForm_generalAttnName"));
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("SampleAttention");
		
		driver.findElement(By.id("createLeadForm_generalAddress1"));
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("21 MAIN ROAD");
		
		driver.findElement(By.id("createLeadForm_generalAddress2"));
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Corner Two Way");
		
		driver.findElement(By.id("createLeadForm_generalCity"));
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Omaha");
		
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Florida");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode"));
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("34778");
		
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt"));
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("5461");
		
		driver.findElement(By.id("createLeadForm_firstName"));
		driver.findElement(By.id("createLeadForm_firstName")).getAttribute(null);
		
		driver.findElement(By.className("smallSubmit"));
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		
		

	}

}
