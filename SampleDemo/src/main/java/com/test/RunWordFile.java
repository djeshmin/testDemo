/**
 * 
 */
package com.test;

/**
 * @author Dilara
 *
 */
public class RunWordFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	    String file ="resources/Wordfile.txt";
		//String file ="../resources/Wordfile.txt";
		
		WordFile f = new WordFile();
		System.out.println("Exercises 3  Demo");
	    f.doesFileExist(f.getAbsoluteFilePath(file));
	    f.readfile();
	   

	}

}
