package Assingnment4;

import java.util.Random;

public class TestMedicine {

	public static void main(String[] args) {
		Medicine[] medicine = new Medicine[5];
		medicine[0] = new Ointment();
		medicine[1] = new Syrup();
		medicine[2] = new Tablet();
		Random random = new Random();
		int rn = random.nextInt(2 - 0 + 1) + 0;
		medicine[rn].displayLabel();
	

	}

}
