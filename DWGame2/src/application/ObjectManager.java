package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class ObjectManager {
	public void showTree() {
	variables.tree = new Rectangle(200,200);
    String treeimg = "/Assets/tree.png";
    ImagePattern treeimgp = new ImagePattern(new Image(getClass().getResourceAsStream(treeimg)));
    variables.tree.setFill(treeimgp);
    variables.tree.setX(150);
    variables.tree.setY(405);

    variables.tree2 = new Rectangle(200,200);
String treeimg2 = "/Assets/tree.png";
ImagePattern treeimgp2 = new ImagePattern(new Image(getClass().getResourceAsStream(treeimg2)));
variables.tree2.setFill(treeimgp2);
variables.tree2.setX(1100);
variables.tree2.setY(505);

variables.tree3 = new Rectangle(200,200);
String treeimg3 = "/Assets/tree.png";
ImagePattern treeimgp3 = new ImagePattern(new Image(getClass().getResourceAsStream(treeimg3)));
variables.tree3.setFill(treeimgp3);
variables.tree3.setX(2200);
variables.tree3.setY(405);
}
	public void showmobs ()
	{
		//mobs
        variables.mob1 = new Rectangle(50,50);
        String mobs = "/Assets/bee_idle.gif";
        ImagePattern mobpt = new ImagePattern(new Image(getClass().getResourceAsStream(mobs)));
        variables.mob1.setFill(mobpt);
        variables.mob1.setX(1050);
        variables.mob1.setY(630);

        variables.mob2 = new Rectangle(50,50);
        String mobs2 = "/Assets/bee_idle.gif";
        ImagePattern mobpt2 = new ImagePattern(new Image(getClass().getResourceAsStream(mobs2)));
        variables.mob2.setFill(mobpt2);
        variables.mob2.setX(3100);
        variables.mob2.setY(630);

	}
	public void showborder()
	{
		  variables.lborderwall = new Rectangle(100,500);
	        variables.lborderwall.setFill(Color.DARKGREEN);
	        variables.lborderwall.setOpacity(0);
	        variables.lborderwall.setX(0);
	        variables.lborderwall.setY(300);
	}
	public void showplatform()
	{
		variables.platforma = new Rectangle(700, 1200);
        String imagePath = "/Assets/Untitled.png";
        ImagePattern imagePattern = new ImagePattern(new Image(getClass().getResourceAsStream(imagePath)));
        variables.platforma.setFill(imagePattern);
        variables.platforma.setX(100);
        variables.platforma.setY(600);

        variables.platforma2 = new Rectangle(700,1200);
        String imagePath1 = "/Assets/mid.png";
        ImagePattern imagePattern1 = new ImagePattern(new Image(getClass().getResourceAsStream(imagePath1)));
        variables.platforma2.setFill(imagePattern1);
        variables.platforma2.setX(750);
        variables.platforma2.setY(700);

        variables.platforma3 = new Rectangle(1400,600);
        String imagePath3 = "/Assets/wide.jpg";
        ImagePattern imagePattern3 = new ImagePattern(new Image(getClass().getResourceAsStream(imagePath3)));
        variables.platforma3.setFill(imagePattern3);
        variables.platforma3.setX(1400);
        variables.platforma3.setY(600);

        variables.platforma4 = new Rectangle(700,1200);
        String imagePath4 = "/Assets/mid.png";
        ImagePattern imagePattern4 = new ImagePattern(new Image(getClass().getResourceAsStream(imagePath4)));
        variables.platforma4.setFill(imagePattern4);
        variables.platforma4.setX(2780);
        variables.platforma4.setY(700);


        variables.platforma5 = new Rectangle(1400,600);
        String imagePath5 = "/Assets/wide.jpg";
        ImagePattern imagePattern5 = new ImagePattern(new Image(getClass().getResourceAsStream(imagePath5)));
        variables.platforma5.setFill(imagePattern5);
        variables.platforma5.setX(3450);
        variables.platforma5.setY(600);
        
        variables.platforma5 = new Rectangle(1400,600);
        String imagePath6 = "/Assets/wide.jpg";
        ImagePattern imagePattern6 = new ImagePattern(new Image(getClass().getResourceAsStream(imagePath6)));
        variables.platforma5.setFill(imagePattern6);
        variables.platforma5.setX(3750);
        variables.platforma5.setY(600);
        variables.platformaflag = new Rectangle(200,200);
        
        String imagePath7 = "/Assets/flag.png";
        ImagePattern imagePattern7 = new ImagePattern(new Image(getClass().getResourceAsStream(imagePath7)));
        variables.platformaflag.setFill(imagePattern7);
        variables.platformaflag.setX(4700);
        variables.platformaflag.setY(440);
	}
	public void showWallborder()
	{
		 variables.rborderwall = new Rectangle(100,500);
	        variables.rborderwall.setFill(Color.DARKGREEN);
	        variables.rborderwall.setOpacity(0);
	        variables.rborderwall.setX(4800);
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
	    

	}
	
}
