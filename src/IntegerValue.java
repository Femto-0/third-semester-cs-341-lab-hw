import java.util.Scanner;

public class IntegerValue {
    int integer;
    Scanner sc = new Scanner(System.in);

    public int askForInteger() {
        System.out.print("Enter the Integer:");
        integer = sc.nextInt();
        return integer;
    }

    public void convertToBinary(int x) {
        x = integer;
        int mod = 0;
        StringBuilder sb = new StringBuilder();
        System.out.print("Binary equivalent of " + x + " is: ");
        while (x >= 1) {
            mod = x % 2; //records the remainder
            String newMod = String.valueOf(mod); //converting mod from int to String so that we can use StringBuilder
            sb.append(newMod);
            x /= 2;
        }
        System.out.println(sb.reverse());//printing the result
    }

    public void allTheBinaryNumbers(int x) {
        for (int i = integer; i > 0; i--) {
            integer = i;
            convertToBinary(i); //converting the numbers to Binary
        }
    }

    public void convertToHexaDecimalNumbers(int x){
        StringBuilder sb= new StringBuilder();
        while(x>=1){
            int  mod= x%16;
             x/=16;
            String alphabet="A";
            if(mod==10){
               alphabet="A";
            } else if(mod==11){
               alphabet="B";
            }else if(mod==12){
                alphabet="C";
            }else if(mod==13){
                 alphabet="D";
            }else if(mod==14){
                alphabet="E";
            }else if(mod==15){
                alphabet="F";
            }
            if(mod>=10){
                sb.append(alphabet);
            }else {
                sb.append(mod);
            }
        }
        System.out.println("The corresponding hexadecimal number for integer "+integer+" is: "+ sb.reverse());
    }
    public void allTheHexaDecimalNumbers(int x){
        for (int i=integer;i>0;i--){
            integer=i;
            convertToHexaDecimalNumbers(i);

        }
    }


    public static void main(String[] args) {
        IntegerValue iv = new IntegerValue();
        iv.convertToBinary(iv.askForInteger());
        System.out.println("--------To get a list of all the Binary numbers from 0-REQUIRED INTEGER--------");
        iv.allTheBinaryNumbers(iv.askForInteger());
        System.out.println("--------To get a list of all the Hexadecimal numbers from 0-REQUIRED INTEGER--------");
        iv.allTheHexaDecimalNumbers(iv.askForInteger());
    }
}
