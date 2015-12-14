package application;

import java.util.Scanner;
 
public class Individual extends User
{
    
    private CalCalculator calCalc = new CalCalculator();
    private CalCounter calCount = new CalCounter();
    
    
    public CalCalculator getCalCalc() {
        return calCalc;
    }
    
    public void setCalCalc(CalCalculator cc) {
        calCalc = cc;
    }
    
    public CalCounter getCalCounter(){
        return calCount;
    }
    
    public void setCalCount(CalCounter ccount){
        calCount = ccount;
    }
     
    public static Individual createNewUser() {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print("First name: ");
        String firstName = in.next();
        
        System.out.print("Last name: ");
        String lastName = in.next();
        
        System.out.print("Email: ");
        String email = in.next();
        
        System.out.print("Password: ");
        String password = in.next();
        
        System.out.print("User ID: ");
        String userID = in.next();
        
         
        Individual newIndividual = new Individual();
        newIndividual.setAttributes(firstName,lastName,password,email,userID);
        
        return newIndividual;
    }
   
}
