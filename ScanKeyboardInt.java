import java.util.*; // allows use of a scanner

public class ScanKeyboardInt 
{
    public static void main(String args[]) 
    {
      Scanner keyboard = new Scanner(System.in);
      int num1,num2;
      int sum;

      System.out.print("Enter an integer: ");
      num1 = keyboard.nextInt();
      
      System.out.print("Enter another integer: ");
      num2 = keyboard.nextInt();
      
      sum = num1 + num2;
      
      System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
    }//end method main
}//end class ScanKeyboardInt