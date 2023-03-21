package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","H:\\selenium\\latest chrmoedriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Akshay");
		
	//	driver.findElement(By.xpath("//button[@name='login']")).click();
		
		Thread.sleep(2000);
		boolean status=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
	if(status==true)
	{
		System.out.println("logo is diplay");
	}
	else
		{
		System.out.println("Logo is not present");
		}
		}

}
