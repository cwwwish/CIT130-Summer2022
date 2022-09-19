import java.util.Scanner;
public class FractionTest {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n1, d1, n2, d2;
       char choice;
      
       System.out.print("Enter the numerator for the target fraction: ");
       n1 = input.nextInt();
      
       System.out.print("Enter the denominator for the target fraction: ");
       d1 = input.nextInt();
      
       Fraction f1 = new Fraction(n1, d1);
          
       do {
           System.out.print("\nEnter the numerator for the next fraction to test: ");
           n2 = input.nextInt();
          
           System.out.print("Enter the denominator for the next fraction to test: ");
           d2 = input.nextInt();
          
           Fraction f2 = new Fraction(n2, d2);
          
           if(f1.equals(f2))
               System.out.println("The fraction you just entered equals the first fraction of " + f1 + ".");
           else
               System.out.println("The fraction you just entered does not equal the first fraction of " + f1 + ".");
          
           System.out.print("Would you like to continue (Y/N)? ");
           choice = input.next().charAt(0);
       }
       
       while(choice == 'y' || choice == 'Y');  
       System.out.println("Process completed.");
   }
}
