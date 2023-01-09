//Java program to determine wheather a given matrix identity matrix
class C20Fri{
  public static void main(String[]args){
    int a[][]={{1,0,0},{0,1,0},{0,0,1}};
    int i,j,Flag=1;
    
    for(i=0;i<3;i++){
      for(j=0;j<3;j++){
        if(a[i][j]!=1 && a[i][j]!=0){
          Flag=0;
          break;
        }
      }
    }
    if(Flag==1){
      System.out.println("identity matrix");
    }
    else{
      System.out.println(" not identity matrix");
    }
    
  }
}
