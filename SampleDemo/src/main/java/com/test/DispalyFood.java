/**
 * 
 */
package com.test;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Dilara
 *
 */
public class DispalyFood {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File Chromefile = new File("Webdrivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", Chromefile.getAbsolutePath());
		
		
		//ChromeDriverManager.getInstance().setup();
		WebDriver driver = new ChromeDriver();	
		driver.get("http://qa.contentunlock.s3.amazonaws.com/Dilara_QA/testpage/demoTest.html");
		
		FoodPage food = new FoodPage(driver);
		
		System.out.println("Exercises 2 Demo");
		
		System.out.println("Printi 3rd and 5th numbers food items from the list ");
		food.findFood();
		
		System.out.println("Printing all the food items and releted serving ");
		food.findAllElement();
				
		driver.close();
	}

}
