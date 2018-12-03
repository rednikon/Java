import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.stage.Stage;



/**
 * Demonstrating JavaFX application by displaying two Text objects in a JavaFX window
 * @author veemac
 *
 */
public class HelloJavaFX extends Application
{

    public void start(Stage primaryStage)
    {
        Text hello = new Text(0, 75, "Hello, Taiyi!");
        hello.setFill(Color.GREEN);
        hello.setFont(Font.font(20));
        
        Text question = new Text(125, 75, "How's it going?");
        question.setFill(Color.RED);
        question.setFont(Font.font(15));
        
        Group root = new Group(hello, question);
        Scene scene = new Scene(root, 300, 120, Color.WHITE);        
        primaryStage.setScene(scene);
        primaryStage.setTitle("A JavaFX Program");
        primaryStage.show();
    }
    
}

