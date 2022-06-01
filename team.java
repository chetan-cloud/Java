package sportsteamroster;

public class team 
{
	private String teamName;
	private String coachName;
	private String conferenceName;
	
	public team(String teamName, String coachName, String conferenceName)
	{
		this.teamName = teamName;
		this.coachName = coachName;
		this.conferenceName = conferenceName;
	}
	public String getTeamName()
	{
		return teamName;
	}
	public String getCoachName()
	{
		return coachName;
	}
	public String getConferenceName()
	{
		return conferenceName;
	}
}
