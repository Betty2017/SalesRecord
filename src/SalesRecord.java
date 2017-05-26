import java.util.Scanner;

public class SalesRecord
{

	public static void main(String[] args)
	{
		
		double TotalAmount = 0.0;
		 String choice ="y";
		 
		 
		Scanner keyboard = new Scanner(System.in);
		
		
		while (choice.equalsIgnoreCase("y"))
		{
		
		
		System.out.println("Enter Customer ID");
		int id = keyboard.nextInt();
		
		System.out.println("Enter Customer Name");
		String name = keyboard.next();
		
		System.out.println("Enter the Sales Amount");
		int Sales = keyboard.nextInt();
				
		System.out.println("Enter Tax Code");
		String code = keyboard.next();
		
		if (code.equals("NPF"))
		{
			TotalAmount = (Sales);
		System.out.println(TotalAmount);
		
		
			
		}
		else if (code.equals("NRM"))
		{
			TotalAmount = ((Sales*0.06)+ Sales);
		
			
		}
		else if (code.equals("BIZ"))
		{
			TotalAmount = ((Sales*0.045)+ Sales);
		
		}
		
		
        System.out.println(TotalAmount);
		
		System.out.println("Customer ID:"+ id);
		System.out.println("Customer Name: "+ name);
		System.out.println("Sales Amount:" + Sales);
		System.out.println("Tax Code:"+ code);
		System.out.println("Total Amount:"+ TotalAmount);
		System.out.println("Do you want to enter another record? (Y/N)");
		choice = keyboard.next();
			
	}

}
	
	
}
