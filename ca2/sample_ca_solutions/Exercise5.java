import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score;
        String project = "yes", participate = "yes";
        String grade = "F", feedback = "Need to work harder";

        System.out.println();    
        System.out.print("Enter score: ");
        score = input.nextInt();

        if(score >= 50 && score <= 100){ //projects and participation only relevant to grade and feedback for scores of 50 or higher
            System.out.print("Did you submit all projects (yes/no): ");
            project = input.next();
            System.out.print("Did you participate in all classes (yes/no): ");
            participate = input.next();
        }

        System.out.println();
        
        if(score >= 0 && score <= 100){
            if(score >= 90){
                if(participate.equalsIgnoreCase("yes") && project.equalsIgnoreCase("yes")){
                    grade = "A+";
                    feedback = "Excellent work";
                }else if(participate.equalsIgnoreCase("yes") && !project.equalsIgnoreCase("yes")){
                    grade = "A";
                    feedback = "Great job, but make sure to submit all projects";
                }else if(!participate.equalsIgnoreCase("yes") && project.equalsIgnoreCase("yes")){
                    grade = "A";
                    feedback = "Great job, but make sure to participate in all classes";
                }else if(!participate.equalsIgnoreCase("yes") && !project.equalsIgnoreCase("yes")){
                    grade = "A-";
                    feedback = "Great job, but make sure to submit all projects and participate more";
                }
            }else if(score >= 70){
                if(participate.equalsIgnoreCase("yes") && project.equalsIgnoreCase("yes")){
                    grade = "B+";
                    feedback = "Well done, great job";
                }else if(participate.equalsIgnoreCase("yes") && !project.equalsIgnoreCase("yes")){
                    grade = "B";
                    feedback = "Good job, but make sure to submit all projects";
                }else if(!participate.equalsIgnoreCase("yes") && project.equalsIgnoreCase("yes")){
                    grade = "B";
                    feedback = "Good job, but make sure to participate in all classes";
                }else if(!participate.equalsIgnoreCase("yes") && !project.equalsIgnoreCase("yes")){
                    grade = "B-";
                    feedback = "Well done, but make sure to submit all projects and participate more";
                }
            }else if(score >= 50){
                if(participate.equalsIgnoreCase("yes") && project.equalsIgnoreCase("yes")){
                    grade = "C+";
                    feedback = "Not bad, decent effort";
                }else if(participate.equalsIgnoreCase("yes") && !project.equalsIgnoreCase("yes")){
                    grade = "C";
                    feedback = "Need to ensure all projects are submitted";
                }else if(!participate.equalsIgnoreCase("yes") && project.equalsIgnoreCase("yes")){
                    grade = "C";
                    feedback = "Need to participate more";
                }else if(!participate.equalsIgnoreCase("yes") && !project.equalsIgnoreCase("yes")){
                    grade = "C-";
                    feedback = "Need to make sure to submit all projects and participate more";
                }            
            }else if(score >= 40){
                grade = "D";
                feedback = "Need to improve. Just about getting by";
            }
            System.out.println("Grade: " + grade);
            System.out.println("Feedback: " + feedback);    
        }else{
            System.out.println("Score entered must be from 0 to 100");     
        }
                
        System.out.println();
        input.close();
    }
}

