
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Hassan Nisar
 * @version 28/10/2020
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String codeNo;
    private String title;

    private Module module1;
    private Module module2;
    private Module module3;
    private Module module4;
    
    private int finalMark;
    private String finalGrade;
    
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String codeNo, String title)
    {
        // initialise instance variables
        this.codeNo = codeNo;
        this.title = title;
        
        this.finalMark = 0;
        this.finalGrade = null;
        
        createModules();
    }
    
    /**
     * method to create modules
     */
    public void createModules()
    {
        module1 = new Module("CO454", "Hilary");
        module2 = new Module("CO452", "Programming Concepts");
        module3 = new Module("CO450", "Networking");
        module4 = new Module("CO456", "Web Deevelopment");
    }

    /**
     * method to add module
     */
    public void addModule(Module module, int moduleNo)
    {
        if(moduleNo == 1)
        {
            this.module1 = module;
        }
    }
    
    /**
     * method to give mark to module
     */
    public void setMark(int mark, int moduleNo)
    {
        if(moduleNo == 1)
        {
            module1.awardMark(mark);
        } 
        else if(moduleNo == 2)
        {
            module2.awardMark(mark);
        }
        else if(moduleNo == 3)
        {
            module3.awardMark(mark);
        }
        else if(moduleNo == 4)
        {
            module4.awardMark(mark);
        }        
    }
    
    /**
     * method to calculate final mark
     */
    public void calculateFinalMark()
    {
        if(courseCompleted())
        {
            int totalMark = module1.getMark() + module2.getMark() +
                module3.getMark() + module4.getMark();
            
                finalMark = totalMark / 4;
                print();
        }
        else
        {
            
        }
    }
    
    
    /**
     * boolean to say if course is completed or not
     */
  
    public boolean courseCompleted()
    {
        if((module1.isCompleted()) && (module2.isCompleted()))
        {
            return true;
        }
        else return false;
        
    }
    
    /**
     * Prints out the details of a course
     */
    public void print()
    {
        // put your code here
        System.out.println("Course " + codeNo + " - " + title);
    }
    
    /**
     * method to print modules
     */
    public void printModules()
    {
        // print all the module marks
        module1.print();
        module2.print();
        module3.print();
        module4.print();
        
        if(courseCompleted())
        {
            System.out.println("Final Mark = " + finalMark);
            System.out.println("Final Grade = " + finalGrade);
        }
    }
}