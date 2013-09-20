//DRUNKEN CODING PRELIM QUESTION 4
/*
Is that a tetrimino? 
Tetrimino are basically shapes that can be found in the popular tetris game. 

1111

 1
111

 11
11

11
11

You are required to complete the method containsTetrimino which checks if the input tetrimino matchs the shape in the 'room'. Return true if it does, return false if it does not.

A room with a tetrimino is represented by a 5 by 5 2D array which looks like this
00110
01100
00000
00000
00000
 
*/


public class QuestionFour{
	public static boolean containsTetrimino(int[][] tet, int[][] room) {
		//complete code - you may use your code from question 4
		  boolean possible = true;

		for (int i=0; i <=5-tet.length; i++) {
		  for (int j=0; j<=5-tet[0].length; j++) {
			if (room[i][j] == tet[0][0]) { // potential match
			  possible = true;
			  for (int y=0; y<tet.length && possible; y++) {
				for (int x=0; x<tet[0].length && possible; x++) {
				  if (room[i+y][j+x] != tet[y][x]) {
					possible = false;
				  }
				}
			  }
			  if (possible) {
				return true;
			  }
			}
		  }
		}
		return false;
	}
}