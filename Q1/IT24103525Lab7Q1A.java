import java.util.Scanner;

public class IT24103525Lab7Q1A 
{
    public static void main(String[]args) 
  {

     //create a scanner object to read inputs
     Scanner input = new Scanner(System.in);

     int mark[] = new int[5];
     int i;
     double avg=0, sum=0;

     System.out.println("Enter the number marks for four subjects: " );

     for(i=1;i<mark.length;i++)
       {
         System.out.print("Enter subject Mark "+i+" :");
         mark[i] = input.nextInt();
       }

     //calculation
     for(i=1;i<mark.length;i++)

	sum += mark[i];
	avg = sum/4;
        System.out.println("Average is: " + avg);

       
     if(75<=avg&&avg<100)
        {
          System.out.print("Overall Grade is : Distinction\n");
        }

     else if(50<=avg&&avg<=74)
        {
         System.out.print("Overall Grade is : Credit\n");
        }
 
     else if(0<=avg&&avg<=49)
        {
         System.out.println("Overall Grade is : Fail\n");
        }
  
     else
        {

        }       

   }
}