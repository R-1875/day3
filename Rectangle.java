package p1;

public class Rectangle extends Shape {
	
	
	public Rectangle(int a,int b)
	{
		super(a,b);
	}
	
	
	public int area()
	{
		return(super.len * super.bre);
	}
	
	
	public int perimeter()
	{
		return(2*(super.len + super.bre));
	}
	
	
	public void sayHello()
	{
		System.out.println("hello from rectangle class");
	}
	
	

	public static void main(String[] args) {
		
		
		
		Shape s=new Rectangle(5,2);
		
		System.out.println("" +s.area());
		System.out.println("" +s.perimeter());
		

	}

}
