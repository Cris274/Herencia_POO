
public class Vehicles {

    // Atributos

    private String brand;
    private String model;
    private int maxSpeed;


    //Constructores

    public Vehicles(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
    // Getters y Setters


    public String getBrand() {
        return brand;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getModel() {
        return model;
    }


    public void setModel(String model) {
        this.model = model;
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }


    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    // Metodos
    
    public void describeVehicle() {

        System.out.println("\n--- Vehicle Description! ---");
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Max Speed: " + getMaxSpeed());
        System.out.println("-------------------------");
    }

}