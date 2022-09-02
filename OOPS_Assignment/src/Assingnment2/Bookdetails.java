package Assingnment2;

import java.util.Scanner;

public class Bookdetails {

	public static void main(String[] args) {
	
		
		Book book = new Book();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Book Number: ");
		book.setBookNo(sc.nextInt());
		sc.nextLine();
		System.out.print("Enter Book Title: ");
		book.setTitle(sc.nextLine());
		System.out.print("Enter Book Author: ");
		book.setAuthor(sc.nextLine());
		System.out.print("Enter Book Price: ");
		book.setPrice(sc.nextFloat());
		EngineeringBook ebook = new EngineeringBook();
		sc.nextLine();
		System.out.print("Enter Book Category: ");
		ebook.setCategory(sc.nextLine());
		System.out.println("\r\n============Book Data============");
		System.out.println("Book Number: "+book.getBookNo());
		System.out.println("Book Title: "+book.getTitle());
		System.out.println("Book Author: "+book.getAuthor());
		System.out.println("Book Price: "+book.getPrice());
		System.out.println("Book Category: "+ebook.getCategory());
	}


	}

}
