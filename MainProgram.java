import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.io.*;


public class MainProgram extends JFrame implements ActionListener, MouseListener{
    private ArrayList<Person> userList = personList();
    private ArrayList<Book> bookList = bookList(),studBookList = bookList();
    private ArrayList<StudyRoom> roomList = roomList();
    private Person staff;
    private Person student;

    //GUI pages and functions
    private LoginForm login;
    private HomePageStaff sHomePage;
    private DisplayWindow displayWindow;
    private BookDialog sDeleteBook,studBorrowBook,studReturnBook ;
    private SearchBookDialog sSearchBook,studSearchBook;
    private HomePageStudent studHomePage;
    private AddBookOption addBookOption;
    private AddJournalPage addJournalPage;
    private AddNovelPage addNovelPage;
    private AddReferenceBookPage addReferenceBookPage;
    private BookingRoomOption bookingOption;
    private IndividualRoomPage bookIndividualRoom;
    private GroupRoomPage bookGroupRoom;

    public MainProgram() throws FileNotFoundException
    {
        this.bookList = bookList();
        login = new LoginForm();
        login.setVisible(true);

        sHomePage = new HomePageStaff();
        sDeleteBook = new BookDialog();
        sSearchBook = new SearchBookDialog();
        studHomePage = new HomePageStudent();
        addBookOption = new AddBookOption();
        addReferenceBookPage = new AddReferenceBookPage();
        addNovelPage = new AddNovelPage();
        addJournalPage = new AddJournalPage();
        displayWindow = new DisplayWindow();
        studBorrowBook = new BookDialog();
        studReturnBook = new BookDialog();
        studSearchBook = new SearchBookDialog();
        bookingOption = new BookingRoomOption();
        bookIndividualRoom = new IndividualRoomPage();
        bookGroupRoom = new GroupRoomPage();

        AddListener();
    }
    /////register users in the system/////
      private ArrayList<Person> personList(){
	ArrayList<Person> personList = new ArrayList<>();
	Student s1 = new Student("Ali","0123456789","A16KB0010","ali123456");
	Student s2 = new Student("Nur","0141111333","A17CS0078","nur123456");
        Student s3 = new Student("Zul","0167895555","B18GH0257","zul123456");
	Student s4 = new Student("Ooi","0112357643","A16MK0153","ooi123456");

	Staff p1 = new Staff("Liza","0194498822","S10LB0001","liza123456","Library Assistant");
	Staff p2 = new Staff("Noh","0123838222","S09LB0002","noh123456","Library Officer");

	personList.add(s1);
	personList.add(s2);
	personList.add(s3);
	personList.add(s4);
	personList.add(p1);
	personList.add(p2);
	return personList;

    }
  ////read books from files ///////////////////////////////////////////////
   private ArrayList<Book> bookList()throws FileNotFoundException{
		Scanner inputFile = new Scanner(new File("novelList.txt"));
		ArrayList<Book> bList = new ArrayList<> ();
		String title, isbn, author, type, desc, yearP, field, topic, issn, country, sYear;

		//Read novel list
		do{
			title 	= inputFile.nextLine();
			isbn 	= inputFile.nextLine();
			author 	= inputFile.nextLine();
			type 	= inputFile.nextLine();
			desc 	= inputFile.nextLine();
			yearP 	= inputFile.nextLine();
			inputFile.nextLine();

			Book b1 = new Novel(title, isbn, author, type, desc, yearP);
			bList.add(b1);
		}while(inputFile.hasNext());
		inputFile.close();

		//Read reference book list
		inputFile = new Scanner(new File("referenceBookList.txt"));
		do{
			title 	= inputFile.nextLine();
			isbn 	= inputFile.nextLine();
			author 	= inputFile.nextLine();
			type 	= inputFile.nextLine();
			field	= inputFile.nextLine();
			yearP 	= inputFile.nextLine();
			inputFile.nextLine();

			Book b2 = new ReferenceBook(title, isbn, author, type, field, yearP);
			bList.add(b2);
		}while(inputFile.hasNext());
		inputFile.close();

		//Read journal list
		inputFile = new Scanner(new File("journal.txt"));
		do{
			title 	= inputFile.nextLine();
			isbn 	= inputFile.nextLine();
			author 	= inputFile.nextLine();
			type 	= inputFile.nextLine();
			topic	= inputFile.nextLine();
			issn 	= inputFile.nextLine();
			country	= inputFile.nextLine();
			sYear 	= inputFile.nextLine();
			inputFile.nextLine();

			Book b3 = new Journal(title, isbn, author, type, topic, issn, country, sYear);
			bList.add(b3);
		}while(inputFile.hasNext());
		inputFile.close();

		return bList;
	}
//////////////Add room in the system//////////////////////////////////////////////////////////////////////
   private ArrayList<StudyRoom> roomList(){
       ArrayList<StudyRoom> rList = new ArrayList<>();
       StudyRoom r1 = new IndividualRoom("S01",true);
       StudyRoom r2 = new IndividualRoom("S02",true);
       StudyRoom r3 = new IndividualRoom("S03",true);
       StudyRoom r4 = new GroupRoom("G01",true);
       StudyRoom r5 = new GroupRoom("G02",true);

       rList.add(r1);
       rList.add(r2);
       rList.add(r3);
       rList.add(r4);
       rList.add(r5);

       return rList;
   }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //register listener here
    public void AddListener()
    {
        //login page listner
        login.getLoginButton().addActionListener(this);
        //delete book dialog listener
        sDeleteBook.getConfirmButton().addActionListener(this);
        //search book dialog listener
        sSearchBook.getConfirmButton().addActionListener(this);
        //staff home page listner
        sHomePage.getLogoutButton().addActionListener(this);
        sHomePage.getDisplayBookPanel().addMouseListener(this);
        sHomePage.getRemoveBookPanel().addMouseListener(this);
        sHomePage.getDisplayStudentPanel().addMouseListener(this);
        sHomePage.getAddBookPanel().addMouseListener(this);
        sHomePage.getSearchBookPanel().addMouseListener(this);
        //add journal page listener
        addJournalPage.getSubmitButton().addActionListener(this);
        //add novel page listener
        addNovelPage.getSubmitButton().addActionListener(this);
        //add reference book page listener
        addReferenceBookPage.getSubmitButton().addActionListener(this);
        //add book option listener
        addBookOption.getJournalButton().addActionListener(this);
        addBookOption.getNovelButton().addActionListener(this);
        addBookOption.getReferenceBookButton().addActionListener(this);
         //student home page listener
        studHomePage.getLogoutButton().addActionListener(this);
        studHomePage.getBorrowBookPanel().addMouseListener(this);
        studHomePage.getBorrowedBookListPanel().addMouseListener(this);
        studHomePage.getReturnBookPanel().addMouseListener(this);
        studHomePage.getBookingDetailsPanel().addMouseListener(this);
        studHomePage.getBookingRoomPanel().addMouseListener(this);
        studHomePage.getSearchBookPanel().addMouseListener(this);
        studHomePage.getDisplayRoomPanel().addMouseListener(this);
        //borrow book page listener
        studBorrowBook.getConfirmButton().addActionListener(this);
        //return book page listener
        studReturnBook.getConfirmButton().addActionListener(this);
        //student search book page listener
        studSearchBook.getConfirmButton().addActionListener(this);
        //booking option listener
        bookingOption.getIndividualButton().addActionListener(this);
        bookingOption.getGroupButton().addActionListener(this);
        //individual room page listener
        bookIndividualRoom.getConfirmButton().addActionListener(this);
        bookIndividualRoom.getRoomChoice().addActionListener(this);
        //group room page listener
        bookGroupRoom.getConfirmButton().addActionListener(this);
        bookGroupRoom.getRoomChoice().addActionListener(this);
    }

    @SuppressWarnings("override")
    //event with button
    public void actionPerformed(ActionEvent event)
    {
       //login function
        if(event.getSource() == login.getLoginButton())
        {
            if(login.loginVerification(userList))
            {
                String id = login.getIDField().getText();
                int index = findPersonListIndex(id,userList);

                if(login.loginUserType().equals("Staff")){
                    staff = userList.get(index);
                    sHomePage.setVisible(true);
                    sHomePage.pack();
                    sHomePage.setLocationRelativeTo(null);
                    sHomePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }

                else if(login.loginUserType().equals("Student"))
                {
                    student = userList.get(index);
                    studHomePage.setVisible(true);
                    studHomePage.pack();
                    studHomePage.setLocationRelativeTo(null);
                    studHomePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }


                login.dispose();
            }
        }
         //staff logout
        else if(event.getSource()==sHomePage.getLogoutButton()){
            sHomePage.setVisible(false);
            login.setVisible(true);
            login.getIDField().setText("");
            login.getPWField().setText("");
        }
        //student logout
         else if(event.getSource()==studHomePage.getLogoutButton()){
            studHomePage.setVisible(false);
            login.setVisible(true);
            login.getIDField().setText("");
            login.getPWField().setText("");
        }
        //////////////////////Staff/////////////////////////////////////////////
        //staff delete book
        else if(event.getSource()==sDeleteBook.getConfirmButton())
        {
            bookList = staff.deleteBook(bookList, sDeleteBook);
        }
        //staff search book
        else if(event.getSource()==sSearchBook.getConfirmButton())
        {
            displayWindow.setVisible(true);
            displayWindow.setLocationRelativeTo(null);
            displayWindow.displaySearchBook(staff.searchBook(bookList,sSearchBook));
        }

        //add journal
        else if(event.getSource()==addBookOption.getJournalButton()){
            addJournalPage.setVisible(true);
            addJournalPage.setLocationRelativeTo(null);
            addJournalPage.refreshPage();
        }
        //submit journal info
        else if(event.getSource()==addJournalPage.getSubmitButton()){
             bookList = staff.addNewJournal(bookList,addJournalPage);
        }
        //add novel
        else if(event.getSource()==addBookOption.getNovelButton()){
            addNovelPage.setVisible(true);
            addNovelPage.setLocationRelativeTo(null);
            addNovelPage.refreshPage();
        }
        //submit novel info
        else if(event.getSource()==addNovelPage.getSubmitButton()){
           bookList = staff.addNewNovel(bookList,addNovelPage);
        }
        //add reference book
        else if(event.getSource()==addBookOption.getReferenceBookButton()){
           addReferenceBookPage.setVisible(true);
           addReferenceBookPage.setLocationRelativeTo(null);
           addReferenceBookPage.refreshPage();
        }
        //submit reference book info
        else if(event.getSource()==addReferenceBookPage.getSubmitButton()){
            bookList = staff.addNewReferenceBook(bookList,addReferenceBookPage);
        }

        //////////////////////////////Student///////////////////////////////////////////
        //borrow book confirmation
        else if(event.getSource()==studBorrowBook.getConfirmButton()){
            studBookList = student.borrowBook(studBookList,studBorrowBook);
        }
        //return book confirmation
        else if(event.getSource()==studReturnBook.getConfirmButton()){
            studBookList = student.returnBook(studBookList,studReturnBook);
        }
        //search book
        else if(event.getSource()==studSearchBook.getConfirmButton())
        {
           displayWindow.setVisible(true);
           displayWindow.setLocationRelativeTo(null);
           displayWindow.displaySearchBook(student.searchBook(bookList,studSearchBook));
        }
        //booking room option choice
        //individual room
        else if(event.getSource()==bookingOption.getIndividualButton()){
            bookIndividualRoom.setVisible(true);
            bookIndividualRoom.setLocationRelativeTo(null);
            bookIndividualRoom.getRoomChoice().setSelectedItem("--");
        }
        //group room
        else if (event.getSource()==bookingOption.getGroupButton()){
            bookGroupRoom.setVisible(true);
            bookGroupRoom.setLocationRelativeTo(null);
            bookGroupRoom.getRoomChoice().setSelectedItem("--");
        }
        //detect whether the chosen room is available before confirm
        //invidual room
        else if(event.getSource()==bookIndividualRoom.getRoomChoice()){
            bookIndividualRoom.setStatus(roomList);
        }
        //group room
        else if(event.getSource()==bookGroupRoom.getRoomChoice()){
            bookGroupRoom.setStatus(roomList);
        }
        //link to booking function @ student class
        //individual room
        else if(event.getSource()==bookIndividualRoom.getConfirmButton()){
            student.bookingIndividualRoom(roomList, bookIndividualRoom);
        }
        //group room
        else if(event.getSource()==bookGroupRoom.getConfirmButton()){
            student.bookingGroupRoom(roomList, bookGroupRoom);
        }
       ///////////////////end of student //////////////////////////////
    }

    @Override
    public void mousePressed(MouseEvent event){
        /////////////////////////Staf Home page////////////////////////////////////////////
        //display book list
        if(event.getSource()== sHomePage.getDisplayBookPanel())
        {
            displayWindow.displayBookList();
            displayWindow.setVisible(true);
            displayWindow.pack();
            displayWindow.setLocationRelativeTo(null);

            for(int i=0; i<bookList.size();i++){
                displayWindow.getTextArea().append( bookList.get(i).bookListDisplay());
                displayWindow.getTextArea().setCaretPosition( 0 );
            }
        }
        //call remove book dialog
        else if(event.getSource() == sHomePage.getRemoveBookPanel())
        {

            sDeleteBook.setVisible(true);
            sDeleteBook.refreshPage();
            sDeleteBook.pack();
            sDeleteBook.setLocationRelativeTo(null);

        }
        //display student list
        else if(event.getSource() == sHomePage.getDisplayStudentPanel())
        {

            displayWindow.setVisible(true);
            displayWindow.pack();
            displayWindow.setLocationRelativeTo(null);
            displayWindow.displayStudentList(userList);
        }

        //call add new book option
        else if(event.getSource() == sHomePage.getAddBookPanel())
        {

            addBookOption.setVisible(true);
            addBookOption.setLocationRelativeTo(null);

        }
        //call search book dialog
        else if(event.getSource() == sHomePage.getSearchBookPanel())
        {
            sSearchBook.setVisible(true);
            sSearchBook.setLocationRelativeTo(null);
            sSearchBook.refreshPage();
        }
        /////////////end of staff function/////////////////////////////////////

        ////////////student page function/////////////////////////////////////
        else if(event.getSource() == studHomePage.getBorrowBookPanel()){
            studBorrowBook.setVisible(true);
            studBorrowBook.borrowBookPage();
            studBorrowBook.setLocationRelativeTo(null);

        }
        else if(event.getSource() == studHomePage.getBorrowedBookListPanel()){
            displayWindow.setVisible(true);
            displayWindow.setLocationRelativeTo(null);
            displayWindow.displayBorrowBook();
            student.displayBorrowed(displayWindow);

        }
        else if(event.getSource() == studHomePage.getReturnBookPanel()){
            studReturnBook.setVisible(true);
            studReturnBook.setLocationRelativeTo(null);
            studReturnBook.returnBookPage();
        }

        else if(event.getSource() == studHomePage.getSearchBookPanel())
        {
            studSearchBook.setVisible(true);
            studSearchBook.setLocationRelativeTo(null);
            studSearchBook.refreshPage();
        }
        else if(event.getSource() == studHomePage.getBookingRoomPanel()){
            bookingOption.setVisible(true);
            bookingOption.setLocationRelativeTo(null);
        }
        else if(event.getSource() == studHomePage.getBookingDetailsPanel()){
            displayWindow.setVisible(true);
            displayWindow.setLocationRelativeTo(null);
            displayWindow.displayBookedRoom();
            student.displayBookingList(displayWindow);
        }
        else if(event.getSource() == studHomePage.getDisplayRoomPanel()){
            displayWindow.setVisible(true);
            displayWindow.setLocationRelativeTo(null);
            displayWindow.displayRoomList(roomList);

        }
        ////////////end of student page click detection/////////////////////
    }

    //determine the index of person in the list
    private int findPersonListIndex(String id, ArrayList<Person> pList){
        for(int i=0;i<pList.size();i++){
            if(pList.get(i).getID().equals(id)){
                JOptionPane.showMessageDialog(null,"Welcome, "+ pList.get(i).getName()+". Have a nice day :D","Library System",JOptionPane.INFORMATION_MESSAGE);
                return i;
            }
        }
        return -1;
    }


    //ignore these
    @Override
    public void mouseEntered(MouseEvent event){};
    @Override
    public void mouseClicked(MouseEvent event){};
    @Override
    public void mouseReleased(MouseEvent event){};
    @Override
    public void mouseExited(MouseEvent e) {};

}
