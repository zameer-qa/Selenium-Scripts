package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowser {

	public static void main(String[] args) {
		//Headless Browser
		WebDriver driver=new HtmlUnitDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		}

}
