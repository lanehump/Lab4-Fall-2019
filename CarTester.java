
/**
 * A test of all methods in the car class.
 * 
 * @author (Lane Humphreys) 
 * @version (9/25/19)
 */
public class CarTester
{
    public static void main(String[]args )
    {
        Car myCar = new Car(50);// constructs car object with a value of 50 which is the mpg
        myCar.addGas(20);// adds 20 gallons of gas
        myCar.drive(100);//drives the car 100 miles
        double gasLeft = myCar.getGasInTank();
        System.out.println(gasLeft);// prints the gas left
    }
 
}
