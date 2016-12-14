

import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/** This class will crawl a website and return all the links on the website
 * @author Dhanish Ashraf
 *
 */
public class WebCrawler {
		
	/**
	 * @param urlString is the URL that needs to be crawled
	 * @return the list of URLs found as an ArrayList
	 */
	public static ArrayList<String> collectURLs(String urlString){ 
		
		String readString; 
		ArrayList<String> URLs = new ArrayList<>(); //Creating a new ArrayList to store the URLs
		
		try {
            URL url = new URL(urlString); 
         //Reading each line of the URL
            BufferedReader in =
                new BufferedReader(new
                                   InputStreamReader(url.openStream()));
            int line = 0;
            while ((readString = in.readLine()) != null) {
            	if(readString.contains("a href=\"")) {
            	 String[] splitString = (readString.split("a href=\"")); 
            	 String[] splitString2 = (splitString[1].split("\""));
         
            		 URLs.add(splitString2[0]);
            		 /** Go through each line of the url and if the line contains 
            		  * "a href="" split the line at this point and then find the end 
            		  * quote mark and split it there. Add this line split to the array list.
            		  * We split at these points because all links will start with "a href=" " and 
            		  * end with " " "
            		  *  */
            	 }          
            
               line++;
            }
        }
	
        catch (IOException e) {
            System.out.println("no access to URL: " + urlString);
        }
	
		return URLs;
		}
	
}	