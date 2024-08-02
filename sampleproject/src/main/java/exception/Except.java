package exception;

public class Except {
	int a=2,b=0;
	int c;
	public void display()
	{
		try
		{
			c=2/0;
		}
	catch(ArithmeticException e)
		{
		System.out.println(e);
		}
		finally
		{
			System.out.println("message corrected");	
	}
	}
public static void main(String[] args)
{
	Except t=new Except();
	t.display();
}
	}


