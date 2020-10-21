/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Student Name
 */
public class TicketMachine
{
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;
    
    private Ticket issuedTicket;
    
    private Ticket aylesburyTicket;
    
    private Ticket amershamTicket;
    
    private Ticket wycombeTicket;
    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        balance = 0;
        total = 0;
        
        aylesburyTicket = new Ticket("Aylesbury",220);
        amershamTicket = new Ticket("Amersham", 300);
        wycombeTicket = new Ticket("Wycombe", 330);
        
        issuedTicket = null;
    }

    public void printBalance()
    {
        System.out.println("current balance is " + balance + " pence");
    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return issuedTicket.getPrice();
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) 
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }
    
    
   public void selectAylesbury()
   {
       issuedTicket = aylesburyTicket;
    }
    
     public void selectAmersham()
   {
       issuedTicket = amershamTicket;
    }
   
    public void selectwycombe()
   {
       issuedTicket = wycombeTicket;
    }
    
   /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
   public void printTicket()
   {
        if(balance >= issuedTicket.getPrice()) 
        {
            // Simulate the printing of a ticket.
            System.out.println("");
            System.out.println("# The BlueJ Line");
            issuedTicket.print();
            System.out.println("##################");
            System.out.println();
            issuedTicket.print();
            System.out.println();

            // Update the total collected with the price.
            total = total + issuedTicket.getPrice();
            // Reduce the balance by the price.
            balance = balance - issuedTicket.getPrice();
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (issuedTicket.getPrice() - balance) + 
                               " more pence.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    
    /**
     * 
     */
    public void printAllTickets()
    {
        System.out.println();
        System.out.println("The following tickets are available:-");
        
        aylesburyTicket.print();
        amershamTicket.print();
        wycombeTicket.print();
    }
    
    public void printHeading()
    {
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("By Hassan");
        System.out.println("# ##################");
        System.out.println();
    }
    
    /**
     * This method will add ten pence
     */
    
    public void insert10pCoin()
    {
        balance = balance + 10;
        System.out.println("you have entered 10p");
        printBalance();
    }
    
    /**
     * This method will add twenty pence
     */
    public void insert20pCoin()
    {
        balance = balance + 20;
        System.out.println("you have entered 20p");
        printBalance();
    }
    
    /**
     * This method will add ten pence
     */
    public void insert£1Coin()
    {
        balance = balance + 100;
        System.out.println("you have entered 100p");
        printBalance();
    }
    
    /**
     * This method will add ten pence
     */
    public void insert£2Coin()
    {
        balance = balance + 200;
        System.out.println("you have entered 200p");
        printBalance();
    }
}
