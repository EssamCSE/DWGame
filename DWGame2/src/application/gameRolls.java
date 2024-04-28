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
    
//    public void animLoop() {
//
//        AnimationTimer gameLoop = new AnimationTimer() {
//                
//                //Updating the character's position
//                public void handle(long now, Stage primaryStage, Pane gamePane) {
//                    variables.charX += variables.charVelX;
//                    variables.charY += variables.charVelY;
//
//                    // Gravity
//                    variables.charVelY += 1;
//
//                    // Move to left
//                    if (variables.moveLeft && !variables.moveRight) {
//                        variables.charVelX = -5; 
//                        variables.charView.setImage(variables.frameLeft[0]);
//                    }
//                    // Move to right
//                    else if (!variables.moveLeft && variables.moveRight) {
//                        variables.charVelX = 5;
//                        
//                        variables.charView.setImage(variables.frameRight[0]);
//                    } 
//                    // Stops moving
//                    else {
//                        variables.charVelX = 0;
//                        if (!variables.isJumping) {
//                            if (variables.charView.getImage() == variables.frameLeft[0]) {
//                                variables.charView.setImage(variables.frameStandLeft[0]); 
//                            }
//                            // When the character stops moving to the right, its image is updated to reflect a stationary position facing right
//                            else if (variables.charView.getImage() == variables.frameRight[0]) {
//                                variables.charView.setImage(variables.frameStandRight[0]); 
//                            }
//                        }
//                    }
//                    // Ensures that the character cannot move outside the boundaries 
//                    if (variables.charX <= variables.lborderwall.getX() + variables.lborderwall.getWidth()) {
//                        variables.charX = variables.lborderwall.getX() + variables.lborderwall.getWidth();
//                    } else if (variables.charX + variables.charView.getFitWidth() >= variables.rborderwall.getX()) {
//                        variables.charX = variables.rborderwall.getX() - variables.charView.getFitWidth();
//                    }
//
//                    // Collision detection
//                    boolean collided = false;
//
//                    if (variables.charY + variables.charView.getFitHeight() >= variables.platforma.getY() && variables.charY <= variables.platforma.getY() + variables.platforma.getHeight()) {
//                        if (variables.charX + variables.charView.getFitWidth() >= variables.platforma.getX() && variables.charX <= variables.platforma.getX() + variables.platforma.getWidth()) {
//                            collided = true;
//                        }
//                    }
//                    if (variables.charY + variables.charView.getFitHeight() >= variables.platforma2.getY() && variables.charY <= variables.platforma2.getY() + variables.platforma2.getHeight()) {
//                        if (variables.charX + variables.charView.getFitWidth() >= variables.platforma2.getX() && variables.charX <= variables.platforma2.getX() + variables.platforma2.getWidth()) {
//                            collided = true;
//                        }
//                    }
//
//                    if (variables.charY + variables.charView.getFitHeight() >= variables.platforma3.getY() && variables.charY <= variables.platforma3.getY() + variables.platforma3.getHeight()) {
//                        if (variables.charX + variables.charView.getFitWidth() >= variables.platforma3.getX() && variables.charX <= variables.platforma3.getX() + variables.platforma3.getWidth()) {
//                            collided = true;
//                        }
//                    }
//                    if (variables.charY + variables.charView.getFitHeight() >= variables.platforma4.getY() && variables.charY <= variables.platforma4.getY() + variables.platforma4.getHeight()) {
//                        if (variables.charX + variables.charView.getFitWidth() >= variables.platforma4.getX() && variables.charX <= variables.platforma4.getX() + variables.platforma4.getWidth()) {
//                            collided = true;
//                        }
//                    }
//
//                    if (variables.charY + variables.charView.getFitHeight() >= variables.platforma5.getY() && variables.charY <= variables.platforma5.getY() + variables.platforma5.getHeight()) {
//                        if (variables.charX + variables.charView.getFitWidth() >= variables.platforma5.getX() && variables.charX <= variables.platforma5.getX() + variables.platforma5.getWidth()) {
//                            collided = true;
//                        }
//                    }
//
//                    if (variables.charY + variables.charView.getFitHeight() >= variables.platformaflag.getY() && variables.charY <= variables.platformaflag.getY() + variables.platformaflag.getHeight()) {
//                        if (variables.charX + variables.charView.getFitWidth() >= variables.platformaflag.getX() && variables.charX <= variables.platformaflag.getX() + variables.platformaflag.getWidth()) {
//                            collided = true;
//                            variables.reachedPlatform = true;
//                        }
//                    }
//                    // Congratulatory message
//                    if (variables.reachedPlatform) {
//                        Text message = new Text("Congratulations, you made it!");
//                        Text hs1 = new Text("Score: "+ variables.score);
//                        hs1.setFont(Font.font("Arial", FontWeight.BOLD, 24));
//                        hs1.setFill(Color.WHITE);
//                        hs1.setX(590);
//                        hs1.setY(390);
//
//                        message.setFont(Font.font("Arial", FontWeight.BOLD, 24));
//                        message.setFill(Color.WHITE);
//                        message.setX(variables.WIDTH / 2 - message.getLayoutBounds().getWidth() / 2);
//                        message.setY(variables.HEIGHT / 2 - message.getLayoutBounds().getHeight() / 2);
//
//                        Pane messagePane = new Pane();
//                        Button playAgain = new Button("Play Again!");
//                        messagePane.setStyle("-fx-background-color: rgba(0, 0, 0, 0.7);");
//                        messagePane.getChildren().add(message);
//                        messagePane.getChildren().add(playAgain);
//                        messagePane.getChildren().add(hs1);
//                        playAgain.setLayoutX(610);
//                        playAgain.setLayoutY(440);
//                        playAgain.setScaleX(2);
//                        playAgain.setScaleY(2);
//
//                        EventHandler<ActionEvent> eventHandler = event -> {
//                          resetGameState();
//                            primaryStage.setScene(variables.gameScene);
//                        };
//                        // Play again
//                        playAgain.setOnAction(eventHandler);
//
//                        Scene messageScene = new Scene(messagePane, variables.WIDTH, variables.HEIGHT);
//
//                        primaryStage.setScene(messageScene);
//
//                        resetGameState();
//                    }
//                    if (variables.charY + variables.charView.getFitHeight() >= variables.mob1.getY() && variables.charY <= variables.mob1.getY() + variables.mob1.getHeight()) {
//                        if (variables.charX + variables.charView.getFitWidth() >= variables.mob1.getX() && variables.charX <= variables.mob1.getX() + variables.mob1.getWidth()) {
//                            collided = true;
//                            variables.touchedMob1 = true;
//                        }
//                    }
//                    // Touch enemy -> End of the game
//                    if (variables.touchedMob1) {
//                        Text message2 = new Text(" Game Over :(");
//                        Text hs2 = new Text("Score: "+ variables.score);
//                        hs2.setFont(Font.font("Arial", FontWeight.BOLD, 24));
//                        hs2.setFill(Color.WHITE);
//                        hs2.setX(590);
//                        hs2.setY(390);
//
//                        message2.setFont(Font.font("Arial", FontWeight.BOLD, 30));
//                        message2.setFill(Color.WHITE);
//                        message2.setX(variables.WIDTH / 2 - message2.getLayoutBounds().getWidth() / 2);
//                        message2.setY(variables.HEIGHT / 2 - message2.getLayoutBounds().getHeight() / 2);
//
//                        Pane messagePane2 = new Pane();
//                        Button playAgain2 = new Button("Play Again!");
//                        playAgain2.setLayoutX(610);
//                        playAgain2.setLayoutY(440);
//                        playAgain2.setScaleX(2);
//                        playAgain2.setScaleY(2);
//
//                        messagePane2.setStyle("-fx-background-color: rgba(0, 0, 0, 0.7);");
//                        messagePane2.getChildren().add(message2);
//                        messagePane2.getChildren().add(playAgain2);
//                        messagePane2.getChildren().add(hs2);
//                        EventHandler<ActionEvent> eventHandler2 = event -> {
//                            resetGameState();
//                            primaryStage.setScene(variables.gameScene);
//                        };
//
//                        playAgain2.setOnAction(eventHandler2);
//
//                    
//                    Scene messageScene2 = new Scene(messagePane2, 1280, 720);
//                    primaryStage.setScene(messageScene2);
//                    resetGameState();
//
//                }
//                    // Collision with 2nd enemy
//                    if (variables.charY + variables.charView.getFitHeight() >= variables.mob2.getY() && variables.charY <= variables.mob2.getY() + variables.mob2.getHeight()) {
//                        if (variables.charX + variables.charView.getFitWidth() >= variables.mob2.getX() && variables.charX <= variables.mob2.getX() + variables.mob2.getWidth()) {
//                            collided = true;
//                            variables.touchedMob2 = true;
//                        }
//                    }
//                    // Handle collision 
//                    if (variables.touchedMob2) {
//                        Text message3 = new Text("You died :( Your score is : " + variables.score);
//                        message3.setFont(Font.font("Arial", FontWeight.BOLD, 30));
//                        message3.setFill(Color.WHITE);
//                        message3.setX(variables.WIDTH / 2 - message3.getLayoutBounds().getWidth() / 2);
//                        message3.setY(variables.HEIGHT / 2 - message3.getLayoutBounds().getHeight() / 2);
//
//                        Pane messagePane3 = new Pane();
//                        Button playAgain3 = new Button("Play Again!");
//                        playAgain3.setLayoutX(600);
//                        playAgain3.setLayoutY(400);
//                        playAgain3.setScaleX(2);
//                        playAgain3.setScaleY(2);
//
//                        messagePane3.setStyle("-fx-background-color: rgba(0, 0, 0, 0.7);");
//                        messagePane3.getChildren().add(message3);
//                        messagePane3.getChildren().add(playAgain3);
//
//                        EventHandler<ActionEvent> eventHandler2 = event -> {
//                            resetGameState();
//                            primaryStage.setScene(variables.gameScene);
//                        };
//                        playAgain3.setOnAction(eventHandler2);
//
//                        Scene messageScene3 = new Scene(messagePane3, variables.WIDTH, variables.HEIGHT);
//
//                         primaryStage.setScene(messageScene3);
//
//                        resetGameState();
//
//                    }
//
//                    // Check pick coins
//                    if (variables.charY + variables.charView.getFitHeight() >= variables.coinView.getY() && variables.charY <= variables.coinView.getY() + variables.coinView.getFitHeight()) {
//                        if (variables.charX + variables.charView.getFitWidth() >= variables.coinView.getX() && variables.charX <= variables.coinView.getX() + variables.coinView.getFitWidth()) {
//                            variables.coinView.setVisible(false);
//                            variables.score += 5;
//                        }
//                    }
//                    variables.coinView.setX(500);
//                    variables.coinView.setY(560);
//
//                    if (variables.charY + variables.charView.getFitHeight() >= variables.coinView2.getY() && variables.charY <= variables.coinView2.getY() + variables.coinView2.getFitHeight()) {
//                        if (variables.charX + variables.charView.getFitWidth() >= variables.coinView2.getX() && variables.charX <= variables.coinView2.getX() + variables.coinView2.getFitWidth()) {
//                            variables.coinView2.setVisible(false);
//                            variables.score += 5;
//                        }
//                    }
//                    variables.coinView2.setX(1050);
//                    variables.coinView2.setY(560);
//
//                    if (variables.charY + variables.charView.getFitHeight() >= variables.coinView3.getY() && variables.charY <= variables.coinView3.getY() + variables.coinView3.getFitHeight()) {
//                        if (variables.charX + variables.charView.getFitWidth() >= variables.coinView3.getX() && variables.charX <= variables.coinView3.getX() + variables.coinView3.getFitWidth()) {
//                            variables.coinView3.setVisible(false);
//                            variables.score += 5;
//                        }
//                    }
//                    variables.coinView3.setX(1500);
//                    variables.coinView3.setY(560);
//
//                    if (variables.charY + variables.charView.getFitHeight() >= variables.coinView4.getY() && variables.charY <= variables.coinView4.getY() + variables.coinView4.getFitHeight()) {
//                        if (variables.charX + variables.charView.getFitWidth() >= variables.coinView4.getX() && variables.charX <= variables.coinView4.getX() + variables.coinView4.getFitWidth()) {
//                            variables.coinView4.setVisible(false);
//                            variables.score += 5;
//                        }
//                    }
//                    variables.coinView4.setX(2000);
//                    variables.coinView4.setY(560);
//
//                    if (variables.charY + variables.charView.getFitHeight() >= variables.coinView5.getY() && variables.charY <= variables.coinView5.getY() + variables.coinView5.getFitHeight()) {
//                        if (variables.charX + variables.charView.getFitWidth() >= variables.coinView5.getX() && variables.charX <= variables.coinView5.getX() + variables.coinView5.getFitWidth()) {
//                            variables.coinView5.setVisible(false);
//                            variables.score += 5;
//                        }
//                    }
//                    variables.coinView5.setX(2500);
//                    variables.coinView5.setY(560);
//
//                    if (variables.charY + variables.charView.getFitHeight() >= variables.coinView6.getY() && variables.charY <= variables.coinView6.getY() + variables.coinView6.getFitHeight()) {
//                        if (variables.charX + variables.charView.getFitWidth() >= variables.coinView6.getX() && variables.charX <= variables.coinView6.getX() + variables.coinView6.getFitWidth()) {
//                            variables.coinView6.setVisible(false);
//                            variables.score += 5;
//                        }
//                    }
//                    variables.coinView6.setX(3100);
//                    variables.coinView6.setY(560);
//
//                    // Check if pick speed boost
//                    if (variables.charY + variables.charView.getFitHeight() >= variables.speedBoostView.getY() &&
//                            variables.charY <= variables.speedBoostView.getY() + variables.speedBoostView.getFitHeight()) {
//                        if (variables.charX + variables.charView.getFitWidth() >= variables.speedBoostView.getX() &&
//                                variables.charX <= variables.speedBoostView.getX() + variables.speedBoostView.getFitWidth()) {
//                            variables.hasSpeedBoost = true;
//                            gamePane.getChildren().remove(variables.speedBoostView);
//                        }
//                    }
//
//                    if(variables.hasSpeedBoost){
//                        if (variables.moveLeft && !variables.moveRight) {
//                            variables.charVelX = variables.hasSpeedBoost ? -10 : -5;
//                            variables.charView.setImage(variables.frameLeft[0]);
//                        } else if (!variables.moveLeft && variables.moveRight) {
//                            variables.charVelX = variables.hasSpeedBoost ? 10 : 5;
//                            variables.charView.setImage(variables.frameRight[0]);
//                        }
//
//                    }
//
//                    /// Reset character position and velocity
//                    if (collided) {
//                       
//                        variables.charX = variables.prevCharX;
//                        variables.charY = variables.prevCharY;
//                        variables.charVelY = 0;
//                        variables.isJumping = false;
//                    }
//
//                    variables.prevCharX = variables.charX;
//                    variables.prevCharY = variables.charY;
//                    variables.charView.setX(variables.charX);
//                    variables.charView.setY(variables.charY);
//
//                    if (variables.charY >= variables.HEIGHT - variables.charView.getFitHeight()) {
//                        variables.charVelY = 0;
//                        variables.charY = variables.HEIGHT - variables.charView.getFitHeight();
//                        variables.isJumping = false;
//                    }
//                    if(variables.charX >= variables.WIDTH - variables.charView.getFitWidth()){
//                        variables.charX = variables.WIDTH - variables.charView.getFitWidth();
//                    }else if(variables.charX <= 0){
//                        variables.charX = 0;
//                    }
//
//                }
//
//				@Override
//				public void handle(long arg0) {
//					// TODO Auto-generated method stub
//					
//				}
//            };
//        gameLoop.start();
//    }
//

}
