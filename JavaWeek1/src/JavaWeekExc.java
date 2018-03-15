import java.util.ArrayList;
import java.util.Iterator;

public class JavaWeekExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		ArrayList<String> Players = new ArrayList<String>();
		
		Players.add("Messi, Age 27, height 170cm, Goals 300");
		Players.add("Ronaldo, Age 31, height 188cm, Goals 290");
		Players.add("Hazard, Age 26, height 172cm, Goals 200");
		Players.add("Neymar, Age 25, height 177cm, Goals 210");
		
		Players.add(1, "nationality Argentinain");
		Players.add(3, "nationality Portogees");
		
		
		
		//System.out.println("Player Profile is " + Players);
		
		Iterator<String> it = Players.iterator();
		
		 
	    while(it.hasNext()) {
	      String obj = (String)it.next();
	      System.out.println(obj);
		
		
		

}

}
	
}



