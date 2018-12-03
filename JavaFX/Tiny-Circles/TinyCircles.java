import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.util.Random;

/**
 * CCSF Homework #4
 * Write a JavaFX Application TinyCircles that draws 10,000 very small circles (radius 3 pixels), in random locations within the visible area.
 * Fill the dots on the left half of the scene with red, and the dots on the right half of the scene yellow. 
 * You can use the getWidth() method of the Scene to determine the halfway point.
 * 
 * @author veemac
 *
 */

public class TinyCircles extends Application
{
	Group root;
	
	
	public void start(Stage primaryStage) 
	{
		int circleCount = 0;
		int radius = 3;
		int centerX, centerY;
	
		
		Random randomGenerator = new Random();
		
		centerX = randomGenerator.nextInt(998);
		centerY = randomGenerator.nextInt(998);
		
		while (circleCount <= 10000)
		{
			Circle newCircle = new Circle(centerX, centerY, radius);
			
			if (centerX < 500)
			{
				newCircle.setFill(Color.RED);
			}
			else 
			{
				newCircle.setFill(Color.YELLOW);
			}
			
			root = new Group(newCircle);
			
		}
		 
		Scene scene = new Scene(root, 1000, 1000, Color.WHITE);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("A Split Scene of Red and Yellow Circles");
		primaryStage.show();

	
	}
	
	
}
