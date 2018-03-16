
public class car extends vehicle {

	private String color;
	private int numberOfWheels;
	
	public car (String color, int numberOfWheels){
		
		this.color = color;
		this.numberOfWheels = numberOfWheels;
	}
	
	public String getcolor(){
		return color;
	}
	
	public int getnumberOfWheels(){
		return numberOfWheels;
	}
}
