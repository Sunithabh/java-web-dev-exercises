package org.launchcode.java.studios.CountingCharacters;

import java.util.Map;
//import java.util.Scanner;
import java.util.HashMap;  //import the HashMap class
import java.nio.file.*; // to import filepath

public class countingCharacters {
   public static void main(String[] args) throws Exception{
       //create a HashMap containing char as a key and occurrences as a value
       HashMap<Character, Integer> charCountMap = new HashMap<>();

       // Prompting the user for the input text/string and storing in a variable
      /* Scanner input = new Scanner(System.in);
       System.out.println("Input your text here:");
       String str = input.nextLine().toLowerCase();  //make the charCount case-insensitive*/

       //Super Bonus//Read the string in from a file
       String data;
       data = new String(Files.readAllBytes(Paths.get("C:\\LC\\Java\\Project1\\HelloWorld\\src\\com\\company\\Main.java")));

       //Finding the character whose ASCII value fall under this range
       for(int i=0; i<data.length(); i++){  // changed variable to data from str
           if(data.charAt(i) < 'A' || data.charAt(i) > 'Z' && data.charAt(i) < 'a' || data.charAt(i) > 'z') {
               data = data.substring(0, i) + data.substring(i + 1);    //erase function to erase the character
               i--;
           }
       }

       char[] strArray = data.toCharArray();  // converting given string to char array

       //checking each char of strArray
       for (char c : strArray){
           if(charCountMap.containsKey(c)) {        //if char is present in charCountMap,
               charCountMap.put(c, charCountMap.get(c) + 1);  //incrementing its count by 1
           } else {                     //if char is not present in charCountMap,
               charCountMap.put(c, 1);   //putting this char to charCountMap with 1 as its value
           }
       }

       //Printing the charCountMap
       for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
           System.out.println(entry.getKey() + " " + entry.getValue());
       }

   }
}
