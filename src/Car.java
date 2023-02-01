/*
 * Car class.
 */
public class Car extends Vehicle {
    public String engineName;

    private Car(Car source) {
        super(source);

        if (source != null) {
            this.engineName = source.engineName;
        }
    }

    public Car(String make, String model, int numberOfWheels, String engineName) {
        super(make, model, numberOfWheels);

        this.engineName = engineName;
    }

    public String toString() {
        return super.toString() + String.format(" Uses %s engine", engineName);
    }

    @Override
    public Car clone() {
        return new Car(this);
    }
}
