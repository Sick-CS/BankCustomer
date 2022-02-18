package bankaccount;

abstract class RBI {
	
	abstract void getRateofinterest();
	abstract void savingAccountbalance();
	abstract void currentAccountbalance();
	
}

class SBI extends RBI{

	@Override
	void getRateofinterest() {
		// TODO Auto-generated method stub
		System.out.println("Our Rate of interest is: 2.5%");
	}

	@Override
	void savingAccountbalance() {
		// TODO Auto-generated method stub
		System.out.println("Your SBI saving account balance is: 10000");
	}

	@Override
	void currentAccountbalance() {
		// TODO Auto-generated method stub
		
		System.out.println("Your SBI current account balance is: 20000");
	}
	
	
}

class ICICI extends RBI{

	@Override
	void getRateofinterest() {
		// TODO Auto-generated method stub
		System.out.println("ICICI Rate of interest is 3.5%");
	}

	@Override
	void savingAccountbalance() {
		// TODO Auto-generated method stub
		System.out.println("Your ICICI saving account balance is: 10000");
	}

	@Override
	void currentAccountbalance() {
		// TODO Auto-generated method stub
		System.out.println("Your ICICI current account balance is: 20000");
	}	
	
}