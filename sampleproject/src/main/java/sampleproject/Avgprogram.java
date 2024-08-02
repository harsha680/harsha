package sampleproject;

public class Avgprogram {
	static int a=20,b=10,avg,res;
	public static void sum()
	{
		res=a+b;
		System.out.println("sum is"+res);
		
	}
	public static void avg()
	{
		avg=res/2;
		System.out.println("average is"+avg);
		
	}
	public static void main(String args[])
	{
		Avgprogram.sum();
		Avgprogram.avg();
		
	}

}
