package fixtures;

public abstract class Fixture {
	
	private String name; //a short name (title of fixture)
	
	private String shortDescription; // one sentence description
	
	private String longDescription; //paragraph description when 
	//player is in a room
	
	
	
	//Constructors
	public Fixture(String name, String shortDescription, String longDescription) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	
	
	// getters and setters for name, short and long descriptions

	public String getName() {
		return name;
	}

	

	public String getShortDescription() {
		return shortDescription;
	}

	

	public String getLongDescription() {
		return longDescription;
	}

	
	
	

}
