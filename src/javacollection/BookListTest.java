package javacollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookListTest {
	public static void main(String[] args) {
		BookList t=new BookList();
		t.setName("n");
		t.setPrice("100");
		
		List<BookList> blist=new ArrayList<>();
		blist.add(t);

		for(BookList s:blist) {
			System.out.println(s);
		}
	}
}
