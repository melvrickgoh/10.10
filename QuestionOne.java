//DRUNKEN CODING PRELIM QUESTION 1
/*A palindrome is a word that is spelled the same backward and forward, like 'noon' and 'redivider'. Recursively, a word is a palindrome if the first and last letters are the same and the middle is a palindrome. Write a function called is_palindrome that takes a String argument and returns true if it is a palindrome and false otherwise. Remember that you can use the built-in method length() to check the length of a string.*/
public class QuestionOne{
	public static boolean is_palindrome(String original){
		int length = original.length();
		String reverse="";
      for ( int i = length - 1 ; i >= 0 ; i-- )
         reverse = reverse + original.charAt(i);
 
      if (original.equals(reverse))
         return true;
      else
         return false;
	}
}