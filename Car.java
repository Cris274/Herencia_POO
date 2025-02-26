
public class Car extends Vehicles {

    //Constructores

    public Car(String brand, String model, int maxSpeed) {
        super(brand, model, maxSpeed); //Llama al constructor de la Superclase
    }
    
    
    // Metodos propios
    

    public void addWater() {

        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("The water has been added to the coolant tank of the " + getBrand() + " " + getModel() + " Car");

        System.out.println("-------------------------------------------------------------------------------");

    }

}