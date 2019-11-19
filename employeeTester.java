
/**
 * Tests all methods of Employee class.
 * 
 * @author (Lane Humphreys) 
 * @version (9/26/19)
 */
public class employeeTester
{
    public static void main(String[]args )
    {
        Employee harry = new Employee( "Hacker, Harry", 50000);//constructs new object with a string and double
        System.out.print("My name is ");
        System.out.println(harry.getName());//gets name
        System.out.print("I make: $");
        System.out.println(harry.getSalary());//gets salary
        harry.raiseSalary(10);//harry gets a 10% raise
        System.out.print("Harry will now get a 10% Raise so his new salary is: $");
        System.out.println(harry.getSalary());//gets salary again
        
    }

}
