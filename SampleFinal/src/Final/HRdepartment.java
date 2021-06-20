package Final;

import java.util.ArrayList;

public class HRdepartment {
    Manager manager;
    ArrayList<Staff> staff;

    public HRdepartment(Manager manager) {
        setManager(manager);
        this.staff = new ArrayList<>();
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        if (manager == null) {
            throw new java.security.InvalidParameterException();
        } else {
            this.manager = manager;
        }
    }

    private class AppointHandler implements StaffAppointHandler {
        private String appointDepartment;

        public AppointHandler(String appointDepartment) {
            setAppointDepartment(appointDepartment);
        }

        public String getAppointDepartment() {
            return appointDepartment;
        }

        public void setAppointDepartment(String appointDepartment) {
            if (appointDepartment != null) {
                this.appointDepartment = appointDepartment;
            } else {
                throw new java.security.InvalidParameterException();
            }
        }

        @Override
        public void addStaff(StaffAppointEventArgs staffAppointEventArgs) {
            Staff staffToAppoint = staffAppointEventArgs.getStaff();
            staffToAppoint.setWorkAt(appointDepartment);
            staffToAppoint.setSalary(staffAppointEventArgs.getSalary());

            staff.add(staffToAppoint);
        }

        @Override
        public String toString() {
            return String.format("Department name: %s%n%s", this.appointDepartment, HRdepartment.this.toString());
        }
    }

    public StaffAppointHandler getAppointHandler(){
        return new AppointHandler(this.manager.getManageDeptName());
    }

    @Override
    public String toString() {
        String result = String.format("%s%n", this.manager);
        for(Staff s : staff){
            result += String.format("%s%n", s);
        }
        return result;
    }
}
