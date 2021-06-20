package Final;

import static java.lang.Math.abs;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        setName(name);
        setSalary(salary);
    }

    public Employee() {
        this("No name", 1000);
    }

    public Employee(Employee employee){
        this(employee.name, employee.salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name != null && !name.isEmpty() ? name : "No name";
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary > 0 ? salary : 1000;
    }

    @Override
    public String toString() {
        return String.format("%s with salary %.2f", this.name, this.salary);
    }
}
