package application;

import java.util.Scanner;
public class Cardio extends Schedule
{
    public Cardio()
    {
    }

    public static Schedule createCSchedule(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Level: ");
        String level1 = in.next();
        int level = Integer.parseInt(level1);
        System.out.print("Enter Exercise: ");
        String exercise1 = in.next();
        int exercise = Integer.parseInt(exercise1);
        
        Cardio newCardioSchedule = new Cardio();
        newCardioSchedule.setAttributes(level, exercise);
        
        return newCardioSchedule;
    }

    public String monday(int level, int exercise){
        String cSchedule = null;
          if(level == 1){
            if(exercise == 1){
                cSchedule = "Run: 1 mile at a moderate pace";
            }
            else{
                cSchedule = "Eliptical: 2 miles on level 1 or 2";
            }
        }
        else if(level == 2){
           if(exercise == 1){
                cSchedule = "Run: 1 mile at a fast pace or 2 miles at a moderate pace";
            }
           else{
                cSchedule = "Eliptical: 3 miles on level 3";
            }
        }
        else{
            if(exercise == 1){
                cSchedule = "Run: 5k at a moderate to fast pace";
            }
            else{
                cSchedule = "Eliptical: 5 miles on level 5 to 6";
            }
        }
        return cSchedule;
}
  public String tuesday(int level, int exercise){
        String cSchedule = null;
          if(level == 1){
            if(exercise == 1){
                cSchedule = "Run: 1 mile at a moderate pace";
            }
            else{
                cSchedule = "Eliptical: 2 miles on level 1 or 2";
            }
        }
        else if(level == 2){
           if(exercise == 1){
                cSchedule = "Run: 1 mile at a fast pace or 2 miles at a moderate pace";
            }
           else{
                cSchedule = "Eliptical: 3 miles on level 3";
            }
        }
        else {
            if(exercise == 1){
                cSchedule = "Run: 5k at a moderate to fast pace";
            }
            else{
                cSchedule = "Eliptical: 5 miles on level 5 to 6";
            }
        }
        return cSchedule;
}
  public String wednesday(int level, int exercise){
        String cSchedule = null;
        if(level == 1){
            if(exercise == 1){
                cSchedule = "Run: 1 mile at a moderate pace";
            }
            else{
                cSchedule = "Eliptical: 2 miles on level 1 or 2";
            }
        }
        else if(level == 2){
           if(exercise == 1){
                cSchedule = "Run: 1 mile at a fast pace or 2 miles at a moderate pace";
            }
           else{
                cSchedule = "Eliptical: 3 miles on level 3";
            }
        }
        else{
            if(exercise == 1){
                cSchedule = "Run: 5k at a moderate to fast pace";
            }
            else{
                cSchedule = "Eliptical: 5 miles on level 5 to 6";
            }
        }
        return cSchedule;
}
  public String thursday(int level, int exercise){
        String cSchedule = null;
          if(level == 1){
            if(exercise == 1){
                cSchedule = "Run: 1 mile at a moderate pace";
            }
            else{
                cSchedule = "Eliptical: 2 miles on level 1 or 2";
            }
        }
        else if(level == 2){
           if(exercise == 1){
                cSchedule = "Run: 1 mile at a fast pace or 2 miles at a moderate pace";
            }
           else{
                cSchedule = "Eliptical: 3 miles on level 3";
            }
        }
        else{
            if(exercise == 1){
                cSchedule = "Run: 5k at a moderate to fast pace";
            }
            else{
                cSchedule = "Eliptical: 5 miles on level 5 to 6";
            }
        }
        return cSchedule;
}
  public String friday(int level, int exercise){
        String cSchedule = null;
          if(level == 1){
            if(exercise == 1){
                cSchedule = "Run: 1 mile at a moderate pace";
            }
            else{
                cSchedule = "Eliptical: 2 miles on level 1 or 2";
            }
        }
        else if(level == 2){
           if(exercise == 1){
                cSchedule = "Run: 1 mile at a fast pace or 2 miles at a moderate pace";
            }
           else{
                cSchedule = "Eliptical: 3 miles on level 3";
            }
        }
        else{
            if(exercise == 1){
                cSchedule = "Run: 5k at a moderate to fast pace";
            }
            else{
                cSchedule = "Eliptical: 5 miles on level 5 to 6";
            }
        }
        return cSchedule;
}
  public String saturday(int level, int exercise){
        String cSchedule = null;
          if(level == 1){
            if(exercise == 1){
                cSchedule = "Run: 1 mile at a moderate pace";
            }
            else{
                cSchedule = "Eliptical: 2 miles on level 1 or 2";
            }
        }
        else if(level == 2){
           if(exercise == 1){
                cSchedule = "Run: 1 mile at a fast pace or 2 miles at a moderate pace";
            }
           else{
                cSchedule = "Eliptical: 3 miles on level 3";
            }
        }
        else{
            if(exercise == 1){
                cSchedule = "Run: 5k at a moderate to fast pace";
            }
            else{
                cSchedule = "Eliptical: 5 miles on level 5 to 6";
            }
        }
        return cSchedule;
}
  public String sunday(int level, int exercise){
        String cSchedule = null;
          if(level == 1){
            if(exercise == 1){
                cSchedule = "Run: 1 mile at a moderate pace";
            }
            else{
                cSchedule = "Eliptical: 2 miles on level 1 or 2";
            }
        }
        else if(level == 2){
           if(exercise == 1){
                cSchedule = "Run: 1 mile at a fast pace or 2 miles at a moderate pace";
            }
           else{
                cSchedule = "Eliptical: 3 miles on level 3";
            }
        }
        else{
            if(exercise == 1){
                cSchedule = "Run: 5k at a moderate to fast pace";
            }
            else{
                cSchedule = "Eliptical: 5 miles on level 5 to 6";
            }
        }
        return cSchedule;
}
}
