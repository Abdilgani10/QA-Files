package peopleObject;

public class people {
	
		public String name;
		public int age;
		public String jobTitle;

		
		public String toString(){
			
			return "name, " + name + " age, " + age + " jobTitle, " + jobTitle; 
		}
	
	public people (String name, int age, String jobTitle) {

		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		
	}
	
	public static void main(String[] args) {
		
		
		people person1 = new people("John", 32, "Scientist");
		people person2 = new people("Abdilgani", 24, "Cosmologist");
		
		people array[] = new people [2];
		
		array [0] = person1;
		array [1] = person2;
				
		for (int i = 0; i < array.length; i++){
			System.out.println(array[i].jobTitle);
			
			

		}
		
	}
	
}


