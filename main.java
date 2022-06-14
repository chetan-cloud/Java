package sportsteamroster;
import java.util.ArrayList;
import java.util.Scanner;
public class main {

	public static void main(String args[]) 
	{
		
		person player1 = new person("Jeff", "425-435-3245", "4/27/1989", 7);
		person player2 = new person("Bob", "425-766-2435", "1/27/1999", 4);
		person player3 = new person("Russell", "425-546-4675", "3/27/2001", 5);
		person player4 = new person("Henry", "425-546-7688", "9/27/1994", 45);
		person player5 = new person("Nolan", "425-789-6575", "11/27/1995", 67);
		team ateam = new team("Seahawks", "Pete", "NFC West");
		
		Scanner input = new Scanner(System.in);
		System.out.println("1. Find person on roster: \n2. Display Roster: \n3. Quit: ");
		
		
		while (true) 
		{
			System.out.println("Enter choice: ");
			int choice = input.nextInt();
			if (choice == 1) 
			{
				Scanner input1 = new Scanner(System.in);
				System.out.println("\nEnter name of person to search for: ");
				String name = input1.nextLine();
				if (name == player1.getName())
				{
					System.out.println("Person located");
					System.out.println("Name: " + player1.getName());
					System.out.println("Phone Number: " + player1.getNumber());
					System.out.println("Birth Date: " + player1.getBirthDate());
					System.out.println("Jersey Number: " + player1.getJersey());
				}
				else if (name == player2.getName())
				{
					System.out.println("Person located");
					System.out.println("Name: " + player2.getName());
					System.out.println("Phone Number: " + player2.getNumber());
					System.out.println("Birth Date: " + player2.getBirthDate());
					System.out.println("Jersey Number: " + player2.getJersey());
				}
				else if (name == player3.getName())
				{
					System.out.println("Person located");
					System.out.println("Name: " + player3.getName());
					System.out.println("Phone Number: " + player3.getNumber());
					System.out.println("Birth Date: " + player3.getBirthDate());
					System.out.println("Jersey Number: " + player3.getJersey());
				}		
				else if (name == player4.getName())
				{
					System.out.println("Person located");
					System.out.println("Name: " + player4.getName());
					System.out.println("Phone Number: " + player4.getNumber());
					System.out.println("Birth Date: " + player4.getBirthDate());
					System.out.println("Jersey Number: " + player4.getJersey());
				}
				else if (name == player5.getName())
				{
					System.out.println("Person located");
					System.out.println("Name: " + player5.getName());
					System.out.println("Phone Number: " + player5.getNumber());
					System.out.println("Birth Date: " + player5.getBirthDate());
					System.out.println("Jersey Number: " + player5.getJersey());
				}
				

			}
			else if (choice == 2)
			{
				System.out.println("Team: "+ ateam.getTeamName() +", Coach: "+ ateam.getCoachName() +", Conference: " + ateam.getConferenceName());
				System.out.println("Player: " + player1.getName() +", Number: " +player1.getNumber() + ", Birth Date " + player1.getBirthDate() + ", Jersey Number "+ player1.getJersey());
				System.out.println("Player: " + player2.getName() +", Number: " +player2.getNumber() + ", Birth Date " + player2.getBirthDate() + ", Jersey Number "+ player2.getJersey());
				System.out.println("Player: " + player3.getName() +", Number: " +player3.getNumber() + ", Birth Date " + player3.getBirthDate() + ", Jersey Number "+ player3.getJersey());
				System.out.println("Player: " + player4.getName() +", Number: " +player4.getNumber() + ", Birth Date " + player4.getBirthDate() + ", Jersey Number "+ player4.getJersey());
				System.out.println("Player: " + player5.getName() +", Number: " +player5.getNumber() + ", Birth Date " + player5.getBirthDate() + ", Jersey Number "+ player5.getJersey());
			}
			else if (choice == 3) 
			{
				break;
			}
			else 
			{
				System.out.println("Invalid Input, Please Try Aagin");
			}
		}
		
	}
	public void locate()
	{
		
	}
}
