package com.test;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class RunReverse 
{
    public static void main( String[] args )
    {
    	 System.out.println( "Exercises 1 demo " );

         
         // Initialing Scanner for user input 
     	   Scanner in = new Scanner(System.in);
     	   
         //User input 
          System.out.println("Enter a string");
          String s = in.nextLine();
      	
         //Define the object of Reverse class and calling THe 
          Reverse r = new Reverse ();
      	System.out.print("Printing Reverese String : " + r.reverseEverything(s));
      
          
    }
}
