package Polymorphismprob;

public class Offseason {
	double discount;
	int c1=400;
	int c2=500;
	int c3=600;
	int total;
	float d;
	public void display() {
		 total=c1+c2+c3;
		 System.out.println("total:"+total);
	}
	public void discount()
	{
		d=total*15/100f;
		System.out.println("discount:"+discount);
		
	}

}
