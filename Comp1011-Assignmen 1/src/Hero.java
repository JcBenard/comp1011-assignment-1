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
	
	//public methods///////////////////////////////////////////////////////////////////////////////
	public void fight(){
		if(hitAttempt() == false){
			System.out.println(this.name + " has hit the opponent dealing " + hitDamage() + " damage.");
		}else{
			System.out.println(this.name + " has missed the opponent.");
		}
	}
	
	public void show(){
		System.out.println("Name: " + this.name + "/nStrength: " + this.strength + "/nSpeed: " + this.speed + "/nHealth: " + this.health);
	}
	
	//private methods////////////////////////////////////////////////////////////////////////////
	private void generateAbilities(){
		this.strength = (int)(Math.random() * 100) + 1;
		this.speed = (int)(Math.random() * 100) + 1;
		this.health = (int)(Math.random() * 100) + 1;
	}
		
	private boolean hitAttempt(){
		if(Math.random() >= 80){
			return true;
		}else{
			return false;
		}
	}
	
	private int hitDamage(){
		return ((int)(Math.random() * 6) + 1) * this.strength;
	}
}
