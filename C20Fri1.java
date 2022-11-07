/*bitLabs:     

        Placement -- Ready     maybe     No

   WAP to accept   Assignement_score,  Mentors_feedback_score, C20 score

  --> The learner should pass in all the 3 subjects and passmarks is 50 in each.
  --> if the leaner got passed in 3 subjects then find out total score.
         ---> 70% from C20, 20% from Assignment , 10 % from Mentors_feedback

                  90 , 78, 98

    --> Based on total score dispaly "Ready" , "maybe" ,"No"
    
           if Total_score >80   --> Ready
            50-80    --> Maybe
          below 50  --> NO

  ---> if learners got failed in any one of the subjects, display subject name along with score.

           you got failed in assignemnts and your score is 40*/
import java.util.*;
class C20Fri1{
  public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the assignment score");
    int assignsc=s.nextInt(); 
    System.out.println("Enter Mentors feedback score "); 
    int mentorsc =s.nextInt(); 
    System.out.println("Enter c20 score"); 
    int c20sc =s.nextInt(); 
    if(assignsc>=50&&mentorsc>=50&&c20sc>=50)
    {
    int total= ((70*c20sc)/100+(10*mentorsc)/100+(20*assignsc)/100);
       
     if(total>=80)
    {
      System.out.println("the learner is ready");
    }
    else if(total>=50){
      System.out.println("the learner is maybe");
    }
    else{
      System.out.println("the learner is no");
    }
    }
   else{
  System.out.println("hi learner");
   if(assignsc<=50){
       System.out.println("the learner failed in assignscore"+assignsc);
      
    }
      if(mentorsc<=50){
       System.out.println("the learner failed in mentorscore"+mentorsc);
      
    }
      if(c20sc<=50){
       System.out.println("the learner failed in c20score"+c20sc);
      
    }

   }
  }
}
