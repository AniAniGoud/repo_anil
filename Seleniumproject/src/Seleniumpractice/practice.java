package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get( "https://practicetestautomation.com/practice-test-login/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		By username1 = By.xpath("//input[@id='username']");
		WebElement username2 = driver.findElement(username1);
		username2.sendKeys("student");
		
		Thread.sleep(3000);
		By password1 = By.xpath("//input[@id='password']");
		WebElement password2 = driver.findElement(password1);
		password2.sendKeys("Password123");
		
		Thread.sleep(3000);
		By submit = By.xpath("// button[@id='submit']");
		WebElement submit1 = driver.findElement(submit);
		submit1.click();
		
		Thread.sleep(3000);
		By logout = By.xpath("//a[text()='Log out']");
		WebElement logout1 = driver.findElement(logout);
		logout1.click();
	}}
