import java.util.Random;
   
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 03/11/2020
 * Modified by Hassan Nisar
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    private Random randomGenerator;
    
    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        randomGenerator = new Random();
        
        manager.addProduct(new Product(101, "Samsung Galaxy S20"));
        manager.addProduct(new Product(102, "Apple iPhone 12"));
        manager.addProduct(new Product(103, "Google Pixel 4A"));
        manager.addProduct(new Product(104, "Samsung Galaxy S20"));
        manager.addProduct(new Product(105, "Apple iPhone 12"));
        manager.addProduct(new Product(106, "Google Pixel 4A"));
        manager.addProduct(new Product(107, "Samsung Galaxy S20"));
        manager.addProduct(new Product(108, "Apple iPhone 12"));
        manager.addProduct(new Product(109, "Google Pixel 4A"));        
        manager.addProduct(new Product(110, "Apple iPhone 12"));
    }
    
    /**
     * This method will run all the tests needed to 
     * demonstrate that the requirements have been met
     */
    public void runDemo()
    {
        manager.printAllProducts();
        demoDeliverProducts();
        manager.printAllProducts();
        demoSellProducts();
        manager.printAllProducts();
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    private void demoDeliverProducts()
    {
        int quantity = 0;
        
        for(int id = 101; id <= 110; id++)
        {
            quantity = randomGenerator.nextInt(8);
            manager.deliverProduct(id, quantity);
        }
    }
    
    /**
     * Provide a very simple demonstration of how a StockManager
     * might be used. Details of one product are shown, the
     * product is restocked, and then the details are shown again.
     */
    private void demoSellProducts()
    {
        int quantity = 0;
        
        for(int id = 101; id <= 110; id++)
        {
            quantity = randomGenerator.nextInt(4);
            manager.sellProduct(id, quantity);
        }
    }
    
}