package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\automationsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		driver.findElement(By.id("gender-Female")).click();
		driver.findElement(By.name("FirstName")).sendKeys("shalini");
		driver.findElement(By.name("LastName")).sendKeys("mendem");
		driver.findElement(By.name("Email")).sendKeys("shalini02@gmali.com");
		driver.findElement(By.name("Password")).sendKeys("shalini");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("shalini");
		driver.findElement(By.id("Register-button")).click();
	}

}
