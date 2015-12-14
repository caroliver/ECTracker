package application;

import java.util.Scanner;

public class CalCalculator
{
    private int dailyCalIntake;
    private int currentWeight;
    private int dietDays;
    private int desiredWeight;
    private String strCalIntake;
    private String strDietDays;
    
    public CalCalculator(){
    }
    
    /**
     * Initializes all local variables for the class.
     *
     * @params daileyCalIntake, currentWeight, desiredWeight, 
     * and dietDays are all intergers.
     * @throws Illegal Arguement Exception if any variable is less than or equal to 0.
     */
    public void createCalc(int dailyCalIntake, int currentWeight, int desiredWeight, int dietDays)
    {
       if (dailyCalIntake <= 0 || currentWeight <= 0 || desiredWeight <=0 || dietDays <=0){ 
             throw new IllegalArgumentException("No variable can be less than or equal to 0");
            }
        
        this.dailyCalIntake = dailyCalIntake;
        this.currentWeight = currentWeight;
        this.desiredWeight = desiredWeight;
        this.dietDays = dietDays;
       
    
    }
    
    /**
     * Creates a new calorie calculator.
     *
     * @variables needed are integers entered during method call in main class.
     * @catches if variable is less than or equal to 0 and allows user to retry once
     * @returns calCalc
     */
    public static CalCalculator newCalCalc() {
        Scanner in = new Scanner(System.in);
        System.out.println();
        for(int tries = 0;; tries++){
            try{
        System.out.print("Daily calorie intake: ");
        int dailyCalIntake = in.nextInt();
        
        System.out.print("Current weight: ");
        int currentWeight = in.nextInt();
        
        System.out.print("Days you wish to diet: ");
        int dietDays = in.nextInt();
        
        System.out.print("Goal weight: ");
        int desiredWeight = in.nextInt();
        
        
        CalCalculator calCalc = new CalCalculator();
        calCalc.createCalc(dailyCalIntake, currentWeight, desiredWeight, dietDays);
        return calCalc;
    }
        catch(IllegalArgumentException ex){
            if(tries <= 1){
                System.out.print("Daily calorie intake: ");
                int dailyCalIntake = in.nextInt();
        
                System.out.print("Current weight: ");
                int currentWeight = in.nextInt();
        
                System.out.print("Days you wish to diet: ");
                int dietDays = in.nextInt();
        
                System.out.print("Goal weight: ");
                int desiredWeight = in.nextInt();
            
        
                CalCalculator calCalc = new CalCalculator();
                calCalc.createCalc(dailyCalIntake, currentWeight, desiredWeight, dietDays);
                return calCalc;
    }
    else{
        throw ex;
    }
}
}
}
    
   /**
    * Gets new daily calorie intake.
    *
    * @variables needed for method are entered through newCalCalc method.
    * @assert that the variable calIntake is greater than 0 before returning.
    * @returns calIntake for number of dietDays
    */
   public String newDailyIntake(){
        int calIntake = ((dailyCalIntake * dietDays) - ((currentWeight-desiredWeight) * 3600)) / dietDays;
        strCalIntake = String.valueOf(calIntake);
        strDietDays = String.valueOf(dietDays);
        
        assert calIntake > 0;
        
        return strCalIntake + " daily max calories for " + strDietDays + " days";
   }
}




