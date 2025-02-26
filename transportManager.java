import java.util.*;

public class transportManager {
    public void showInformation(List<Vehicles> vehicles) {
        
        for (int i = 0; i < vehicles.size(); i++) {

            vehicles.get(i).describeVehicle();
     
        }
    }
}
