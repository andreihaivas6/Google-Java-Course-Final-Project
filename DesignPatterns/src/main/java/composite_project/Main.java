package composite_project;

import composite_project.composite.HeadDepartment;
import composite_project.department.FinancialDepartment;
import composite_project.department.HumanResourcesDepartment;

public class Main {
    public static void main(String[] args) {
        HeadDepartment headDepartment = new HeadDepartment("Head department");

        headDepartment.addDepartment(new FinancialDepartment("Department F no.7"));
        headDepartment.addDepartment(new HumanResourcesDepartment("Department HR no.3"));

        headDepartment.printDepartmentName();
    }
}
