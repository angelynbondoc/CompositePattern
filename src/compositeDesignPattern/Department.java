package compositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Department implements EducationalUnit {

    private String name;
    private List<EducationalUnit> units;

    public Department(String name) {
        this.name  = name;
        this.units = new ArrayList<>();
    }

    public void add(EducationalUnit unit) {
        units.add(unit);
    }

    public void remove(EducationalUnit unit) {    
        units.remove(unit);
    }

    public List<EducationalUnit> getUnits() {
        return units;
    }

    public String getName() {
        return name;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "Department: " + name);
        for (EducationalUnit unit : units) {
            unit.displayDetails(indent + "  ");
        }
    }

    @Override
    public int getStudentCount() {
        int count = 0;
        for (EducationalUnit unit : units) {
            count += unit.getStudentCount();
        }
        return count;
    }

    @Override
    public double getBudget() {
        double total = 0;
        for (EducationalUnit unit : units) {
            total += unit.getBudget();
        }
        return total;
    }
}