/*
 * Vehicle class.
 */
public abstract class Vehicle implements Cloneable 
{
    public String make;
    public String model;
    public int numberOfWheels;

    public Vehicle(String make, String model, int numberOfWheels) {
        this.make = make;
        this.model = model;
        this.numberOfWheels = numberOfWheels;
    }

    public Vehicle(Vehicle target) 
    {
        if (target != null)
        {
            this.make = target.make;
            this.model = target.model;
            this.numberOfWheels = target.numberOfWheels;
        }
    }

    public String toString() {
        return String.format("%s %s: %d wheel vehicle.", make, model, numberOfWheels);
    }

    public abstract Vehicle clone();
}
