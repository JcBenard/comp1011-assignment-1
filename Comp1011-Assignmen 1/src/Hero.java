/**
 * @author Jean-Claude Benard
 * Program Description: Create a hero object and its associated methods
 */
public class Hero {
	
	//private properties///////////////////////////////////////////////////////////////////////////
	private int strength;
	private int speed;
	private int health;
	
	//public properties////////////////////////////////////////////////////////////////////////////
	public String name;
	
	//constructor/////////////////////////////////////////////////////////////////////////////////
	public void Hero(String name){
		this.name = name;
		
		generateAbilities();
	}
}
