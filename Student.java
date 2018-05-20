
public class Student extends Person
{
    // instance variables 
    private int studentID;
    private String major;

    // constructor
    public Student(String name, int age, int studentID, String major)
    {
        super(name, age);
        this.studentID = studentID;
        this.major = major;
    }
    
    //getter methods
    public int getStudentID()
    {
        return studentID;
    }
    
    public String getMajor()
    {
        return major;
    }
    
    //setter methods
    public void setStudentID(int id)
    {
        studentID = id;
    }
    
    public void setMajor(String major)
    {
        this.major = major;
    }
    
    //toString override
    public String toString()
    {
        return super.toString() + "\tStudentID: " + studentID + "\tMajor: " + major;
    }
}
