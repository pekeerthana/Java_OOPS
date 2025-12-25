package Inheritance;

public class HourlyEmployee extends Employee{

    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, long employeeId, String hiredDate, double hourlyPayRate){
        super(name, birthDate, employeeId,hiredDate);
        this.hourlyPayRate =hourlyPayRate;
    }
    
    @Override 
    public double collectPay(){
        return 40*hourlyPayRate;
    }
    public double getDoublePay(){
        return 2*collectPay();
    }

    @Override
    public String toString() {
        return "HourlyEmployee [hourlyPayRate=" + hourlyPayRate + "]" + super.toString();
    }
    
}
