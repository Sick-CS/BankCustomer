package bankaccount;

public class Main {

	public static void main(String[] args) {

		SBI S = new SBI();
		// S.getRateofinterest();
		// S.savingAccountbalance();
		// S.currentAccountbalance();

		ICICI I = new ICICI();
		// I.getRateofinterest();
		// I.savingAccountbalance();
		// I.currentAccountbalance();

		Customer C = new Customer();
		Customer C1 = new Customer();
		
		C.setname("Harry");
		C.setid(6);
		C.setaddress("Kandivali");
		
		C1.setname("Tom");
		C1.setid(9);
		C1.setaddress("Bandra");


		System.out.println("Hello! ");
		System.out.println("SBI BANK CUSTOMER INFO");
		System.out.println("\nCustomer name: " + C.getname());
		System.out.println("Customer id: " + C.getid());
		System.out.println("Customer address: " + C.getaddress());

		System.out.println("\nSBI LOAN INFORMATION");
		S.getRateofinterest();
		// System.out.println("\n"+C.getname()+" your SBI & ICICI Bank informations are
		// here");
		// System.out.println("\nSBI Bank Loan information: ");

		System.out.println("\n" + C.getname() + " your SBI Bank Account Information :");
		S.savingAccountbalance();
		S.currentAccountbalance();

		System.out.println("\nICICI BANK CUSTOMER INFO");
		System.out.println("\nCustomer name: " + C1.getname());
		System.out.println("Customer id: " + C1.getid());
		System.out.println("Customer address: " + C1.getaddress());

		System.out.println("\nICICI LOAN INFORMATION");
		I.getRateofinterest();

		System.out.println("\n" + C1.getname() + " your SBI Bank Account Information :");
		I.savingAccountbalance();
		I.currentAccountbalance();

	}
}
