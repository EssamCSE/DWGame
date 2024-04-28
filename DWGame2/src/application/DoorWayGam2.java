package application;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
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

public class DoorWayGam2 extends Application {


    public static void main(String[] args) {

        launch(args);
    }
    
    frames frame1 = new frames();
    gameRolls level1 = new gameRolls();
    player Player=new player();
    @Override
    public void start(Stage primaryStage) {
    	//set the player and the buttons
        Button playButton = new Button();
        
        Player.character(playButton);

        playButton.setOnAction(event -> primaryStage.setScene(variables.gameScene));
        //set the background
        frame1.background(primaryStage,playButton);

        variables.gameScene = frame1.createGameScene();
        
        frame1.load_frames();

        // Initialize AnimationTimer and set the player movement
        Player.playerMove ();
        //add objects to the scene
        Pane gamePane = (Pane) variables.gameScene.getRoot();
        gamePane.getChildren().addAll(variables.charView, variables.coinView, variables.coinView2, variables.coinView3, variables.coinView4, variables.coinView5, variables.coinView6);
        //handle press keys case
        Player.KeyHandle();
        //level1.animLoop();
        AnimationTimer gameLoop = new AnimationTimer() {
            
        	@Override
            public void handle(long now) {
            	
            	variables.charX += variables.charVelX;
                variables.charY += variables.charVelY;

                // graviteti lojes
                variables.charVelY += 1;
                //
                
                if (variables.moveLeft && !variables.moveRight) {
                	variables.charVelX = -7; //
                    variables.charView.setImage(variables.frameLeft[0]);
                } else if (!variables.moveLeft && variables.moveRight) {
                	variables.charVelX = 7; // 
                    variables.charView.setImage(variables.frameRight[0]);
                } else {
                	variables.charVelX = 0;
                    if (!variables.isJumping) {
                        if (variables.charView.getImage() == variables.frameLeft[0]) {
                        	variables.charView.setImage(variables.frameStandLeft[0]); //
                        } else if (variables.charView.getImage() == variables.frameRight[0]) {
                        	variables.charView.setImage(variables.frameStandRight[0]); 
                        }
                    }
                }
                //
                if (variables.charX <= variables.lborderwall.getX() + variables.lborderwall.getWidth()) {
                	variables.charX = variables.lborderwall.getX() + variables.lborderwall.getWidth();
                } else if (variables.charX + variables.charView.getFitWidth() >= variables.rborderwall.getX()) {
                	variables.charX = variables.rborderwall.getX() - variables.charView.getFitWidth();
                }

                //collision 
                boolean collided = false;

                if (variables.charY + variables.charView.getFitHeight() >= variables.platforma.getY() && variables.charY <= variables.platforma.getY() + variables.platforma.getHeight()) {
                    if (variables.charX + variables.charView.getFitWidth() >= variables.platforma.getX() && variables.charX <= variables.platforma.getX() + variables.platforma.getWidth()) {
                        collided = true;
                    }
                }
                if (variables.charY + variables.charView.getFitHeight() >= variables.platforma2.getY() && variables.charY <= variables.platforma2.getY() + variables.platforma2.getHeight()) {
                    if (variables.charX + variables.charView.getFitWidth() >= variables.platforma2.getX() && variables.charX <= variables.platforma2.getX() + variables.platforma2.getWidth()) {
                        collided = true;
                    }
                }

                if (variables.charY + variables.charView.getFitHeight() >= variables.platforma3.getY() && variables.charY <= variables.platforma3.getY() + variables.platforma3.getHeight()) {
                    if (variables.charX + variables.charView.getFitWidth() >= variables.platforma3.getX() && variables.charX <= variables.platforma3.getX() + variables.platforma3.getWidth()) {
                        collided = true;
                    }
                }
                if (variables.charY + variables.charView.getFitHeight() >= variables.platforma4.getY() && variables.charY <= variables.platforma4.getY() + variables.platforma4.getHeight()) {
                    if (variables.charX + variables.charView.getFitWidth() >= variables.platforma4.getX() && variables.charX <= variables.platforma4.getX() + variables.platforma4.getWidth()) {
                        collided = true;
                    }
                }

                if (variables.charY + variables.charView.getFitHeight() >= variables.platforma5.getY() && variables.charY <= variables.platforma5.getY() + variables.platforma5.getHeight()) {
                    if (variables.charX + variables.charView.getFitWidth() >= variables.platforma5.getX() && variables.charX <= variables.platforma5.getX() + variables.platforma5.getWidth()) {
                        collided = true;

                    }
                }

                if (variables.charY + variables.charView.getFitHeight() >= variables.platformaflag.getY() && variables.charY <= variables.platformaflag.getY() + variables.platformaflag.getHeight()) {
                    if (variables.charX +variables. charView.getFitWidth() >= variables.platformaflag.getX() && variables.charX <= variables.platformaflag.getX() + variables.platformaflag.getWidth()) {
                        collided = true;
                        variables.reachedPlatform = true;
                    }
                }

                if (variables.reachedPlatform) {
                    Text message = new Text("Congratulations,You made it!");
                    Text hs1 = new Text("Score: "+ variables.score);
                    hs1.setFont(Font.font("Arial", FontWeight.BOLD, 24));
                    hs1.setFill(Color.WHITE);
                    hs1.setX(590);
                    hs1.setY(390);

                    message.setFont(Font.font("Arial", FontWeight.BOLD, 24));
                    message.setFill(Color.WHITE);
                    message.setX(variables.WIDTH / 2 - message.getLayoutBounds().getWidth() / 2);
                    message.setY(variables.HEIGHT / 2 - message.getLayoutBounds().getHeight() / 2);

                    Pane messagePane = new Pane();
                    Button playagain = new Button("Play Again!");
                    messagePane.setStyle("-fx-background-color: rgba(0, 0, 0, 0.7);");
                    messagePane.getChildren().add(message);
                    messagePane.getChildren().add(playagain);
                    messagePane.getChildren().add(hs1);
                    playagain.setLayoutX(610);
                    playagain.setLayoutY(440);
                    playagain.setScaleX(2);
                    playagain.setScaleY(2);

                    EventHandler<ActionEvent> eventHandler = event -> {
                        level1.resetGameState();
                        primaryStage.setScene(variables.gameScene);
                    };

                    playagain.setOnAction(eventHandler);

                    Scene messageScene = new Scene(messagePane, variables.WIDTH, variables.HEIGHT);

                    primaryStage.setScene(messageScene);

                    level1.resetGameState();
                }
                if (variables.charY + variables.charView.getFitHeight() >= variables.mob1.getY() && variables.charY <= variables.mob1.getY() + variables.mob1.getHeight()) {
                    if (variables.charX + variables.charView.getFitWidth() >= variables.mob1.getX() && variables.charX <= variables.mob1.getX() + variables.mob1.getWidth()) {
                        collided = true;
                        variables.touchedMob1 = true;
                    }
                }
                
                // CHECK PLAYER FALLING, IF HE FALLS, THE GAME WILL BE OVER
                if(variables.charY > variables.SCREEN_HEIGHT) {
                	gameOver(primaryStage);
                	
                	/*
                	 * 
                	 * 
                	 * 
                	 * 
                	 * 
                	 * 
                	 * 
                	 * 
                	 * 
                	 * 
                	 * 
                	 * 
                	 * 
                	 * 
                	 * 
                	 * */
                }
                
                if (variables.touchedMob1) {
                	gameOver(primaryStage);
                }
                
                if (variables.charY + variables.charView.getFitHeight() >= variables.mob2.getY() && variables.charY <= variables.mob2.getY() + variables.mob2.getHeight()) {
                    if (variables.charX + variables.charView.getFitWidth() >= variables.mob2.getX() && variables.charX <= variables.mob2.getX() + variables.mob2.getWidth()) {
                        collided = true;
                        variables.touchedMob2 = true;
                    }
                }
                if (variables.touchedMob2) {
                    Text message3 = new Text("You died :( " + "Your Score is : " + variables.score);
                    message3.setFont(Font.font("Arial", FontWeight.BOLD, 30));
                    message3.setFill(Color.WHITE);
                    message3.setX(variables.WIDTH / 2 - message3.getLayoutBounds().getWidth() / 2);
                    message3.setY(variables.HEIGHT / 2 - message3.getLayoutBounds().getHeight() / 2);

                    Pane messagePane3 = new Pane();
                    Button playagain3 = new Button("Play Again!");
                    playagain3.setLayoutX(600);
                    playagain3.setLayoutY(400);
                    playagain3.setScaleX(2);
                    playagain3.setScaleY(2);

                    messagePane3.setStyle("-fx-background-color: rgba(0, 0, 0, 0.7);");
                    messagePane3.getChildren().add(message3);
                    messagePane3.getChildren().add(playagain3);

                    EventHandler<ActionEvent> eventHandler2 = event -> {
                        level1.resetGameState();
                        primaryStage.setScene(variables.gameScene);
                    };
                    playagain3.setOnAction(eventHandler2);

                    Scene messageScene3 = new Scene(messagePane3, variables.WIDTH, variables.HEIGHT);

                    primaryStage.setScene(messageScene3);

                    level1.resetGameState();

                }

                //check per perplasjen me pickup item
                if (variables.charY + variables.charView.getFitHeight() >= variables.coinView.getY() && variables.charY <= variables.coinView.getY() + variables.coinView.getFitHeight()) {
                    if (variables.charX + variables.charView.getFitWidth() >= variables.coinView.getX() && variables.charX <= variables.coinView.getX() + variables.coinView.getFitWidth()) {
                    	variables.coinView.setVisible(false);
                        variables.score += 5;
                    }
                }
                variables.coinView.setX(500);
                variables.coinView.setY(560);

                if (variables.charY + variables.charView.getFitHeight() >= variables.coinView2.getY() && variables.charY <= variables.coinView2.getY() + variables.coinView2.getFitHeight()) {
                    if (variables.charX + variables.charView.getFitWidth() >= variables.coinView2.getX() && variables.charX <= variables.coinView2.getX() + variables.coinView2.getFitWidth()) {
                    	variables.coinView2.setVisible(false);
                        variables.score += 5;
                    }
                }
                variables.coinView2.setX(1050);
                variables.coinView2.setY(560);

                if (variables.charY + variables.charView.getFitHeight() >= variables.coinView3.getY() && variables.charY <= variables.coinView3.getY() + variables.coinView3.getFitHeight()) {
                    if (variables.charX + variables.charView.getFitWidth() >= variables.coinView3.getX() && variables.charX <= variables.coinView3.getX() + variables.coinView3.getFitWidth()) {
                    	variables.coinView3.setVisible(false);
                        variables.score += 5;
                    }
                }
                variables.coinView3.setX(1500);
                variables.coinView3.setY(560);

                if (variables.charY + variables.charView.getFitHeight() >= variables.coinView4.getY() && variables.charY <= variables.coinView4.getY() + variables.coinView4.getFitHeight()) {
                    if (variables.charX + variables.charView.getFitWidth() >= variables.coinView4.getX() && variables.charX <= variables.coinView4.getX() + variables.coinView4.getFitWidth()) {
                    	variables.coinView4.setVisible(false);
                        variables.score += 5;
                    }
                }
                variables.coinView4.setX(2000);
                variables.coinView4.setY(560);

                if (variables.charY + variables.charView.getFitHeight() >= variables.coinView5.getY() && variables.charY <= variables.coinView5.getY() + variables.coinView5.getFitHeight()) {
                    if (variables.charX + variables.charView.getFitWidth() >= variables.coinView5.getX() && variables.charX <= variables.coinView5.getX() + variables.coinView5.getFitWidth()) {
                    	variables.coinView5.setVisible(false);
                    	variables.score += 5;
                    }
                }
                variables.coinView5.setX(2500);
                variables.coinView5.setY(560);

                if (variables.charY + variables.charView.getFitHeight() >= variables.coinView6.getY() && variables.charY <= variables.coinView6.getY() + variables.coinView6.getFitHeight()) {
                    if (variables.charX + variables.charView.getFitWidth() >= variables.coinView6.getX() && variables.charX <= variables.coinView6.getX() + variables.coinView6.getFitWidth()) {
                    	variables.coinView6.setVisible(false);
                    	variables.score += 5;
                    }
                }
                variables.coinView6.setX(3100);
                variables.coinView6.setY(560);

                //peplasja midis karakterit dhe speed boostit
                if (variables.charY + variables.charView.getFitHeight() >= variables.speedBoostView.getY() &&
                		variables.charY <= variables.speedBoostView.getY() + variables.speedBoostView.getFitHeight()) {
                    if (variables.charX + variables.charView.getFitWidth() >= variables.speedBoostView.getX() &&
                    		variables.charX <= variables.speedBoostView.getX() + variables.speedBoostView.getFitWidth()) {
                    	variables.hasSpeedBoost = true;
                        gamePane.getChildren().remove(variables.speedBoostView);
                    }
                }

                if(variables.hasSpeedBoost){
                    if (variables.moveLeft && !variables.moveRight) {
                    	variables.charVelX = variables.hasSpeedBoost ? -10 : -5;
                    	variables.charView.setImage(variables.frameLeft[0]);
                    } else if (!variables.moveLeft && variables.moveRight) {
                    	variables.charVelX = variables.hasSpeedBoost ? 10 : 5;
                    	variables.charView.setImage(variables.frameRight[0]);
                    }

                }

                //teston nese collision nga ndodhur
                if (collided) {
                    //karakteri behet reset te lokacioni i meparshem
                	variables.charX = variables.prevCharX;
                	variables.charY = variables.prevCharY;
                	variables.charVelY = 0;
                	variables.isJumping = false;
                }

                //behet update lokacioni i meparshem
                variables.prevCharX = variables.charX;
                variables.prevCharY = variables.charY;

                //updatohet pozicioni i karakterit
                variables.charView.setLayoutX(variables.charX);
                variables.charView.setLayoutY(variables.charY);

                // Camera follows the character
                double cameraX = variables.charView.getLayoutX() - (double) variables.WIDTH /2;
                double cameraY = variables.charView.getLayoutY() - (double) variables.HEIGHT /2;

                gamePane.setLayoutX(-cameraX);
                gamePane.setLayoutY(-cameraY);

                //update pozicionin e game pane
                gamePane.relocate(-variables.charX + variables.WIDTH / 2, -variables.charY + variables.HEIGHT / 2);

            }
        };
        gameLoop.start();

        level1.resetGameState();
        level1.resetScore();
//        variables.gameScene = frame1.createGameScene();
    }
    
    void gameOver(Stage primaryStage) {
    	Text message2 = new Text(" GameOver :(");
        Text hs2 = new Text("Score: "+ variables.score);
        hs2.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        hs2.setFill(Color.WHITE);
        hs2.setX(590);
        hs2.setY(390);

        message2.setFont(Font.font("Arial", FontWeight.BOLD, 30));
        message2.setFill(Color.WHITE);
        message2.setX(variables.WIDTH / 2 - message2.getLayoutBounds().getWidth() / 2);
        message2.setY(variables.HEIGHT / 2 - message2.getLayoutBounds().getHeight() / 2);

        Pane messagePane2 = new Pane();
        Button playagain2 = new Button("Play Again!");
        playagain2.setLayoutX(610);
        playagain2.setLayoutY(440);
        playagain2.setScaleX(2);
        playagain2.setScaleY(2);

        messagePane2.setStyle("-fx-background-color: rgba(0, 0, 0, 0.7);");
        messagePane2.getChildren().add(message2);
        messagePane2.getChildren().add(playagain2);
        messagePane2.getChildren().add(hs2);
        EventHandler<ActionEvent> eventHandler2 = event -> {
            level1.resetGameState();
            primaryStage.setScene(variables.gameScene);

        };

        playagain2.setOnAction(eventHandler2);

    //skena me mesazhe
    Scene messageScene2 = new Scene(messagePane2,1280,720);
    primaryStage.setScene(messageScene2);
    level1.resetGameState();
    }

   
}


