package classesObjects.task12plus;

import classesObjects.task12plus.entity.Book;
import classesObjects.task12plus.entity.ProgrammerBook;

public class Main {
	public static void main(String[] args) {
		Book book1 = new Book("Serious Sam", "Jovanny Makkinley", 120);
		System.out.println(book1.hashCode());
		
		Book book2 = new Book("Serious Sam", "Jovanny Makkinley", 120);
		Book book3 = new Book("Fifth night", "Jovanny Makkinley", 120);
		
		System.out.println(book1.equals(book2)); //true
		System.out.println(book1.equals(book3)); //false
		
		System.out.println(book1);
		System.out.println(book3);
		
		ProgrammerBook prgBook1 = new ProgrammerBook("Java from zero", "Shildt", 150, "Java", 8);
		System.out.println(prgBook1.hashCode());
		
		System.out.println(prgBook1.equals(prgBook1)); //true
		System.out.println(prgBook1.equals(book1)); //false
		System.out.println(prgBook1.clone().equals(prgBook1)); //true
		System.out.println(prgBook1.equals(prgBook1.clone())); //false
		
		System.out.println(prgBook1);
		
		System.out.println(book1.clone());
		System.out.println(book1.clone().equals(book1)); //true
		System.out.println(book1.clone() == book1); //false
		
		book1.setISBN(1234);
		book2.setISBN(1235);
		System.out.println(book1.compareTo(book2)); //-1
		System.out.println(book2.compareTo(book1)); //1
		book1.setISBN(1235);
		System.out.println(book2.compareTo(book1)); //0
	}
}
