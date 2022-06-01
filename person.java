package sportsteamroster;

public class person 
{
	private String name;
	private String number;
	private String birthDate;
	private int jersey;
	
	public person(String name, String number, String birthDate, int jersey)
	{
		this.name = name;
		this.number = number;
		this.birthDate = birthDate;
		this.jersey = jersey;
	}
	public String getName()
	{
		return name;
	}
	public String getNumber()
	{
		return number;
	}
	public String getBirthDate()
	{
		return birthDate;
	}
	public int getJersey()
	{
		return jersey;
	}
}
