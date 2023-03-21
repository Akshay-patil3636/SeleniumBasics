package static_Table_Handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_dev_sample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "H:\\selenium\\latest chrmoedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.techlistic.com/2017/02/how-to-handle-dynamic-web-table-in.html");
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		
	int rows=	driver.findElements(By.xpath("//table[@class='ws-table-all']//tr")).size();	
	System.out.println("Number of rows="+rows);	
	int columns=driver.findElements(By.xpath("//table[@class='ws-table-all']//tr/th")).size();
	System.out.println("Number of columns="+columns);	

	String data=driver.findElement(By.xpath("//table[@class='ws-table-all']//tr[4]/td[1]")).getText();
	System.out.println("In table any perticular data="+data);
		
		
	for(int r=1;r<=rows;r++)
	{
		for(int c=1;c<=columns;c++)
		{
			
			String data1=driver.findElement(By.xpath("//table[@class='ws-table-all']//tr["+r+"]/td["+c+"]")).getText();
            System.out.print(data1+"   ");
		}
		System.out.println(" ");
	}
	for(int r=1;r<=rows;r++)
	{
		String comp=driver.findElement(By.xpath("//table[@class='ws-table-all']//tr["+r+"]/td[1]")).getText();
		if((comp.equals("Island Trading"))
		{
			String data3=driver.findElement(By.xpath("//table[@class='ws-table-all']//tr["+r+"]/td[2]")).getText();
			String data4=driver.findElement(By.xpath("//table[@class='ws-table-all']//tr["+r+"]/td[3]")).getText();
            
			System.out.println("Island Trading" + "  "+data3 +"   "+ data4);
		}
	}
		

	
	
	
	
	
	
	
		// number of rows

/*		WebElement table = driver.findElement(By.xpath("//table[@class='ws-table-all']"));
		int row = driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr")).size();
		System.out.println("Number of rows in a table=" + row);

		// number of columns

		int column = driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr/th")).size();
		System.out.println("Number of columns in a table=" + column);

// Retrive specific data in a table

		String data = driver.findElement(By.xpath("//table[@class='ws-table-all']/tbody/tr[2]/td[1]")).getText();
		System.out.println("Specific data in the table=" + data);
		Thread.sleep(3000);

		// print all deta in a table

		for (int r = 2; r <= row; r++) {
			for (int c = 1; c <= column; c++) {
				String All_Data = driver
						.findElement(By.xpath("//table[@class='ws-table-all']/tbody/tr[" + r + "]/td[" + c + "]"))
						.getText();
				System.out.print(All_Data + "  ");

			}
			System.out.println("     ");

		}             */
		
		// print specific requuirment data i.e  java  version  owner
		
		
		
		
		
		

	}

}
