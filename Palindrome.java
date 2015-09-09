// Textbook used as a reference

import java.util.Scanner;


public class Palindrome {
    
   
public static void main (String[] args)
	{
    	System.out.println ("Enter a Palindrome");
   
    Scanner input = new Scanner(System.in);
    String text= input.nextLine();
   int first = 0;
   int last = text.length() -1;
    
    
   
    
    int isPalindrome = 1;
    while (first < last){
    	if (text.charAt(last)  != text.charAt(first))
    		isPalindrome = 0;
    	first++;
    	last--;
    }
   		
    if (isPalindrome == 1)
    	System.out.println ("String entered is a Palindrome");
    else
    	System.out.println ("String entered is NOT a Palindrome");
    
	}
}




