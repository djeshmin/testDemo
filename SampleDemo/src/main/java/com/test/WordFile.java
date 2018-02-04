/**
 * 
 */
package com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Dilara
 *
 */
public class WordFile {
	// Initializing BufferedRedaer
		BufferedReader read ;
		
		//Method to get the Absolute path of file location 
		public String getAbsoluteFilePath (String fileLoc){
			
			File oFile = new File(fileLoc);
			String datafile = oFile.getAbsolutePath();
			return datafile;
			
		}
		// Method to check file exits inthe give path or not
		public String doesFileExist(String path){
			
			try{
				read = new BufferedReader(new FileReader(path));
				System.out.println("File exist : " + path);
				
			}catch (FileNotFoundException e)
			{
			  
			  System.out.println("File doest not exist for given path:" + path);
			  e.printStackTrace();
			  
			}
			
			return path ;
			
			
			
		}
		
		// Method to read file and display the records 
		public void readfile() {
			String line = null ;
			try {
				while ((line = read.readLine()) != null) {
				      String[] wordm = line.split("–");
				      for (String wo : wordm) {
				        String [] wordop = wo.split(",");
				        for (String des : wordop) {
					        System.out.println(des);
				        }
				        
				      }
				 
				}
			} catch (IOException e) {
				System.out.println("file not found");
				e.printStackTrace();
			}
		}
		

}
