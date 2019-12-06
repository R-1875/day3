package p2;

//import p1.Rectangle;
//import p1.Shape;

public class Car extends Vehicle{
	
	
	
	
	public void start()
	{
		System.out.println("ignition");
	}
	
	
	public void stop()
	{
		System.out.println("off");
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		
		
		Car v=new Car();
		v.start();
		v.stop();
		
		

	}

}
