import java.util.Random;
   
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * Modified Hassan Nisar
 */
public class StockDemo
{
    // The stock manager.
    private StockManager manager;

    private Random randomGenerator;
    
    /**
     * Create a StockManager and apply some products
     * 
     */
    public StockDemo(StockManager manager)
    {
        this.manager = manager;
        randomGenerator = new Random();
        
        manager.addProduct(new Product(101, "Nissan GTR 01"));
        manager.addProduct(new Product(102, "Ford Mustang 02"));
        manager.addProduct(new Product(103, "Dodge Charger 03"));
        manager.addProduct(new Product(104, "Porsche Carrera 04"));
        manager.addProduct(new Product(105, "Ford GT 05"));
        manager.addProduct(new Product(106, "Ferrari Enzo 06"));
        manager.addProduct(new Product(107, "Lamborghini Sesto Elemento 07"));
        manager.addProduct(new Product(108, "Toyota Supra 08"));
        manager.addProduct(new Product(109, "Ferrari 452 09"));        
        manager.addProduct(new Product(110, "Nissan 350z 10"));
    }
    
    /**
     * This method will show that requirements have been met,
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
     * might be used.
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
     * might be used.
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