package application;
import java.util.concurrent.Flow.Publisher;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class  frames {
	
	public static ImageView imageView;
	public static ImageView imageView1;
	public static ImageView imageView2;
	public static ImageView imageView3;
	public static ImageView imageView4;
	public static ImageView imageView5;
	public static ImageView imageView6;
	public static ImageView imageView7;
	public static ImageView imageView8;
	public static ImageView imageView9;
	public static ImageView imageView10;
	public static ImageView imageView11;
	public static ImageView imageView12;
	public static ImageView imageView13;
	public static ImageView imageView14;
	public static ImageView imageView15;
	public static ImageView imageView16;
	public static ImageView imageView17;
	public static ImageView imageView18;
	public static ImageView imageView19;
	public static ImageView imageView110;
	protected Pane gamePane;
	
	private boolean collided3;
	private boolean collided4;
	
	
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
	public void createPane(ImageView imageView,  double x, double y, double width, double height, String imagePath) {
	    Image image = new Image(getClass().getResourceAsStream(imagePath));
	    imageView.setImage(image);
	    imageView.setX(x);
	    imageView.setY(y);
	    imageView.setFitWidth(width);
	    imageView.setFitHeight(height);
	}

	public Scene createGameScene() {

        Pane gamePane = new Pane();
        Pane gamePane2 = new Pane();
        gamePane.setPrefSize(variables.WIDTH, variables.HEIGHT);
        gamePane.setStyle("-fx-background-color: #87CEEB;");
        
        

      //decoration
        imageView = new ImageView();
        createPane(imageView, 800, 100, 400, 400, "/Assets/cloud2.png");
        
       // للإختصار
//        Image image = new Image(getClass().getResourceAsStream("/Assets/cloud2.png"));
//        ImageView imageView = new ImageView(image);
//        imageView.setX(800);
//        imageView.setY(100);
//        imageView.setFitWidth(400);
//        imageView.setFitHeight(400);

        imageView1 = new ImageView();
        createPane(imageView1, 300, 200, 400, 400, "/Assets/cloud1.png");
//        Image image1 = new Image(getClass().getResourceAsStream("/Assets/cloud1.png"));
//        ImageView imageView1 = new ImageView(image1);
//        imageView1.setX(300);
//        imageView1.setY(200);
//        imageView1.setFitWidth(400);
//        imageView1.setFitHeight(400);
        
        imageView4 = new ImageView();
        createPane(imageView4, 2900, 200, 400, 400, "/Assets/cloud2.png");
//        Image image4 = new Image(getClass().getResourceAsStream("/Assets/cloud2.png"));
//        ImageView imageView4 = new ImageView(image4);
//        imageView4.setX(2900);
//        imageView4.setY(200);
//        imageView4.setFitWidth(400);
//        imageView4.setFitHeight(400);

        imageView5 = new ImageView();
        createPane(imageView5, 3400, 220, 400, 400, "/Assets/cloud1.png");
//        Image image5 = new Image(getClass().getResourceAsStream("/Assets/cloud1.png"));
//        ImageView imageView5 = new ImageView(image5);
//        imageView5.setX(3400);
//        imageView5.setY(220);
//        imageView5.setFitWidth(400);
//        imageView5.setFitHeight(400);
        
        imageView6 = new ImageView();
        createPane(imageView6, 4100, 200, 400, 400,"/Assets/cloud3.png");
//        Image image6 = new Image(getClass().getResourceAsStream("/Assets/cloud3.png"));
//        ImageView imageView6 = new ImageView(image6);
//        imageView6.setX(4100);
//        imageView6.setY(200);
//        imageView6.setFitWidth(400);
//        imageView6.setFitHeight(400);
        
        imageView7 = new ImageView();
        createPane(imageView7, 300, 539, 80, 65, "/Assets/Bush (1).png");
//        Image image7 = new Image(getClass().getResourceAsStream("/Assets/Bush (1).png"));
//        ImageView imageView7 = new ImageView(image7);
//        imageView7.setX(300);
//        imageView7.setY(539);
//        imageView7.setFitWidth(80);
//        imageView7.setFitHeight(65);
        
        imageView8 = new ImageView();
        createPane(imageView8, 820, 642, 80, 65, "/Assets/Bush (3).png");
        
        
//        Image image8 = new Image(getClass().getResourceAsStream("/Assets/Bush (3).png"));
//        ImageView imageView8 = new ImageView(image8);
//        imageView8.setX(820);
//        imageView8.setY(642);
//        imageView8.setFitWidth(80);
//        imageView8.setFitHeight(65);
        
        imageView8 = new ImageView();
        createPane(imageView8, 820, 642, 80, 65, "/Object/Bush (3).png");
        
        imageView9 = new ImageView();
        createPane(imageView9, 1500, 539, 80, 65, "/Object/Mushroom_1.png");
        
        imageView10 = new ImageView();
        createPane(imageView10, 1600, 435, 180, 165, "/Retina/house2.png");
        
//        imageView12 = new ImageView();
//        createPane(imageView9, 1600, 435, 180, 165, "/Retina/house2.png");
//        
        imageView13 = new ImageView();
        createPane(imageView13, 1800, 500, 80, 100, "/Retina/treePalm.png");
        
        imageView14 = new ImageView();
        createPane(imageView14, 1000, 50, 80, 100, "/Retina/sun.png");

        
        
        imageView15 = new ImageView();
        createPane(imageView15, 3550, 460, 50, 100, "/Retina/treeSmall_green1.png");
        
        imageView16 = new ImageView();
        createPane(imageView16, 3600, 520, 50, 50, "/Retina/bush4.png");
        
//        imageView9 = new ImageView();
//        createPane(imageView8, 820, 642, 80, 65, "/Object/Bush (3).png");
//        
//        imageView9 = new ImageView();
//        createPane(imageView8, 820, 642, 80, 65, "/Object/Bush (3).png");
//        
        
        //coin
        ObjectManager obj=new ObjectManager();
        obj.showCoin();

        ///tree
        ObjectManager obj1 = new ObjectManager();

     // Assuming variables.tree, variables.tree2, variables.tree3 are Rectangles
        obj1.showTree();
      
        obj1.showmobs ();
    
        obj1.showborder();


       obj1.showWallborder();
       
       obj1.showSpeedObj ();
       
       createLine(gamePane);
       createTriangle(gamePane);
       createSea(gamePane);
       
       obj1.showplatform();
       gamePane.getChildren().addAll(variables.platforma2,
        		variables.platforma,variables.lborderwall,imageView,
        		variables.tree,variables.platforma4,variables.platforma3,variables.platforma5,variables.rborderwall,
                imageView1,imageView4,imageView5,
                imageView6,imageView7,imageView8,imageView9,imageView10,
                imageView13,imageView14,imageView15,imageView16,
                
                
                variables.tree2,variables.tree3,variables.mob1,variables.mob2,variables.platformaflag,variables.speedBoostView

        );

        Scene scene = new Scene(gamePane, variables.WIDTH*3 , variables.HEIGHT);
        scene.setFill(Color.SKYBLUE);
        
        return scene;
    }
	
	
	public void createTriangle(Pane gamePane) {
		
	       TriangleCrate trin1 = new TriangleCrate();
	       TriangleCrate trin2 = new TriangleCrate();
//	       trin1.createTriangleCrate(gamePane, 500, 556);
	       trin2.createTriangleCrate(gamePane, 2000, 556);
	       trin1.createTriangleCrate2(gamePane, 6500, 556);
	}
	
	
	public void createLine(Pane gamePane) {
		
		
	  LineCrate line1  = new LineCrate();
	       line1.createLineCrate(gamePane, 1000, 456);
	       
	  LineCrate line2  = new LineCrate();
	       line2.createLineCrate2(gamePane, 2500, 456);
	      
      LineCrate line3  = new LineCrate();
	       line3.createLineCrate3(gamePane, 6200, 400);
	       
	  LineCrate line4  = new LineCrate();
	       line4.createLineCrateSeperated(gamePane, 4300, 556);
	       
	  LineCrate line5  = new LineCrate();
	       line5.createLineLand(gamePane, 3500, 556);

	  LineCrate line6  = new LineCrate();
	       line6.createLineLandP(gamePane, 4000, 456);
	       
	  LineCrate line7  = new LineCrate();
	       line7.createLineLandP1(gamePane, 4500, 356);
	       
	  LineCrate line8  = new LineCrate();
	       line8.createLineLandP2(gamePane, 5000, 456);
	       
	  LineCrate line9  = new LineCrate();
	       line9.createLineLandP3(gamePane, 5500, 556);
	}
	
	public void createSea(Pane gamePane) {
		Sea sea = new Sea();
		sea.createSea(gamePane, 3450, 700);
		sea.createSea2(gamePane, 3450, 750);
		sea.createSea2(gamePane, 3450, 800);
		sea.createSea2(gamePane, 3450, 850);
		sea.createSea2(gamePane, 3450, 900);
		sea.createSea2(gamePane, 3450, 950);
	}

	
	
	
	
}



 

