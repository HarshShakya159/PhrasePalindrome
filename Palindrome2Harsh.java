/*
 * HARSH SHAKYA
 * FEB 17, 2022
 * COMP SCI ASSIGNMENT 2 
 * PALINDROME #2
 * Mr. Martins 
 */
package Palindrome2Harsh;
import java.util.Scanner;

public class Palindrome2Harsh {
    
    // Took this code off online sources, I was stuck on this for hours and needed to look for other sources.
    public static String palindrome(String sentence) {

        String array[] = sentence.split(" "); // String Array tracks all the words, then the sentence splits divides them into individual words
        int wordcount = 0;

        // To track and analyze mutliple words, you have to use a for-loop
        for (int i = 0; i < array.length; i++) {

            String palindromeword = array[i]; // Variable to track the number of letters in a word
            char characters[] = palindromeword.toCharArray(); // Tracking individual letters of the word

            String ReverseWord = ""; // Variable holding the inverse of the word

            // For loop for adding the characters
            for (int w = characters.length - 1; w >= 0; w--){

                ReverseWord += characters[w];
            }

            
            if (palindromeword.equals(ReverseWord)){ // If statement to determine whether the word is a Palindrome

                System.out.println((wordcount) + 1 + ". " + "|" + palindromeword + "|" + " is a palindrome."); // if the word is a Palindrome, the number of total palindrome increases by 1
                wordcount++;

                ReverseWord = ""; 
            }
        }
        
        System.out.println("--------------------------------");
        return "There are a total of " + wordcount + " palindrome(s) in the sentence.";  // Display the total number of Palidromes in the server
    }

    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in); // Scanner class to prompt an input

        System.out.println("--------------------------------");
        System.out.println("FIND IF THE SENTENCE CONTAINS ANY PALINDROMES - HARSH SHAKYA"); // title 
        System.out.println("--------------------------------");   
        System.out.print("Please enter a sentence: "); // Prompt to enter your sentence
        String sentence = userinput.nextLine(); // Command to enter the sentence
        
        sentence = sentence.toLowerCase(); // Make all the words into lowercase

        // Using the String Static method from before to use it for the final answer
        String answer = palindrome(sentence);
        System.out.println(answer); // Displas the final amount of palindrome, and how many there are

        userinput.close();

    }
}


