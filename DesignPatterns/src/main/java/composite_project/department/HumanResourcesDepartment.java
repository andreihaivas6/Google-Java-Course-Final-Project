package composite_project.department;

public class HumanResourcesDepartment extends Department {

    public HumanResourcesDepartment(String name) {
        super(name);
    }

    @Override
    public void printDepartmentName() {
        System.out.println("Human Resources: " + this.getName());
    }
}