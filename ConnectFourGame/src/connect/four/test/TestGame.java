package connect.four.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.Before;

import connect.four.Game;
import connect.four.board.Board;
import connect.four.player.ConsolePlayer;
import connect.four.player.Player;


public class TestGame 
{

	ConsolePlayer playerOne;
	ConsolePlayer playerTwo;
	int inRow = 4;
	
	@Before
	public void setUp()
	{
		playerOne = new ConsolePlayer("X");
		playerTwo = new ConsolePlayer("@");
	}
	
	@Test
	public void testDiagonalWinner() 
	{
		System.out.println("Diagonal Winner Test");
		//DiagonalWin
		Object[][] board1Layout = { { playerTwo, null, null, null, null, null }, { playerTwo, playerTwo, playerTwo, null, null, null },
				{ playerOne, playerOne, playerTwo, null, null, null }, { playerTwo, playerOne, playerTwo, playerTwo, null, null} };
		Board a = new Board(board1Layout.length, board1Layout[0].length);
		for (int i = 0; i < a.getWidth(); i++) 
			for (int j = 0; j < a.getHeight(); j++) 
				a.play(i, (Player) board1Layout[i][j]);

		Board board1 = new Board(a);

		assertEquals(playerTwo, Game.detectWinner(board1, inRow));
	}
	
	@Test
	public void testHorizontalWinner()
	{
		System.out.println("Horizontal Winner Test");
		//Horizontal Win
		Object[][] board1Layout = { { playerTwo, playerTwo, playerTwo, playerTwo, playerOne, playerOne }, { playerTwo, playerOne, playerTwo, null, null, null },
				{ null, null, null, null, null, null }, { null, null, null, null, null, null} };
		Board a = new Board(board1Layout.length, board1Layout[0].length);
		for (int i = 0; i < a.getWidth(); i++) 
			for (int j = 0; j < a.getHeight(); j++) 
				a.play(i, (Player) board1Layout[i][j]);
		Board board1 = new Board(a);

		assertEquals(playerTwo, Game.detectWinner(board1, inRow));
	}
	
	@Test
	public void testVerticalWinner()
	{
		System.out.println("Vertical Winner Test");
		//Vertical Win
		Object[][] board1Layout = { { playerOne, playerTwo, null, null, null, null }, { playerOne, playerTwo, null, null, null, null },
				{ playerOne, playerTwo, null, null, null, null }, { playerOne, null, null, null, null, null} };
		Board a = new Board(board1Layout.length, board1Layout[0].length);
		for (int i = 0; i < a.getWidth(); i++) 
			for (int j = 0; j < a.getHeight(); j++) 
				a.play(i, (Player) board1Layout[i][j]);
		Board board1 = new Board(a);

		assertEquals(playerOne, Game.detectWinner(board1, inRow));
	}
}
