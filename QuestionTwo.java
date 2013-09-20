//DRUNKEN CODING PRELIM QUESTION 2
/*
Some functions only work for certain data types. In order to give worthwhile feedback it is good to include simple tests at the beginning of the function to weed out any invalid data. Create a recursive function for double factorial. Double factorials are defined as n*(n-2)*(n-4). . . with double factorial of 1 or 0 both equaling 1. Your program should start with two guardian statements to test that the input value is valid. If the input is not valid it should return an error string. (See examples) Use the Integer.parseInt() method to convert a String to an Integer. You can assume for this question that there is a function, isInteger(String s), that returns true if s represents an Integer.
Examples: 
>>> doublefactorial("hello") "TypeError: unsupported type" 
>>> doublefactorial("-3") "OverflowError: math range error" 
>>> doublefactorial("0") "1" 
>>> doublefactorial("12") "46080" 
>>> doublefactorial("7") "105"
*/

//TypeError: unsupported type
//OverflowError: math range error

public class QuestionTwo{
	public static int doubleFactorial(int input){
		return 0;
	}
}