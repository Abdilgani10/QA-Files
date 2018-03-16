import java.util.Scanner;

public class GridInput {

	public static void main(String[] args) {
		
		int EnterNumbers [][] = new int [3][3];
		
		Scanner insert = new Scanner (System.in);
		System.out.println(" Enter your  Values");
		
		for (int row = 0; row < 3; row++ ){
			
			for (int column = 0; column < 3; column++ ){
				
			EnterNumbers[row][column] = insert.nextInt();
			}
		}
		
			System.out.println(" your rows and colums are arranged");
			for (int row = 0; row < 3; row++ ){
			
			
			for (int column = 0; column < 3; column++){
				System.out.print(EnterNumbers[row][column]+"\t");

	}
			System.out.println();
}
	}
}
