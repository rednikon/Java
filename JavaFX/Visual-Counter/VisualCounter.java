package org.ccsf.homework;
/*
 * A visual display of the Counter class in JavaFX
 * @author veemac
 */

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;



public class VisualCounter extends Application
{
	private Counter counter = new Counter();
	private Text count;
	
	public void start(Stage primaryStage) 
	{
		count = new Text("Current count: " + counter.getCount());
		
		Button increment = new Button("Increment");
		increment.setOnAction(this::pressIncrement);
		
		
		Button reset = new Button("Reset");		
		reset.setOnAction(this::pressReset);
		
		
		FlowPane pane = new FlowPane(increment, reset, count);
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(60);
		pane.setStyle("-fx-background-color: lightblue");
		
		Scene scene = new Scene(pane, 500, 250);
		
		primaryStage.setTitle("Visual Counter");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
		
	public void pressIncrement(ActionEvent event)
	{
		counter.click();
			
		count.setText("Count: " + counter.getCount());
			
	}

	public void pressReset(ActionEvent event)
	{
		counter.reset();
			
		count.setText("Count = " + counter.getCount());
			
	}
	
	public static void main(String[] args)
	{
		launch(args);
			
	}
		

}
