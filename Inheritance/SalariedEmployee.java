package Inheritance;

public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, long employeeId, String hiredDate, double annualSalary){
        super(name,birthDate,employeeId,hiredDate);
        this.annualSalary = annualSalary;

    }

    public void retire(){
        terminate("12/30/2025");
        isRetired = true;
        
    }

    @Override
    public double collectPay(){

        int pay = (int) annualSalary/26;
        int adjustedPay = (int) (isRetired ? pay*0.9 : pay);
        return adjustedPay;
    }

    @Override
    public String toString() {
        return "SalariedEmployee [annualSalary=" + annualSalary + ", isRetired=" + isRetired + "]" +super.toString();
    }
    
}
