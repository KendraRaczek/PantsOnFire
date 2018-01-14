import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


/**
 * The Level class is responsible for managing all of the objects in your game.
 * The GameEngine creates a new Level object for each level, and then calls that
 * Level object's update() method repeatedly until it returns either "ADVANCE"
 * (to go to the next level), or "QUIT" (to end the entire game).
 * <br/><br/>
 * This class should contain and use at least the following private fields:
 * <tt><ul>
 * <li>private Random randGen;</li>
 * <li>private Hero hero;</li>
 * <li>private Water[] water;</li>
 * <li>private ArrayList&lt;Pant&gt; pants;</li>
 * <li>private ArrayList&lt;Fireball&gt; fireballs;</li>
 * <li>private ArrayList&lt;Fire&gt; fires;</li>
 * </ul></tt>
 */
public class Level
{
	
//	private Graphic graphic;
//	private float   speed;
//	private int     controlType;
	private Hero hero;
	
	/**
	 * This constructor initializes a new Level object, so that the GameEngine
	 * can begin calling its update() method to advance the game's play.  In
	 * the process of this initialization, all of the objects in the current
	 * level should be instantiated and initialized to their beginning states.
	 * @param randGen is the only Random number generator that should be used
	 * throughout this level, by the Level itself and all of the Objects within.
	 * @param level is a string that either contains the word "RANDOM", or the 
	 * contents of a level file that should be loaded and played. 
	 */
	public Level(Random randGen, String level) 
	{ 
		hero = new Hero
		speed = 0.12f;
		controlType = 3;
		graphic = new Graphic("HERO");
		graphic.setPosition((GameEngine.getWidth())/2, (GameEngine.getHeight())/2);
		// TODO: Implement this method.
		
	}

	/**
	 * The GameEngine calls this method repeatedly to update all of the objects
	 * within your game, and to enforce all of the rules of your game.
	 * @param time is the time in milliseconds that have elapsed since the last
	 * time this method was called.  This can be used to control the speed that
	 * objects are moving within your game.
	 * @return When this method returns "QUIT" the game will end after a short
	 * 3 second pause and a message indicating that the player has lost.  When
	 * this method returns "ADVANCE", a short pause and win message will be 
	 * followed by the creation of a new level which replaces this one.  When
	 * this method returns anything else (including "CONTINUE"), the GameEngine
	 * will simply continue to call this update() method as usual. 
	 */
	public String update(int time) 
	{
		Hero.update(time);
		
		// TODO: Implement this method.
		//right
//		if(controlType == 1) {
//		
//			if(GameEngine.isKeyPressed("D") || GameEngine.isKeyHeld("D")) {
//				graphic.setDirection(graphic.getX()+1 , graphic.getY());
//				graphic.setX(graphic.getX() + (speed * time));
//			}
//			//left
//			if(GameEngine.isKeyPressed("A") || GameEngine.isKeyHeld("A")) {
//				graphic.setDirection(graphic.getX()-1 , graphic.getY());
//				graphic.setX(graphic.getX() - (speed * time));
//			}
//			//up
//			if(GameEngine.isKeyPressed("W") || GameEngine.isKeyHeld("W")) {
//				graphic.setDirection(graphic.getX() , graphic.getY()-1);
//				graphic.setY(graphic.getY() - (speed * time));
//			}
//			//down
//			if(GameEngine.isKeyPressed("S") || GameEngine.isKeyHeld("S")) {
//				graphic.setDirection(graphic.getX() , graphic.getY()+1);
//				graphic.setY(graphic.getY() + (speed * time));
//			}
//		}
//		
//		
//		if(controlType == 2) {
//			graphic.setDirection(GameEngine.getMouseX() , GameEngine.getMouseY());
//			if(GameEngine.isKeyPressed("D") || GameEngine.isKeyHeld("D")) {
//				//graphic.setDirection(GameEngine.getMouseX() , GameEngine.getMouseY());
//				graphic.setX(graphic.getX() + (speed * time));
//			}
//				//left
//			if(GameEngine.isKeyPressed("A") || GameEngine.isKeyHeld("A")) {
//				//graphic.setDirection(GameEngine.getMouseX() , GameEngine.getMouseY());
//				graphic.setX(graphic.getX() - (speed * time));
//			}
//				//up
//			if(GameEngine.isKeyPressed("W") || GameEngine.isKeyHeld("W")) {
//				//graphic.setDirection(GameEngine.getMouseX() , GameEngine.getMouseY());
//				graphic.setY(graphic.getY() - (speed * time));
//			}
//				//down
//			if(GameEngine.isKeyPressed("S") || GameEngine.isKeyHeld("S")) {
//				//graphic.setDirection(GameEngine.getMouseX() , GameEngine.getMouseY());
//				graphic.setY(graphic.getY() + (speed * time));
//			}
//		}
//		
//		if(controlType == 3) {
//			graphic.setDirection(GameEngine.getMouseX() , GameEngine.getMouseY());
//			double distance = Math.sqrt(Math.pow(GameEngine.getMouseX()-graphic.getX(), 2.0)
//					+ Math.pow(GameEngine.getMouseY()-graphic.getY(), 2.0));
//			if (distance <= 20) {
//				
//			}
//			else {
//				double distanceX = graphic.getDirectionX();
//				double distanceY = graphic.getDirectionY();
//				
//				
//				//graphic.setX(Math.sqrt(Math.pow(GameEngine.getMouseX()-graphic.getX(), 2.0) - (speed * time));
//				graphic.setPosition(graphic.getX() + graphic.getDirectionX() * (speed * time), graphic.getY() +graphic.getDirectionY() * (speed * time));
//				
//			}
//		}
//		
//		
//		graphic.draw();
//		
		
		return "CONTINUE"; 
	}	

	/**
	 * This method returns a string of text that will be displayed in the
	 * upper left hand corner of the game window.  Ultimately this text should 
	 * convey the number of unburned pants and fires remaining in the level.  
	 * However, this may also be useful for temporarily displaying messages that 
	 * help you to debug your game.
	 * @return a string of text to be displayed in the upper-left hand corner
	 * of the screen by the GameEngine.
	 */
	public String getHUDMessage() 
	{
		// TODO: Implement this method.
		return ""; 
	}

	/**
	 * This method creates a random level consisting of a single Hero centered
	 * in the middle of the screen, along with 6 randomly positioned Fires,
	 * and 20 randomly positioned Pants.
	 */
	public void createRandomLevel() 
	{ 
		// TODO: Implement this method.		
	}

	/**
	 * This method initializes the current game according to the Object location
	 * descriptions within the level parameter.
	 * @param level is a string containing the contents of a custom level file 
	 * that is read in by the GameEngine.  The contents of this file are then 
	 * passed to Level through its Constructor, and then passed from there to 
	 * here when a custom level is loaded.  You can see the text within these 
	 * level files by dragging them onto the code editing view in Eclipse, or 
	 * by printing out the contents of this level parameter.  Try looking 
	 * through a few of the provided level files to see how they are formatted.
	 * The first line is always the "ControlType: #" where # is either 1, 2, or
	 * 3.  Subsequent lines describe an object TYPE, along with an X and Y 
	 * position, formatted as: "TYPE @ X, Y".  This method should instantiate 
	 * and initialize a new object of the correct type and at the correct 
	 * position for each such line in the level String.
	 */
	public void loadLevel(String level) 
	{ 
		// TODO: Implement this method.		
	}

	/**
	 * This method creates and runs a new GameEngine with its first Level.  Any
	 * command line arguments passed into this program are treated as a list of
	 * custom level filenames that should be played in a particular order.
	 * @param args is the sequence of custom level files to play through.
	 */
	public static void main(String[] args)
	{
		
		GameEngine.start(null,args);
	}
}
