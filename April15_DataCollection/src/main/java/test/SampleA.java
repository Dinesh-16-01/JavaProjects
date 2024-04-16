package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleA {
WebDriver driver;
@Test(dataProvider = "testDataValue")
public void testcase01()
{
	driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.findElement(By.id("user-name")).sendKeys();
	driver.findElement(By.id("password")).sendKeys();
	driver.findElement(By.id("login-button")).click();
}
@DataProvider(name = "testDataValue")
public Object[][]testData()
{
	return new Object[][] {{"standard_user", "secret_sauce"},
		{"locked_out_user", "secret_sauce"}, 
		{"error_user", "secret_sauce"}};
}
}
