
public class Bike extends Vehicles {

    //Constructores

    public Bike(String brand, String model, int maxSpeed) {
        super(brand, model, maxSpeed);
    }
    
    
    // Metodos propios
    
    public void chainLubricating() {

        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("The bike " + getModel() + " chain has been perfectly lubricated.");

        System.out.println("-------------------------------------------------------------------------------");

    }

}