package application;

import application.RoShamBo.MoveType;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Displaying RoShamBo game in JavaFX, @author veemac, built with Kelly Hong
 * 
 */

public class RoShamBoFX extends Application {

	private ImageView computerMoveImageView, userMoveImageView;
	private Image rockImage, paperImage, scissorsImage;
	private Text matchOutcomeText, cWinsText, uWinsText, tieText;
	private Button rockButton, paperButton, scissorsButton;
	private HBox labelBox;
	private MoveType cpuMove = MoveType.ROCK;
	private MoveType playerMove = MoveType.ROCK;

	private RoShamBo game;

	public void start(Stage primaryStage) {
		
		game = new RoShamBo();

		//establishing the images of the game
		rockImage = new Image("rock.jpg");
		paperImage = new Image("paper.jpg");
		scissorsImage = new Image("scissors.jpg");
		computerMoveImageView = new ImageView(paperImage);
		
		//creating default game view 
		computerMoveImageView.setVisible(false); 
		userMoveImageView = new ImageView(paperImage);
		userMoveImageView.setVisible(false);
		HBox imageBox = new HBox(computerMoveImageView, userMoveImageView);
		imageBox.setAlignment(Pos.CENTER);
		imageBox.setSpacing(20);

		Text computerLabel = new Text("Computer's Move");
		computerLabel.setFont(Font.font("Helvetica", 14));
		Text yourLabel = new Text("Your Move");
		yourLabel.setFont(Font.font("Helvetica", 14));
		labelBox = new HBox(computerLabel, yourLabel);
		labelBox.setAlignment(Pos.CENTER);
		labelBox.setSpacing(30);
		labelBox.setVisible(false);

		//user buttons (Rock, Paper, Scissors)
		rockButton = new Button("Play Rock");
		rockButton.setOnAction(this::handleRockButton);
		paperButton = new Button("Play Paper");
		paperButton.setOnAction(this::handlePaperButton);
		scissorsButton = new Button("Play Scissors");
		scissorsButton.setOnAction(this::handleScissorsButton);
		HBox buttonBox = new HBox(rockButton, paperButton, scissorsButton);
		buttonBox.setSpacing(10);
		buttonBox.setAlignment(Pos.CENTER);

		//match results in JavaFX
		matchOutcomeText = new Text();
		matchOutcomeText.setFill(Color.GREEN);
		matchOutcomeText.setFont(Font.font("Helvetica", 20));
			
		//displaying game stats
		cWinsText = new Text("Computer Wins: " + game.getCWins());
		cWinsText.setFont(Font.font("Helvetica", 16));
		cWinsText.setFill(Color.BLUE);
		uWinsText = new Text("User Wins: " + game.getUWins());
		uWinsText.setFont(Font.font("Helvetica", 16));
		uWinsText.setFill(Color.BLUE);
		tieText = new Text("Ties: " + game.getTies());
		tieText.setFont(Font.font("Helvetica", 16));
		tieText.setFill(Color.BLUE);
		HBox statsBox = new HBox(cWinsText, uWinsText, tieText);
		statsBox.setSpacing(10);
		statsBox.setAlignment(Pos.CENTER);

		VBox pane = new VBox(imageBox, labelBox, matchOutcomeText, buttonBox, statsBox);
		pane.setAlignment(Pos.CENTER);
		pane.setSpacing(20);
		pane.setStyle("-fx-background-color: white");

		Scene scene = new Scene(pane, 400, 400, Color.TRANSPARENT);
		primaryStage.setTitle("Rock, Paper, Scissors, Go!");
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	//image for player's rock move  
	private void handleRockButton(ActionEvent event) {
		userMoveImageView.setImage(rockImage);
		playerMove = MoveType.ROCK;
		displayMovesAndMatchResultion();
		
	}
	
	//image for player's scissors move  
	private void handleScissorsButton(ActionEvent event) {
		userMoveImageView.setImage(scissorsImage);
		playerMove = MoveType.SCISSORS;
		displayMovesAndMatchResultion();
	}
	
	 //image for player's paper move  
	private void handlePaperButton(ActionEvent event) {
		userMoveImageView.setImage(paperImage);
		playerMove = MoveType.PAPER;
		displayMovesAndMatchResultion();
	}
	
	 //image of Comupter's random move and the player's selected move
	//displays visual outcome of match
	private void displayMovesAndMatchResultion() {
		userMoveImageView.setVisible(true);
		computerMoveImageView.setVisible(true);
		labelBox.setVisible(true);
		displayMatchOutcome();
	}
	
	 //displays text announcing match outcome
	 //updates tie, computer win, and player win counters
	private void displayMatchOutcome() {
		MoveType cpuMove = ComputerMove();
		switch (game.findWinner(playerMove, cpuMove)) {
	case USER_WIN:
		if (playerMove == MoveType.PAPER)
		{
			matchOutcomeText.setText("Paper smoothers Rock! You Win!");
			uWinsText.setText("User Wins: " + game.getUWins());
		}
		else if (playerMove == MoveType.ROCK)
		{
			matchOutcomeText.setText("Rock smashes Scissors! You Win!");
			uWinsText.setText("User Wins: " + game.getUWins());
		}
		else if (playerMove == MoveType.SCISSORS)
		{
			matchOutcomeText.setText("Scissors shred Paper! You Win!");
			uWinsText.setText("User Wins: " + game.getUWins());
		} 
		break;
	case COMPUTER_WIN:
		if (cpuMove == MoveType.PAPER)
		{
			matchOutcomeText.setText("Paper smoothers Rock! You Lose!");
			cWinsText.setText("Computer Wins: " + game.getCWins());
		}
		else if (cpuMove == MoveType.ROCK)
		{
			matchOutcomeText.setText("Rock smashes Scissors! You Lose!");
			cWinsText.setText("Computer Wins: " + game.getCWins());
		}
		else if (cpuMove == MoveType.SCISSORS)
		{
			matchOutcomeText.setText("Scissors shred Paper! You Lose!");
			cWinsText.setText("Computer Wins: " + game.getCWins());
		} 
		break;
	case TIE:
		matchOutcomeText.setText("It's a Tie!");
		tieText.setText("Ties: " + game.getTies());
		break;
		}
	}
	
	 //sets image for Comupter's random move
	private MoveType ComputerMove(){
		cpuMove = game.generateComputerPlay();
		
		switch (cpuMove) {
		case ROCK:
			computerMoveImageView.setImage(rockImage);
			break;
		case PAPER:
			computerMoveImageView.setImage(paperImage);
			break;
		case SCISSORS:
			computerMoveImageView.setImage(scissorsImage);
			break;
		}
		return cpuMove;
	}

	public static void main(String[] args) {
		launch(args);
	}

}