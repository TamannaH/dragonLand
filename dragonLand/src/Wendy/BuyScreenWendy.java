package Wendy;

import java.util.ArrayList;

import dragonComponents.Dragon;
import dragonComponents.DragonLabel;
import dragonComponents.PriceLabel;
import dragonComponents.ShopBackdrop;
import game.ShopScreen;
import guiPractice.components.Action;
import guiPractice.components.Visible;

public class BuyScreenWendy extends ShopScreen{
	
	 private ArrayList<Dragon> dragonsInShop;
	    private ArrayList<DragonLabel> shoplabels; 
	    private DragonLabel label;
	    private Dragon[] dragons;
	    
	    private int price;
	    private PriceLabel priceLabel;
	   // private Dragon sold;
	    private int x;
		private	int y;

	public BuyScreenWendy(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub

	}

	@Override
	public void addDragonLabels(ArrayList<Visible> visible) {
		// TODO Auto-generated method stub
		dragons = new Dragon[3];
		for(int i= 0; i< dragons.length;i++)
		{
			dragons[i] = new Dragon(50, 50, 50, 50, "Nice Dragon", 100, "img/dragon9.png");
		}
		
		x = 0;
		y = 170;
		
		shoplabels = new ArrayList<DragonLabel>();
		dragonsInShop = new ArrayList<Dragon>();
		for(int i = 0; i<dragons.length;i++)
		{
			ShopBackdrop labelBack = new ShopBackdrop(150,y,getWidth()-300,getHeight()/7);
			label = new DragonLabel(x,y, dragons[i],"BUY", new Action(){
				
				public void act() {
					// TODO Auto-generated method stub
					shoplabels.remove(label);
					dragonsInShop.remove(this);	
					visible.remove(labelBack);
					visible.remove(label.getDragonImg());
					visible.remove(label.getDragonName());
					visible.remove(label.getDragonPrice().getCoin());
					visible.remove(label.getDragonPrice().getPriceLabel());
					visible.remove(label.getButton());
					//DragonLand.coins -= this.priceLabel.getPrice();
					//DragonLand.game.setScreen(DragonLand.homeScreen);
				}
			});
			shoplabels.add(label);
			dragonsInShop.add(dragons[i]);
			//addObject(label);
			visible.add(labelBack);
			visible.add(label.getDragonImg());
			visible.add(label.getDragonName());
			//System.out.println(label.getDragonName().getText());
			visible.add(label.getDragonPrice().getCoin());
			visible.add(label.getDragonPrice().getPriceLabel());
			visible.add(label.getButton());
			
			y = y + DragonLabel.getLabelHeight()+20;
		}	
		
	}



}
