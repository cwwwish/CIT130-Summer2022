import java.util.Scanner;

public class SieveOfEratosthenes
{

public static void main(String args[])
{
   //Declaring variables
int number;

//Scanner object is used to get the inputs entered by the user.
Scanner sc=new Scanner(System.in);

//This loop will continue to execute until user enters valid number greater than 2
while(true)
{
   //Getting the number entered by the user.
System.out.print("Enter the highest number to check (must be higher than 2):");
number=sc.nextInt();

/* Checking the number is less than or equal to 2 or not
* If yes, Display the Error message
* if not,Print all the Prime Numbers
*/
if(number<=2)
{
   //Displaying the error Message
   System.out.println(":: Invalid Number.Enter Number Greater than 2 ::");
   continue;
}
else
{
  
   System.out.print("The prime numbers between 2 and "+number+" are:");
     
   //Creating the SieveOfEratosthenes Object
   SieveOfEratosthenes soe = new SieveOfEratosthenes();
     
   //Calling the method primeSieve() on the SieveOfEratosthenes Object
   soe.primeSieve(number);
   System.out.println("Process Completed.");
   break;
}       
}


}

private void primeSieve(int number) {
   //Creating an Boolean array
   boolean primeNumbers[] = new boolean[number+1];
     
   //Populating the primeNumbers array with boolean value true.
   for(int i=0;i<number;i++)
       primeNumbers[i] = true;
  
   //This loop will make all every number multiples to false
   for(int k = 2; k*k <=number; k++)
   {
   //Checking whether the element of an array is true or not
   if(primeNumbers[k] == true)
   {
   /* this loop will make all multiples
   * of every number in array to false
   */
   for(int i = k*2; i <= number; i += k)
       primeNumbers[i] = false;
   }
   }
  
   /*
   * This loop will print all the prime numbers
   * whose elements of primeNumbers are true.
   */
   for(int i = 2; i <= number; i++)
   {
   if(primeNumbers[i] == true)
   System.out.print(i + " ");
   }
   }
  
}


