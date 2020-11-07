import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author  Hassan Nisar
 * @version (05.11.2020)
 */
public class StockManager
{
   // A list of the products.
    private ArrayList<Product> stock;
    
   /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

   /**
     * Add a product to the list.
     * 
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    /**
     * Receive a delivery of a particular product.
     * 
     */
    public void deliverProduct(int id, int amount)
    {
        Product product = findProduct(id);
        
        System.out.println("Deliever Product" + id);
        product.deliver(amount);
        printProduct(id);
        
        
        
        if(product != null)
            product.deliver(amount);
        else
            System.out.println("Invalid Product ID = " + id);
    }
    
    /**
     * Sell one of the given item.
     * 
     */
    public void sellProduct(int id, int quantity)
    {
        Product product = findProduct(id);
        
        if(product != null) 
        {
            if(quantity > product.getQuantity())
                quantity = product.getQuantity();
                
            printProduct(id);
            
            for(int count = 0; count <= quantity; count++)
            {
                product.sellOne();
            }

            printProduct(id);
        }
    }    
    
    /**
     * Try to find a product in the stock with the given id.
     *
     */
    public Product findProduct(int id)
    {
        for(Product product : stock)
        {
            if(product.getID() == id)
            {
               return product; 
            }
        }
        
        return null;
    }
    
    /**
     * Try to find a product in the stock with part of name.
     * 
     */
    public void searchProduct(String name)
    {
        for(Product product : stock)
        {
            if(product.getName().contains(name))
            {
               System.out.println(product);
            }
        }
    }    
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock.
     */
    public int numberInStock(int id)
    {
        return 0;
    }

    /**
     * Print details of the given product.
     * 
     */
    public void printProduct(int id)
    {
        Product product = findProduct(id);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void printAllProducts()
    {
        System.out.println();
        System.out.println("Hassan's Products");
        System.out.println("====================");
        System.out.println();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }
}