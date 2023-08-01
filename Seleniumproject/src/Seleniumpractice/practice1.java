package Seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {
public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
    By email = By.xpath("//input[@id='email']");
    WebElement email1 = driver.findElement(email);
    email1.sendKeys("anil");
    
    Thread.sleep(3000);
    By password = By.xpath("//input[@id='pass']");
    WebElement password1 = driver.findElement(password);
	password1.sendKeys("anil123");
	
	Thread.sleep(3000);
	By login = By.xpath("//button[@id='loginbutton']");
	WebElement login1 = driver.findElement(login);
	login1.click();
}}
