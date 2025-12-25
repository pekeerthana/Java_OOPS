package Inheritance;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        if (birthDate == null || birthDate.isEmpty()) return 0;
        int currentYear = 2025;
        int age = currentYear - Integer.parseInt(birthDate.substring(6));
        return age;
    }
    
    public double collectPay(){
        return 1.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{name=" + (name == null ? "N/A" : name)
            + ", birthDate=" + (birthDate == null ? "N/A" : birthDate)
            + ", endDate=" + (endDate == null ? "N/A" : endDate)
            + ", age=" + getAge()
            + "}";
    }
}
