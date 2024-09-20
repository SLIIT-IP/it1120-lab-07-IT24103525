import java.util.Scanner;

public class IT24103525Lab7Q3 
{
    public static void main(String[]args) 
  {

     //create a scanner object to read inputs
     Scanner input = new Scanner(System.in);

    final double DIS = 0.05;
    final double DI = 0.95;
    int customer;


    for(customer=1;customer<6;customer++)
    {
      System.out.println("Customer " + customer);

      System.out.print("Enter total bill amount : ");
      double total = input.nextDouble(); 

      System.out.print("Enter mode of payment (C for cash, O for other): ");
      char methord = input.next().charAt(0);
     
       if(methord =='C'||methord =='c')
        {
          System.out.println("Discount is: "+ total*DIS);
	  System.out.println("Amount to be paid: "+total*DI+"\n");
	}
 
       else if(methord =='O'|| methord=='o')
	{
	  System.out.println("No Discount is applicable");
	  System.out.println("Amount to be paid: "+total+"\n");
	}
	
       else
	{
	 System.out.println("Payment Mode is not valid\n");
	}

      }
   

  }

}      
