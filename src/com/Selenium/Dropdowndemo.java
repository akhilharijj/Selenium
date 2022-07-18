package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowndemo {
	public static void main(String[] args){
	 System.setProperty("webdriver.chrome.driver", "C:\\aaakhilproject\\julypractice\\Selenium\\DRiver\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("http://www.leafground.com/pages/Dropdown.html");
	 driver.manage().window().maximize();
	 
	 
	 //drop down
	 
	 WebElement drop=driver.findElement(By.id("dropdown3"));
	// drop.click();
	  Select s=new Select(drop);
	 // s.selectByValue("1"); //select by value
	//  s.selectByIndex(3); //select by index
	  s.selectByVisibleText("Appium");
	// s.isMultiple();
	 // s.getOptions();
	}

}
