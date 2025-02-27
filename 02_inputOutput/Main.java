
import java.util.Scanner; // or taking input has to import scanner class
/**
 *Difference between println(), print() and printf()
  print() - It prints string inside the quotes.
  println() - It prints string inside the quotes similar like print() method. Then the cursor moves to the beginning of the next line.
  printf() - It provides string formatting
 */
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        // *Input for String
        // String s = sc.nextLine();
        // String s = sc.next();
        // see the deifferance between sc.next() and sc.nextLine() || take input --> rohan maiti
        // System.out.println(s);

        

        // ** INPUT NUMBER
        // ** INTEGER
        // System.ouseveral words are used to form the name of t.println("Enter a Integer - ");
        // int n = sc.nextInt();
        // float n2 = sc.nextInt();
        // System.out.println(n2);
        // System.out.println("output of input integer is = "+n);
        // **FLOAT
        // System.out.println("Enter a Float number - ");
        // float n = sc.nextFloat();
        // System.out.println("output of input float is = "+n);
        // **SAME FOR OTHER DATA TYPES
        /*
         * xxxx variableName = sc.nextXxxx(); 
         * short a = sc.nextShort();
         */
        // ** INPUT CHARACTER
        // System.out.println("Enter charater");
        // char ch = sc.next().charAt(0);
        // System.out.println("input character is "+ch);

        // ** to print ascaii value of character
        char c = '0';
        System.out.println((int)c);
 
    }
}