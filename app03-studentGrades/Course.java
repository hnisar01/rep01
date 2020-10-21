
/**
 * this class will contain details about the 
 * course title and its ucas course code
 *
 * @author Hassan Nisar
 * @version 07/10/2020
 */
public class Course
{
    //atributes/fields/variables
    
    
    private String title;
    
    private String codeNo;
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String title, String codeNo)
    {
        this.title=title;
        this.codeNo=codeNo;
    }
    
    public void print()
    {
        System.out.print("Course " + title + " " + codeNo);
    }
}

    
    
    
