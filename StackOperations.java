/* JFM1T10_Assignment4:

     Create an interface named MyStack in package MyCollection with following methods- 
     void push(int I) 
     int pop() 
     Create two sub classes inheriting the MyStack interface.  
   1.class FixedStack that can accept a fixed numbers of integers. 
     The size of the Stack will be specified in the constructor. 
     If the number of integers exceed the size, “Stack overflow” message should be displayed. 
   2.class VariableStack that can accept numbers more than its size. 
     The size of the Stack will be specified in the constructor. 
     If the number of integers exceed the size, the stack should automatically grow to accommodate the new element. 
     Make a program that checks the implementation of both the classes. 
     Prompt the user for the  values to be input from the terminal.

     Sample Input:
     Enter a a few comma separated integers (Ex: 1,7,4)
     1,2,3,4,5

     Expected Output:
     Fixed Stack Overflows. Failed to push the integer:4
     Dynamic Stack Overflow. Increasing the stack length...Done
     Fixed Stack Overflows. Failed to push the integer:5
     Dynamic Stack Overflow. Increasing the stack length...Done
     Printing all elements of Fixed Stack
     3
     2
     1
     Printing all elements of Dynamic Stack
     5
     4
     3
     2
     1

*/
interface mystack{
    public void push(int data);
    public int pop();
}
class FixedStack implements mystack{
    int stack[]=new int[3];
    int tos;
    FixedStack(){
        tos=-1;
    }
    public void push(int data){
        
    if(tos >=2){
        System.out.println("Fixedstack over flow ....Failed to push "+data);
    }
    else{
        tos++;
        stack[tos]=data;
    }
        
        
    }
    public int pop(){
        
        if(tos<=-1){
            System.out.println("Stack is under flow");
            return 0;
        }
        else{
            return stack[tos--];
        }
    }
    public void display(){
        for(int i=2;i>=0;i--){
             System.out.println(stack[i]);
        }
    }
    
}
class DynamicStack implements mystack{
    int stack[];
    int tos;
  int capacity;
    
    DynamicStack(int size){
      stack=new int[size];
         tos=-1;
          capacity=size;
   }
    
    public void push(int data){
        if(isFull()){
          int i;
          capacity=capacity+1;
          int [] newStack=new int[capacity];
          for( i=0;i<stack.length;i++){
            newStack[i]=stack[i];
          }
          newStack[i]=data;
          stack=newStack;
          tos++;
            System.out.println("Dynamic Stack Overflow. Increasing the stack length...Done");
        }else{
            tos++;
            stack[tos]=data;
            
        }
        
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            return stack[tos--];
        }
        
    }
  public boolean isEmpty(){
    return tos==-1;
  }
  public boolean isFull(){
    return tos>=stack.length-1;
  }
   public void display(){
     for(int i=capacity-1;i>=0;i--){
       System.out.println(stack[i]);
     }
   }
  
    
}
public class StackOperations
{
    public static void main(String[] args) {
    FixedStack obj=new FixedStack();
    DynamicStack obj1=new DynamicStack(3);
    for(int i=1;i<6;i++){
        obj.push(i);
        obj1.push(i);
    }
    
    System.out.println("Printing all elements of Fixed Stack :");
    
    obj.display();
    
    System.out.println("Printing all elements of Dynamic Stack :");
    
    obj1.display();
}
}