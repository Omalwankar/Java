public class Game {
	static int bagX = 200, bagY = 500;
	static int presentX = 0, presentY = 0;
	static int bombX = 0, bombY = 0;
	
	static int presentCaught = 0;
	public static void main(String[] args) {
		Zen.create(400, 600);
		
		while(true) {
			drawBackground();
			drawPresent();
			drawBomb();
			drawBag();
			
			movePresent();
			moveBomb();
			moveBag();
			
			if (bombInBag()) {
				// You die!
			}
			if(presentInBag()) {
				presentCaught++;
				resetPresent();
				}
			
			Zen.flipBuffer();
			Zen.sleep(33);
		}
	}
	private static void resetPresent() {
		presentY = -50;
		presentX = (int) (Math.random() * 400);
		
	}
	public static void drawBag() {
		Zen.setColor(42, 23, 215);
		Zen.fillRect(bagX-50, bagY, 100, 50);
		Zen.setColor(42, 23, 215);
		Zen.fillOval(bagX-50,bagY+40, 100, 20);
		Zen.fillOval(bagX-50, bagY-10, 100, 20);
	}
	public static void moveBag() {
		if (Zen.isKeyPressed('z')) {
			bagX = bagX-5;
		}
		if (Zen.isKeyPressed('x')) {
			bagX = bagX+5; 
		}
	}
	public static void drawPresent() {
		Zen.setColor(29, 245, 18); 
		Zen.fillRect(presentX+200, presentY-150, 50, 50);
		Zen.fillRect(presentX-5, presentY-27,50,50);
		Zen.fillRect(presentX-27, presentY-5, 0, 0);
	}
	public static void movePresent() {
		presentY = presentY + 5;
	}
	public static void dropPresent() {
		
	}
	public static boolean presentInBag() {
		if(Math.sqrt(Math.pow(bagX-presentX,2) + Math.pow(bagY- presentY, 2)) < 50) {
			return true;
		}
		return false;
	}
	public static boolean bombInBag() {
		return false;
	}
	public static void drawBackground() {
		Zen.setColor(0, 0, 0);
		Zen.fillRect(0, 0, 400, 600);
		Zen.setColor(255, 255, 255);
		Zen.setFont("Helvetica-32"); 
		Zen.drawText("Presents: " + presentCaught, 200, 50);
	}
	
	public static void drawBomb() {
		
	}
	public static void moveBomb() {
		
	}
	public static void dropBomb() {
		
	}
	/*public static boolean presentAtBottom() {
		if (presentY > 600) {
			return true;
		}
		return false;
	}  */ 
	
}
