
import java.util.ArrayList;


public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
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

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max){
        ArrayList<Vehicle> inventoryWithinRange = new ArrayList<>();
        for(Vehicle vehicle: inventory){
            if(vehicle.getYear() >= min && vehicle.getYear() <= max){
                inventoryWithinRange.add(vehicle);
            }
        }
        return inventoryWithinRange;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color){
        ArrayList<Vehicle> inventoryWithinColor = new ArrayList<>();
        String makeParsed = color.trim();
        for(Vehicle vehicle: inventory){
            if(vehicle.getColor().equalsIgnoreCase(color)){
                inventoryWithinColor.add(vehicle);
            }
        }
        return inventoryWithinColor;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max){
        ArrayList<Vehicle> inventoryWithinRange = new ArrayList<>();
        for(Vehicle vehicle: inventory){
            if(vehicle.getOdometer() >= min && vehicle.getOdometer() <= max){
                inventoryWithinRange.add(vehicle);
            }
        }
        return inventoryWithinRange;
    }

    public ArrayList<Vehicle> getVehiclesByType(String type){
        ArrayList<Vehicle> inventoryWithinType = new ArrayList<>();
        String makeParsed = type.trim();
        for(Vehicle vehicle: inventory){
            if(vehicle.getColor().equalsIgnoreCase(type)){
                inventoryWithinType.add(vehicle);
            }
        }
        return inventoryWithinType;
    }

    public ArrayList<Vehicle> getAllVehicles(){
        return inventory;
    }

    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        inventory.remove(vehicle);
    }


}
