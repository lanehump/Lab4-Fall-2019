
/**
 * this is a set of methods to caluclate how much gas is left in a car after going so many miles.
 * 
 * @author (Lane Humphreys) 
 * @version (9/26/19)
 */
public class Vehicle
{
    private double fuel;
    private double efficiency;
    private double Cap;
    /**
     * Constructs a car with a certain fuel efficiency - Miles per Gallon.
     *
     * @param anEfficiency the fuel efficiency (Miles Per Gallon)
     * @param inTank the amount of gas already in the tank
     * @param tankCap sets the capacity of the tank
     */
     public Vehicle(double anEfficiency, double inTank, double tankCap)
    {
        efficiency = anEfficiency;
        fuel = inTank;
        Cap = tankCap;
    }

    /**
     * Adds a certain amount of gas in the fuel tank.
     * Also limits the amount of gas that can be put into the tank
     * @param gas amount of gas
     * @returns fuel actual amount of fuel added
     */
    public double addGas(double gas)
    {
        double iTank = fuel;
        fuel = Math.min(iTank + gas, Cap);
        return (fuel - iTank);
    }

    /**
     * Drives a car to a given distance and reduces the amount
     * of fuel in the tank according to car's fuel efficiency.
     *
     * @param Miles to drive
     */
    public double drive(double miles)
    {
        double iTank = fuel;
        fuel = Math.max(fuel - miles / efficiency, 0);
        return (Math.min((miles / efficiency), iTank) * efficiency);
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
