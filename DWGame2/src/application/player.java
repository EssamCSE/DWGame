package application;

import javafx.animation.AnimationTimer;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;

public class player {
 public void character (Button playButton)
{
	Image pbimage = new Image(getClass().getResourceAsStream("/Assets/play_blue.png"));
    ImageView pb = new ImageView(pbimage);
    pb.setFitWidth(250);
    pb.setFitHeight(250);
    playButton.setGraphic(pb);
    playButton.setPrefWidth(100);
    playButton.setPrefHeight(100);
    playButton.setStyle("-fx-background-color: transparent;");

}
 public void playerMove ()
 {
	 AnimationTimer animationTimer = new AnimationTimer() {
         int frameIndexLeft = 0;
         int frameIndexRight = 0;
         long lastTime = 0;

         @Override
         public void handle(long now) {
             if (now - lastTime >= 200) {  // Change frame every 100 milliseconds
                 if (variables.moveLeft) {
                 	variables. charView.setImage(variables.frameLeft[frameIndexLeft]);
                     frameIndexLeft = (frameIndexLeft + 1) % variables.frameLeft.length;
                 } else if (variables.moveRight) {
                 	variables.charView.setImage(variables.frameRight[frameIndexRight]);
                     frameIndexRight = (frameIndexRight + 1) % variables.frameRight.length;
                 }
                 lastTime = now;
             }
         }
     };

     variables.gameScene.setOnKeyPressed(event -> {
         KeyCode keyCode = event.getCode();
         if (keyCode == KeyCode.LEFT) {
         	variables.moveLeft = true;
             variables.charView.setImage(variables.frameLeft[0]);
             animationTimer.start();  // Start the animation timer for left movement
         } else if (keyCode == KeyCode.RIGHT) {
         	variables.moveRight = true;
             variables.charView.setImage(variables.frameRight[0]);
             animationTimer.start();  // Start the animation timer for right movement
         } else if (keyCode == KeyCode.SPACE) {
             if (!variables.isJumping) {
             	variables.isJumping = true;
                 variables.charVelY = -18;
                 variables.charView.setImage(variables.frameJump[0]);
             }
         }
     });

     variables.gameScene.setOnKeyReleased(event -> {
         KeyCode keyCode = event.getCode();
         if (keyCode == KeyCode.LEFT) {
         	variables.moveLeft = false;
         	variables.charView.setImage(variables.frameStandLeft[0]);
             animationTimer.stop();  // Stop the animation timer for left movement
         } else if (keyCode == KeyCode.RIGHT) {
         	variables.moveRight = false;
         	variables.charView.setImage(variables.frameStandRight[0]);
             animationTimer.stop();  // Stop the animation timer for right movement
         }
     });

 }
 public void KeyHandle()
 {
	 variables.gameScene.setOnKeyReleased(event -> {
         KeyCode keyCode = event.getCode();
         if (keyCode == KeyCode.LEFT) {
         	variables.moveLeft = false;
             if (!variables.moveRight) {
             	variables.charView.setImage(variables.frameStandLeft[0]); 
             }
         } else if (keyCode == KeyCode.RIGHT) {
         	variables.moveRight = false;
             if (!variables.moveLeft) {
             	variables.charView.setImage(variables.frameStandRight[0]); //e vendos panden pa leviz duke pare djathtas
             }
         }
     });
 }
 public void keyRelease ()
 {
	 
 }
}
