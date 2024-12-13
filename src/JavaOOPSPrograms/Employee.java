package JavaOOPSPrograms;

public class Employee extends Person {
    private  int id;
    private long salary;

    public Employee(int id, long salary, String name, int age, String designation) {
        super(name, age, designation);
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    void displayInfo() {
        System.out.println("ID: "+getId()+" Name: "+getName()+" AGE:  "+getAge()+
                "Designation: "+getDesignation()+" Salary: "+getSalary());

    }
}
