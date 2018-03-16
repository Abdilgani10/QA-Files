
public class Grid {

	public static void main(String[] args) {
		
		int StudentGrades [][] = {{22, 33, 44, 55, 66},
		                          {23, 24, 46, 54, 64},
		                          {45, 67, 76, 75, 99},
		                          {77, 88, 99, 45, 74}};
		
		for (int row = 0; row < StudentGrades.length; row++ ){
			
			
			for (int column = 0; column < StudentGrades.length; column++){
				System.out.print(StudentGrades[row][column]+"\t");
			}
			
			System.out.println();
		}

	}

}
