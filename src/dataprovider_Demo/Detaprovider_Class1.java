package dataprovider_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Detaprovider_Class1 {

	// public static void main(String[] args) {
	WebDriver driver;

	@BeforeClass
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\latest chrmoedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();

	}

	@Test(dataProvider="testdata")
	public void login(String un,String pass ) throws InterruptedException {
		WebElement userName = driver.findElement(By.id("email"));

		userName.clear();
		userName.sendKeys(un);

		WebElement password = driver.findElement(By.id("pass"));

		password.clear();
		password.sendKeys(pass);
		Thread.sleep(2000);
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));

		loginBtn.click();
	}
		@DataProvider(name="testdata")
		public String[][] getdata()
		{
			String [][]d1= {{"Akshay","123"},
			                  {"Mahadev","456"} ,      
			                  {"Patil","789" }};
			
			return d1;
		}
		
		
		@AfterClass
		public void teardown()
		{
			driver.quit();
		}
		
		
	
	}


