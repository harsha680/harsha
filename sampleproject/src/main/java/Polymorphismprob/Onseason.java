package Polymorphismprob;

public class Onseason {
	public void discount() {
		super.discount();
		d=total*40/100f;
		System.out.println("discount:"+discount);
	}

	public static void main(String[] args) {
		Onseason obj=new Onseason();
		obj.discount();
		obj.display();
		// TODO Auto-generated method stub

	}

}
