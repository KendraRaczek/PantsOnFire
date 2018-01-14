
public class Hero {

	private Graphic graphic;
	private float   speed;
	private int     controlType;
	
	public Hero(float x, float y, int controlType) {
		
	}
	
	
	public void update(int time){
		if(controlType == 1) {
			
			if(GameEngine.isKeyPressed("D") || GameEngine.isKeyHeld("D")) {
				graphic.setDirection(graphic.getX()+1 , graphic.getY());
				graphic.setX(graphic.getX() + (speed * time));
			}
			//left
			if(GameEngine.isKeyPressed("A") || GameEngine.isKeyHeld("A")) {
				graphic.setDirection(graphic.getX()-1 , graphic.getY());
				graphic.setX(graphic.getX() - (speed * time));
			}
			//up
			if(GameEngine.isKeyPressed("W") || GameEngine.isKeyHeld("W")) {
				graphic.setDirection(graphic.getX() , graphic.getY()-1);
				graphic.setY(graphic.getY() - (speed * time));
			}
			//down
			if(GameEngine.isKeyPressed("S") || GameEngine.isKeyHeld("S")) {
				graphic.setDirection(graphic.getX() , graphic.getY()+1);
				graphic.setY(graphic.getY() + (speed * time));
			}
		}
		
		
		if(controlType == 2) {
			graphic.setDirection(GameEngine.getMouseX() , GameEngine.getMouseY());
			if(GameEngine.isKeyPressed("D") || GameEngine.isKeyHeld("D")) {
				//graphic.setDirection(GameEngine.getMouseX() , GameEngine.getMouseY());
				graphic.setX(graphic.getX() + (speed * time));
			}
				//left
			if(GameEngine.isKeyPressed("A") || GameEngine.isKeyHeld("A")) {
				//graphic.setDirection(GameEngine.getMouseX() , GameEngine.getMouseY());
				graphic.setX(graphic.getX() - (speed * time));
			}
				//up
			if(GameEngine.isKeyPressed("W") || GameEngine.isKeyHeld("W")) {
				//graphic.setDirection(GameEngine.getMouseX() , GameEngine.getMouseY());
				graphic.setY(graphic.getY() - (speed * time));
			}
				//down
			if(GameEngine.isKeyPressed("S") || GameEngine.isKeyHeld("S")) {
				//graphic.setDirection(GameEngine.getMouseX() , GameEngine.getMouseY());
				graphic.setY(graphic.getY() + (speed * time));
			}
		}
		
		if(controlType == 3) {
			graphic.setDirection(GameEngine.getMouseX() , GameEngine.getMouseY());
			double distance = Math.sqrt(Math.pow(GameEngine.getMouseX()-graphic.getX(), 2.0)
					+ Math.pow(GameEngine.getMouseY()-graphic.getY(), 2.0));
			if (distance <= 20) {
				
			}
			else {
				double distanceX = graphic.getDirectionX();
				double distanceY = graphic.getDirectionY();
				
				
				//graphic.setX(Math.sqrt(Math.pow(GameEngine.getMouseX()-graphic.getX(), 2.0) - (speed * time));
				graphic.setPosition(graphic.getX() + graphic.getDirectionX() * (speed * time), graphic.getY() +graphic.getDirectionY() * (speed * time));
				
			}
		}
		
		
		graphic.draw();
		

		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
