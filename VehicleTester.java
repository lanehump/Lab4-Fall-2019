
/**
 * This class will pump gas into a car without going over its capacity.
 * Calculate how many miles it can go on the amount of gallons in the tank.
 * Calculate how much gas is used when driving so many miles.
 * 
 * @author (Lane Humphreys) 
 * @version (9/26/19)
 */
public class VehicleTester
{
    public static void main(String[]args )
    {
        Vehicle myPrius = new Vehicle(27, 7, 20);// Constructs an object Vehicle with values
        //adds gas to the tank without going over capacity
        System.out.println("Gallons Pumped: " + myPrius.addGas(14));
        //myPrius.milesInTank();//calculates how many miles are in the tank
        //prints how many miles are driven
        System.out.println("Miles Driven " + myPrius.drive(1000));
        //prints the amount of gas left in tank
        System.out.println("Gas left in tank " + myPrius.getGasInTank());
    }
 
}
