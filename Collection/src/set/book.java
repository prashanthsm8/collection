package set;

import java.util.Comparator;

public class book implements Comparable<book> {
	
	
		public String bookname;
		public String author;
		
		public book(String bookname, String author) {
			
			this.bookname = bookname;
			this.author = author;
		}
		
		public String getTitle() {
			return bookname;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((author == null) ? 0 : author.hashCode());
			result = prime * result + ((bookname == null) ? 0 : bookname.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			book other = (book) obj;
			if (author == null) {
				if (other.author != null)
					return false;
			} else if (!author.equals(other.author))
				return false;
			if (bookname == null) {
				if (other.bookname != null)
					return false;
			} else if (!bookname.equals(other.bookname))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "book [bookname=" + bookname + "]";
		}

		@Override
		public int compareTo(book o) {
		
			// TODO Auto-generated method stub
			
			return getTitle().compareTo(((book)o).getTitle());
		}
		
		
}



