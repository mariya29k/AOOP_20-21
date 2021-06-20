package Final;

import java.util.ArrayList;

public class AppointTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Boss", 1500, "Invoices");
        Staff[] candidates = new Staff[]{
                new Staff("Nono", 670, "HR"),
                new Staff("Koko", 650, "QA")
        };

        System.out.println(boss);
        System.out.println("Candidates before: ");
        for (Staff c : candidates) {
            System.out.println(c);
        }

        HRdepartment hRdepartment = new HRdepartment(boss);

        StaffAppointHandler sah = hRdepartment.getAppointHandler();

        boss.addStaffAppointHandler(sah);
        boss.onStaffAppoint(candidates[0], 1300);
        boss.onStaffAppoint(candidates[1], 1500);

        System.out.println(sah.toString());

        System.out.println("Candidates after: ");
        for(Staff c : candidates) {
            System.out.println(c);
        }
    }
}
