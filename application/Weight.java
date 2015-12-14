package application;

public class Weight extends Schedule
{
    public static int level;
    public static int exercise; 
    
    public Weight(){
    }
    
    public static Schedule createWSchedule(){
        
        Weight newWeightSchedule = new Weight();
        newWeightSchedule.setAttributes(level, exercise);
        
        return newWeightSchedule;
    }

    public String monday(int level, int exercise){
        String wSchedule = "";
          if(level == 1){
            if(exercise == 1){
                wSchedule = "Squat: Do 5 reps increasing 2.5 to 5lbs per rep!";
            }
            else if(exercise == 2){
                wSchedule = "Bench: Do 5 reps increasing 2.5 to 5lbs per rep!";
            }
            else{
                wSchedule = "Deadlift: Do 5 reps increasing 2.5 to 5lbs per rep!";
            }
        }
        else if(level == 2){
           if(exercise == 1){
                wSchedule = "Squat: Do 5 reps increasing 5 to 10lbs per rep!";
            }
            else if(exercise == 2){
                wSchedule = "Bench: Do 5 reps increasing 5 to 10lbs per rep!";
            }
            else{
                wSchedule = "Deadlift: Do 5 reps increasing 5 to 10lbs per rep!";
            }
        }
        else{
            if(exercise == 1){
                wSchedule = "Squat: Do 5 reps increasing 10 to 15lbs per rep!";
            }
            else if(exercise == 2){
                wSchedule = "Bench: Do 5 reps increasing 10 to 15lbs per rep!";
            }
            else{
                wSchedule = "Deadlift: Do 5 reps increasing 10 to 15lbs per rep!";
            }
        }
        return wSchedule;
}

    public String tuesday(int level, int exercise){
        String wSchedule = null;
          if(level == 1){
            if(exercise == 1){
                wSchedule = "Squat: Do 5 reps increasing 2.5 to 5lbs per rep!";
            }
            else if(exercise == 2){
                wSchedule = "Bench: Do 5 reps increasing 2.5 to 5lbs per rep!";
            }
            else{
                wSchedule = "Deadlift: Do 5 reps increasing 2.5 to 5lbs per rep!";
            }
        }
        else if(level == 2){
           if(exercise == 1){
                wSchedule = "Squat: Do 5 reps increasing 5 to 10lbs per rep!";
            }
           else if(exercise == 2){
                wSchedule = "Bench: Do 5 reps increasing 5 to 10lbs per rep!";
            }
           else{
                wSchedule = "Deadlift: Do 5 reps increasing 5 to 10lbs per rep!";
            }
        }
        else{
            if(exercise == 1){
                wSchedule = "Squat: Do 5 reps increasing 10 to 15lbs per rep!";
            }
            else if(exercise == 2){
                wSchedule = "Bench: Do 5 reps increasing 10 to 15lbs per rep!";
            }
            else{
                wSchedule = "Deadlift: Do 5 reps increasing 10 to 15lbs per rep!";
            }
        }
        return wSchedule;
}

    public String wednesday(int level, int exercise){
        String wSchedule = null;
          if(level == 1){
            if(exercise == 1){
                wSchedule = "Squat: Do 5 reps increasing 2.5 to 5lbs per rep!";
            }
            else if(exercise == 2){
                wSchedule = "Bench: Do 5 reps increasing 2.5 to 5lbs per rep!";
            }
            else{
                wSchedule = "Deadlift: Do 5 reps increasing 2.5 to 5lbs per rep!";
            }
        }
        else if(level == 2){
           if(exercise == 1){
                wSchedule = "Squat: Do 5 reps increasing 5 to 10lbs per rep!";
            }
           else if(exercise == 2){
                wSchedule = "Bench: Do 5 reps increasing 5 to 10lbs per rep!";
            }
           else{
                wSchedule = "Deadlift: Do 5 reps increasing 5 to 10lbs per rep!";
            }
        }
       else{
            if(exercise == 1){
                wSchedule = "Squat: Do 5 reps increasing 10 to 15lbs per rep!";
            }
            else if(exercise == 2){
                wSchedule = "Bench: Do 5 reps increasing 10 to 15lbs per rep!";
            }
            else{
                wSchedule = "Deadlift: Do 5 reps increasing 10 to 15lbs per rep!";
            }
        }
        return wSchedule;
}

    public String thursday(int level, int exercise){
        String wSchedule = null;
          if(level == 1){
            if(exercise == 1){
                wSchedule = "Squat: Do 5 reps increasing 2.5 to 5lbs per rep!";
            }
            else if(exercise == 2){
                wSchedule = "Bench: Do 5 reps increasing 2.5 to 5lbs per rep!";
            }
            else{
                wSchedule = "Deadlift: Do 5 reps increasing 2.5 to 5lbs per rep!";
            }
        }
        else if(level == 2){
           if(exercise == 1){
                wSchedule = "Squat: Do 5 reps increasing 5 to 10lbs per rep!";
            }
           else if(exercise == 2){
                wSchedule = "Bench: Do 5 reps increasing 5 to 10lbs per rep!";
            }
           else{
                wSchedule = "Deadlift: Do 5 reps increasing 5 to 10lbs per rep!";
            }
        }
        else{
            if(exercise == 1){
                wSchedule = "Squat: Do 5 reps increasing 10 to 15lbs per rep!";
            }
            else if(exercise == 2){
                wSchedule = "Bench: Do 5 reps increasing 10 to 15lbs per rep!";
            }
            else{
                wSchedule = "Deadlift: Do 5 reps increasing 10 to 15lbs per rep!";
            }
        }
        return wSchedule;
}

    public String friday(int level, int exercise){
        String wSchedule = null;
          if(level == 1){
            if(exercise == 1){
                wSchedule = "Squat: Do 5 reps increasing 2.5 to 5lbs per rep!";
            }
            else if(exercise == 2){
                wSchedule = "Bench: Do 5 reps increasing 2.5 to 5lbs per rep!";
            }
            else{
                wSchedule = "Deadlift: Do 5 reps increasing 2.5 to 5lbs per rep!";
            }
        }
        else if(level == 2){
           if(exercise == 1){
                wSchedule = "Squat: Do 5 reps increasing 5 to 10lbs per rep!";
            }
           else if(exercise == 2){
                wSchedule = "Bench: Do 5 reps increasing 5 to 10lbs per rep!";
            }
           else{
                wSchedule = "Deadlift: Do 5 reps increasing 5 to 10lbs per rep!";
            }
        }
        else{
            if(exercise == 1){
                wSchedule = "Squat: Do 5 reps increasing 10 to 15lbs per rep!";
            }
           else if(exercise == 2){
                wSchedule = "Bench: Do 5 reps increasing 10 to 15lbs per rep!";
            }
           else{
                wSchedule = "Deadlift: Do 5 reps increasing 10 to 15lbs per rep!";
            }
        }
        return wSchedule;
}

    public String saturday(int level, int exercise){
        String wSchedule = null;
          if(level == 1){
            if(exercise == 1){
                wSchedule = "Squat: Do 5 reps increasing 2.5 to 5lbs per rep!";
            }
            else if(exercise == 2){
                wSchedule = "Bench: Do 5 reps increasing 2.5 to 5lbs per rep!";
            }
            else{
                wSchedule = "Deadlift: Do 5 reps increasing 2.5 to 5lbs per rep!";
            }
        }
        else if(level == 2){
           if(exercise == 1){
                wSchedule = "Squat: Do 5 reps increasing 5 to 10lbs per rep!";
            }
           else if(exercise == 2){
                wSchedule = "Bench: Do 5 reps increasing 5 to 10lbs per rep!";
            }
           else{
                wSchedule = "Deadlift: Do 5 reps increasing 5 to 10lbs per rep!";
            }
        }
        else{
            if(exercise == 1){
                wSchedule = "Squat: Do 5 reps increasing 10 to 15lbs per rep!";
            }
            else if(exercise == 2){
                wSchedule = "Bench: Do 5 reps increasing 10 to 15lbs per rep!";
            }
            else{
                wSchedule = "Deadlift: Do 5 reps increasing 10 to 15lbs per rep!";
            }
        }
        return wSchedule;
}

    public String sunday(int level, int exercise){
        String wSchedule = null;
          if(level == 1){
            if(exercise == 1){
                wSchedule = "Squat: Do 5 reps increasing 2.5 to 5lbs per rep!";
            }
            else if(exercise == 2){
                wSchedule = "Bench: Do 5 reps increasing 2.5 to 5lbs per rep!";
            }
            else{
                wSchedule = "Deadlift: Do 5 reps increasing 2.5 to 5lbs per rep!";
            }
        }
        else if(level == 2){
           if(exercise == 1){
                wSchedule = "Squat: Do 5 reps increasing 5 to 10lbs per rep!";
            }
           else if(exercise == 2){
                wSchedule = "Bench: Do 5 reps increasing 5 to 10lbs per rep!";
            }
           else{
                wSchedule = "Deadlift: Do 5 reps increasing 5 to 10lbs per rep!";
            }
        }
        else{
            if(exercise == 1){
                wSchedule = "Squat: Do 5 reps increasing 10 to 15lbs per rep!";
            }
            else if(exercise == 2){
                wSchedule = "Bench: Do 5 reps increasing 10 to 15lbs per rep!";
            }
            else{
                wSchedule = "Deadlift: Do 5 reps increasing 10 to 15lbs per rep!";
            }
        }
        return wSchedule;
}
}