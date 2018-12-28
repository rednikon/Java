import java.util.Random;
import java.util.stream.DoubleStream;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 * Take the example shown in class, RecursiveTree, and play with it.  See if you can make it more random.
 * I made the branch color random blues, and added several branches. Also played around with the angles.
 * 
 * @author veemac
 */
public class RecursiveTree extends Application {
	Random random = new Random();

	@Override
	public void start(Stage primaryStage) {        
        Group rootGroup = new Group();
        
        Scene scene = new Scene(rootGroup, 1000, 500, Color.LIGHTYELLOW);
		Point2D startingPoint = new Point2D(scene.getWidth()/2, scene.getHeight());

		// the recursive step
		drawBranch(rootGroup, startingPoint, scene.getHeight()/2, 90.0f);
		
        primaryStage.setTitle("Tree");
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	/**
	 * draw requested branch, then recursively draw 2 more branches at its end
	 */
	private void drawBranch(Group g, Point2D start, double length, double angle) {
		if (length < 2) {
			// If the branch would be very small then stop drawing.
			// This is the base case of recursion.
			return;
		}

		// make requested line
		//changed color to random blue
		Line l = makeLine(start, (float)length, (float)angle);
		l.setStroke(new Color(0, 0, random.nextDouble(), 1));
		l.setStrokeWidth(2);
		g.getChildren().add(l);
		
		//played with length, angle, and added more branches
		// these are recursive calls
		Point2D end = new Point2D(l.getEndX(), l.getEndY());
		drawBranch(g, end, length/1.5, angle - 80);
		drawBranch(g, end, length/1.5, angle + 80);
		drawBranch(g, end, length/2, angle - 40);
		drawBranch(g, end, length/2.5, angle + 20);
		drawBranch(g, end, length/2.5, angle + 20);
	}

	/**
	 * Create a JavaFX Line, given a start point, a length and an angle.
	 * @param angle the angle in radians starting counterclockwise from horizontal
	 */
	private static Line makeLine(Point2D start, double length, double angle) {
		double incrementX = length*Math.cos(angle);
		double incrementY = -length*Math.sin(angle);  // negative because y values inverted
		Point2D end = start.add(new Point2D(incrementX, incrementY));
		Line l = new Line(start.getX(), start.getY(), end.getX(), end.getY());
		return l;
	}
	
	
	/**
	 * Create a JavaFX Line, given a start point, a length and an angle.
	 * @param angle the angle in degrees starting counterclockwise from horizontal
	 */
	private static Line makeLine(Point2D start, float length, float angleDegrees) {
		Line line = makeLine(start, (double)length, (double)angleDegrees/360.0*2*Math.PI);
		return line;
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}


}
