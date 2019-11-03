import com.smartcar.sdk.*;
import com.smartcar.sdk.data.*;
public class Vehicles {
    private String access;
    Vehicle[] vehicles;
    public Vehicles(String[] vehicleIds, String access){
        vehicles = new Vehicle[vehicleIds.length];
        this.access = access;
        setVehicles(vehicleIds);
    }

    private void setVehicles(String[] vehicleIds) {
        for (int i = 0; i < vehicleIds.length; i++){
            vehicles[i] = new Vehicle(vehicleIds[i],access);
        }
    }
}
