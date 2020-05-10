class Journal extends Book
{
	private String 	topic,		// to differentiate different topic of journal
					issn,
					country,
					startingYear;

	public Journal(){}
	public Journal(String title, String isbn, String author, String type, String topic, String issn, String country, String startingYear)
	{
		super(title, isbn, author, type);
		this.topic = topic;
		this.issn = issn;
		this.country = country;
		this.startingYear = startingYear;
	}

	public void setTopic(String topic){this.topic = topic;}
	public void setISSN(String issn){this.issn = issn;}
	public void setCountry(String country){this.country = country;}
	public void setStartingYear(String startingYear){this.startingYear = startingYear;}

	public String getTopic(){return topic;}
	public String getISSN(){return issn;}
	public String getCountry(){return country;}
	public String getStartingYear(){return startingYear;}

	public String bookListDisplay()
	{
		return 	super.bookListDisplay() +
				"\nTopic                   : " + topic +
				"\nISSN                    : " + issn +
				"\nCountry		: " + country +
				"\nStarting Year	: " + startingYear +"\n";
	}
}