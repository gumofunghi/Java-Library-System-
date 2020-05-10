class ReferenceBook extends Book
{
	private String 	field,		// to differentiate different field of reference book
					yearPublished;

	public ReferenceBook(){}
	public ReferenceBook(String title, String isbn, String author, String type, String field, String yearPublished)
	{
		super(title, isbn, author, type);
		this.field = field;
		this.yearPublished = yearPublished;
	}

	public void setYearPublished(String yearPublished){this.yearPublished = yearPublished;}
	public void setField(String field){this.field = field;}

	public String getYearPublished(){return yearPublished;}
	public String getField(){return field;}

	public String bookListDisplay()
	{
		return 	super.bookListDisplay() +
				"\nField                    : " + field +
				"\nYear Published	: " + yearPublished +"\n";

	}
}