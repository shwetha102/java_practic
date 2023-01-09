// Create a class named User having private attributes
// Attributes
// Datatype

// name
// String
// username
// String
// password
// String
// contactDetail
// ContactDetail

// Create a class named ContactDetail having private attributes
// Attributes
// Datatype
// mobile
// String
// alternateMobile
// String
// landLine
// String
// email
// String
// address
// String

// Include getter and setters for all attributes in both the classes
// Include default and parameterized constructors for both the classes in the following order
// User(String name, ContactDetail contactDetail, String username,String password)
// ContactDetail(String mobile, String alternateMobile,String landLine, String email, String address)
// Create a driver class called Main. In the Main method, obtain input from the user and display all the details.
/*
class user{
private string name;
private string username;
private string password;
ContactDetail ContactDetail;
 User(){
     System.out.println("Defalut user constructor");
  }
   System.out.println("Defalut");
  User(String name, ContactDetails contactDetails, String username,String password){
    this.name=name;
    this.contactDetails=contactDetails;
    this.username=username;
    this.password=password;
  }
  public void setname(string name){
    this.name=name;
  }
  public void setusername(string username){
    this.username=username;
  }
   public void setpassword(string password){
    this.password=password;
  }
  public void setContactDetail=(ContactDetail ContactDetail){
    this.ContactDetail=ContactDetail;
  }

 public ContactDetails getcontactDetails(){
    return contactDetails;

  public string getname(){
    return name;
  }
  public string getusername(){
    return username;
  }
  
  public string getpassword(){
    return password;
  }
  }
 

class ContactDetail{
private  string mobile;
private string alternatemobile;
private string landline;
private string email;
private string address;
  ContactDetail(string mobile,string alternatemobile,string landline,string email,string address){
    this.mobile=mobile;
    this.altrnatemobile=altrnatemobile;
    this.landline=landline;
    this.email=email;
    this.address=address;
    
  }
    public void setmobile(string mobile){
    this.mobile=mobile;
  }
  public void setaltrnatemobile(string alternatemobile){
    this.altrnatemobile=altrnatemobile
  }
   public void setlandline;(string landline;){
    this.landline=landline;
  }
  public void setemail(string email){
    this.email=email;
  }
public void setemail(string email){
    this.email=email;
  }
  public void getaddress(string address){
    this.address=address;
  }
  
  public string getpassword(){
    return password;
  }
  }
class C20Fri5{
  public static void main(String args[]){
    ContactDetails cd=new ContactDetails("123","456","789","shwetha146@","xyz");
    User us=new User("abc","acs2","123678",c);
    cd.setmobile("123");
    cd.setalternateMobile("456");
    cd.setlandLine("789");
    cd.setemail("shwetha146@");
    cd.setaddress("xyz");
    us.setname("abc");
    us.setusername("acs2");
    us.setpassword("1234678");
    us.setcontactDetails(c);
    System.out.println(cd.getmobile()+" "+cd.getalternateMobile()+" "+cd.getlandLine()+" "cd.getemail()+" "+cd.getaddress());
    System.out.println(us.getname()+" "+us.getusername()+" "+us.getpassword()+" "+us.getcontactDetails());
  }
}
  
   
  }
*/

// Create a class named Pizza that stores information about a single pizza. It should containthe following:  

// 1.Private  instance  variables  to  store  the  size  of  the  pizza  (either  small,  medium,or large), the  number of  cheese toppings, the number of pepperoni toppings, andthe number of ham toppings. 

// 2.Constructor(s) that set all of the instance variables.
// 3.Public methods to get and set the instance variables.
// 4.A public method named calcCost( ) that returns a double that is the cost of the pizza.
// Pizza cost is determined by:
// Small: $10 + $2 per topping
// Medium: $12 + $2 per topping
// Large: $14 + $2 per topping  

//  6.public method named getDescription( ) that returns a String containing the pizzasize, quantity of each topping.
/*
class Pizza {
  private String pizzaSize;
  private int cheeseCount;
  private int pepperoniCount;
  private int hamCount;

  public Pizza() {
    this.pizzaSize = "";
    this.cheeseCount = 0;
    this.pepperoniCount = 0;
    this.hamCount = 0;
  }

  public Pizza(String pizzaSize, int cheeseCount, int pepperoniCount, int hamCount) {
    this.pizzaSize = pizzaSize;
    this.cheeseCount = cheeseCount;
    this.pepperoniCount = pepperoniCount;
    this.hamCount = hamCount;
  }

  public String getPizzaSize() {
    return pizzaSize;
  }

  public void setPizzaSize(String pizzaSize) {
    this.pizzaSize = pizzaSize;
  }

  public int getNumCheeseToppings() {
    return cheeseCount;
  }

  public void setNumCheeseToppings(int cheeseCount) {
    this.cheeseCount = cheeseCount;
  }

  public int getNumPepperoniToppings() {
    return pepperoniCount;
  }

  public void setNumPepperoniToppings(int pepperoniCount) {
    this.pepperoniCount = pepperoniCount;
  }

  public int getNumHmaToppings() {
    return hamCount;
  }

  public void setNumHmaToppings(int hamCount) {
    this.hamCount = hamCount;
  }

  public double calcCost() {
    if (pizzaSize.equals("small")) {
      return 10 + 2*(cheeseCount + pepperoniCount + hamCount);
    } else if (pizzaSize.equals("medium")) {
      return 12 + 2*(cheeseCount + pepperoniCount + hamCount);
    } else if (pizzaSize.equals("large")) {
      return 14 + 2*(cheeseCount + pepperoniCount + hamCount);
    } else {
       return 0.0;
     }
  }

  public String getDescription() {
    return "Pizza size: " + pizzaSize + "\n Cheese toppings: " + cheeseCount + "\n Pepperoni toppings: "
        + pepperoniCount + "\n Ham toppings: " + hamCount + "\n Pizza cost: $" + calcCost() + "\n";
  }
}

public class C20Fri5{
  public static void main(String[] args) {
    Pizza p1 = new Pizza("large", 3, 1, 2);
    Pizza p2 = new Pizza("small", 2, 5, 1);
    Pizza p3 = new Pizza("medium", 4, 2, 3);

    System.out.println(p1.getDescription());
    System.out.println(p2.getDescription());
    System.out.println(p3.getDescription());
  }
}
*/

// A class named Arithmetic with a method named add that takes  integers as parameters and returns an integer denoting their sum.
// A class named Adder that inherits from a superclass named Arithmetic.
// Your classes should not be be .

// Input Format

// You are not responsible for reading any input from stdin; a locked code stub will test your submission by calling the add method on an Adder object and passing it  integer parameters.

// Output Format

// You are not responsible for printing anything to stdout. Your add method must return the sum of its parameters.

// Sample Output

// The main method in the Solution class above should print the following:

// My superclass is: Arithmetic
// 42 13 20

/*
// A class named Arithmetic with a method named add that takes  integers as parameters and returns an integer denoting their sum.

class Arithmetic{
     int add(int a, int b){
        int sum = a + b; 
        return sum;
    }
}

// A class named Adder that inherits from a superclass named Arithmetic.Your classes should not be be .
class Adder extends Arithmetic{
    
}

// The main method in the Solution class above should print the following:

// My superclass is: Arithmetic
// 42 13 20
class C20Fri5{
    public static void main(String []args){
        Adder a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());  
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
     }
}

*/
// Create   a    class    Account    class     with     balance     as     data    member.    Create     twoconstructors  (no argument, and two arguments) and methods to withdraw and depositbalance
/*
class Account{
  int balance;
  Account(){
  
  }
  Account(int balance){
    this.balance=balance;
  }
  public int deposit(int depo){
    return balance+depo;
  }
  public int withdraw(int wit){
    return balance-wit;
    
  }
  
  
}
class C20Fri5{
  public static void main(String args[]) {
        Account ac = new Account(10000);
    System.out.println(ac.withdraw(500));
    System.out.println(ac.deposit(1000));
   
  
}
}
*/

// A Student is an object in a university management System. Analyze the concept andidentify the data members   that   a   Student   class   should   have.   Also   analyze   thebehavior   of  student  in   a   university management System and identify the methodsthat should be included in Student class








   

  

   

