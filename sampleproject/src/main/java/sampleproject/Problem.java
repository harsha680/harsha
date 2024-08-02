package sampleproject;

public class Problem {
	static int l,b,r;
	static float a;
	static float area;
	public static void Area(int l,int b)
	{
		area=l*b;
		System.out.println("Area of rectangle:"+area);
	}
	public static void Area(float a)
	{
		area=a*a;
		System.out.println("Area of square:"+area);
	}
	public static void Area(int r)
	{
		area=(3.14)*r*r;
		System.out.println("Area of circle:"+area);
	}
	public static void main(String args[])
	{
		Problem.Area(2,3);
		Problem.Area(2.5f);
		Problem.Area(4);
	}
	

}
