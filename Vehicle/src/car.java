
public class car extends vehicle {

	private String color;
	private int numberOfWheels;
	private int speed;
	
	car (String color, int numberOfWheels, int speed, int id, String make){
		
		super (id, make);
		
		this.color = color;
		this.numberOfWheels = numberOfWheels;
		this.speed = speed;
	}
	
	int getSpeed (){
		return speed;
	}
	String getcolor(){
		return color;
	}
	
	int getnumberOfWheels(){
		return numberOfWheels;
	}
	
	void print(){
		
		super.print();
		
		System.out.println("color is: " + color + " numOfWheel is: " + numberOfWheels + " speed is: " + speed );
	}
}
