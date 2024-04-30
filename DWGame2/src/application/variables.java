package application;



import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class variables {
	public static javafx.scene.Scene gameScene;
    public static boolean hasSpeedBoost = false;
    public static ImageView speedBoostView;

    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;

    public static final int boostX = 2450;
    public static final int boostY = 570;
	private static final Paint treeimgp = null;
	private static final Paint treeimgp2 = null;
	private static final Paint treeimgp3 = null;
	
    public static Image[] frameLeft;
    public static Image[] frameRight;
    public static Image[] frameJump;
    public static Image[] frameStandLeft;
    public static Image[] frameStandRight;

    public static ImageView charView;
    public static double charX;
    public static double charY;
    public static double charVelX;
    public static double charVelY;

    public static boolean moveLeft;
    public static boolean moveRight;
    public static boolean isJumping;
    public static double prevCharX;
    public static double prevCharY;

    public static Rectangle platforma;

    public static Rectangle lborderwall;
    
    
    public static Rectangle platforma2;
    public static Rectangle platforma3;
    public static Rectangle platforma4;
    public static Rectangle platforma5;
    public static Rectangle platforma6;
    public static Rectangle platforma7;
    public static Rectangle platforma8;
    public static Rectangle platforma9;
    public static Rectangle platforma10;
    
    public static Rectangle rborderwall;
    
    public static Rectangle tree;
    public static Rectangle tree2;
    public static Rectangle tree3;
    public static Paint treePaint=treeimgp;
    public static Paint tree2Paint=treeimgp2;
    public static Paint tree3Paint=treeimgp3;
    public static boolean reachedPlatform = false;
    public static Rectangle mob1;
    public static boolean touchedMob1 = false;
    public static boolean touchedMob2 = false;
    public static Rectangle mob2;

    public static ImageView coinView;
    public static ImageView coinView2;
    public static ImageView coinView3;
    public static ImageView coinView4;
    public static ImageView coinView5;
    public static ImageView coinView6;
    
    public static ImageView[] coinViews;

    public static int score = 0;

    public static Rectangle platformaflag;
    public static final int SCREEN_HEIGHT = HEIGHT + 100;
}
