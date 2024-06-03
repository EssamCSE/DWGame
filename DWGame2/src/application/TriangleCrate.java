package application;

import java.security.PublicKey;

import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class TriangleCrate {
	
	
	
		public void createPlatform(Rectangle platform, double x, double y, String imagePath) {
	    ImagePattern imagePattern = new ImagePattern(new Image(getClass().getResourceAsStream(imagePath)));
	    platform.setFill(imagePattern);
	    platform.setX(x);
	    platform.setY(y);
	}
		
		// Triangle Crate 1
		public void createTriangleCrate(Pane gamePane, int x, int y) {
		int width = 50;
		int height = 50;
		for (int i = 0; i < variables.crate.length; i++) {
		variables.crate[0] = new Rectangle(width,height);
		
		createPlatform(variables.crate[0], x + 100, y - 100, "/Object/Crate.png");
		gamePane.getChildren().add(variables.crate[0]);
		}
		
		for (int i = 0; i < variables.crate3.length; i++) {
			variables.crate3[i] = new Rectangle(width,height);
			createPlatform(variables.crate3[i], ( x + width )+ i * width, y - height, "/Object/Crate.png");
			gamePane.getChildren().add(variables.crate3[i]); // Add the crate to the gamePane
		}
		
		for (int i = 0; i < variables.crate5.length; i++) {
		    variables.crate5[i] = new Rectangle(width,height);
		    createPlatform(variables.crate5[i], x + i * width, y, "/Object/Crate.png");
		    gamePane.getChildren().add(variables.crate5[i]); // Add the crate to the gamePane
		}
		
	}
		
		//Triangle Crate 2
		public void createTriangleCrate2(Pane gamePane, int x, int y) {
			int width = 50;
			int height = 50;
			for (int i = 0; i < variables.crate1.length; i++) {
				variables.crate1[0] = new Rectangle(width,height);
				
				createPlatform(variables.crate1[0], x + 100, y - 100, "/Object/Crate.png");
				gamePane.getChildren().add(variables.crate1[0]);
			}
			
			for (int i = 0; i < variables.crate33.length; i++) {
				variables.crate33[i] = new Rectangle(width,height);
				createPlatform(variables.crate33[i], ( x + width )+ i * width, y - height, "/Object/Crate.png");
				gamePane.getChildren().add(variables.crate33[i]); // Add the crate to the gamePane
			}
			
			for (int i = 0; i < variables.crate55.length; i++) {
				variables.crate55[i] = new Rectangle(width,height);
				createPlatform(variables.crate55[i], x + i * width, y, "/Object/Crate.png");
				gamePane.getChildren().add(variables.crate55[i]); // Add the crate to the gamePane
			}
			
		}
		
		// For Crate 1;
		public Rectangle[] getcrate() {
	        return variables.crate;
	    }

		public Rectangle[] getcrate3() {
			return variables.crate3;
		}
		
		public Rectangle[] getcrate5() {
			return variables.crate5;
		}
		
		
		// For Crate 2;
		public Rectangle[] getcrate1() {
			return variables.crate1;
		}
		
		public Rectangle[] getcrate33() {
			return variables.crate33;
		}
		
		public Rectangle[] getcrate55() {
			return variables.crate55;
		}
		
}