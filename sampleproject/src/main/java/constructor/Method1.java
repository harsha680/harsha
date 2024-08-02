package constructor;

public class Method1 {
	int bonus;
	static int bonussal;
	static int insurance;
	public static void student(String s,int age,int firstsemmark,char c,int to,int bonus)
	{
		System.out.println(s);
		System.out.println(age);
		System.out.println(firstsemmark);
		System.out.println(c);
		System.out.println(to);
		System.out.println(bonus=firstsemmark+to);
	}
	public static void employees(String n,int id,int jansal,int bonusal, int to)
	{
		System.out.println(n);
		System.out.println(id);
		System.out.println(jansal);
		System.out.println(to);
		System.out.println(bonusal=jansal+to);
		
	}
	public static void car(String n,int c,int to)
	{
		System.out.println(n);
		System.out.println();
	}
	public static void main(String args[])
	{
	Method1 d=new Method1();
	d.student("harsha",23,60,'c',300,0);
	d.employees("Athulya",2,5000,26000,0);
	}
	
	}
	
