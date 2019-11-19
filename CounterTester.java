
/**
 * A test class for all methods in the counter class.
 * 
 * @author (Lane Humphreys) 
 * @version (9/26/19)
 */
public class CounterTester
{
    public static void main(String[]args )
    {
        Counter Tally = new Counter();//constructs a new Counter object with name Tally
        /**
         * All Tally.click() methods add to the value
         */
        Tally.click();
        Tally.click();
        Tally.reset();
        Tally.click();
        Tally.click();
        Tally.click();
        Tally.click();
        Tally.click();
        Tally.click();
        Tally.click();
        Tally.click();
        Tally.undo();// removes 1 from the value
        Tally.setLimit(5);//sets the limit to 5

        System.out.println(Tally.getValue());// prints the return values
        
    }

}
