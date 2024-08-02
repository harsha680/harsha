package constructor;

public class Problem1 {
	String name;
	int id;
	String place;
	static String companyname="obsqura";

	
	public Problem1(String name, int id, String place)
	{
		name=name;
		place=place;
		id=id;
	}
		
	
	public void Problem1()
	{
		System.out.println(name);
		System.out.println(place);
		System.out.println(id);
		System.out.println(companyname);
	}
	public static void main(String []args)
	{
		Problem1 d=new Problem1("harsha",1,"TVM");
		d.Problem1();
		Problem1 d=new 	Problem1("sara",2,"Ernakulam");
		d.Problem1();
		Problem1 d=new Problem1("sagara",3,"palakkad");
		d.Problem1();
		Problem1 d=new Problem1("athulya",4,"kochi");
		d.Problem1();
		Problem1 d=new Problem1("amritha",5,"kannur");
		d.Problem1();
	}
	
	}

