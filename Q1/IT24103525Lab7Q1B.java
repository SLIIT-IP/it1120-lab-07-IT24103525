import java.util.Scanner;

public class IT24103525Lab7Q1B
 {

   public static void main(String[] args) 

  {
    Scanner input = new Scanner(System.in);

    int mark[]=new int[5];
    int i,student;

    for(student=1;student<4;student++)
    {
      System.out.println("Student " + student);
      System.out.print("Enter Marks : ");

      double avg=0, sum=0;

      for(i=1;i<mark.length;i++)
       {
         mark[i] = input.nextInt();
       }

     //calculation
     for(i=1;i<mark.length;i++)

	sum += mark[i];
	avg = sum/4;
        System.out.println("Average is: " + avg);

     if(75<=avg&&avg<100)
        {
          System.out.println("Overall Grade is : Distinction\n");
        }

     else if(50<=avg&&avg<=74)
        {
         System.out.println("Overall Grade is : Credit\n");
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
}
