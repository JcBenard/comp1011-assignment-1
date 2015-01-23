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
	public Hero(String name){
		this.name = name;
		
		generateAbilities();
	}
	
	//private methods////////////////////////////////////////////////////////////////////////////
	private void generateAbilities(){
		this.strength = (int)(Math.random() * 100) + 1;
		this.speed = (int)(Math.random() * 100) + 1;
		this.health = (int)(Math.random() * 100) + 1;
	}
	
	public void fight(){
		if(hitAttempt() == false){
			System.out.println(this.name + " has hit the opponent dealing " + hitDamage() + " damage.")
		}else{
			System.out.println(this.name + " has missed the opponent.")
		}
	}
}
