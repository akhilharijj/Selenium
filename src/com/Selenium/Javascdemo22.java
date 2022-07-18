package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascdemo22 {
	public static void main(String[] args) throws Throwable{
		 System.setProperty("webdriver.chrome.driver", "C:\\aaakhilproject\\julypractice\\Selenium\\DRiver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.selenium.dev/downloads/");
		 driver.manage().window().maximize();
		 
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scroll(0,450)","");
		 js.executeScript("window.scroll(0,-450)","");
		// js.executeScript("window.scroll(0,document.body.scrollHeight","");
		 
		 
		 WebElement d= driver.findElement(By.xpath("(//p[@class='card-text w-lg-75'])[5]"));
		 Thread.sleep(200);
		 js.executeScript("arguments[0].scrollIntoView(true);",d);
		 

}}
