import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.util.Random;


/**
 * CCSF Homework #2
 * Displaying a rectangle of random colors with JavaFX
 * @author veemac
 *
 */


public class ColoredBackground extends Application
{

	public void start(Stage primaryStage)
	{
		// Creating 3 RGB variables for random generation
		double RGB1, RGB2, RGB3;
		
		//Random generator
		Random randomGenerator = new Random();
		
		//Making the RBG color values random
		RGB1 = randomGenerator.nextDouble();
		RGB2 = randomGenerator.nextDouble();
		RGB3 = randomGenerator.nextDouble();
		
		//Creating the displayed rectangle shape
		Rectangle rect = new Rectangle(60, 70, 250, 60);
		rect.setStroke(Color.BLACK);
		rect.setStrokeWidth(2);
		rect.setFill(Color.color(RGB1, RGB2, RGB3));
		
		//Printing out RGB values
		Text colorValues = new Text(0, 150, "Red = " + RGB1 + '\n' + "Green = " + RGB2 + '\n' + "Blue = " + RGB3);
		colorValues.setFill(Color.BLACK);
		colorValues.setFont(Font.font(20));
				
		
		//Blank background for the rectangle and adding text
		Group root = new Group(rect, colorValues);
		Scene scene = new Scene (root, 400, 200, Color.WHITE);
		
		//Making the FX stage window
		primaryStage.setScene(scene);
		primaryStage.setTitle("Randomly Colored Rectangle, with JavaFX");
		primaryStage.show();

	}

}
