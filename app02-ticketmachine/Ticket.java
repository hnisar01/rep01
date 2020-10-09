import java.util.Date;
/**
 * This is where tickets will be sold.
 *
 * @author Hassan Nisar
 * @version 09/10/2020
 */
public class Ticket
{
    // Attributes
    
    private String destination;
    
    private int price;
    
    private Date issueDateTime;
    
    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String destination,int price)
    {
        this.destination = destination;
        this.price = price;
        
        issueDateTime = new Date();
    }
    
    /**
     * 
     */
    public void print()
    {
        System.out.println("Ticket" + destination + 
        " price : " + " Issued " + issueDateTime);
    
    }
}
