
   /**
   * This app provides a user interface to the
   * stock manager so that users can add, edit,
   * print and remove stock products
   *
   * @author Hassan Nisar
   * @version 0.1
   */
   public class StockApp
   {
     public static final String PRINT_ALL = "printall";
     // Use to get user input
     private InputReader reader;
    
     private StockManager manager;
   
     private StockDemo oldStock;
     
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();
        manager = new StockManager();
        oldStock = new StockDemo(manager);
    }

     /** prints heading and shows choices
      * 
      */
     public void run()
     {
        printHeading();
        getMenuChoice();
     }
    
    public void deliverProduct()
    {
        System.out.println("Please enter the product ID");
        String value = reader.getInput();
        int id = Integer.parseInt(value);
        
        System.out.println("Please enter the Amount");
        value = reader.getInput();
        int amount = Integer.parseInt(value);
        
        manager.deliverProduct(id, amount);
    }
    
    
    
    public void sellProduct()
    {
        System.out.println("Selling a product");
        
        System.out.println("Please enter the product ID");
        String value = reader.getInput();
        int id = Integer.parseInt(value);
        
        System.out.println("Please enter the Amount");
        value = reader.getInput();
        int amount = Integer.parseInt(value);
        
        manager.sellProduct(id, amount);
    }
    
    public void restockAllProducts()
    {
       System.out.println("Please enter the product ID");
       String value = reader.getInput();
       int id = Integer.parseInt(value);
        
       System.out.println("Please enter the amount");
       value = reader.getInput();
       int amount = Integer.parseInt(value);
      
       manager.restockLowStock(id, amount);
    }
    
    /** 
     * 
     */
    public void getMenuChoice()
    {
       boolean finished = false;
        
       while(!finished)
       {
           printHeading();
           printMenuChoices();
           
           String choice = reader.getInput();
           choice = choice.toLowerCase();
            
           if(choice.equals("quit"))
           {
               finished = true;
           }
           else
           {
               executeMenuChoice(choice);
           }
           
       }
    }
    
    /** 
     * 
     */
    public void getShowLowStock()
    {
        boolean finished = true;
        
        while(!finished)
        {
           String choice = reader.getInput();
            choice = choice.toLowerCase();
            
            if(choice.equals(" < == 20 "))
            {
                finished = false;
            }
            else
            {
                executeMenuChoice(choice);
            }
           
        }
    }
   
    /**this adds a product
    * 
    */
    private void addProduct()
    {
       System.out.println("\nAdding a new product!\n");
        
       System.out.println("Please enter the product ID");
       String value = reader.getInput();
       int id = Integer.parseInt(value);
        
       System.out.println("Please enter the product name");
       String name = reader.getInput();
        
       Product product = new Product(id,name);
       System.out.print("Added new product " + product);
      
       manager.addProduct(product);
    }
   
    /**this renames a product
     * 
     */
     private void renameProduct()
     {
       System.out.println("\nRenaming a product!\n");
        
       System.out.println("Please enter the product ID");
       String value = reader.getInput();
       int id = Integer.parseInt(value);
        
       System.out.println("Please enter the product name");
       String name = reader.getInput();
      
       manager.renameProduct(id, name);
    }
   
    private void executeMenuChoice(String choice)
    {
         if(choice.equals("add"))
         {
            addProduct();
         }
         else if(choice.equals("remove"))
         {
            removeProduct(); 
         }
         else if(choice.equals(PRINT_ALL))
         {
            printAllProducts();
         }
         else if(choice.equals("deliver"))
         {
            deliverProduct();
         }
         else if(choice.equals("restock"))
         {
            restockAllProducts();
         }
         else if(choice.equals("rename"))
         {
            renameProduct();
         }
         else if(choice.equals("sell"))
         {
            sellProduct();
         }
         else if(choice.equals("showLowStock"))
         {
            getShowLowStock();
         }
        
    }
    
     /** this removes a product
     * 
     */
     private void removeProduct()
     {
         System.out.println("\nremoving a product!\n");
        
         System.out.println("Please enter the product ID");
         String value = reader.getInput();
         int id = Integer.parseInt(value);
        
         manager.removeProduct(id);
      }
   
     /** this prints all products
     * 
     */
     private void printAllProducts()
     {
         manager.printAllProducts();
     }
        
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println("    Deliver:    Deliver a product");
        System.out.println("    Rename:     Rename a Product");
        System.out.println("    Lowstock:   Show Lowstock Products");
        System.out.println("    Restock:    Restock Products");
        System.out.println("    Sell:       Sell a product");
        System.out.println();        
    }
    
    /**
    * Print the title of the program and the authors name
    */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: Hassan Nisar");
        System.out.println("******************************");
    }
}
