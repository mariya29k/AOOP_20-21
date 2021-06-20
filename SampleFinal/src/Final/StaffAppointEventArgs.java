package Final;
//при назначаване на нови служители
//менажерът изпраща на отдел Личен състав референция към обекта от тип Staff, който е
//назначен заедно със стойността на заплатата (тип double) , която е договорена при
//назначаването.

public class StaffAppointEventArgs {
    private Staff staff;
    private double salary;

    public StaffAppointEventArgs(Staff staff, double salary) {
        setStaff(staff);
        setSalary(salary);
    }

    public Staff getStaff() {
        return new Staff(staff);
    }

    public void setStaff(Staff staff) {
        if (staff == null) {
            this.staff = new Staff();
        } else {
            this.staff = new Staff(staff);
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary > 0 ? salary : 0;
    }
}
