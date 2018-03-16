
public class vehicle {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car car1 = new car ("blue" , 4);
		motorcycle motorcycle1 = new motorcycle ("red" , 2);
		
		vehicle array [] = {car1, motorcycle1};
		
		for ( int i = 0; i < array.length; i++){
			System.out.println(array[i].getcolor());
		}

	}

}
