
public class Race 
{
	private String name;
	private int athleteMax;
	// anche organizzatore, lista partecipanti, tempi partecipanti
	
	public Race(String name, int athleteMax) 
	{
		super();
		this.name = name;
		this.athleteMax = athleteMax;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAthleteMax() {
		return athleteMax;
	}
	public void setAthleteMax(int athleteMax) {
		this.athleteMax = athleteMax;
	}
	
	
}
