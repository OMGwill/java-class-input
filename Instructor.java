
public class Instructor extends Person
{
    private int salary;
    
    // constructor
    public Instructor(String name, int age, int salary)
    {
        super(name, age);
        this.salary = salary;
    }
    
    //getter method
    public int getSalary()
    {
        return salary;
    }
    
    //setter method
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    
    // toString override
    public String toString()
    {
        return super.toString() + "\tSalary: " + salary;
    }
}
