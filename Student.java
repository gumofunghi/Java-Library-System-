import java.util.*;
import javax.swing.*;

class Student extends Person
{
	private Vector <Book> borrowList; // borrowList
        private StudyRoom studyRoom;
	private int limit = 5;
        private String id1,id2,id3;

	public Student ()
	{

	}

	public Student (String name, String hpNo, String ID, String pw)
	{
		super (name, hpNo, ID, pw);
		borrowList = new Vector<Book>();
	}
//abstract method from Person class
	public String displayInfo()
	{
		return "\nName : " + super.getName()
		       +"\nHp No : " + super.getHpNo()
		       +"\nID : " + super.getID()
               +"\nBorrowed books: \n";
	}

	public ArrayList<Book> borrowBook (ArrayList<Book> bookList, BookDialog studBorrowBook)
	{
		String isbn = studBorrowBook.getIsbnInput().getText();



		for(int i=0; i<bookList.size(); i++)
		{
			if (bookList.get(i).getISBN().equals(isbn))
			{
				if (checkLimit() == false)
				{
					JOptionPane.showMessageDialog(null,"The book with ISBN " + isbn + "borrowed.","Success",JOptionPane.INFORMATION_MESSAGE);
					borrowList.addElement(bookList.get(i));
					bookList.remove(i);
                                        return bookList;
				}
                                else
                                    return bookList;

			}


		}
			JOptionPane.showMessageDialog(null,"The book with ISBN " +isbn+ " not found. Please try again","Error", JOptionPane.INFORMATION_MESSAGE);
                        return bookList;

	}

	private Boolean checkLimit(){
			if(borrowList.size()>=limit){
				JOptionPane.showMessageDialog(null,"You have exceed the borrow limit,\nPlease return book first if you want to borrow","Error",JOptionPane.INFORMATION_MESSAGE);

				return true;
			}
			else
				return false;
	}

	public ArrayList<Book> returnBook(ArrayList<Book> bookList, BookDialog studReturnBook)
	{
		String isbn = studReturnBook.getIsbnInput().getText();
                if(borrowList.size()==0){
                    JOptionPane.showMessageDialog(null,"Your borrow list is empty","Error",JOptionPane.INFORMATION_MESSAGE);
                    return bookList;
                }

		for (int i=0; i<borrowList.size(); i++)
		{
			if (borrowList.elementAt(i).getISBN().equals(isbn))
			{
                            bookList.add(borrowList.get(i));

                            JOptionPane.showMessageDialog(null,"The book with ISBN " +isbn+ " has been returned.","Success",JOptionPane.INFORMATION_MESSAGE);
                            borrowList.removeElementAt(i);
                            return bookList;
			}


		}
                JOptionPane.showMessageDialog(null,"The book with ISBN " +isbn+ " not found. Please try again","Error",JOptionPane.INFORMATION_MESSAGE);
		return bookList;
        }

	public String searchBook(ArrayList<Book> bookList, SearchBookDialog searchBook){

			String title = searchBook.getTitleInput().getText().toUpperCase();
			for(int i=0; i< bookList.size();i++){
				if(bookList.get(i).getTitle().toUpperCase().equals(title)){
					return "Book Found!\n"+ bookList.get(i).bookListDisplay();
				}

			}

			return "Book Not Found!";

	}

	public void displayBorrowed(DisplayWindow displayWindow)
	{

		displayWindow.getTextArea().append("Here is the list of the book you borrowed\n");

		for(int i=0; i< borrowList.size();i++){
				displayWindow.getTextArea().append("Book : " + (i+1)+ "\nTitle : " + borrowList.elementAt(i).getTitle()+
				"\nISBN : " + borrowList.elementAt(i).getISBN()+"\n") ;
		}
	}

        public String displayBorrowList(){
            for(int i=0; i< borrowList.size();i++){
		return "Book " + (i+1)+ ": \nTitle : " + borrowList.elementAt(i).getTitle()+
		"\nISBN : " + borrowList.elementAt(i).getISBN()+"\n";
            }
           return "\n";
        }

        public ArrayList<StudyRoom> bookingIndividualRoom(ArrayList<StudyRoom> roomList,IndividualRoomPage bookRoom){
            String roomNo = bookRoom.getRoomChoice().getSelectedItem().toString();
            if(roomNo.equals("--")){
                JOptionPane.showMessageDialog(null,"Please choose a room..." ,"Error", JOptionPane.INFORMATION_MESSAGE);
                return roomList;
            }
            for(int i=1;i<=roomList.size();i++){
                if(roomList.get(i).getRoomNo().equals(roomNo)&&roomList.get(i).getStatus().equals("Available")){
                    JOptionPane.showMessageDialog(null,"The room with room no. " + roomNo + " booked.","Success",JOptionPane.INFORMATION_MESSAGE);
                    studyRoom = roomList.get(i);
                    roomList.get(i).setStatus(false);
                    return roomList;
                }
                if(roomList.get(i).getRoomNo().equals(roomNo)&&roomList.get(i).getStatus().equals("Not Available")){
                     JOptionPane.showMessageDialog(null,"Please choose an available room..." ,"Error", JOptionPane.INFORMATION_MESSAGE);
                }

            }


            return roomList;
        }

        public ArrayList<StudyRoom> bookingGroupRoom(ArrayList<StudyRoom> roomList,GroupRoomPage bookRoom){
            String roomNo = bookRoom.getRoomChoice().getSelectedItem().toString();


            if(roomNo.equals("--")){
                JOptionPane.showMessageDialog(null,"Please choose a room..." ,"Error", JOptionPane.INFORMATION_MESSAGE);
                return roomList;
            }
            for(int i=1;i<=roomList.size();i++){
                if(roomList.get(i).getRoomNo().equals(roomNo)&&roomList.get(i).getStatus().equals("Available")){
                    JOptionPane.showMessageDialog(null,"The room with room no. " + roomNo + " booked.","Success",JOptionPane.INFORMATION_MESSAGE);
                    studyRoom = roomList.get(i);
                    roomList.get(i).setStatus(false);
                    id1 = bookRoom.getIDStud1Input().getText();
                    id2 = bookRoom.getIDStud2Input().getText();
                    id3 = bookRoom.getIDStud3Input().getText();


                    return roomList;
                }
                if(roomList.get(i).getRoomNo().equals(roomNo)&&roomList.get(i).getStatus().equals("Not Available")){
                     JOptionPane.showMessageDialog(null,"Please choose an available room..." ,"Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            return roomList;
        }

        public void displayBookingList(DisplayWindow display){
            if(studyRoom == null){
                display.getTextArea().append("No room is booked");
            }
            else{
                display.getTextArea().append("Room No.: "+studyRoom.getRoomNo()+"\n");
                if(studyRoom.getRoomNo().charAt(0)=='S'){
                    display.getTextArea().append("Type : Individual Room");
                }
                else{
                    display.getTextArea().append("Type : Group Discussion Room\n");
                    if(!id1.isEmpty()||!id2.isEmpty()||!id3.isEmpty()){
                        display.getTextArea().append("Student 1 id: "+ super.getID()+"\n");
                        display.getTextArea().append("Student 2 id: "+ id1+"\n");
                        display.getTextArea().append("Student 3 id: "+ id2+"\n");
                        display.getTextArea().append("Student 4 id: "+ id3+"\n");
                    }
                }

            }

        }






}

