import java.util.Scanner;

/**
 * CCSF Homework #7
 * Create a TicTacToe game where the main method is used to display the status of the game.
 * @author veemac
 *
 */
public class TicTacToe 
{
	public static void main(String[] args)
	{
		GameBoard.createBoard();
		GameBoard.displayBoard();
		while (GameBoard.gameOver() == false)
			{
			GameBoard.makeAMove();
			}
		System.out.println("Congratulations, the game is over.");
	}

}

class GameBoard
{
	static char[][] board = new char[3][3];
	static char currentPlayer = 'X';
	
	
	public static void createBoard()
	{
		for (int row = 0; row < 3; row++)
		{
			for (int col = 0; col < 3; col++)
			{
				board[row][col] = ' ';
			}
		}
	}
	
	public static void displayBoard()
	{	
		for(int row = 0; row <3; row++)
		{
			System.out.println(" " + board[row][0] + " | " + board[row][1] + " | " + board[row][2]);
			if (row < 2)
			{
				System.out.println("------------");
			}
			
		}
	}
	
	public static boolean gameOver()
	{
		return (isRowWin() || isColWin() || isDiagonalWin() || isDraw());
	}
	
	public static boolean isBoardChecked(char c1, char c2, char c3)
	{
		return ((c1 != ' ') && (c1 == c2) && (c2 == c3));
	}
	
	public static boolean isRowWin()
	{
		for (int row = 0; row < 3; row++)
		{
			if (isBoardChecked(board[row][0], board[row][1], board[row][2]) == true)
			{
				return true;
			}
		}
		return false;
	}
	
	public static boolean isColWin()
	{
		for (int col = 0; col < 3; col++)
		{
			if (isBoardChecked(board[0][col], board[1][col], board[2][col]) == true)
			{
				return true;
			}
		}
		return false;
	}
	
	public static boolean isDiagonalWin()
	{
		if (isBoardChecked(board[0][0], board[1][1], board[2][2]) == true)
		{
			return true;
		}
		
		else if (isBoardChecked(board[2][0], board[1][1], board[0][2]) == true)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	public static boolean isDraw()
	{
		
		for (int row = 0; row < 3; row++)
		{
			for (int col = 0; col < 3; col++)
			{
				if (board[row][col] == ' ')
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public static void changePlayer()
	{
		if (currentPlayer == 'X')
		{
			currentPlayer = 'O';
		}
		
		else
		{
			currentPlayer = 'X';
		}
	}
	
	public static void makeAMove()
	{
		int row, col;
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a row for your player (0 - 2): ");
		row = userInput.nextInt();
		
		System.out.println("Enter a column for your player (0 - 2): ");
		col = userInput.nextInt();
		
		
		if ((row >= 0) && (row < 3))
		{
			if ((col >= 0) && (col < 3))
			{
				if (board[row][col] == ' ')
				{
					board[row][col] = currentPlayer;
					changePlayer();
				}
				else
				{
					System.out.println("Space is full. Please select another.");
				}
			}
			else
			{
				System.out.println("\n**Please enter numbers in the acceptable range.**\n");
			}
		}
		else
		{
			System.out.println("\n**Please enter numbers in the acceptable range.**\n");
		}
		displayBoard();
	}
}
