		package Seleniumpractice;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class practice3 {
     	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		By username= By.xpath("//input[@name='username']");
		WebElement username1= driver.findElement(username);
		username1.sendKeys("Admin");

		Thread.sleep(3000);
		By password = By.xpath("//input[@name= 'password']");
		WebElement password1 = driver.findElement(password);
		password1.sendKeys("admin123");

		Thread.sleep(3000);
		By login = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
		WebElement login1 = driver.findElement(login);
		login1.click();
	}}
