package ques5;

public class Joker extends JokerPoly{

	String JName;
	String Dance;
	
	Joker(){
		
	}
	Joker(String Jname, String Dance){
		this.JName = Jname;
		this.Dance = Dance;
		
		
	}
	public static void main(String args[])
	{
		Joker J1 = new Joker();
		Joker J11 = new Joker("Joker1","Odissi");
		Joker J2 = new Joker();
		Joker J12 = new Joker("Joker2","Manipuri");
		Joker J3 = new Joker();
		Joker J13 = new Joker("Joker3","Kuchipudi");
		Joker J4 = new Joker();
		Joker J14 = new Joker("Joker4","Bharatnatyam");
		Joker J5 = new Joker();
		Joker J15 = new Joker("Joker5","Kathak");
		Joker J6 = new Joker();
		Joker J16 = new Joker("Joker6","Bhangra");
		//Joker J7 = new Joker();
		//Joker J17 = new Joker("Joker7","Western");
		//Joker J8 = new Joker();
		//Joker J18= new Joker("Joker8","Hip-hop");
		
		System.out.println(J1.JName+"dances"+J1.Dance);
		System.out.println(J11.JName+"dances"+J11.Dance);
		System.out.println(J2.JName+"dances"+J2.Dance);
		System.out.println(J12.JName+"dances"+J12.Dance);
		System.out.println(J3.JName+"dances"+J3.Dance);
		System.out.println(J13.JName+"dances"+J13.Dance);
		System.out.println(J4.JName+"dances"+J4.Dance);
		System.out.println(J14.JName+"dances"+J14.Dance);
		System.out.println(J5.JName+"dances"+J5.Dance);
		System.out.println(J15.JName+"dances"+J15.Dance);
		System.out.println(J6.JName+"dances"+J6.Dance);
		System.out.println(J16.JName+"dances"+J16.Dance);
	}
	public String dance() {
		return "Odissi";
	}
	public String dance1() {
		return "Manipuri";
	}
	
	
	
}
