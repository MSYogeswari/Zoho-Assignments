
public class StudentInformation {

	
	private int ID;
	private String LastName;
	private String FirstName;
	private int Age;
	private String Address;
	private String BloodGroup;
	private int ExamRank;
	
	public StudentInformation(int ID, String LastName, String FirstName, int Age, String Address, String BloodGroup, int ExamRank)
	{
		this.ID = ID;
		this.LastName = LastName;
		this.FirstName = FirstName;
		this.Age = Age;
		this.Address = Address;
		this.BloodGroup = BloodGroup;
		this.ExamRank = ExamRank;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getExamRank() {
		return ExamRank;
	}
	public void setExamRank(int examRank) {
		ExamRank = examRank;
	}
	public String getBloodGroup() {
		return BloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		BloodGroup = bloodGroup;
	}
	


}
