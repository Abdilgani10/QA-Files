
public class vehicle extends MainRunner {
	

	private int id;
	private String make;
	
	vehicle (int id, String make){
		
		this.id =id;
		this.make = make;
	}
	
	int getid(){
		
		return id;
	}
	
	String getmake(){
		
		return make;
	}
	
	void print(){
		
		
		System.out.println("id: " +  id  + " make: " +  make);
	//}
}
	
}



		
		