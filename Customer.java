import java.util.Objects;

public class Customer {

    private int customer_id;
    private String name;
    private int creditLimit;
    private String email;
    private static String shopName;

    public Customer(int customer_id, String name, int creditLimit,String email,String shopName){
        this.name = name;
        this.customer_id = customer_id;
        this.creditLimit = creditLimit;
        this.email = email;
        Customer.shopName = shopName;

    };

    public void ShopName(){
        System.out.println(shopName);
    }
    
    
    public Customer(){
        this(0,"Default Name",0,"Default mail","Default Shop");
    }

    public Customer(int id, String name, String email,String shopName){
        this(id,name,0,email,shopName);
    }

    public String getName(){
        return name;
    }

    public int getCreditLimit(Customer customer){
        System.out.println(customer.creditLimit);
        return creditLimit;
    }
    public String getEmail(){
        return email;
    }
    
    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Customer customer = (Customer) obj;
        return customer_id == customer.customer_id &&
       Objects.equals(name, customer.name) &&
       Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode(){
        return Objects.hash(customer_id,name,email);
    }
}
