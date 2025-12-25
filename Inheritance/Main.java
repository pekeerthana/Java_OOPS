package Inheritance;

public class Main {

    public static void main(String[] args) {
        Employee keerthana = new Employee("Keerthana", "12/09/2001", 1234445, "08/01/2024");
        System.out.println(keerthana.getAge());
        System.out.println(keerthana);

        SalariedEmployee chutki = new SalariedEmployee("Chutki", "12/12/1990", 1233044, "01/01/2015", 3300000);
        System.out.println(chutki);
        chutki.retire();
        System.out.println(chutki);
        System.out.println(chutki.collectPay());

        HourlyEmployee chintu = new HourlyEmployee("Chintu", "09/09/1995", 13588588, "09/10/2023", 15);
        System.out.println(chintu);
        System.out.println(chintu.getDoublePay());

    }
    
}
