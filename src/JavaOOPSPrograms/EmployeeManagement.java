package JavaOOPSPrograms;

public class EmployeeManagement {
    public static void main(String[] args) {

        Employee employee = new Employee(1,12000 ,"John", 25, "Developer");

        employee.displayInfo();

        Manager manager = new Manager(2,120000 ,"Pradeep", 35, "Project Manager");

        manager.displayInfo();

        employee.setName("Ramesh");

        System.out.println(employee.getName());
    }
}
