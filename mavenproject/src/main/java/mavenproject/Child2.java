package mavenproject;

public class Child2 extends Parent{
	public void display2()
	{
		System.out.println("Cat");
	}
	public static void main(String []args)
	{
		Child2 obj=new Child2();
		obj.display();
		obj.display2();
	}
	
	
	

}
