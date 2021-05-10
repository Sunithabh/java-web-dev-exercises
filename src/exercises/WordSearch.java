package exercises;
import java.util.Scanner;

public class WordSearch {
   public static void main(String[] args) {
     String firstSentence = "Alice was beginning to get very " +
             "tired of sitting by her sister " +
             "on the bank, and of having " +
             "nothing to do: once or twice " +
             "she had peeped into the book " +
             "her sister was reading, but it " +
             "had no pictures or conversations in it, 'and what " +
             "is the use of a book,' thought " +
             "Alice 'without pictures or " +
             "conversation?'";
     Scanner input = new Scanner(System.in);
     System.out.println("Type the word you are searching for:");

     String inputWord = input.nextLine().toLowerCase();
     if(firstSentence.toLowerCase().contains(inputWord)) {
       System.out.println("Your search term " + inputWord + " was found in the sentence");
     } else {
       System.out.println("Your search term " + inputWord + " was not found in the sentence");
     }

     int index = firstSentence.toLowerCase().indexOf(inputWord);
     int length = inputWord.length();
     System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
     String modifiedSentence = firstSentence.toLowerCase().replace(inputWord, "");
     System.out.println(modifiedSentence);
   }
}