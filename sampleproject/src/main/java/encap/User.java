package encap;

public class User {
	private int pin;
	public void Setter(int pin)
	{
		this.pin=pin;
	}
	public void validate()
	{
		if(this.pin==1001)
		{
			System.out.println("valid");
		}
		else if(this.pin==1234){
			System.out.println("valid");
		}
			else if(this.pin==1212)
			{
				System.out.println("valid");
			}
			else
			{
				System.out.println("invalid");
			}
			}
			public void getter()
			{
				System.out.println(this.pin);
			}
			
		}
	


