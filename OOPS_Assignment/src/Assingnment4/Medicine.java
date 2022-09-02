package Assingnment4;

abstract class Medicine {
	private double price;
	private String expdate;
	abstract void displayLabel();
	void getDetails() {
		System.out.println(price +" "+expdate);
	}
}

class Tablet extends Medicine{
	void displayLabel() {
		System.out.println("Store in a cool dry place");
	}
}

class Syrup extends Medicine{
	void displayLabel() {
		System.out.println("Store in a cool dry place");
	}
}

class Ointment extends Medicine{
	void displayLabel() {
		System.out.println("For External Use Only");
	}
	
	

}
