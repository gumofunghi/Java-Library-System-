The requirements of Object-Oriented Programming(SCSJ2154) Project is to construct a system that implements Java technology and object-oriented programming concepts. Our system for this project is Library System. The main objective of our system is to provide a convenient and efficient way for librarians to manage and students to enjoy the services. Therefore, our target users are both librarians and students, and both of them have different functions to access.  

The services provided in our system including book borrow service and study room service. For book borrowed service, there are only three types of books provided, which are novel, reference book and journal. For each type, there are 3 books, and the quantity is only one for every book. For study room service, there are only two types, which are the individual room and group discussion room. For both librarians and students, they have different functions to access the services. In the system, there are simple databases that store the details for users, for example, name, user ID, password, contact number and so on. Thus, before the user can access any functions, they need to login by input their user ID and password as well. Once inserted, the system will trace their ID and direct them to a different interface. 

From librarians perspective, the functions provided in our system included:
-display booklist
-search book
-add new book
-remove book
-display student list
	Librarians can choose any of the function to access. 
For function display booklist, the librarian can check the current books in the library which enable them to decide what type of book need to add from time to time.  
For the function search book, the librarian can search the current book available by inserting the book titles. All the details of that book will be displayed once the book is found. 
For function add new book, the librarian can add details for a new book by inserting all related information of the book, for example, book title, ISBN(International Standard Book Title), author, type and so on. Different type of book has different information to insert. 
For function remove book, the librarian can remove the book that is no longer available from the list by inserting the ISBN of the book. With this function, the librarian can update the booklist from time to time. 
For function display student list, the librarian check the list of the students with detailed information and  the list of books they have borrowed.
	
From the students perspective, the functions provided in our system included:
-search book
-borrow book
-return  book
-check borrowed booklist
-booking study room
-check booking status
-display study room list
	Students can choose any of the function to access. 
For the function search book, students can search the book by inserting the book title. Once the book is found, all the details of the book will be displayed. 
For function borrow book, students can borrow the book by inserting the ISBN of the book. If the book not found or borrowed by others, the system will display book not found. The limit of the book borrowed for each student is 5, and once the student had borrowed 5 books, he/she is not allowed to borrow any more, until he/she returns. 
For function return book, students can return the book by inserting the ISBN as well. Once the system found that the ISBN inserted is matched with one of the books in the borrowed list of the students, it will remove that book from the list. If not found, an information message will be displayed.
For function check borrowed booklist, students can check the books that they had borrowed and have not returned yet. This function enables the students to check if they had forgotten to return the book and also allowed them to check the book that they had successfully borrowed.  
For function booking study room, students can booking a room either individual room or group room for study. In individual room, only one student allowed to use the room, and for the group room consist of maximum of 4 people in the room. 
For function check booking status, students can check the room booked in the session. If there is no room booked, the system will also tell users about that.
For function display study room list, students can browse through the list of study room provided in the library. The information displayed includes room number, room type, and the status which shows whether room is available.

