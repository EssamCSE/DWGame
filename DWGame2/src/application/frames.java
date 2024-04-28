package application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class  frames {
	public void background(Stage primaryStage,Button playButton)
	{
		Image img = new Image(getClass().getResourceAsStream("/Assets/main.png"));
        ImageView imageView = new ImageView(img);
        imageView.setOpacity(0.9);

        Pane pane = new Pane();

        pane.getChildren().add(imageView);

        VBox vbox = new VBox();
        vbox.getChildren().add(playButton);
        vbox.setAlignment(Pos.BOTTOM_CENTER);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(pane);
        stackPane.getChildren().add(vbox);

        Scene scene = new Scene(stackPane, variables.WIDTH, variables.HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setWidth(variables.WIDTH);
        primaryStage.setHeight(variables.HEIGHT);
        primaryStage.setTitle("Door Way Game");
        primaryStage.show();

        
	}
	
	public void load_frames()
	{
    variables.frameLeft = new Image[8];
    variables.frameRight = new Image[8];
    variables.frameJump = new Image[12];
    variables.frameStandLeft = new Image[1];
    variables.frameStandRight = new Image[1];

    for (int i = 0; i < variables.frameLeft.length; i++) {
    	int k = i + 1;
    	variables.frameLeft[i] = new Image(getClass().getResourceAsStream("/RunLeft/Run (" + k + ").png"));
    }

    for (int i = 0; i < variables.frameRight.length; i++) {
        int k = i + 1;
        variables.frameRight[i] = new Image(getClass().getResourceAsStream("/RunRight/Run (" + k + ").png"));
    }

    for (int i = 0; i < variables.frameJump.length; i++) {
    	variables.frameJump[i] = new Image(getClass().getResourceAsStream("/Assets/Idle (1).png"));
    }

    variables.frameStandLeft[0] = new Image(getClass().getResourceAsStream("/RunLeft/Run (1).png"));
    variables.frameStandRight[0] = new Image(getClass().getResourceAsStream("/RunRight/Run (1).png"));

    variables.charView = new ImageView(variables.frameRight[0]);
    variables.charView.setFitWidth(52);
    variables.charView.setFitHeight(52);
    variables.charVelX = 0;
    variables.charVelY = 0;

    variables.charX = variables.platforma.getX();
    variables.charY = variables.platforma.getY() - variables.charView.getFitHeight();

}
	public Scene createGameScene() {

        Pane gamePane = new Pane();
        gamePane.setPrefSize(variables.WIDTH, variables.HEIGHT);
        gamePane.setStyle("-fx-background-color: #87CEEB;");

      //decoration
        Image image = new Image(getClass().getResourceAsStream("/Assets/cloud2.png"));
        ImageView imageView = new ImageView(image);
        imageView.setX(800);
        imageView.setY(100);
        imageView.setFitWidth(400);
        imageView.setFitHeight(400);

        Image image1 = new Image(getClass().getResourceAsStream("/Assets/cloud1.png"));
        ImageView imageView1 = new ImageView(image1);
        imageView1.setX(300);
        imageView1.setY(200);
        imageView1.setFitWidth(400);
        imageView1.setFitHeight(400);

        Image image4 = new Image(getClass().getResourceAsStream("/Assets/cloud2.png"));
        ImageView imageView4 = new ImageView(image4);
        imageView4.setX(2900);
        imageView4.setY(200);
        imageView4.setFitWidth(400);
        imageView4.setFitHeight(400);

        Image image5 = new Image(getClass().getResourceAsStream("/Assets/cloud1.png"));
        ImageView imageView5 = new ImageView(image5);
        imageView5.setX(3400);
        imageView5.setY(220);
        imageView5.setFitWidth(400);
        imageView5.setFitHeight(400);

        Image image6 = new Image(getClass().getResourceAsStream("/Assets/cloud3.png"));
        ImageView imageView6 = new ImageView(image6);
        imageView6.setX(4100);
        imageView6.setY(200);
        imageView6.setFitWidth(400);
        imageView6.setFitHeight(400);

        Image image7 = new Image(getClass().getResourceAsStream("/Assets/Bush (1).png"));
        ImageView imageView7 = new ImageView(image7);
        imageView7.setX(300);
        imageView7.setY(539);
        imageView7.setFitWidth(80);
        imageView7.setFitHeight(65);

        Image image8 = new Image(getClass().getResourceAsStream("/Assets/Bush (3).png"));
        ImageView imageView8 = new ImageView(image8);
        imageView8.setX(820);
        imageView8.setY(642);
        imageView8.setFitWidth(80);
        imageView8.setFitHeight(65);

        //coin
        ObjectManager obj=new ObjectManager();
        obj.showCoin();

        ///tree
        ObjectManager obj1 = new ObjectManager();

     // Assuming variables.tree, variables.tree2, variables.tree3 are Rectangles
        obj1.showTree();
        //
        obj1.showmobs ();
      //
        obj1.showborder();

        obj1.showplatform();

       obj1.showWallborder();
       
       obj1.showSpeedObj ();

        gamePane.getChildren().addAll(variables.platforma2,
        		variables.platforma,variables.lborderwall,imageView,
        		variables.tree,variables.platforma4,variables.platforma3,variables.platforma5,variables.rborderwall,
                imageView1,imageView4,imageView5,
                imageView6,imageView7,imageView8,variables.tree2,variables.tree3,variables.mob1,variables.mob2,variables.platformaflag,variables.speedBoostView

        );

        Scene scene = new Scene(gamePane, variables.WIDTH*3 , variables.HEIGHT);
        scene.setFill(Color.SKYBLUE);

        return scene;
    }

}



 

