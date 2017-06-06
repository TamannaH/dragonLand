/**
 * 
 */
package game;


import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import dragonComponents.ReadFile;
import game.EggIncuabtor.IncubatorScreen;
import game.dragonTrading.TradingScreen;
import game.mainScreenTeam.Dragon;
import game.mainScreenTeam.HomeScreen;
import game.miniGameTeam.GameInstructions;
import game.miniGameTeam.GameScreen;
import game.miniGameTeam.GameVioletta;
import game.miniGameTeam.HighScoreScreen;
import game.newShop.ShopScreen;
import game.newShop.ShopSelectionScreen;


import guiPractice.GUIApplication;
import guiPractice.Screen;
import introScreens.WelcomeScreen;


/**
 * @author Kat
 *
 */
public class DragonLand extends GUIApplication {

	/**
	 * 
	 */
	
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 640;
	private static final long serialVersionUID = 1L;

	public static DragonLand game;
	public static int coins = 3000; 
	public static HomeScreen homeScreen;
	public static Screen shopMain; // shop 1
	//public static Screen sellScreen; // shop 2
	//public static Screen buyScreen; // shop 3
	public static Screen highscoreScreen; // high score
	public static GameScreen miniGameScreen; // minigame
	public static Screen gameInstructionsScreen;
	public static Screen incubator;
	public static Screen HelpScreen;
	public static Color NAVY;
	public static Color BRIGHT_PINK;
	public static Color LIGHT_PINK;
	public static Color LIGHT_NUDE;
	public static Color DARKER_NUDE;
	
	private GameVioletta vGame;
	public WelcomeScreen welcomeScreen;
	public static Color TEXT_PINK;

	public static Screen newShopScreen;
	public static Screen shopScreen;
	public static Screen nameScreen;

	public static TradingScreen tradingScreen;
	public static Screen incubatorScreen;
	static JFileChooser chooser;
	static ReadFile dragonFile;
	
	/**
	 * 
	 */
//	public static void addDragon(AnimatedComponent a){
//		dragonList.add(a);
//	}
	public DragonLand(String[] strings) {
		if(strings != null){
			ArrayList<Dragon> myDragons = new ArrayList<Dragon>();
			ArrayList<Dragon> dragons = new ArrayList<Dragon>();
			ArrayList<Dragon> dragonsToBuy = new ArrayList<Dragon>();
			int x=0;
			
			for(int i=0; i<strings.length; i++){
				String[] str = strings[i].split("''");
				
			}
		}
	}
	
	public DragonLand() {
		//Sound.AMBIANCE.loop();
				//
	}
	/* (non-Javadoc)
	 * @see guiPractice.GUIApplication#initScreen()
	 */
	@Override
	protected void initScreen() {
		initColors();


		miniGameScreen = new GameScreen(WIDTH, HEIGHT);
		shopMain = new ShopSelectionScreen(WIDTH, HEIGHT);
		newShopScreen = new ShopScreen(WIDTH, HEIGHT); 
		homeScreen = new HomeScreen(WIDTH, HEIGHT);
		highscoreScreen = new HighScoreScreen(WIDTH, HEIGHT);
		HomeScreen.jenCode = new game.mainScreenTeam.HomeJenniber();

		welcomeScreen = new WelcomeScreen(WIDTH, HEIGHT);
//		incubator = new IncubatorScreen(viewObjects);
		gameInstructionsScreen = new GameInstructions(WIDTH, HEIGHT);
		tradingScreen = new TradingScreen(WIDTH, HEIGHT);
		vGame = new GameVioletta();
		incubatorScreen = new IncubatorScreen(WIDTH, HEIGHT);
		setScreen(welcomeScreen);

	}
	private void initColors() {
		NAVY = new Color(62,74,99);
		BRIGHT_PINK = new Color(224,102,102);
		LIGHT_PINK = new Color(248,186,182);
		LIGHT_NUDE = new Color(244,215,183);
		DARKER_NUDE = new Color(230,195,147);
		TEXT_PINK = new Color(255,218,238);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
//			ReadFile file = new ReadFile("C:/Users/Student 8/Desktop/test.txt");
			
			JButton open = new JButton();
			chooser=new JFileChooser();
//			chooser.setCurrentDirectory(new java.io.File("C:/Users/student 8/Desktop"));
			chooser.setDialogTitle("Pick a saved file");
			if(chooser.showOpenDialog(open)== JFileChooser.APPROVE_OPTION){
				//Open JFileChooser
			}
			dragonFile = new ReadFile(chooser.getSelectedFile().getPath());
			
			game = new DragonLand(dragonFile.OpenFile());
			Thread go = new Thread(game);
			go.start();
			
			System.out.print(chooser.getSelectedFile().getPath());
		}catch
		(IOException e){
			game = new DragonLand(null);
			Thread go = new Thread(game);
			go.start();
		}
	}
	
//	public static void jFileChoose(){
//		JButton open = new JButton();
//		chooser=new JFileChooser("Pick a saved file");
//		chooser.setDialogTitle("Hello World");
//		chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
////		System.out.print(chooser.getSelectedFile().getPath());
//	}
	
	//public coin getter + setter
		public void setCoins(int x){
			coins = x;
		}
		public int getCoins(){
			return coins;
		}

		public GameVioletta getViolettaGame() {
			return vGame;
		}

}
