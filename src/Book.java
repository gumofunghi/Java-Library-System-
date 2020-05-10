class Book
{
	private String title, isbn, author, type;
	// isbn if for user and librarian to search
	// type is the book type, for example: novel, reference book, journal

	public Book(){};
	public Book(String title, String isbn, String author, String type)
	{
		this.title=title;
		this.isbn=isbn;
		this.author=author;
		this.type=type;
	}

	public void setTitle(String title){this.title = title;}
	public void setISBN(String isbn){this.isbn = isbn;}
	public void setAuthor(String author){this.author = author;}
	public void setType(String type){this.type = type;}

	public String getTitle(){return title;}
	public String getISBN(){return isbn;}
	public String getAuthor(){return author;}
	public String getType(){return type;}

	public String bookListDisplay()
	{
		return 	"\nTitle			: " + title +
				"\nISBN			: " + isbn +
				"\nAuthor			: " + author +
				"\nType			: " + type ;
	}
}