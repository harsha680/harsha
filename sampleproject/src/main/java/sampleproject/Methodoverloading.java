package sampleproject;

public class Methodoverloading {
	public static void add( float a, int b)
	{
		int c= a+b;
		System.out.println(c);
	}
	public static void add(int a, int b)
	{
		int c= a+b;
		System.out.println(c);
	}
	public static void main( String[] args)

	{
		Methodoverloading.add(2,3);
        Methodoverloading.add(4, 5);
		
	
				
	}
	

}
