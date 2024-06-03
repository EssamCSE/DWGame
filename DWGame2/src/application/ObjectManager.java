package application;

import java.awt.font.ImageGraphicAttribute;
import java.security.PublicKey;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class ObjectManager {
	
	public void createTree(Rectangle tree, double x, double y, String imagePath) {
//		variables.tree = new Rectangle(width,height);
	    ImagePattern treeimgp = new ImagePattern(new Image(getClass().getResourceAsStream(imagePath)));
	    tree.setFill(treeimgp);
	    tree.setX(x);
	    tree.setY(y);
	}
//	
	public void showTree() {
		variables.tree = new Rectangle(200,200);
		createTree(variables.tree, 150, 405, "/Assets/tree.png");
		
		variables.tree2 = new Rectangle(200,200);
		createTree(variables.tree2, 1100, 505, "/Assets/tree.png");
		
		variables.tree3 = new Rectangle(200,200);
		createTree(variables.tree3, 2200, 405, "/Assets/tree.png");
		
	}
	public void creatEnemy(Rectangle mob, double x, double y, String imagePath) {
        ImagePattern mobpt = new ImagePattern(new Image(getClass().getResourceAsStream(imagePath)));
        mob.setFill(mobpt);
        mob.setX(x);
        mob.setY(y);
	}
	
	public void showmobs ()
	{
		//mobs
        variables.mob1 = new Rectangle(50,50);
        creatEnemy(variables.mob1, 1050, 630, "/Assets/bee_idle.gif");


        variables.mob2 = new Rectangle(50,50);
        creatEnemy(variables.mob2, 3100, 630, "/Assets/bee_idle.gif");


	}
	
	
	public void showborder()
	{
		  variables.lborderwall = new Rectangle(100,500);
	        variables.lborderwall.setFill(Color.DARKGREEN);
	        variables.lborderwall.setOpacity(0);
	        variables.lborderwall.setX(0);
	        variables.lborderwall.setY(300);
	}

	public void createPlatform(Rectangle platform, double x, double y, String imagePath) {
	    ImagePattern imagePattern = new ImagePattern(new Image(getClass().getResourceAsStream(imagePath)));
	    platform.setFill(imagePattern);
	    platform.setX(x);
	    platform.setY(y);
	}
	
	public void showplatform()
	{   

		
		// هذا الكود متكرر ، لذا عملت الدالة واعطيتها استدعاء لكل كائن ننشأه
		variables.platforma = new Rectangle(700, 1200);
		createPlatform(variables.platforma, 100, 600, "/Assets/Untitled.png");
	
        variables.platforma2 = new Rectangle(700,1200);
        createPlatform(variables.platforma2, 750, 700, "/Assets/mid.png");

        variables.platforma3 = new Rectangle(1400,600);
        createPlatform(variables.platforma3, 1400, 600, "/Assets/wide.jpg");


        variables.platforma4 = new Rectangle(700,1200);
        createPlatform(variables.platforma4, 2780, 700, "/Assets/mid.png");


        variables.platforma5 = new Rectangle(1400,600);
        createPlatform(variables.platforma5, 3450, 600, "/Assets/wide.jpg");
       
        variables.platforma5 = new Rectangle(1400,600);
        createPlatform(variables.platforma5, 6000, 600, "/Assets/wide.jpg");

        

        //FLAGE
        variables.platformaflag = new Rectangle(200,200);
//        createPlatform(variables.platformaflag, 4700, 4400, "/Assets/flag.png");
        String imagePath7 = "/Assets/towerSmallAlt.png";
        ImagePattern imagePattern7 = new ImagePattern(new Image(getClass().getResourceAsStream(imagePath7)));
        variables.platformaflag.setFill(imagePattern7);
        variables.platformaflag.setWidth(50); // Set width
        variables.platformaflag.setHeight(200); 
        variables.platformaflag.setX(7000);
        variables.platformaflag.setY(415);
	}
	
	public void showWallborder()
	{
		 variables.rborderwall = new Rectangle(100,500);
	        variables.rborderwall.setFill(Color.DARKGREEN);
	        variables.rborderwall.setOpacity(0);
	        variables.rborderwall.setX(7500);
	        variables.rborderwall.setY(260);

	}
	public void showSpeedObj ()
	{
		 variables.speedBoostView = new ImageView(new Image(getClass().getResourceAsStream("/Assets/powerup.png")));
	        variables.speedBoostView.setFitWidth(40);
	        variables.speedBoostView.setFitHeight(40);
	        variables.speedBoostView.setX(variables.boostX);
	        variables.speedBoostView.setY(variables.boostY);
	}

	public void showCoin()
	{

		Image coinImage = new Image(getClass().getResourceAsStream("/Gold/Gold_1.png"));
	    variables.coinView = new ImageView(coinImage);
	    variables.coinView.setFitWidth(40);
	    variables.coinView.setFitHeight(40);

	    Image coinImage2 = new Image(getClass().getResourceAsStream("/Gold/Gold_1.png"));
	    variables.coinView2 = new ImageView(coinImage2);
	    variables.coinView2.setFitWidth(40);
	    variables.coinView2.setFitHeight(40);

	    Image coinImage3 = new Image(getClass().getResourceAsStream("/Gold/Gold_1.png"));
	    variables.coinView3 = new ImageView(coinImage3);
	    variables.coinView3.setFitWidth(40);
	    variables.coinView3.setFitHeight(40);

	    Image coinImage4 = new Image(getClass().getResourceAsStream("/Gold/Gold_1.png"));
	    variables.coinView4 = new ImageView(coinImage4);
	    variables.coinView4.setFitWidth(40);
	    variables.coinView4.setFitHeight(40);

	    Image coinImage5 = new Image(getClass().getResourceAsStream("/Gold/Gold_1.png"));
	    variables.coinView5 = new ImageView(coinImage5);
	    variables.coinView5.setFitWidth(40);
	    variables.coinView5.setFitHeight(40);

	    Image coinImage6 = new Image(getClass().getResourceAsStream("/Gold/Gold_1.png"));
	    variables.coinView6 = new ImageView(coinImage6);
	    variables.coinView6.setFitWidth(40);
	    variables.coinView6.setFitHeight(40);
	    
	    Image coinImage7 = new Image(getClass().getResourceAsStream("/Gold/Gold_1.png"));
	    variables.coinView7 = new ImageView(coinImage7);
	    variables.coinView7.setFitWidth(40);
	    variables.coinView7.setFitHeight(40);
	    
	    Image coinImage8 = new Image(getClass().getResourceAsStream("/Gold/Gold_1.png"));
	    variables.coinView8 = new ImageView(coinImage8);
	    variables.coinView8.setFitWidth(40);
	    variables.coinView8.setFitHeight(40);
	    
	    Image coinImage9 = new Image(getClass().getResourceAsStream("/Gold/Gold_1.png"));
	    variables.coinView9 = new ImageView(coinImage9);
	    variables.coinView9.setFitWidth(40);
	    variables.coinView9.setFitHeight(40);
	    
	    Image coinImage10 = new Image(getClass().getResourceAsStream("/Gold/Gold_1.png"));
	    variables.coinView10 = new ImageView(coinImage10);
	    variables.coinView10.setFitWidth(40);
	    variables.coinView10.setFitHeight(40);
	    
	    Image coinImage11 = new Image(getClass().getResourceAsStream("/Gold/Gold_1.png"));
	    variables.coinView11 = new ImageView(coinImage11);
	    variables.coinView11.setFitWidth(40);
	    variables.coinView11.setFitHeight(40);
	    
	    Image coinImage12 = new Image(getClass().getResourceAsStream("/Gold/Gold_1.png"));
	    variables.coinView12 = new ImageView(coinImage12);
	    variables.coinView12.setFitWidth(40);
	    variables.coinView12.setFitHeight(40);
	    
	    Image coinImage13 = new Image(getClass().getResourceAsStream("/Gold/Gold_1.png"));
	    variables.coinView13 = new ImageView(coinImage13);
	    variables.coinView13.setFitWidth(40);
	    variables.coinView13.setFitHeight(40);
	    
	    Image coinImage14= new Image(getClass().getResourceAsStream("/Gold/Gold_1.png"));
	    variables.coinView14 = new ImageView(coinImage14);
	    variables.coinView14.setFitWidth(40);
	    variables.coinView14.setFitHeight(40);
	    
	    Image coinImage15 = new Image(getClass().getResourceAsStream("/Gold/Gold_1.png"));
	    variables.coinView15 = new ImageView(coinImage15);
	    variables.coinView15.setFitWidth(40);
	    variables.coinView15.setFitHeight(40);
}
	
}
	
