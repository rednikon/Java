import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import java.util.Random;



/**
 * CCSF Homework #2
 * A JavaFX program that draws your name, but randomly rotates the angle every time it's run.
 * 
 * @author veemac
 *
 */


public class RotatedName extends Application
{

	public void start(Stage primaryStage)
	{
		//Creating the display angle as an integer
		int angle;
		
		//Creating a random generator
		Random randomGenerator = new Random();
		
		//Making the display angle a random degree every time the program is executed
		angle = randomGenerator.nextInt(90) + 1;
		
		
		//Displaying my name
		Text name = new Text(0, 75, "Vee McClure");
		name.setFill(Color.ROYALBLUE);
		name.setFont(Font.font(20));
		name.setRotate(angle);
		
		//Creating bonus output showing angle degree
		Text degree = new Text(100, 100, "Vee at " + angle + " degrees");
		degree.setFill(Color.BLACK);
		degree.setFont(Font.font(20));
		
		//Creating a color background and group
		Group root = new Group(name, degree);
		Scene scene = new Scene(root, 400, 200, Color.DARKORANGE);
		
		//Setting up the stage window in JavaFX
		primaryStage.setScene(scene);
		primaryStage.setTitle("Rotated Name, with JavaFX");
		primaryStage.show();


	}

}
