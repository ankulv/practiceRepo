package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
//		WebElement title;
				String str=driver.getTitle();
				System.out.println("Title of web page is "+ str);
				
				WebElement user=driver.findElement(By.id("user-name")); 
				user.sendKeys("standard_user");
				WebElement pass=driver.findElement(By.name("password"));
				pass.sendKeys("secret_sauce");
				WebElement button=driver.findElement(By.id("login-button"));
				button.click();
				String url=driver.getCurrentUrl();
				System.out.println(url);
				Thread.sleep(2000);
				driver.close();
	}

}
