//DRUNKEN CODING PRELIM QUESTION 5
/*
	Code the rotate method that rotates the room clockwise once.
*/
public class QuestionFive{
	
	public static boolean containsTetrimino(int[][] tet, int[][] room){
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
	
	public static int[][] rotate(int[][] room){
		int[][] newRoom = new int[5][5];
		for (int i=0; i<5; i++) {
		  for (int j=0; j<5; j++) {
			newRoom[j][4-i] = room[i][j];
		  }
		}
		return newRoom;
	}
}