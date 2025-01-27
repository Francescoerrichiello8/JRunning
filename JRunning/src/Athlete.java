
public class Athlete extends Person
{	

	private String category;
	private double record;
	
	public Athlete(String name, String lastname, String category, double record) 
	{
		super(name, lastname);
		this.category = category;
		this.record = record;
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
