
package org.ada;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinLogin {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://adactinhotelapp.com/");
		
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("vigneshwikki");
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("Wikki@321.");
		
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
	}
 
}