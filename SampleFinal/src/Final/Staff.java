package Final;

public class Staff extends Employee{
    private String workAt;

    public Staff(String name, double salary, String workAt) {
        super(name, salary);
        setWorkAt(workAt);
    }

    public Staff(Staff staff){
        this(staff.getName(), staff.getSalary(), staff.workAt);
    }

    public Staff(){
        this("No name", 1000, "Candidate");
    }

    public final String getWorkAt() {
        return workAt;
    }

    public final void setWorkAt(String workAt) {
        this.workAt = workAt != null && !workAt.isEmpty() ? workAt : "Candidate";
    }

    @Override
    public String toString() {
        return String.format("Staff %s works at %s", super.toString(), this.workAt);
    }
}
