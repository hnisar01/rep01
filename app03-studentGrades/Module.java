
/**
 * This Module class will show the student has passed or fail.
 *
 * @author (Hassan Nisar)
 * @version 28/10/2020
 */
public class Module
{
    private String title;
    
    private String codeNo;
    
    private int mark;
    
    private int credit;
    
    private boolean completed;
    
    private boolean passed;
    
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        this.title = title;
        this.codeNo = codeNo;
        
        mark = -1;
        credit = 15;
        
        passed = false;
        completed = false;
    }
    
   /**
     * This is the mark awarderd to the student
     */
    public void awardMark(int mark)
    {
        this.mark = mark;
    }

   /**
     * Returns the mark
     */
    public int getMark()
    {
        return mark;
    }
    
   /**
     * Returns the module code number
     */
    public String getCodeNo()
    {
        return codeNo;
    }
    
    /**
     * 
     */
    public boolean isCompleted()
    {
        return mark >= 40;
    }
    
    /**
     * 
     */
    public void print()
    {
        System.out.println("Module: " + title + " " + codeNo + " Mark = " + mark); 
    }
    
    /**GET Method Propertie title*/
    public String getTitle()
    {
        return this.title;
    }//end method getTitle

    //End GetterSetterExtension Source Code
//!
}