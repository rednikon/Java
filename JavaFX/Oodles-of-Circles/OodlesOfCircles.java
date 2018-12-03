import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.Random;

/**
 * CCSF Homework #4
 * Write a JavaFX application that draws 100 circles of random fill color, random stroke color, random stroke thickness (up to 20 pixels), 
 * and random size (up to a radius of 150 pixels), in random locations. Make sure that each circle appears in the visible area of the scene.
 * 
 * @author veemac
 *
 */
public class OodlesOfCircles extends Application
{
	
	@Override
	public void start(Stage primaryStage) 
	{
		//variable names for circle details and count
		int strokeThickness, centerX, centerY, radius;
		int circleCount = 0;
		double redCircleValue, greenCircleValue, blueCircleValue;
		double redStrokeValue, greenStrokeValue, blueStrokeValue;
		
		Group root;
		
		
		//building the random generator for all variable values
		Random randomGenerator = new Random();
		
		//color values for circle fill
		redCircleValue = randomGenerator.nextDouble();
		greenCircleValue = randomGenerator.nextDouble();
		blueCircleValue = randomGenerator.nextDouble();
		
		//color values for circle stroke
		redStrokeValue = randomGenerator.nextDouble();
		greenStrokeValue = randomGenerator.nextDouble();
		blueStrokeValue = randomGenerator.nextDouble();
		
		
		centerX = randomGenerator.nextInt(925);
		centerY = randomGenerator.nextInt(925);
		radius = randomGenerator.nextInt(150) + 1;
		strokeThickness = randomGenerator.nextInt(20) + 1;
		
		
		//while loop to create 100 circles
		while (circleCount <= 100);
		{
			Circle newCircle = new Circle(centerX, centerY, radius);
			
			newCircle.setFill(Color.color(redCircleValue, greenCircleValue, blueCircleValue));
			newCircle.setStroke(Color.color(redStrokeValue, greenStrokeValue, blueStrokeValue));
			newCircle.setStrokeWidth(strokeThickness);			
			circleCount++;
			
			root = new Group(newCircle);
			
		}
		
		Scene scene = new Scene(root, 1000, 1000, Color.WHITE);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("A Rainbow of 100 Random Circles");
		primaryStage.show();
		
	}

}
