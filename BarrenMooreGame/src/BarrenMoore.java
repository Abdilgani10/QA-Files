import java.util.Scanner;

public class BarrenMoore {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new BarrenMoore();
	}
	
	
	int[][] treasureArray;
	
	int treasureArraySize = 3;
	
	Scanner input;
	
	
	
	private void fillTresureArray(){
		System.out.println("\t" + "WELCOME TO BARREN MOORE");
		System.out.println("Enter the treasure array (3x3): ");
		
		for(int row = 0; row < treasureArraySize; row++){
			
			for(int column = 0; column < treasureArraySize ; column++){
				treasureArray[row][column] = input.nextInt();
				System.out.print(treasureArray[row][column]+"\t");
			}
			System.out.println();
		}
	}
	
	private void findTreasure(){
		
		boolean found = false;
		int currentCellRow = 0;
		int currentCellCol = 0;
		
		while(!found){
			System.out.println("Currently in row "+(currentCellRow+1)+" col "+(currentCellCol+1));
			int value = treasureArray[currentCellRow][currentCellCol];
			int nextCellCol = value % 10 - 1;
			value /= 10;
			int nextCellRow = value % 10 - 1;
			if(nextCellCol==currentCellCol && nextCellRow==currentCellRow){
				System.out.println("Treasure found");
				found = true;
			}else{
				currentCellCol = nextCellCol;
				currentCellRow = nextCellRow;
			}
			
		}
	}
	
	BarrenMoore(){
		input = new Scanner(System.in);
		treasureArray = new int[treasureArraySize][treasureArraySize];
		fillTresureArray();
		findTreasure();
	}
	

}
