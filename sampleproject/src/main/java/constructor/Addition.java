package constructor;

public class Addition {
	int a= 2;
	int b=3;
	int c;
	public Addition()
		{
			int c=a+b;
			System.out.println(c);
		}
		public static void main(String []args)
		{
			Addition a = new Addition();
		}
	}


