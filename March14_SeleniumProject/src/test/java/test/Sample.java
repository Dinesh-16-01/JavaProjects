package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Dinesh");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("521154654");
		Select dropDownSkill = new Select(driver.findElement(By.xpath("//select[@ng-model='Skill']")));
		dropDownSkill.selectByIndex(10);
		driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("Abc@123");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Abc@123");
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		driver.findElement(By.xpath("//a[text()='Estonian']")).click();
		
		
	}
	

}