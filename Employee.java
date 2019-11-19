
/**
 * A set of methods to Calculate the salary after a raise for an employee.
 * 
 * @author (Lane Humphreys) 
 * @version (9/26/19)
 */
public class Employee
{
    private String name;
    private double salary;
    /**
     * Constructs an Object that is an Employees name and Salary
     * @param employeeName String
     * @param currentSalary double
     */
    public Employee(String employeeName, double currentSalary)
    {
        name = employeeName;
        salary = currentSalary;
    }
    /**
     * Method that returns employees name
     * @return employeeName
     */
    public String getName()
    {
        return name;
    }
    /**
     * method that returns the employees salary
     * @return currentSalary
     */
    public double getSalary()
    {
        return salary;
    }
    /**
     * Increases Salary with specified percentage
     * @param byPercent double
     */
    public void raiseSalary(double byPercent)
    {
        byPercent = byPercent / 100;
        salary = salary * (byPercent + 1);
    }

}
