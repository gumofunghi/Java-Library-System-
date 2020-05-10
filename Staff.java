import java.util.*;
import javax.swing.*;

class Staff extends Person{
	private String position;

	public Staff()
	{
		position = "";
	}

	public Staff(String name, String hpNo, String ID, String pw, String position)
	{
		super(name, hpNo, ID, pw);
		this.position = position;
	}

	//mutator
	public void setPosition(String position){this.position = position;}

	//accessor
	public String getPosition(){return position;}

	//print staff info
        public String displayInfo(){
              return "Name : " + super.getName()
                   +"\nHp No : " + super.getHpNo()
                   +"\nID : " + super.getID()
                   +"\nPosition: " + position + "\n";
        }

	//add new journal to the list
	public ArrayList<Book> addNewJournal(ArrayList<Book> bookList, AddJournalPage addJournalPage){
		String title, isbn, author, type, topic, issn, country, sYear;

		title = addJournalPage.getTitleInput().getText();
		isbn = addJournalPage.getIsbnInput().getText();
		author = addJournalPage.getAuthorInput().getText();
		type = addJournalPage.getTypeInput().getText();
		topic = addJournalPage.getTopicInput().getText();
		issn = addJournalPage.getIssnInput().getText();
		country = addJournalPage.getCountryInput().getText();
		sYear = addJournalPage.getYearInput().getText();

                JOptionPane.showMessageDialog(null,"Book Added!","Success",JOptionPane.INFORMATION_MESSAGE);

		Book book = new Journal(title, isbn, author, type, topic, issn, country, sYear);
		bookList.add(book);

		return bookList;
	}
	//add new novel to the list
	public ArrayList<Book> addNewNovel(ArrayList<Book> bookList, AddNovelPage addNovelPage){
		String title, isbn, author, type, desc, yearP;
		title = addNovelPage.getTitleInput().getText();
		isbn = addNovelPage.getIsbnInput().getText();
		author = addNovelPage.getAuthorInput().getText();
		type = addNovelPage.getTypeInput().getText();
		desc = addNovelPage.getDescInput().getText();
		yearP = addNovelPage.getYearInput().getText();

                JOptionPane.showMessageDialog(null,"Book Added!","Success",JOptionPane.INFORMATION_MESSAGE);

		Book book = new Novel(title, isbn, author, type, desc, yearP);
		bookList.add(book);

		return bookList;
	}

	//add new reference book to the list
	public ArrayList<Book> addNewReferenceBook(ArrayList<Book> bookList, AddReferenceBookPage addReferenceBookPage){
		String title, isbn, author, type, field, yearP;
		title = addReferenceBookPage.getTitleInput().getText();
		isbn = addReferenceBookPage.getIsbnInput().getText();
		author = addReferenceBookPage.getAuthorInput().getText();
		type = addReferenceBookPage.getTypeInput().getText();
		field = addReferenceBookPage.getFieldInput().getText();
		yearP = addReferenceBookPage.getYearInput().getText();
                Book book = new ReferenceBook(title, isbn, author, type, field, yearP);

                JOptionPane.showMessageDialog(null,"Book Added!","Success",JOptionPane.INFORMATION_MESSAGE);
		bookList.add(book);

                return bookList;
	}

	//delete book from list
	public ArrayList<Book> deleteBook(ArrayList<Book> bookList, BookDialog deleteBook){
                String isbn = deleteBook.getIsbnInput().getText();

		for(int i=0; i< bookList.size();i++){
			if(bookList.get(i).getISBN().equals(isbn)){
				bookList.remove(i);
                                JOptionPane.showMessageDialog(null,"Book Removed!","Success",JOptionPane.INFORMATION_MESSAGE);
                                return bookList;
			}

		}
                JOptionPane.showMessageDialog(null,"Book Not Found!","Error",JOptionPane.INFORMATION_MESSAGE);
                return bookList;
	}

	//search book
	public String searchBook(ArrayList<Book> bookList, SearchBookDialog searchBook){

		String title = searchBook.getTitleInput().getText().toUpperCase();
		for(int i=0; i< bookList.size();i++){
			if(bookList.get(i).getTitle().toUpperCase().equals(title)){
				return "Book Found!\n"+ bookList.get(i).bookListDisplay();
			}

		}

		return "Book Not Found!";

	}



}