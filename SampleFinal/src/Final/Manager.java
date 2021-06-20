package Final;

public class Manager extends Employee{
    private String manageDeptName;
    private StaffAppointHandler staffAppoint;

    public Manager(String name, double salary, String manageDeptName) {
        super(name, salary);
        setManageDeptName(manageDeptName);
    }

    public Manager()
    {
        this("No name", 1000, "Unknown");
    }

    public Manager(Manager manager){
        this(manager.getName(), manager.getSalary(), manager.manageDeptName);
    }

    public String getManageDeptName() {
        return manageDeptName;
    }

    public void setManageDeptName(String manageDeptName) {
        if (manageDeptName == null) {
            throw new java.security.InvalidParameterException();
        } else {
            this.manageDeptName = manageDeptName;
        }
    }
    
    void addStaffAppointHandler(StaffAppointHandler staffAppointHandler){
        this.staffAppoint = staffAppointHandler;
    }

    void onStaffAppoint (Staff member, double newStaffMemberSalary){
        if (staffAppoint != null) {
            StaffAppointEventArgs staffNew = new StaffAppointEventArgs(member, newStaffMemberSalary);
            staffAppoint.addStaff(staffNew);
        }
    }

    @Override
    public String toString() {
        return String.format("Staff %s works at %s", super.toString(), this.manageDeptName);
    }
}