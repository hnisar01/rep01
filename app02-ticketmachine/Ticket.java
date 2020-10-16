import java.util.Date;
/**
 * This class will store information based on the tickets 
 * such as the destination, price 
 * and the date/time the ticket is bought.
 *
 * @author Hassan Nisar
 * @version 09/10/2020
 */
public class Ticket
{
    // Attributes
    
    private String destination;
    
    // currency in pence 
    private int price;
    
    private Date issueDateTime;
    
    /**
     * Constructor for objects of class Ticket
     * this method will set values for the fields
     */
    public Ticket(String destination,int price)
    {
        this.destination = destination;
        this.price = price;
        
        issueDateTime = new Date();
    }
    
    //todo add get destination add get date
    
    // two more methods
    
    /**
     * 
     */
    public void print()
    {
        System.out.println("Ticket to " + destination + 
        " price : " + price + "pence" + 
        "Issued " + issueDateTime);
    
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public String getDestination()
    {
        return destination;
    }
    
}
