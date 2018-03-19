
public class motorcycle extends vehicle {
	
	private String color;
	private int numberOfWheels;
	
	public motorcycle (String color, int numberOfWheels, int id, String make){
		
		super (id, make);
		
		this.color = color;
		this.numberOfWheels = numberOfWheels;
	}
	
	public String getcolor(){
		return color;
	}
	
	public int getnumberOfWheels(){
		return numberOfWheels;
	}
	
	void print(){
		
		super.print();
		
		System.out.println("color is: " + color + " numOfWheel is: " + numberOfWheels);
	}
	

}
