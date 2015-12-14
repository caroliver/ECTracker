package application;

import java.util.Scanner;

public class CalCounter
{
    public int cals = 0;
    public int plusCals = 0;
    public int initialCals = 0;
    
    public CalCounter(){
    }
    
    /**
     * Initializes all local variables for the class.
     *
     * @params cals, plusCals, 
     * and initialCals are all intergers.
     * @throws Illegal Arguement Exception if any variable is less than or equal to 0.
     */
    public void createCalCounter()
    {
        if (cals <= 0 || plusCals <= 0 || initialCals <=0){ 
             throw new IllegalArgumentException("No variable can be less than or equal to 0");
            }
            
        this.cals = cals;
        this.plusCals = plusCals;
        this.initialCals = initialCals;
    }
    
    /**
     * Creates a new calorie counter.
     *
     * @variables needed are integers entered during method call in main class.
     * @returns calCount
     */
    public static CalCounter newCalCount() {
        CalCounter calCount = new CalCounter();
        calCount.createCalCounter();
        return calCount;
    }

   /**
     * Add initial calories to CalCounter.
     *
     * @required variable cCals entered through scanner in method.
     * @throws IllegalArgumentException if initial calories (cCals) is entered as a 0.
     */
    public int initialAddCals(){
       Scanner in = new Scanner(System.in);
       System.out.print("Enter Initial Calorie Amount: ");
       int cCals = in.nextInt(); 
       if (cCals <= 0){
             throw new IllegalArgumentException("Initial calories can't be 0");
            }
       initialCals = initialCals + cCals;
       
       return initialCals;
    }
    
    /**
     * Add additional calories to CalCounter.
     *
     * @required variable newCals entered through scanner in method.
     * @throws IllegalArgumentException if additional calories (newCals) is entered as a 0.
     */
    public int addCals(){
        Scanner in = new Scanner(System.in);
        System.out.print("Number of Calories: ");
        int newCals = in.nextInt();
        if (newCals <= 0){
             throw new IllegalArgumentException("Initial calories can't be 0");
            }
        cals = initialCals + newCals;
        
        return cals;
    }
    
    /**
     * Returns updated calorie amount for the user (until reset).
     *
     * @returns cals
     */
    public int getUpdatedCals(){
        return cals;
    }
    
    /**
     * Resets calCount to 0.
     *
     * @resets initialCals to 0.
     * @returns initialCals
     */
    public int resetCals(){
        initialCals = 0;
        return initialCals;
    }
}

