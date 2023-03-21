package MethodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods2 { // isDisplay, isEnabled, IsSelected

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\latest chrmoedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

// 	isDisplay	

		/*
		 * boolean statusOfLogo=driver.findElement(By.xpath("//img[@alt='Facebook']")).
		 * isDisplayed(); if(statusOfLogo==true) {
		 * System.out.println("Facebook logo is present on login page"); } else {
		 * System.out.println("Facebook logo is not present on login page");
		 * 
		 * }
		 */

// is enabled and isSelected	
		/*
		 * driver.get(
		 * "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		 * 
		 * boolean StatusOfenable = driver .findElement(By.
		 * xpath("//input[@value='red'and@name='color' and @type='checkbox' ]")).
		 * isEnabled();
		 * 
		 * System.out.println("Status of checkbox is ="+StatusOfenable); if
		 * (StatusOfenable == true) { boolean ResultBeforeClick = driver
		 * .findElement(By.
		 * xpath("//input[@value='red'and@name='color' and @type='checkbox' ]")).
		 * isSelected(); System.out.println("ResultBeforeClick=" + ResultBeforeClick);
		 * 
		 * driver.findElement(By.
		 * xpath("//input[@value='red'and@name='color' and @type='checkbox' ]")).click()
		 * ; boolean ResultAfterClick = driver .findElement(By.
		 * xpath("//input[@value='red'and@name='color' and @type='checkbox' ]")).
		 * isSelected(); System.out.println("ResultAfterClick=" + ResultAfterClick); }
		 * 
		 * }
		 */
// isEnabled 
		/*
		 * driver.get("https://www.facebook.com/"); boolean status =
		 * driver.findElement(By.xpath("//a[text()='Sign Up']")).isEnabled(); if (status
		 * == true) { System.out.println("Sign page link present on login page"); }
		 * 
		 * driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		 * System.out.println(" Click action is performed on sign up link");
		 * 
		 */

		// getAttribute()

		// String
		// AttributeValue=driver.findElement(By.xpath("//input[@id='pass']")).getAttribute("name");
		// System.out.println(AttributeValue);

// getCssValue      it shows font size colour and all information

//	String CssData=	driver.findElement(By.xpath("//a[text()='Create new account']")).getCssValue("font-size");
//		System.out.println(CssData);

// geturl getTitle

		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.close();
		System.out.println("Current browser close succcessfully");
		driver.quit();
		System.out.println("All tabs are close successfully");

	}
}