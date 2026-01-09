import java.util.*;

public class Equals_HashCode {

    public static void main(String[] args) {

        Customer c1 = new Customer(1234,"Arya","arya@gmail.com","Zara");
        Customer c2 = new Customer(1234, "Arya", 12000, "arya@gmail.com" , "Zara");
        Customer c3 = new Customer(1235,"Arthi", "arthi@gmail.com", "Zudio");
        Customer c4 = new Customer(1235, "Arthi", "arthi@gmail.com", "Zudio");

        HashSet<Customer> set = new HashSet<>();
        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);
        
        System.out.println(set.size());

        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
        System.out.println("c1 hashcode is " +c1.hashCode());
        System.out.println("c2 hashcode is " +c2.hashCode());
        System.out.println("c3 hashcode is " +c3.hashCode());
        System.out.println("c4 hashcode is " +c4.hashCode());
        System.out.println(c3 == c4);
        System.out.println(c3.equals(c4));


        
    }

    
}
