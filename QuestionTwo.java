//DRUNKEN CODING PRELIM QUESTION 2
/*
Some functions only work for certain data types. In order to give worthwhile feedback it is good to include simple tests at the beginning of the function to weed out any invalid data. Create a recursive function for double factorial. Double factorials are defined as n*(n-2)*(n-4). . . with double factorial of 1 or 0 both equaling 1.
Examples: 
>>> doublefactorial("0") "1" 
>>> doublefactorial("12") "46080" 
>>> doublefactorial("7") "105"
*/

public class QuestionTwo{
	public static int doubleFactorial(int input){
		if (input==0||input==1){
			return 1;
		}
		
		return input * doubleFactorial(input-2);
	}
}