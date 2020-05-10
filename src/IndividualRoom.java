import java.util.*;

class IndividualRoom extends StudyRoom
{
	Student student;

	public IndividualRoom()
	{

	}

	public IndividualRoom (String roomNo, boolean status)
	{
		super(roomNo,status);
	}

	public void setStudent(Student student)
	{
		this.student = student;
	}

	public Student getStudent()
	{
		return student;
	}

        public String displayDetails(){
            return   "Room No.: " + super.getRoomNo()
                   + "\nRoom Type : Individual Study Room"
                   + "\nStatus " + super.getStatus()+"\n\n";
        }



}