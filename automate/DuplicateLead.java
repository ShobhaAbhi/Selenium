package automate;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shobha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kittada");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Shobha");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("K");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Dear");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Founder");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("11100000k");
		driver.findElement(By.className("inputBox")).sendKeys("Testing");
		driver.findElement(By.name("description")).sendKeys("I'm just trying to automate Lead page");
		driver.findElement(By.className("inputBox")).sendKeys("shobhashivakumarkittada@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ThoughtWorks");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shobha Shivakumar");
		driver.findElement(By.className("smallSubmit")).click();
		String display = driver.getTitle();
		System.out.println(display);
		

	}

}
