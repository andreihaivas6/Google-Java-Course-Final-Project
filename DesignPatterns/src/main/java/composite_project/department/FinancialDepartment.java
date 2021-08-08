package composite_project.department;

public class FinancialDepartment extends Department {

    public FinancialDepartment(String name) {
        super(name);
    }

    @Override
    public void printDepartmentName() {
        System.out.println("Financial: " + this.getName());
    }
}