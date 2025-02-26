
public class Motorcycle extends Vehicles {

    //Constructores

    public Motorcycle(String brand, String model, int maxSpeed) {
        super(brand, model, maxSpeed);
    }
    
    
    // Metodos Propios
    

    public void kickStarting () {

        System.out.println("The Motorcycle " + getBrand() + " " + getModel() + " was perfectly started with a nice kick!");

        System.out.println("-------------------------------------------------------------------------------");

    }

}