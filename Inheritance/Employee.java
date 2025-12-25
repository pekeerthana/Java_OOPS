package Inheritance;

public class Employee extends Worker {
    private long employeeId;
    protected String hiredDate;


    public Employee(String name, String birthDate, long employeeId, String hiredDate){
        super(name,birthDate);
        this.employeeId = employeeId;
        this.hiredDate = hiredDate;
    }
    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", hiredDate=" + hiredDate + "] "+ super.toString();
    }

}
