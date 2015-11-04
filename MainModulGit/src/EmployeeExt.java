/**
 * Created by Bro on 24.09.15.
 */
public class EmployeeExt extends Employee {

    private String jj = "getme";
//    private int jj = 11;

    void testGetSet() {
//    EmployeeExt oext = new EmployeeExt();
//    Employee oemp = new Employee();
        Employee oe = new EmployeeExt();
        oe.setI(555);
        System.out.println(oe.getI());
    }

}
