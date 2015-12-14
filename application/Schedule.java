package application;

import java.util.Scanner;

public abstract class Schedule
{
    public int level;
    public int exercise;
    public String type;
    
    public Schedule()
    {
    }
    
    
    public static Schedule getScheduleType(){
        Scanner in = new Scanner(System.in);
        
        // Enter schedule type
        System.out.println();
        System.out.print("Enter W for weight schedule and C for cardio schedule: ");
        String type = in.next().toLowerCase();
        
        Schedule newSched;
        if (type.equals("c")){
            newSched = new Cardio();
            System.out.println();
            System.out.println("1 - Beginner, 2 - Intermediate, 3 - Expert");
            System.out.print("Enter Level Number: ");
            int level = in.nextInt();
            
            System.out.println();
            System.out.println("1 - Run, 2 - Elliptical");
            System.out.print("Enter Exercise Number: ");
            int exercise = in.nextInt();
           
            
            System.out.println();
            System.out.println("What day is it?");
            
            String dayOfWeek = in.next().toLowerCase();
            
             if(dayOfWeek.equals("monday")){
                 System.out.println();
            System.out.println(newSched.monday(level, exercise));
        }
        else if(dayOfWeek.equals("tuesday")){
            System.out.println();
            System.out.println(newSched.tuesday(level, exercise));
        }
        else if(dayOfWeek.equals("wednesday")){
            System.out.println();
            System.out.println(newSched.wednesday(level, exercise));
        }
        else if(dayOfWeek.equals("thursday")){
            System.out.println();
            System.out.println(newSched.thursday(level, exercise));
        }
        else if(dayOfWeek.equals("friday")){
            System.out.println();
            System.out.println(newSched.friday(level, exercise));
        }
        else if(dayOfWeek.equals("saturday")){
            System.out.println();
            System.out.println(newSched.saturday(level, exercise));
        }
        else if(dayOfWeek.equals("sunday")){
            System.out.println();
            System.out.println(newSched.sunday(level, exercise));
        }
        else{
            System.out.println("Error: Invalid input");
        }
        }
        
        else{
            newSched = new Weight();
            System.out.println();
            System.out.println("1 - Beginner, 2 - Intermediate, 3 - Expert");
            System.out.print("Enter Level Number: ");
            int level = in.nextInt();

            System.out.println();
            System.out.println("1 - Squat, 2 - Bench, 3 - Deadlift");
            System.out.print("Enter Exercise Number: ");
            int exercise = in.nextInt();
            
            System.out.println();
            System.out.println("What day is it?");
            String dayOfWeek = in.next().toLowerCase();
            
             if(dayOfWeek.equals("monday")){
                 System.out.println();
            System.out.println(newSched.monday(level, exercise));
        }
        else if(dayOfWeek.equals("tuesday")){
            System.out.println();
            System.out.println(newSched.tuesday(level, exercise));
        }
        else if(dayOfWeek.equals("wednesday")){
            System.out.println();
            System.out.println(newSched.wednesday(level, exercise));
        }
        else if(dayOfWeek.equals("thursday")){
            System.out.println();
            System.out.println(newSched.thursday(level, exercise));
        }
        else if(dayOfWeek.equals("friday")){
            System.out.println();
            System.out.println(newSched.friday(level, exercise));
        }
        else if(dayOfWeek.equals("saturday")){
            System.out.println();
            System.out.println(newSched.saturday(level, exercise));
        }
        else if(dayOfWeek.equals("sunday")){
            System.out.println();
            System.out.println(newSched.sunday(level, exercise));
        }
        else{
            System.out.println("Error: Invalid input");
        }
        }
        
        return newSched;
        
    
}

    
    public void setAttributes(int level, int exercise){
        this.level = level;
        this.exercise = exercise;
    }
 
    public abstract String monday(int level, int exercise);
    
    public abstract String tuesday(int level, int exercise);
    
    public abstract String wednesday(int level, int exercise);
    
    public abstract String thursday(int level, int exercise);
    
    public abstract String friday(int level, int exercise);
    
    public abstract String saturday(int level, int exercise);
    
    public abstract String sunday(int level, int exercise);
        

}

