/**
 * 
 */
package com.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Dilara
 *
 */
public class FoodPage {

	WebDriver driver;
	
	//defining each type of element using XPATH
	By foodname = By.xpath("//*[@class='title ng-binding']");
	By foodserving = By.xpath("//*[@class='description ng-binding']");
	
	
	//Constructor 
	public FoodPage(WebDriver driver ){
		
		this.driver =driver;
	}

	
	
	//Public Method which will print 3 and 5 element from food 
	public void findFood(){
		
		String elementval;
		//defining list for food Web element 
		List<WebElement> fooditems = driver.findElements(foodname);
		
		//initialing the i  ;
		int i=1;	
		// iterator to get all food element 
		for ( WebElement food: fooditems) {
			
			//Checking if i =3 OR i=5 , if yes then display the text 
			
			if (i==3 || i==5)
			{
				elementval = food.getText();
				System.out.println(elementval);
			}
			//increment the i
			i++;
			
		}
	
		
		
	}
	
	
  // Public Method which will find all elements and stored in the Map , and Print all the 
	public void findAllElement(){
		String foodN;
		String servingQ;
		
		//define the hasMap Object 
		 Map<String, String> foodObjMap = new HashMap<String, String>();
		
		 //Difine the List for Webelement  
		 List<WebElement> fooditems = driver.findElements(foodname);
		 List<WebElement> foodservings = driver.findElements(foodserving);
		
		 //nested loop to add food and serving values to hasMap bject 
		 for ( WebElement food: fooditems) {
				
				for (WebElement serving: foodservings){
					
					foodN=food.getText();
					servingQ=serving.getText();
					foodObjMap.put(foodN,servingQ);
					
				}
			}
		
		 
		 /* Display content using Iterator*/
			
			      Set set = foodObjMap.entrySet();
			      Iterator iterator = set.iterator();
			      while(iterator.hasNext()) {
			         Map.Entry display = (Map.Entry)iterator.next();
			         System.out.print("Food Name: "+ display.getKey() + " & Serving is: ");
			         System.out.println(display.getValue());
			      }
		 
		 
	}
	

}
