/**
 * 
 */
package com.test;

/**
 * @author Dilara
 *
 */
public class Reverse {

public String reverseEverything(String s) {
		
		// Converting string to array character 
	    char ch[]=s.toCharArray();  
	    // Initializing variable for reserve string 
	    String rev="";  
	    //iterate char array in the reverse oder  
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i];  
	    }
		
	    //returning reverse string 
		return rev;
    }
}
