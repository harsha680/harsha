package sampleproject;

public class staticmain {
	Static String x;
	public static void display(String s)
	{
		x=s;
		System.out.println(x);
	}
	public static void main()
	{
		staticmain.display("hello");
		
	}

}
