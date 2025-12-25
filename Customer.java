public class Customer {

    private String name;
    private int creditLimit;
    private String email;
    private static String shopName;

    public Customer(String name, int creditLimit,String email,String shopName){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        Customer.shopName = shopName;

    };

    public void ShopName(){
        System.out.println(shopName);
    }
    
    
    public Customer(){
        this("Default Name",0,"Default mail","Default Shop");
    }

    public Customer(String name, String email,String shopName){
        this(name,0,email,shopName);
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
    
}
