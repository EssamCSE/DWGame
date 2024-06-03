package application;

import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Sea {
	public void createPlatform(Rectangle platform, double x, double y, String imagePath) {
	    ImagePattern imagePattern = new ImagePattern(new Image(getClass().getResourceAsStream(imagePath)));
	    platform.setFill(imagePattern);
	    platform.setX(x);
	    platform.setY(y);
	}
	
	public void createSea(Pane gamePane, int x, int y) {
		int width = 50;
		int height = 50;
		
		for (int i = 0; i < variables.seas.length; i++) {
		    variables.seas[i] = new Rectangle(width,height);
		    createPlatform(variables.seas[i], x + i * width, y, "/Object/SeaS.png");
		    gamePane.getChildren().add(variables.seas[i]); // Add the crate to the gamePane
		}
		
}
	public void createSea2(Pane gamePane, int x, int y) {
		int width = 50;
		int height = 50;
		
		for (int i = 0; i < variables.sea.length; i++) {
			variables.sea[i] = new Rectangle(width,height);
			createPlatform(variables.sea[i], x + i * width, y, "/Object/sea.png");
			gamePane.getChildren().add(variables.sea[i]); // Add the crate to the gamePane
		}
		
	}
	
	public Rectangle[] seaLine() {
		return variables.seas;
	}
	
}
