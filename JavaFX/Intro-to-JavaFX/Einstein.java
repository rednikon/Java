import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * This program creates and displays several shapes
 * @author veemac
 *
 */

public class Einstein extends Application
{

    public void start(Stage primaryStage)
    {
        Line line = new Line(35, 60, 150, 170);
        
        Line line2 = new Line(50, 40, 275, 40);

        Circle circle = new Circle(100, 65, 20);
        circle.setFill(Color.GREEN);
        
        Rectangle rect = new Rectangle(60, 70, 250, 60);
        rect.setStroke(Color.YELLOW);
        rect.setStrokeWidth(2);
        rect.setFill(Color.WHITE);        
        
        Ellipse ellipse = new Ellipse(175, 100, 150, 100);
        ellipse.setFill(Color.PALEGREEN);
        
        Text quote = new Text(120, 100, "It's better in " +
                "Python.\n-- Taiyi");
        
        Group root = new Group(ellipse, rect, circle, line, line2, quote);
        Scene scene = new Scene(root, 400, 200);        
        primaryStage.setScene(scene);
        primaryStage.setTitle("Taiyi");
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
