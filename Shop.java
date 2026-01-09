public class Shop {

    public static void main(String[] args) {
        Customer customer_1 = new Customer();
        System.out.println(customer_1.getName());
        System.out.println(customer_1.getEmail());
        System.out.println(customer_1.getCreditLimit(customer_1));
        customer_1.ShopName();

        Customer customer_2 = new Customer(122,"Keerthana",130000,"kee@gmail.com","H$M");
        System.out.println(customer_2.getName());
        System.out.println(customer_2.getEmail());
        System.out.println(customer_2.getCreditLimit(customer_2));
        Customer customer_3 = new Customer(122,"Keerthana",130000,"kee@gmail.com","Zara");

        customer_2.ShopName();
        customer_3.ShopName();

    }
    
}
