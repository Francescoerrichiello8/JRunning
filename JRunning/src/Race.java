import java.util.ArrayList;

public class Race 
{
	private String name;
	private int athleteMax;
	private Organizer organizer;
	private ArrayList<Athlete> partecipanti1;
	private ArrayList<Athlete> partecipanti2;
	
	public Race(String name, int athleteMax, Organizer organizer) 
	{
		super();
		this.name = name;
		this.athleteMax = athleteMax;
		this.organizer = organizer;
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

	public Organizer getOrganizer() {
		return organizer;
	}

	public void setOrganizer(Organizer organizer) {
		this.organizer = organizer;
	}

	public ArrayList<Athlete> getPartecipanti1() {
		return partecipanti1;
	}

	public void setPartecipanti1(ArrayList<Athlete> partecipanti1) {
		this.partecipanti1 = partecipanti1;
	}

	public ArrayList<Athlete> getPartecipanti2() {
		return partecipanti2;
	}

	public void setPartecipanti2(ArrayList<Athlete> partecipanti2) {
		this.partecipanti2 = partecipanti2;
	}
	
	
	
	
}
