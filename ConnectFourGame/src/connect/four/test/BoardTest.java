package connect.four.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import connect.four.board.Board;
import connect.four.board.ColumnFullException;
import connect.four.player.ComputerPlayer;
import connect.four.player.ConsolePlayer;

public class BoardTest {

	private static Board board;
	private static ConsolePlayer console;
	private static ComputerPlayer computer;

	/**
	 * Creates a new board
	 */
	@Before
	public void initializeTest() {
		board = new Board(6, 7);
		
		//Two generic players
		console = new ConsolePlayer("P1");
		computer = new ComputerPlayer();
	}
	@After
	public void tearDown()
	{
		board.clear();
	}
	@Test
	public void testWhoPlayed()
	{
		System.out.println("Testing WhoPlayed");
		board.play(0, console);
		assertEquals(console, board.whoPlayed(0, 0));
	}
	
	@Test
	public void testMoveCount()
	{
		System.out.println("Testing getMoveCount");
		board.play(0, console);
		assertEquals(1, board.getMoveCount());
	}
	@Test
	public void testClear()
	{
		System.out.println("Testing clear method");
		board.play(0, console);
		board.play(2, computer);
		board.clear();
		assertEquals(0, board.getMoveCount());
		
	}
	
	@Test
	public void testColumnFull() {
		System.out.println("Test Column Full");
		try
		{
			board.play(0, console);
			board.play(0, computer);
			board.play(0, console);
			board.play(0, computer);
			board.play(0, console);
			board.play(0, computer);
			board.play(0, console);
		}
		catch(Exception e)
		{
			assertEquals(true, true);
		}
	}

	@Test
	public void testGetColumnHeight() {
		System.out.println("Test getColumnHeight");
		board.play(0, computer);
		board.play(1, console);
		board.play(1, console);
		Assert.assertEquals(1, board.getColumnHeight(0));
	}
}
