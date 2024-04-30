package application;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class gameRolls {
    public void resetScore() {
        variables.score = 0;
        variables.coinView.setVisible(true);
        variables.coinView2.setVisible(true);
        variables.coinView3.setVisible(true);
        variables.coinView4.setVisible(true);
        variables.coinView5.setVisible(true);
        variables.coinView6.setVisible(true);
        variables.speedBoostView.setVisible(true);
    }

    public void resetGameState() {
        variables.charX = variables.platforma.getX();
        variables.charY = variables.platforma.getY() - variables.charView.getFitHeight();
        variables.charVelX = 0;
        variables.charVelY = 0;

        variables.moveLeft = false;
        variables.moveRight = false;
        variables.isJumping = false;
        variables.prevCharX = variables.charX;
        variables.prevCharY = variables.charY;

        variables.hasSpeedBoost = false;

        variables.reachedPlatform = false;
        variables.touchedMob1 = false;
        variables.touchedMob2 = false;

        resetScore();

        variables.charView.setImage(variables.frameRight[0]);
    }

    public void animtimer() {
        AnimationTimer animationTimer = new AnimationTimer() {
            int frameIndexLeft = 0;
            int frameIndexRight = 0;
            long lastTime = 0;

            @Override
            public void handle(long now) {
                if (now - lastTime >= 200) {  // Change frame every 200 nanoseconds
                    if (variables.moveLeft) {
                        variables.charView.setImage(variables.frameLeft[frameIndexLeft]);
                        frameIndexLeft = (frameIndexLeft + 1) % variables.frameLeft.length;
                    } else if (variables.moveRight) {
                        variables.charView.setImage(variables.frameRight[frameIndexRight]);
                        frameIndexRight = (frameIndexRight + 1) % variables.frameRight.length;
                    }

                    lastTime = now;
                }
            }
        };

        // Start the animation timer
        animationTimer.start();
    }
    


}
