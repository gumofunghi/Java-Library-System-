class Novel extends Book
{
	private String  description,		// for novel description
					yearPublished;

	public Novel(){}
	public Novel(String title, String isbn, String author, String type, String description, String yearPublished)
	{
		super(title, isbn, author, type);
		this.description = description;
		this.yearPublished = yearPublished;
	}

	public void setYearPublished(String yearPublished){this.yearPublished = yearPublished;}
	public void setDescription(String description){this.description = description;}

	public String getYearPublished(){return yearPublished;}
	public String getDescription(){return description;}

	public String bookListDisplay()
	{
		return 	super.bookListDisplay() +
				"\nYear Published	: " + yearPublished +
				"\nDescription		: " + description +"\n";
	}
}