package p2;

public class Bicycle extends Vehicle{
	
	
	
	
	public void start()
	{
		System.out.println("cycle start");
	}
	
	
	public void stop()
	{
		System.out.println("cycle off");
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		Vehicle v=new Bicycle();
		//Bicycle v1=new Bicycle();
		v.start();
		v.stop();
	}

}
