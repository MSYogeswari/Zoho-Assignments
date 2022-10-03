public class StudentInformation {
    private int RollNumber;
    private String StudentFirstName;
    private String StudentLastName;
    private int Age;
    private String Address;
    private String AadharNumber;
    private String StudentStatus;

    public int getRollNumber() {
        return RollNumber;
    }

    public void setRollNumber(int rollNumber) {
        RollNumber = rollNumber;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAadharNumber() {
        return AadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        AadharNumber = aadharNumber;
    }

    public String getStatus() {
        return StudentStatus;
    }

    public void setStatus(String status) {
        this.StudentStatus = status;
    }

    public String getStudentFirstName() {
        return StudentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        StudentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return StudentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        StudentLastName = studentLastName;
    }
}
