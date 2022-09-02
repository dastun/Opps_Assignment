package Assingnment3;




interface Rewardable{
	
	double rewardPoints(double amount);
}




public class TravelCard  extends PrepaidCard implements Rewardable {


		
double rewardPoints;
	
	@Override
	public double rewardPoints(double INR) {
		return (INR / 100)*5;
		
	}
	

	@Override
	public
	boolean swipeCard(double swip) {
		
			if(swip > this.availableBalance) {
				return false;
			}else {
				
				this.availableBalance-=swip;
				this.rewardPoints += this.rewardPoints(swip);
				return true;
			
			}
	}
	
	void cardDetails() {
		System.out.println("Card No:"+this.CardNo);
		System.out.println("Available Balance :"+this.availableBalance);
		System.out.println("Reward Points:"+this.rewardPoints);
	}
	
	

}
