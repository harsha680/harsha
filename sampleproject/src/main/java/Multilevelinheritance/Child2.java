package Multilevelinheritance;

public class Child2 extends Child1 {
	public void display2() {
		System.out.println("kovalam");
	}
	public static void main(String[] args)
	{
		Child2 obj=new Child2();
		obj.display();
		obj.display1();
		obj.display2();
	}

}
