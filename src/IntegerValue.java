import java.util.Scanner;

public class IntegerValue {
    int integer;
    Scanner sc= new Scanner(System.in);
     public int askForInteger() {
         System.out.print("Enter the Integer:");
       integer= sc.nextInt();
         return integer;
     }
     public void convertToBinary(int x){
         x=integer;
         int mod=0;
         StringBuilder sb= new StringBuilder();
         System.out.print("Binary equivalent of "+ x +" is: ");
      while(x>=1){
      mod=x%2; //records the remainder
          String newMod= String.valueOf(mod); //converting mod from int to String so that we can use StringBuilder
          sb.append(newMod);
      x/=2;
 }
      System.out.println(sb.reverse());//printing the result
         }
      public void allTheBinaryNumbers(int x){
    for( int i=integer; i>0;i--){
        integer=i;
      convertToBinary(i); //converting the numbers to Binary
  }
     }

    public static void main(String[] args) {
        IntegerValue iv= new IntegerValue();
        iv.convertToBinary(iv.askForInteger());
        System.out.println("--------To get a list of all the Binary numbers from 0-REQUIRED INTEGER--------");
        iv.allTheBinaryNumbers(iv.askForInteger());
    }
}
