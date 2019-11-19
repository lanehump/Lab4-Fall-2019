
/**
 * A set of methods that will be used to calculate how much gas is used going so many miles.
 * 
 * @author (Lane Humphreys) 
 * @version (9/25/19)
 */
public class Car
{
    private double fuel;
    private double efficiency;

    /**
     * Constructs a car with a certain fuel efficiency - Miles per Gallon.
     *
     * @param anEfficiency the fuel efficiency (Miles Per Gallon)
     */
     public Car(double anEfficiency)
    {
        efficiency = anEfficiency;
    }

    /**
     * Adds a certain amount of gas in the fuel tank.
     *
     * @param gas amount of gas
     */
    void addGas(double gas)
    {
        fuel = fuel + gas;
    }

    /**
     * Drives a car to a given distance and reduces the amount
     * of fuel in the tank according to car's fuel efficiency.
     *
     * @param Miles to drive
     */
     public void drive(double miles)
    {
        fuel = fuel - miles / efficiency;
    }

    /**
     * Gets amount of gas in the tank.
     *
     * @return fuel in the tank
     */
    double getGasInTank()
    {
        return fuel;
    }
}