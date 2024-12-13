package TaskOnAssociation;

class Department{
    private String name;

    public Department(String name){
        this.name =name;
    }

    public String getName() {
        return name;
    }
}
class Employee {
    private String name;
    private Department department;

    public Employee (String name, Department department){
        this.name = name;
        this.department = department;
    }
    public void displayDetails(){
        System.out.println("Employee:" + name + ", Department:" + department.getName());
    }
}
public class ManyToOneExample {
    public static void main(String[] args) {
        Department depart = new Department("IT");
        Employee emp1 = new Employee("ChanaReddy", depart);
        Employee emp2 = new Employee("Nirmala", depart);

    emp1.displayDetails();
    emp2.displayDetails();
    }
}
