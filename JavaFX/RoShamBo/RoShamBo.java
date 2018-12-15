package application;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * RoShamBo game, @author veemac, built with Kelly Hong
 * 
 */

// class should only handle the game - it shouldn't have any interaction with the user.
public class RoShamBo 
{

	int computerWins = 0;
	int userWins = 0;
	int ties = 0;

	MatchOutcome matchResolution = MatchOutcome.TIE;

	// possible match outcomes (user win, computer win, tie, keep_playing)
	// keep_playing was added to handle else condition in findWinner
	public enum MatchOutcome { USER_WIN, COMPUTER_WIN, TIE}

	// possible moves
	public enum MoveType { ROCK, PAPER, SCISSORS }
	
	// generates and returns a random move by the computer.
	public MoveType generateComputerPlay() {
		List<MoveType> moveValues = Collections.unmodifiableList(Arrays.asList(MoveType.values()));
		int size = moveValues.size();
		Random random = new Random();
		return moveValues.get(random.nextInt(size));
	}

	// takes in two moves as parameters (the userMove and the computerMove)
	// and determines and returns the outcome (user wins, computer wins, or tie).
	// update the appropriate win/loss/tie count (the instance data variables)
	// before returning a value.
	public MatchOutcome findWinner(MoveType userMove, MoveType computerMove) {

		// tie conditions
		if (userMove == MoveType.ROCK && computerMove == MoveType.ROCK) {
			matchResolution = MatchOutcome.TIE;
			++ties;
		} else if (userMove == MoveType.PAPER && computerMove == MoveType.PAPER) {
			matchResolution = MatchOutcome.TIE;
			++ties;
		} else if (userMove == MoveType.SCISSORS && computerMove == MoveType.SCISSORS) {
			matchResolution = MatchOutcome.TIE;
			++ties;
		}

		// CPU win conditions
		if (computerMove == MoveType.ROCK && userMove == MoveType.SCISSORS) {
			matchResolution = MatchOutcome.COMPUTER_WIN;
			++computerWins;
		} else if (computerMove == MoveType.SCISSORS && userMove == MoveType.PAPER) {
			matchResolution = MatchOutcome.COMPUTER_WIN;
			++computerWins;
		} else if (computerMove == MoveType.PAPER && userMove == MoveType.ROCK) {
			matchResolution = MatchOutcome.COMPUTER_WIN;
			++computerWins;
		}

		// Player win conditions
		if (userMove == MoveType.ROCK && computerMove == MoveType.SCISSORS) {
			matchResolution = MatchOutcome.USER_WIN;
			++userWins;
		} else if (userMove == MoveType.SCISSORS && computerMove == MoveType.PAPER) {
			matchResolution = MatchOutcome.USER_WIN;
			++userWins;
		} else if (userMove == MoveType.PAPER && computerMove == MoveType.ROCK) {
			matchResolution = MatchOutcome.USER_WIN;
			++userWins;
		}
	
		return matchResolution;
	}

	// getters
	public int getComputerWins() {
		return this.computerWins;
	}

	public int getUserWins() {
		return this.userWins;
	}

	public int getTies() {
		return this.ties;
	}

	// setters
	public void setComputerWins(int computerWins) {
		this.computerWins = computerWins;
	}

	public void setUserWins(int userWins) {
		this.userWins = userWins;
	}

	public void setTies(int ties) {
		this.ties = ties;
	}

	public static String[] getMatchResolution(Class<? extends Enum<?>> e) {
	    return Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new);
	}
	
	public String getCWins() {
		return Integer.toString(getComputerWins());
	}

	public String getUWins() {
		return Integer.toString(getUserWins());
	}

}
