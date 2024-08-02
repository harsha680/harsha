package sampleproject;

public class Staticoperation {
	static int a=6;
	static int b=2;
	static int c;
	public static void add()
	{
		c=a+b;
		System.out.println("sum="+c);
	}
	public static void diff()
	{
		c=a-b;
		System.out.println("Difference="+c);
	}
	public static void product()
	{
		c=a*b;
		System.out.println("product="+c);
	}
	public static void division()
	{
		c=a%b;
		System.out.println("quotient="+c);
	}
	public static void main(String[] args)
	{
		Staticoperation.add();
		Staticoperation.diff();
		Staticoperation.product();
		Staticoperation.division();
	}
}
	
