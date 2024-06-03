package application;

import javafx.scene.shape.Rectangle;

public class Collision {
	    public boolean checkCollision(Rectangle[] crates) {
	        for (int i = 0; i < crates.length; i++) {
	            if (variables.charY + variables.charView.getFitHeight() >= crates[i].getY() &&
	                    variables.charY <= crates[i].getY() + crates[i].getHeight() &&
	                    variables.charX + variables.charView.getFitWidth() >= crates[i].getX() &&
	                    variables.charX <= crates[i].getX() + crates[i].getWidth()) {
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    public boolean CrateCollision(Rectangle[]... cratesArray) {
	        for (Rectangle[] crates : cratesArray) {
	            if (checkCollision(crates)) {
	                return true;
	            }
	        }
	        return false;
	    }
}
