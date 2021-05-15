package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

public class CalenderHandler {

	public void dateTimePicker(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/");
		WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
     	dateBox.sendKeys("09252013");
		dateBox.sendKeys(Keys.TAB);
		dateBox.sendKeys("0245PM");
	}
}