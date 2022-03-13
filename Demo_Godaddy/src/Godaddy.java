import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Godaddy {
	public static void main(String args[]) throws InterruptedException 
	
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Automation_Testing\\Drivers\\chromedriver_win32_new\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();
	
	
	String appURL="https://in.godaddy.com/";
	// launch the Chrome browser and open the application url
	
	driver.get(appURL);
	
	driver.manage().window().maximize();

	driver.findElement(By.xpath("//*[@id=\"id-68aad88a-f732-425d-b4c3-d14407a0aa2a\"]/summary/span[2]")).click();
	
	driver.findElement(By.cssSelector("a[data-track-name=\"create_account_link\"]")).click();  // class name a[paste the data]
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div/div/div[3]/form/div[1]/button")).click();
	
	
	
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div/div/div[3]/form/div[1]/div/div/input")).sendKeys("poojadangi@gmail.com");

driver.findElement(By.id("username")).sendKeys("Demo12567");
	//driver.findElement(By.id(""))
	

	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div/div/div/div[3]/form/div[3]/div/div[1]/div/input")).sendKeys("PoojaDemo123");

	driver.findElement(By.id("submitBtn")).click();
	
	Thread.sleep(5000);
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  // switch to alert
	String alertMessage= driver.switchTo().alert().getText(); // capture alert message

	System.out.println(alertMessage); // Print Alert Message

	driver.switchTo().alert().accept();
	Thread.sleep(5000);
	}
}


