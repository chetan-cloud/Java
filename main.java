package sportsteamroster;

public class main {

	public static void main(String args[]) 
	{
		person player1 = new person("Jeff", "425-435-3245", "4/27/1989", 7);
		person player2 = new person("Bob", "425-766-2435", "1/27/1999", 4);
		person player3 = new person("Russell", "425-546-4675", "3/27/2001", 5);
		person player4 = new person("Henry", "425-546-7688", "9/27/1994", 45);
		person player5 = new person("Nolan", "425-789-6575", "11/27/1995", 67);
		team ateam = new team("Seahawks", "Pete", "NFC West");
		
		System.out.println("Team: "+ ateam.getTeamName() +", Coach: "+ ateam.getCoachName() +", Conference: " + ateam.getConferenceName());
		System.out.println("Player: " + player1.getName() +", Number: " +player1.getNumber() + ", Birth Date " + player1.getBirthDate() + ", Jersey Number "+ player1.getJersey());
		System.out.println("Player: " + player2.getName() +", Number: " +player2.getNumber() + ", Birth Date " + player2.getBirthDate() + ", Jersey Number "+ player2.getJersey());
		System.out.println("Player: " + player3.getName() +", Number: " +player3.getNumber() + ", Birth Date " + player3.getBirthDate() + ", Jersey Number "+ player3.getJersey());
		System.out.println("Player: " + player4.getName() +", Number: " +player4.getNumber() + ", Birth Date " + player4.getBirthDate() + ", Jersey Number "+ player4.getJersey());
		System.out.println("Player: " + player5.getName() +", Number: " +player5.getNumber() + ", Birth Date " + player5.getBirthDate() + ", Jersey Number "+ player5.getJersey());
		
		
	}


}
