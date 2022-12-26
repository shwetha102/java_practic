/* JFM1T9_Assignment4:
     Extend and enhance the previous inheritance program where collegeName, designation and 
     work() method are common to all the teachers and declared in the base class in the way
     that all child classes like MathTeacher, EnglishTeacher and MusicTeacher do not need to 
     write this code and can use directly from base class. 

     Sample Output:
     Math Teacher         IIT
     English Teacher      IIT
     Music Teacher        IIT
*/

class Teacher{
  public static String collegeName = "IIT";
  public String designation;

  public void details(String designation){
    this.designation = designation;
  }
  public void work(){
    System.out.println(this.designation+" \t"+collegeName);
    
  }
  
}

//Add MathTeacher class
class MathTeacher extends Teacher{

  
}

//Add EnglishTeacher class
class EnglishTeacher extends Teacher{



  
}

//Add MusicTeacher class
class MusicTeacher extends Teacher{


  
}

class CollegePrincipal {
  public static void main(String[] args){
//Add the main method here and create all different types of Teacher objects and print there college name designation.
    MathTeacher math = new MathTeacher();
    EnglishTeacher english = new EnglishTeacher();
    MusicTeacher music = new MusicTeacher();

    math.details("MathTeacher");
    english.details("EnglishTeacher");
    music.details("MusicTeacher");

    math.work();
    english.work();
    music.work();
  }
}
