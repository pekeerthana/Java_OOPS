public class Car{
    private String make = "Suzuki";
    private String model = "Jimmy";
    private String color = "Green";
    private int doors = 4;
    private boolean convertible = false;

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public int getDoors(){
        return doors;
    }

    public void setMake(String make){
        this.make = (make == null) ? "Unknown" : make;
    }


    public void describeCar(){

        System.out.println(doors+"-Door" + " " +
                        color + " "+ 
                        make +" "+ model + " "+
                        (convertible ? "Convertible" : ""));
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean isConvertible() {
        return convertible;
    }
}