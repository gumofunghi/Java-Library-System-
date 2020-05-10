import java.util.*;

abstract class StudyRoom
{
	private String roomNo;
	private boolean status = true;

	public StudyRoom()
	{

	}

	public StudyRoom (String roomNo, boolean status)
	{
		this.roomNo = roomNo;
		this.status = status;
	}

	public String getRoomNo()
	{
		return roomNo;
	}

	public String getStatus()
	{
            if(status==true){
                return "Available";
            }
            else{
                return "Not Available";
            }

	}

	public void setRoomNo (String roomNo)
	{
		this.roomNo = roomNo;
	}

	public void setStatus (boolean status)
	{
		this.status = status;
	}

        public abstract String displayDetails();
}


