package p1;

abstract public class Shape {

	
	
	//instance data 
	
	
	protected int len;
	protected int bre;
	
	
	public Shape(int i,int j)
	{
		this.len=i;
		this.bre=j;
	}
	
	
abstract	public int area();
	
	
abstract	public int perimeter();
	
	
	public void sayHello()
	{
		System.out.println("hello from shape class");
	}
	
	
	
	
	//public static void main(String[] args) {
		
		
		
		
		
		
	//}
}
