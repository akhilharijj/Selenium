package com.mini;


import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Miniproject {
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\aaakhilproject\\julypractice\\Marvenproject\\Driver11\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		
		  driver.get("http://adactinhotelapp.com/index.php");
		
		  //username
		  
		WebElement e=driver.findElement(By.id("username"));
		e.sendKeys("9080802216");
		
		//paswrd
		WebElement e1=driver.findElement(By.id("password"));
		e1.sendKeys("EYHA17");
		
		//LOGIN
		WebElement e2=driver.findElement(By.id("login"));
		e2.click();
		
		
		//2ndpage
		
		//location
		WebElement e3=driver.findElement(By.id("location"));
		Select s1=new Select(e3);
		s1.selectByValue("Melbourne");
		e3.click();
		//hotel
		WebElement e4=driver.findElement(By.id("hotels"));
		Select s2=new Select(e4);
		s2.selectByValue("Hotel Sunshine");
		e4.click();
		//roomtype
		WebElement e5=driver.findElement(By.id("room_type"));
		Select s3=new Select(e5);
		s3.selectByValue("Double");
		e5.click();
		//no.of rooms
		WebElement e6=driver.findElement(By.id("room_nos"));
		Select s4=new Select(e6);
		s4.selectByValue("2");
		e6.click();
		//chck in date
		WebElement e7=driver.findElement(By.id("datepick_in"));
		e7.clear();
		e7.sendKeys("12/07/2022");
		//chckot date
		WebElement e8=driver.findElement(By.id("datepick_out"));
		e8.clear();
		e8.sendKeys("14/07/2022");
		//adult per room
		WebElement e9=driver.findElement(By.id("adult_room"));
		Select s5=new Select(e9);
		s5.selectByValue("2");
		e9.click();
		//children er room
		WebElement e10=driver.findElement(By.id("child_room"));
		Select s6=new Select(e10);
		s6.selectByValue("2");
		e10.click();
		//search
		WebElement e11=driver.findElement(By.id("Submit"));
		e11.click();
		
		//3rdpage
		//button
		WebElement e12=driver.findElement(By.id("radiobutton_0"));
		e12.click();
		
		//continue
		WebElement e13=driver.findElement(By.id("continue"));
		e13.click();
		
	//4th page
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_PAGE_DOWN);
	r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	//fst name
	WebElement e14=driver.findElement(By.id("first_name"));
	e14.sendKeys("akhil");
	//last name
	WebElement e15=driver.findElement(By.id("last_name"));
	e15.sendKeys("hari");
	//address
	WebElement e16=driver.findElement(By.id("address"));
	e16.sendKeys("Arumanai");
	//card no
	WebElement e17=driver.findElement(By.id("cc_num"));
	e17.sendKeys("1234567890123456");
	//card type
	WebElement e18=driver.findElement(By.id("cc_type"));
	Select s8=new Select(e18);
	s8.selectByIndex(2);
	e18.click();
	//exprdmonth
	WebElement e19=driver.findElement(By.id("cc_exp_month"));
	Select s9=new Select(e19);
	s9.selectByIndex(2);
	e19.click();
	//expyear
	WebElement e20=driver.findElement(By.id("cc_exp_year"));
	Select s10=new Select(e20);
	s10.selectByIndex(2);
	e20.click();
	//cvv numbr
	WebElement e21=driver.findElement(By.id("cc_cvv"));
	e21.sendKeys("123");
	//booknow
	WebElement e22=driver.findElement(By.id("book_now"));
	e22.click();
	
	
	//5th page
	//r.keyPress(KeyEvent.VK_PAGE_DOWN);
	//r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	JavascriptExecutor s=(JavascriptExecutor)driver ;
	WebElement e30=driver.findElement(By.id("my_itinerary"));
	s.executeScript("arguments[0],ScrollIntoView();",e30);
	e30.click();
	
	//6th page
	//order id
	WebElement e24=driver.findElement(By.id("order_id_text"));
	e24.sendKeys("YDGAH13F75");
	//GO
	WebElement e25=driver.findElement(By.id("search_hotel_id"));
	e25.click();
	
	
	

	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

