package composite_project.composite;

import composite_project.department.Department;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment extends Department {
    private final List<Department> childDepartments = new ArrayList<>();

    public HeadDepartment(String name) {
        super(name);
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }

    @Override
    public void printDepartmentName() {
        for (Department department : childDepartments) {
            department.printDepartmentName();
        }
    }
}
