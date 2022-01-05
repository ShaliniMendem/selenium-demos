package seleniumdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\automationsoftware\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
        driver.findElement(By.linkText("Alert with OK & Cancel")).click();
        
        driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();
        Alert alt2=driver.switchTo().alert();
        String altcnclmesg=driver.switchTo().alert().getText();        
        System.out.println(altcnclmesg);
            
        alt2.dismiss();
        
        driver.findElement(By.linkText("Alert with Textbox")).click();
        driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]"));

        Alert alt3=driver.switchTo().alert();
        alt3.sendKeys("selenium"); 
            
        alt3.accept();

	}

}
