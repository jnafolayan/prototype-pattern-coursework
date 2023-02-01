/*
 * Bicycle class.
 */
public class Bicycle extends Vehicle {
    public Boolean hasHeadlamps;

    public Bicycle(String make, String model, int numberOfWheels, boolean hasHeadlamps) {
        super(make, model, numberOfWheels);

        this.hasHeadlamps = hasHeadlamps;
    }

    private Bicycle(Bicycle source) {
        super(source);

        if (source != null) {
            this.hasHeadlamps = source.hasHeadlamps;    
        }
    }

    public Bicycle clone() {
        return new Bicycle(this);
    }
}
