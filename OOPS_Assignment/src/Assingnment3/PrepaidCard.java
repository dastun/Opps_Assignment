package Assingnment3;

abstract class PrepaidCard {
	

	int CardNo;
	double availableBalance;
	double swipeLimit;
	

	public abstract boolean swipeCard (double input);
	
	
	public void rechargeCard(double amount) {
		this.availableBalance+=amount;
		System.out.println("Reacharge Successfully ! Balance :"+this.availableBalance);
	} 

}
