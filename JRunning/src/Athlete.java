
public class Athlete 
{	
	private String name;
	private String lastname;
	private String category;
	private double record;
	
	public Athlete(String name, String lastname, String category, double record) 
	{
		super();
		this.name = name;
		this.lastname = lastname;
		this.category = category;
		this.record = record;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getRecord() {
		return record;
	}
	public void setRecord(double record) {
		this.record = record;
	}
	
	

}
