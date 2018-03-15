package ifstatments;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Tempreture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tempreture = 90;
		boolean isSummer = true;
		
		
		if (tempreture > 30 && isSummer ){
			System.out.println("It is summer enjoy the day");
		

	}else if (tempreture < 30 && isSummer){
		
		System.out.println("Bad Luck Mate Cancel everthing");
	}

}
}
