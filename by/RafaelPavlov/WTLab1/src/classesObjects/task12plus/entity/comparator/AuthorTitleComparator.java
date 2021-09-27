package classesObjects.task12plus.entity.comparator;
import java.util.Comparator;

import classesObjects.task12plus.entity.Book;

public class AuthorTitleComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		int authorCompare = o1.getAuthor().compareTo(o2.getAuthor());
		if(authorCompare!= 0) return authorCompare;
		TitleComparator comparator = new TitleComparator();
		return comparator.compare(o1, o2);
	}

}
