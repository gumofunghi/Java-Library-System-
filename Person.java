import java.util.*;

abstract class Person{
	private String name;
	private String hpNo;
	private String ID;
	private String password;

	public Person()
	{
		name = "";
		hpNo = "";
		ID = "";
		password = "";
	}

	public Person(String name, String hpNo, String ID, String password)
	{
		this.name = name;
		this.hpNo = hpNo;
		this.ID = ID;
		this.password = password;
	}

	//mutator
	public void setName(String name){this.name = name;}
	public void setHpNo(String hpNo){this.hpNo = hpNo;}
	public void setID(String ID){this.ID = ID;}
        public void setPW(String pw){this.password = pw;}

	//accessor
	public String getName(){return name;}
	public String getHpNo(){return hpNo;}
	public String getID(){return ID;}
        public String getPW(){return password;}


        public abstract String displayInfo();
	public abstract String searchBook(ArrayList<Book> bookList, SearchBookDialog searchBook);
	public ArrayList<Book> addNewJournal(ArrayList<Book> bookList, AddJournalPage addJournalPage){return null;}
        public ArrayList<Book> addNewNovel(ArrayList<Book> bookList, AddNovelPage addNovelPage){return null;}
        public ArrayList<Book> addNewReferenceBook(ArrayList<Book> bookList, AddReferenceBookPage addReferenceBookPage){return null;}
	public ArrayList<Book> deleteBook(ArrayList<Book> bookList, BookDialog deleteBook){return null;}
	public ArrayList<Book> returnBook(ArrayList<Book> bookList, BookDialog studReturnBook){return null;}
	public ArrayList<Book> borrowBook (ArrayList<Book> bookList, BookDialog studBorrowBook){return null;}
        public void displayBorrowed(DisplayWindow displayWindow){};
        public String displayBorrowList(){return null;}
        public ArrayList<StudyRoom> bookingIndividualRoom(ArrayList<StudyRoom> roomList,IndividualRoomPage bookRoom){return null;}
        public ArrayList<StudyRoom> bookingGroupRoom(ArrayList<StudyRoom> roomList,GroupRoomPage bookRoom){return null;}
        public void displayBookingList(DisplayWindow display){};

}
