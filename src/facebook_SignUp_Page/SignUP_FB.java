package facebook_SignUp_Page;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
/*
public class SignUP_FB {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\latest chrmoedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

		System.out.println("Click on create button successfully ");
		Thread.sleep(4000);

//		WebElement s = driver.findElement(By.xpath("//div[text()='Sign Up']"));
//		String text_Of_SignIN = s.getText();
//		System.out.println(text_Of_SignIN);

//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Akshay");
//		System.out.println("First name is passed successfully");
//		Thread.sleep(5000);
//		
//		WebElement name=driver.findElement(By.xpath("//input[@name='firstname']"));
//		String text=name.getAttribute("value");
//		System.out.println(text);
//		
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Patil");
//		System.out.println("Last name is passed successfully");
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//input[@ aria-label='Mobile number or email address']")).sendKeys("8805435440");
//		System.out.println(" Mo number is passed successfully");
//		//input[@autocomplete='new-password']
//		
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("Akshay@1010");
//
//		System.out.println(" Password is passed successfully");
//
//		
//		WebElement date=driver.findElement(By.xpath("//select[@title='Day']"));
//		
//		Select a=new Select(date);
//		a.selectByValue("13");                // selectByindex()  selectByValue();  selectByVisibleText(); 
//		
//		
//		//select[@aria-label='Month']
//		
//	List<WebElement>DOB	=driver.findElements(By.xpath("//span[@data-name='birthday_wrapper']/span/select"));
//	Iterator i= DOB.iterator();
//	while(i.hasNext())
//	{
//		System.out.println(i.next());
//	}
//		
//	for(WebElement each:DOB)
//	{
//		                                                  //each.getText();
//		Select q=new Select(each);
//		  
//		q.selectByValue("10");   
//		                                                 //System.out.println(each.getText());
//           q.selectByVisibleText("Jan");
//           q.selectByValue("2020");
//	}
//		
//	

		List<WebElement> DOB = driver.findElements(By.xpath("//span[@data-name='birthday_wrapper']/span/select"));

		for (WebElement each : DOB) {
			System.out.println(each.getText()); // each.getText();
			Select q = new Select(each);
			System.out.println(q);
//				q.selectByValue("10");   
//				                                                 //System.out.println(each.getText());
//		           q.selectByVisibleText("Jan");
//		           q.selectByValue("2020");
		}
		for (WebElement a : DOB) {

	/*		if (a + "[@title='Day']" >= '1') {
				Select date = new Select(a);
				date.selectByValue("20");

			} else if (a.getText() == "Jan" && a.getText() == "Dec")

			{

				Select month = new Select(a);
				month.selectByValue("Jan");

			} else if (a.getText() == "2023" && a.getText() == "1905")

			{

				Select yr = new Select(a);
				yr.selectByValue("1910");

			}

		}
	}

}*/
