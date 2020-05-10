import java.util.*;

class GroupRoom extends StudyRoom
{
	private int capacity = 4;
	private Student[] studentList;

	public GroupRoom()
	{

	}

	public GroupRoom(String roomNo, boolean status)
	{
		super(roomNo,status);
		studentList = new Student[capacity];
	}

	public void setStudList(Student[] studentList)
	{
		this.studentList = studentList;
	}

	public Student[] getStudList()
	{
		return studentList;
	}
	//use id to get the student then add student into the discussion room

	public Student[] addStudent(Student student){

		for(int i=0; i<capacity;i++){
			studentList[i] = student;
		}

		return studentList;

	}

         public String displayDetails(){
            return   "Room No.: " + super.getRoomNo()
                   + "\nRoom Type : Group Discussion Room"
                   + "\nStatus " + super.getStatus()+"\n\n";
        }


	/*public ArrayList<Student> addStudent (ArrayList<Student> personList)
	{


		for (int i=0; i<personList.size(); i++)
		{
			String n, id;
					Scanner input = new Scanner(System.in);
					System.out.println("Please input the student information:");
					System.out.print("Name : ");
					n = input.nextLine();
					System.out.print("ID : ");
					id = input.nextLine();

					System.out.println("Press Enter to continue...");
					input.nextLine();

					Student student = new Student(n, id);
					personList.add(student);

					return personList;
		}

	}*/

}
