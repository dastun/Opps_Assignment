package Assingnment1;

public class TestClass {
	
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setcustomerName("Aditya Prasad");
		customer.setresidentialAddress("Ambikapur","Chhattishgarh");
		System.out.println(customer.getCustomerDetails());
		
		Address address = new Address("pune","Maharastra");
		Customer customer2 = new Customer("kuhu",address);
		System.out.println(customer2.getCustomerDetails());

	}

}
