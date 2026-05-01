package compositeDesignPattern;

public class Teacher implements EducationalUnit {

    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        this.name    = name;
        this.subject = subject;
        this.salary  = salary;
    }

    public String getName() { 
    	return name;
    	}
    
    public String getSubject() {
    	return subject;
    	}
    
    public double getSalary()  {
    	return salary;
    	}


    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "Teacher: " + name + " | Subject: " + subject + " | Salary: PHP " + String.format("%,.2f", salary));
    }

    @Override
    public int getStudentCount() {
        return 0;
    }

    @Override
    public double getBudget() {
        return salary;
    }
}