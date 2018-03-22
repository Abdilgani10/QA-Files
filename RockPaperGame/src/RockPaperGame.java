import java.util.Random;
import java.util.Scanner;

public class RockPaperGame {

	

	public static void main(String[] args) {
		
		String player;
		String computer = "";
		int computerint;
		 
		
		Scanner input = new Scanner (System.in);
		Random generator = new Random();
		//System.out.println("choose: 1 for Rock ---- 2 for Paper ---- 3 for sissors");
		
		computerint = generator.nextInt(3)+1;
		
		if (computerint == 1){
			
			computer = "Rock";
		}else if (computerint == 2){
			
			computer = "Paper";
			
		}else if (computerint == 3){
			
			computer = "Scissors";
		}
		
		System.out.println("It is your play now");
		
		
		player = input.next();
		 
		if ( player.equals(computer) ){
			
			System.out.println("It is A tie");
			
			
		}else if (player.equals ("Rock")){
			
			if (computer.equals ("Scissors"))
			System.out.println("You Win Rock Crashes Scissors");
			
			
		}else if (player.equals ("Paper")) {
			
			if (computer.equals ("Rock"))
			System.out.println("You Loose  paper crashes Rock");
			
		}else if (player.equals ("Scissors")) {
			
			if (computer.equals ("Paper"))
			System.out.println("You win Scissors cuts Paper");
			
			
		}else {
			System.out.println("invalid Input");
		}
		
	}
}
