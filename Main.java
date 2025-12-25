public class Main {

    public static void main(String[] args){

        Car car = new Car();
        car.setMake(null);
        
        // car.color = "blue";
        System.out.println("Color " + car.getColor());
        System.out.println("Model " + car.getModel());
        System.out.println("Make " + car.getMake());
        System.out.println("Doors " + car.getDoors());

        car.describeCar();

    }
    
}
