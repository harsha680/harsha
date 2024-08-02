package constructor;

public class Add {
	int a;
	int b;
	int c;
	int avg;
	public void display(int a, int b)

	
	{
		 c= a+b;
		System.out.println(c);
	} 
	public static void main(String []args)
	{
		Add t = new Add();
		t.display(10,30);
		t.avg();
	}
		public void avg()
		{
			int avg = c/2;
			System.out.println(avg);
		}

}
		
