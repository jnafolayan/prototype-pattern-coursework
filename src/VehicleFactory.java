import java.util.HashMap;
import java.util.Map;

/*
 * The VehicleFactory provides a wrapper around Vehicle instantiation
 * using the Prototype pattern. Vehicle instances are added to the 
 * factory and associated with unique keys. Creating a new Vechicle
 * from the factory call the `clone()` methond on an existing 
 * Vehicle that matches the requested Vehicle key.
 * 
 * Usage:
 *  VehicleFactory vf = new VehicleFactory();
 *  vf.register("bmw", new Car(...));
 *  
 *  Car bmw = (Car) vf.create("bmw");
 */
public class VehicleFactory {
    private Map<String, Vehicle> vehicles = new HashMap<>();

    public VehicleFactory() {
    }

    public Vehicle register(String key, Vehicle v) {
        vehicles.put(key, v);
        return v;
    }

    public Vehicle create(String key) {
        return vehicles.get(key).clone();
    }
}
