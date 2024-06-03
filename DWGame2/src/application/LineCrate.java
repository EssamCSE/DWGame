package application;

import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class LineCrate {
	public void createPlatform(Rectangle platform, double x, double y, String imagePath) {
	    ImagePattern imagePattern = new ImagePattern(new Image(getClass().getResourceAsStream(imagePath)));
	    platform.setFill(imagePattern);
	    platform.setX(x);
	    platform.setY(y);
	}
	
	
		public void createLineCrate(Pane gamePane, int x, int y) {
			int width = 50;
			int height = 50;
			
			for (int i = 0; i < variables.crateLine.length; i++) {
			    variables.crateLine[i] = new Rectangle(width,height);
			    createPlatform(variables.crateLine[i], x + i * width, y, "/Object/Crate.png");
			    gamePane.getChildren().add(variables.crateLine[i]); // Add the crate to the gamePane
			}
	}
		
		public void createLineCrate2(Pane gamePane, int x, int y) {
			int width = 50;
			int height = 50;
			
			for (int i = 0; i < variables.crateLine2.length; i++) {
				variables.crateLine2[i] = new Rectangle(width,height);
				createPlatform(variables.crateLine2[i], x + i * width, y, "/Object/Crate.png");
				gamePane.getChildren().add(variables.crateLine2[i]); // Add the crate to the gamePane
			}
		}
		
		public void createLineCrate3(Pane gamePane, int x, int y) {
			int width = 50;
			int height = 50;
			
			for (int i = 0; i < variables.crateLine3.length; i++) {
				variables.crateLine3[i] = new Rectangle(width,height);
				createPlatform(variables.crateLine3[i], x + i * width, y, "/Object/Crate.png");
				gamePane.getChildren().add(variables.crateLine3[i]); // Add the crate to the gamePane
			}
		}
		
		public void createLineCrateSeperated(Pane gamePane, int x, int y) {
			int width = 50;
			int height = 50;
			
			for (int i = 0; i < variables.crateLineSep.length; i++) {
				variables.crateLineSep[i] = new Rectangle(width,height);
				createPlatform(variables.crateLineSep[i], x + (i * width)* 2.5, y, "/Object/Crate.png");
				gamePane.getChildren().add(variables.crateLineSep[i]); // Add the crate to the gamePane
			}
		}
		
		
		public void createLineLand(Pane gamePane, int x, int y) {
			int width = 50;
			int height = 50;
			int k=13;
			for (int i = 0; i < variables.crateLineLan.length; i++) {
				variables.crateLineLan[i] = new Rectangle(width,height);
				createPlatform(variables.crateLineLan[i], x + i * width, y, "/LandP/"+k+".png");
				gamePane.getChildren().add(variables.crateLineLan[i]); // Add the crate to the gamePane
				k++;
			
			}
		}
		
		public void createLineLandP(Pane gamePane, int x, int y) {
			int width = 50;
			int height = 50;
			int k=13;
			for (int i = 0; i < variables.crateLineLanP.length; i++) {
				variables.crateLineLanP[i] = new Rectangle(width,height);
				createPlatform(variables.crateLineLanP[i], x + i * width, y, "/LandP/"+k+".png");
				gamePane.getChildren().add(variables.crateLineLanP[i]); // Add the crate to the gamePane
				k++;
				
			}
		}
		public void createLineLandP1(Pane gamePane, int x, int y) {
			int width = 50;
			int height = 50;
			int k=13;
			for (int i = 0; i < variables.crateLineLanP1.length; i++) {
				variables.crateLineLanP1[i] = new Rectangle(width,height);
				createPlatform(variables.crateLineLanP1[i], x + i * width, y, "/LandP/"+k+".png");
				gamePane.getChildren().add(variables.crateLineLanP1[i]); // Add the crate to the gamePane
				k++;
				
			}
		}
		public void createLineLandP2(Pane gamePane, int x, int y) {
			int width = 50;
			int height = 50;
			int k=13;
			for (int i = 0; i < variables.crateLineLanP2.length; i++) {
				variables.crateLineLanP2[i] = new Rectangle(width,height);
				createPlatform(variables.crateLineLanP2[i], x + i * width, y, "/LandP/"+k+".png");
				gamePane.getChildren().add(variables.crateLineLanP2[i]); // Add the crate to the gamePane
				k++;
				
			}
		}
		public void createLineLandP3(Pane gamePane, int x, int y) {
			int width = 50;
			int height = 50;
			int k=13;
			for (int i = 0; i < variables.crateLineLanP3.length; i++) {
				variables.crateLineLanP3[i] = new Rectangle(width,height);
				createPlatform(variables.crateLineLanP3[i], x + i * width, y, "/LandP/"+k+".png");
				gamePane.getChildren().add(variables.crateLineLanP3[i]); // Add the crate to the gamePane
				k++;
				
			}
		}
	
		
	public Rectangle[] crateLine() {
		return variables.crateLine;
	}
	
	public Rectangle[] crateLine2() {
		return variables.crateLine2;
	}
	public Rectangle[] crateLine3() {
		return variables.crateLine3;
	}
	public Rectangle[] crateLineSep() {
		return variables.crateLineSep;
	}
	public Rectangle[] crateLineLan() {
		return variables.crateLineLan;
	}
	
	public Rectangle[] crateLineLanP() {
		return variables.crateLineLanP;
	}
	public Rectangle[] crateLineLanP1() {
		return variables.crateLineLanP1;
	}
	public Rectangle[] crateLineLanP2() {
		return variables.crateLineLanP2;
	}
	public Rectangle[] crateLineLanP3() {
		return variables.crateLineLanP3;
	}
	

//	 
}

