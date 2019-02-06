/**
 * Class representing a superhero.
 * 
 * @author Aaron Craig
 * @version 2019-01-17
 */
public class Hero {
	
	/**
	 * Name of the Hero, capitalized
	 */
	private String name;
	
	/**
	 * Array of Size three, contains:
	 * -Height
	 * -Weight
	 * -BMI
	 */
	private String[] stats;
	
	/** added text
	 * Construct a hero from an information string
	 * 
	 * @param information contains information about te hero in the form:
	 *  hero in form: "Name/Height/Weight"
	 */
	public Hero(String information) 
	{
		//Split the information
		String[] temp = information.split("/");
		
		//Assign variables from temporary array
		name = temp[0];
		stats = new String[3];
		stats[0] = temp[1];
		stats[1] = temp[2];
		
		//Calculate BMI
		double height = Double.parseDouble(temp[1]);
		double weight = Double.parseDouble(temp[2]);
		double bmi = weight / (height * height) * 1000;
		
		//Convert bmi to string and assign it
		stats[2] = "" + bmi;
	}
	
	/**
	 * Returns description of the hero. String of the format:
	 * "Name: (name), Height: (height)cm, Weight: (weight) kg, BMI: (bmi)kg/m^2"
	 */
	@Override
	public String toString()
	{
		return String.format("Name: %s, Height: %s cm, Weight: %s kg, BMI: %s kg/m^2",name, stats[0], stats[1], stats[2]);
	}
}
