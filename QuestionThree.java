//DRUNKEN CODING PRELIM QUESTION 3
/*
Pascal's Triangle is a mathematical construct that has interesting properties related to the field of statistics. In the puzzle, you will need to generate the logic for pascal triangle given an input integer. Given an int, return a Pascal Triangle with the same number of "rows" as the given int. Each number in the output is separated by a space. There is no need to actually display the triangle in this question therefore no new line is needed for each "row" - see the examples for a better idea.

createTri(1)-> " 1 " createTri(2)-> " 1 1 1 " createTri(5)-> " 1 1 1 1 2 1 1 3 3 1 1 4 6 4 1 "

*/
public class QuestionThree{
	public static String createTri(int row){
		int N = row;
        int[][] pascal  = new int[N+1][];

        // initialize first row
        pascal[1] = new int[1 + 2];
        pascal[1][1] = 1;

        // fill in Pascal's triangle
        for (int i = 2; i <= N; i++) {
            pascal[i] = new int[i + 2];
            for (int j = 1; j < pascal[i].length - 1; j++)
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
        }
		String triangle=" ";
        // print results
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j < pascal[i].length - 1; j++) {
                triangle+=pascal[i][j] + " ";
            }
        }
		return triangle;
	}
}