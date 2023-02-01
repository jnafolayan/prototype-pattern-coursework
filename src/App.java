public class App {
    public static void main(String[] args) throws Exception {
        VehicleFactory vehicleFactory = new VehicleFactory();

        // Create cars
        Car hondaCivic = new Car("Honda", "Civic", 4, "V8");
        Car mercedesBClass = new Car("Mercedes", "BClass", 4, "V9");
        Car bugattiVeyron = new Car("Bugatti", "Veyron", 4, "V9");
        // Create bicycles
        Bicycle trekUnderdog = new Bicycle("Trek", "Underdog", 2, true);
        Bicycle cannondaleUp = new Bicycle("Cannondale", "Up", 2, false);

        // Register the cars and bikes
        vehicleFactory.register("hondaCivic", hondaCivic);
        vehicleFactory.register("mercedesBClass", mercedesBClass);
        vehicleFactory.register("bugattiVeyron", bugattiVeyron);
        vehicleFactory.register("trekUnderdog", trekUnderdog);
        vehicleFactory.register("cannondaleUp", cannondaleUp);

        // Grab cars from the factory
        Car civic1 = (Car) vehicleFactory.create("hondaCivic");
        Car civic2 = (Car) vehicleFactory.create("hondaCivic");
        // ensure they are not the same
        assert civic1 != civic2;

        civic2.engineName = "TI8";
        System.out.println(civic1.toString());
        System.out.println(civic2.toString());

        // Grab bicycles from the factory
        Bicycle trek1 = (Bicycle) vehicleFactory.create("trekUnderdog");
        Bicycle trek2 = (Bicycle) vehicleFactory.create("trekUnderdog");
        // ensure they are not the same
        assert trek1 != trek2;

        trek2.model = "Riverfull";
        System.out.println(trek1.toString());
        System.out.println(trek2.toString());
    }
}
