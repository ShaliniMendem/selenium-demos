package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class q5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\automationsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		String expectedtitle="Demo Web Shop. Login";
		String actualtitle=driver.getTitle();
		
		System.out.println(actualtitle);
		
		if(actualtitle.equals(expectedtitle))
		{
		   System.out.println("You are on the correct page");
		   driver.findElement(By.id("Email")).sendKeys("shalini02@gmail.com");
		   driver.findElement(By.name("Password")).sendKeys("shalini");
		   driver.findElement(By.xpath("//input[@value='Log in']")).click();
		   
		   driver.findElement(By.xpath("//input[@value='Apparels and Shoes']")).click();
		   driver.findElement(By.xpath("//AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/5/1/1')")).click();
		   driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		   driver.findElement(By.xpath("//input"));
		   
		   
		   

	}

	}
}
