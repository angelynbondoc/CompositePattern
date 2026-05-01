package compositeDesignPattern;

public class Student implements EducationalUnit {

    private String name;
    private String studentId;
    private double tuitionFee;

    public Student(String name, String studentId, double tuitionFee) {
        this.name       = name;
        this.studentId  = studentId;
        this.tuitionFee = tuitionFee;
    }

    public String getName() {
    	return name;
    	}
    
    public String getStudentId()  {
    	return studentId; 
    	}
    
    public double getTuitionFee() {
    	return tuitionFee;
    	}

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "Student: " + name + " | ID: " + studentId + " | Tuition: PHP " + String.format("%,.2f", tuitionFee));
    }

    @Override
    public int getStudentCount() {
        return 1;
    }

    @Override
    public double getBudget() {
        return -tuitionFee;
    }
}
