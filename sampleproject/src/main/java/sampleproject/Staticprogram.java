package sampleproject;

public class Staticprogram{
	static int a=10;
	static float b=10;
	static float c;
	public static float display()
	{
		float c=a+b;
		return c;
	}
	public static void main(String[]arg)
	{
		System.out.println(Staticprogram.display());
	}
}
