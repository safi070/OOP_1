 public class Artist{
	private String name;

	Artist(){
		this.name="Unknown Name ";
		//this.name= name.getName();
	}	

	public String getName(){
		return name;		
	}

	public void display(){
		System.out.println("Artsit Name : "+ name);
	}


}