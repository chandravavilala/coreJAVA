import java.util.Scanner;

public class TicketBooking {
	
	public static void main(String args[])
	{
		bookTicket();
	}
	
	static void bookTicket()
	{
		Scanner sc = new Scanner(System.in);
		double ticketCost = 200;
		System.out.println("Enter Number of tickets");
		int n = sc.nextInt();
		double amount = ticketCost * n;
		
		System.out.println("You want to book a ticket press 1 else any number");
		
		int ch = sc.nextInt();
		if (ch == 1)
		{
			String status = payment(amount);
			if (status.equals("Booking sucess"))
			{
				System.out.println(status + "  Reference No " + 12345);
			}
			else
			{
				System.out.println(status);
			}
			
		}else {
			System.out.println("Thank you");
		}
	}
	
	static String payment(double amount)
	{
		double balance = 100;
		
		String status = "";
		if (amount<balance)
		{
			status = "Booking success";
		}
		else 
		{
			status = "Booking fail";
		}
		return status;
	}

}
