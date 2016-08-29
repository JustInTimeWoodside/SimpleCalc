
/**
 * Write a description of class SimpleCalc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SimpleCalc
{
    // instance variables - replace the example below with your own
    private int num1;
    private int num2;;
    /**
     * Constructor for objects of class SimpleCalc
     */
    public SimpleCalc(int x, int y)
    {
        num1 = x;
        num2 = y;

    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int add()
    {
        int add = num1 + num2;
        
        return add;
    }
    
    public int subtract()
    {
        int subtract = num1 - num2;
        
        return subtract;
    }
    public int mult()
    {
        int mult = num1 * num2;
        
        return mult;
    }
    public int div()
    {
        int div = num1/num2;
        
        return div;
    }
    
}
