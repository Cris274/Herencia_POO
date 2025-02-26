import java.util.*;

public class Main {
    
    public static void main(String[] args) {

    //Creacion de objetos

    Car car = new Car("Chevrolet", "Camaro ZL1", 290);
    Bike bike = new Bike("SE Bikes", "PK Ripper Super Elite", 50);
    Motorcycle motorcycle = new Motorcycle("Bajaj Pulsar", "NS 250", 150);
    transportManager manager = new transportManager();

    // Mostrar Metodos

    System.out.println("\nWelcome to the Transport Manager Services");

    manager.showInformation(Arrays.asList(car,bike,motorcycle));
    car.addWater();
    bike.chainLubricating();
    motorcycle.kickStarting();
    

}

}
