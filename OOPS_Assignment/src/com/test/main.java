package com.test;
import com.shape.*;
public class main {
	
	public static void main(String[] args) {
		Square square = new Square(4);
		square.calcArea();
		square.calcPeri();
		Rectangle rectangle = new Rectangle(5,4);
		rectangle.calcArea();
		rectangle.calcPeri();
}

}
