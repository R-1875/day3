package p1;

public class Base {
	
	
	public Base()
	{
		System.out.println("inside base");
	}
	
	
	//instance data
	
	private int i;
	private int j;
	
	
	
	//instance methods
	//setter method
	
	public void setIJ(int v1,int v2)
	{
		this.i=v1;
		this.j=v2;
	}
	
	
	//getter 
	public void showIJ()
	{
		System.out.println("i is ="+this.i);
		System.out.println("j is ="+this.j);
	}
	
	

}
