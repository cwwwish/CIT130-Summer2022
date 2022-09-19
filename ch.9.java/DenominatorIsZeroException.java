import java.util.Scanner;
import java.lang.Exception;

public class DenominatorIsZeroException extends Exception {
    DenominatorIsZeroException(String message) {
        super(message);
    }
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         fraction f = new fraction();
       
        System.out.printf("Please enter the numerator:");
        int num = input.nextInt();
        f.setNumerator(num);
        System.out.printf("Please enter the denominator:");
        int den = input.nextInt();

        try {  
            if(den==0)
                throw new DenominatorIsZeroException("Denominator cannot be zero.");
            f.setDenominator(den);
        }
        catch(DenominatorIsZeroException e) {
            System.out.println(e.getMessage());
            System.out.printf("Please enter the denominator:");
            den = input.nextInt();
            f.setDenominator(den);
        }
      
        System.out.println("Numerator is: "+f.getNumerator()+"\nDenominator is: "+f.getDenominator());
      
    }
  
      
}
