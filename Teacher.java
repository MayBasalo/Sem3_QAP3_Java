// Teacher class - Derived from Person
public class Teacher extends Person {
    private String subject;  // Subject taught
    private double salary;   // Teacher's salary
 
    // Constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }
 
    // Getter methods
    public String getSubject() {
        return subject;
    }
 
    public double getSalary() {
        return salary;
    }
 
    // Setter methods
    public void setSubject(String subject) {
        this.subject = subject;
    }
 
    public void setSalary(double salary) {
        this.salary = salary;
    }
 
    // toString method
    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject + ", Salary: $" + salary;
        
    }
}