package Multilevel;

public class wild extends animal {
	public void display1()
	{
		System.out.println("wild animal");
	}
	public static void main(String []args)
	{
		wild obj=new wild();
		obj.display();
		obj.display1();
	}

}
