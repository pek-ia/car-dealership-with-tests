import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Locale;

public class Dealership {
    String name;
    String address;
    String phone;
    ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max){
        ArrayList<Vehicle> inventoryWithinRange = new ArrayList<>();
        for(Vehicle vehicle: inventory){
            if(vehicle.getPrice() >= min && vehicle.getPrice() <= max){
                inventoryWithinRange.add(vehicle);
            }
        }
        return inventoryWithinRange;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        ArrayList<Vehicle> inventoryWithinMakeModel = new ArrayList<>();
        String makeParsed = make.trim();
        String modelParsed = model.trim();
        for(Vehicle vehicle: inventory){
            if(vehicle.getMake().equalsIgnoreCase(makeParsed) && vehicle.getModel().equalsIgnoreCase(modelParsed)){
                inventoryWithinMakeModel.add(vehicle);
            }
        }
        return inventoryWithinMakeModel;
    }

    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }

    public ArrayList<Vehicle> getAllVehicles(){
        return inventory;
    }
    
}
