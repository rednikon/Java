import java.util.concurrent.RecursiveAction;
import java.util.Random;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/** 
 * recursive squares, with alternating colors,
 * and alternating layouts,
 * as layers descend
 */
public class RecursiveSquaresAlternatingColorsLayouts extends Application {
	private Color[] colors = {Color.BLACK, Color.RED, Color.YELLOW, Color.BLUE};
	Random random = new Random();
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		final int width = 900;
		Rectangle square = new Rectangle(0, 0, width, width);
		square.setFill(Color.RED);
		Group root = new Group(square);
		Scene scene = new Scene(root, width, width);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Recursive Squares 3: colors, layouts by level");
		primaryStage.show();
		int level = 0;
		drawSubsquares(level, root, square);
	}

	/** draw 4 subsquares that fill square param */
	private void drawSubsquares(int recursionLevel, Group root, Rectangle square) {
		if (square.getWidth() <= 3) {
			// base case: can no longer recurse down, because
			// cannot draw finer detail on this screen
			return;
		}
		
		final double subsquareWidth = square.getWidth()/2;

		if (recursionLevel % 2 == 0) {
			// upper left corner
			Rectangle subsquare = new Rectangle(square.getX(), square.getY(), subsquareWidth, subsquareWidth);
			subsquare.setFill(pickColor(recursionLevel));
			root.getChildren().add(subsquare);
			// lower right corner
			Rectangle subsquare3 = new Rectangle(square.getX() + subsquareWidth, square.getY() + subsquareWidth, subsquareWidth, subsquareWidth);
			subsquare3.setFill(pickColor(recursionLevel));
			root.getChildren().add(subsquare3);
			// upper right corner: recursion
			Rectangle subsquare1 = new Rectangle(square.getX() + subsquareWidth, square.getY(), subsquareWidth, subsquareWidth);
			drawSubsquares(recursionLevel + 1, root, subsquare1);
			// lower left corner: recursion
			// this does not work out -- covers almost everything!
			Rectangle subsquare2 = new Rectangle(square.getX(), square.getY() + subsquareWidth, subsquareWidth, subsquareWidth);
			drawSubsquares(recursionLevel + 1, root, subsquare2);
		} else {
			// upper left corner
			Rectangle subsquare = new Rectangle(square.getX(), square.getY(), subsquareWidth, subsquareWidth);
			drawSubsquares(recursionLevel + 1, root, subsquare);
			//subsquare.setFill(pickColor(recursionLevel));
			//root.getChildren().add(subsquare);
			// lower right corner
			Rectangle subsquare3 = new Rectangle(square.getX() + subsquareWidth, square.getY() + subsquareWidth, subsquareWidth, subsquareWidth);
			drawSubsquares(recursionLevel + 1, root, subsquare3);
			//subsquare3.setFill(pickColor(recursionLevel));
			//root.getChildren().add(subsquare3);
			// upper right corner: recursion
			Rectangle subsquare1 = new Rectangle(square.getX() + subsquareWidth, square.getY(), subsquareWidth, subsquareWidth);
			//drawSubsquares(recursionLevel + 1, root, subsquare1);
			subsquare1.setFill(pickColor(recursionLevel));
			root.getChildren().add(subsquare1);
			// lower left corner: recursion
			// this does not work out -- covers almost everything!
			Rectangle subsquare2 = new Rectangle(square.getX(), square.getY() + subsquareWidth, subsquareWidth, subsquareWidth);
			//drawSubsquares(recursionLevel + 1, root, subsquare2);
			subsquare2.setFill(pickColor(recursionLevel));
			root.getChildren().add(subsquare2);
		}
	}
	
	Color pickColor(int level) {
		return colors[level % colors.length];
	}

}
