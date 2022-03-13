import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio_Demo {
	
public static void main(String args[]) throws InterruptedException 
	
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Automation_Testing\\Drivers\\chromedriver_win32_new\\chromedriver.exe");

	WebDriver driver= new ChromeDriver();
	
	
	String appURL="https://www.ajio.com/";
	
    driver.get(appURL);
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[3]/div[1]/ul/li[2]/a")).click();
	
/*	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/span")).click();
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/div/div/div/div[2]/div/form/div[1]/div[1]/div[2]")).click();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div")).sendKeys("Poojadangi2@gamil.com");
	*/
	
	}

}
