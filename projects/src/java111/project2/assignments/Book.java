/** Represents a book.
 *  Used emphasize Unit 2 concepts and help you prepare
 *  for Project 2.
 *  @author Jared Wesolaski
 */
public class Book {

    private String title;
    private String author;
    private int publicationYear;
    private int numberOfCopies;
    private int size;

    /**
	* Returns value of title
	* @return title
	*/
	public String getTitle() {
		return title;
	}

	/**
	* Sets new value of title
	* @param title
	*/
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	* Returns value of author
	* @return author
	*/
	public String getAuthor() {
		return author;
	}

	/**
	* Sets new value of author
	* @param author
	*/
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	* Returns value of publicationYear
	* @return publicationYear
	*/
	public int getPublicationYear() {
		return publicationYear;
	}

	/**
	* Sets new value of publicationYear
	* @param publicationYear
	*/
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	/**
	* Returns value of numberOfCopies
	* @return numberOfCopies
	*/
	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	/**
	* Sets new value of numberOfCopies
	* @param numberOfCopies
	*/
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	/**
	* Returns value of size
	* @return size
	*/
	public int getSize() {
		return size;
	}

	/**
	* Sets new value of size
	* @param size
	*/
	public void setSize(int size) {
		this.size = size;
	}


    // TODO Create a method to calculate the width on the bookshelf that all copies
    // of this book take up (numberOfCopies * size)
    public int shelfSize() {
        return getNumberOfCopies() * getSize();
    }

    // TODO Create a method that returns a String containing the book information,
    // including the distance this title takes up.
    public void bookInformation() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Book Author: " + getAuthor());
        System.out.println("Book Publication Year: " + getPublicationYear());
        System.out.println("Book Number of Copies: " + getNumberOfCopies());
    }

    // TODO Remember to include descriptive comments before each method explaining
    // what the method does. Be sure to include details about what parameters the
    // methods take and what they return, if anything.

}
