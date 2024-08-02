package classthrow;

public class Throw {
	int age=12;
	public static void main(String[] args) throws VoteException {
		Throw obj=new Throw();
		obj.test();
		
	}
	public void test() throws VoteException
	{
		if(age>=18)
		{
			System.out.println("is eligible to vote");
		}
		else
		{
			throw new VoteException("is not eligible");
		}
	}

}
