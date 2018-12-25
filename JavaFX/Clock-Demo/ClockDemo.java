import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Date: Saturday, December 8, 2018 
 * Class: CS 111B-Programming Fundamentals: Java-551
 * Assignment: CCSF Intro to Java Final Project
 * 
 * @author Kelly Hong and Vee McClure
 */

//builds the clock in JavaFX
public class ClockDemo extends Application {
	final double CLOCK_RADIUS = 100;

	public static void main(String[] args) throws Exception {
		launch(args);
	}

	public void start(final Stage stage) throws Exception {
		// create the scene elements
		final Pane backdrop = makeBackdrop("backdrop", stage);

		// layout the scene
		final Scene scene = createClockScene(makeAnalogClock(stage));

		// size the backdrop to the scene
		sizeToScene(backdrop, scene);

		// show the scene
		stage.initStyle(StageStyle.TRANSPARENT);
		stage.setScene(scene);
		stage.show();

	}

	private AnalogClock makeAnalogClock(Stage stage) {
		final AnalogClock AnalogClock = new AnalogClock(CLOCK_RADIUS);
		return AnalogClock;
	}

	private void sizeToScene(Pane pane, Scene scene) {
		pane.prefWidthProperty().bind(scene.widthProperty());
		pane.prefHeightProperty().bind(scene.heightProperty());
	}

	private Scene createClockScene(Parent layout) {
		final Scene scene = new Scene(layout, Color.TRANSPARENT);
		return scene;
	}

	private Pane makeBackdrop(String id, Stage stage) {
		Pane backdrop = new Pane();
		backdrop.setId(id);
		return backdrop;
	}
}
