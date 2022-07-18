package com.Selenium;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robortdemo {
	public static void main(String[] args) throws Throwable{
		 System.setProperty("webdriver.chrome.driver", "C:\\aaakhilproject\\julypractice\\Selenium\\DRiver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.selenium.dev/downloads/");
		  
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_PAGE_DOWN);
		 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 r.keyPress(KeyEvent.VK_PAGE_UP);
		 r.keyRelease(KeyEvent.VK_PAGE_UP);

}}
