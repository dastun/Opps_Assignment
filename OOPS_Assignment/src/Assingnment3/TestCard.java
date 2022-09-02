package Assingnment3;

import java.util.Scanner;

public class TestCard {

	public static void main(String[] args) {
	

@SuppressWarnings("resource")
Scanner input = new Scanner(System.in);
		
		TravelCard tc = new TravelCard();
		
		int user = 0;
		boolean exitUser = true;
		tc.CardNo = (int) (100000 + Math.random() * 900000);
		
		do {
			System.out.println("---Travel Card ---");
			System.out.println("press 1 to View Card Info");
			System.out.println("press 2 to Recharge Card");
			System.out.println("press 3 to Swipe Card");
			System.out.println("press 0 to exit");
			
			
			if(input.hasNext()) {
				user = input.nextInt();
			}else {
				exitUser = false;
			}
			switch(user) {
				case 1:
					tc.cardDetails();
					break;
				case 2:
					System.out.println("Enter Amount :");
					double amount = input.nextDouble();
					tc.rechargeCard(amount);
					break;
				case 3:
					System.out.println("Enter the Amount in USD to Swip: ");
			        double USD = input.nextDouble();
			        double INR = 60 * USD;
			        boolean status = tc.swipeCard(INR);
			        if(status) {
			        	System.out.println("Swip Successfully");
			        	
			        	tc.cardDetails();
			        }else {
			        	System.out.println("Failed ! Insufficent Balance !");
			        }
			        break;   
				case 0:
					exitUser = false;
					break;
				default:
					System.out.println("Choose a Correct Option");
			}
			
		}while(exitUser);
	}
		
	}


