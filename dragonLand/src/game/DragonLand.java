/**
 * 
 */
package game;

import guiPractice.GUIApplication;

/**
 * @author Kat
 *
 */
public class DragonLand extends GUIApplication {
	/**
	 * Static Fields
	 */
	public static DragonLand game;
	/**
	 * 
	 */
	public DragonLand() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see guiPractice.GUIApplication#initScreen()
	 */
	@Override
	protected void initScreen() {
		// TODO Auto-generated method stub

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		game = new DragonLand();
		Thread go = new Thread(game);
		go.start();
	}

}
