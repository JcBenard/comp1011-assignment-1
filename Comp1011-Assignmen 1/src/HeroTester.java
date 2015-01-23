/**
 * @author Jean-Claude Benard
 * @version 5 - Completed tester class and fixed errors in hero class
 * Program Description: Test the creation of the hero object and the assiociated methods
 */
public class HeroTester {

	public static void main(String[] args) {
		
		Hero solidus = new Hero("Solidus");
		Hero snake = new Hero("Snake");

		solidus.show();
		
		while(solidus.fight() == false){			
		}	
		
		snake.show();
		
		while(snake.fight() == false){			
		}
	}
}
