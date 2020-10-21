
/**
 * Write a description of class Module here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Module
{
   private String title;
    
   private String codeNo;
   
   private int mark;
   
   private boolean completed;

   /**
     * Constructor for objects of class Module
     */
   public Module(String title, String codeNo)
   {
       completed = false;
       mark = 0;
       this.title = title;
       this.codeNo = codeNo; 
    }

    
}
