
/**
 * Set of methods for a virtual counter.
 * 
 * @author (Lane Humphreys) 
 * @version (9/26/19)
 */
public class Counter
{
  private int value;
  /**
   * Constructs a Counter object with initial value 0
   */
  public Counter()
  {
      value = 0;
  }
  /**
   * Constructs Counter Object with an initial value
   * @param initialCount
   */
  public Counter(int initialCount)
  {
      value = initialCount;
  }
  /**
   * advances the counter by one
   */
  public void click()
  {
        value = value + 1;
  }
  /**
   * Resets counter back to zero
   */
  public void reset()
  {
      value = 0;
  }
  /**
   * Subtracts a click from the counter but counter can never be less than 0
   */
  public void undo()
  {
      value = value - 1;
      value = Math.max(value, 0);// sets value back to 0 if it is less than 0
  }
  /**
   * Sets a limit to the maximum number of clicks.
   */
    public void setLimit(int maximum)
  {
      value = Math.min(value, maximum);
  }
  /**
   * Gets the value of the counter
   * @return the current value
   */
  public int getValue()
  {
      return value;
  }

    
}
