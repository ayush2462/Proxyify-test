package com.proxyify.utils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
protected WebDriver driver;
@BeforeEach
private void setUp() {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.manage().window().maximize();
}
@AfterEach
private void tearDown() {
	if(driver!=null) {
		driver.quit();
	}

}


}
