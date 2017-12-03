package connect.four.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import connect.four.player.ConsolePlayer;

public class ConsolePlayerTest {

	private ConsolePlayer player;
	
	@Test
	public void testConstructorSuccess() 
	{
		System.out.println("Testing Constructor");
		player = new ConsolePlayer("Hello!");
		assertEquals("Hello!", player.getName());
	}
	
	@Test
	public void testGetName() 
	{
		System.out.println("Testing GetName");
		player = new ConsolePlayer("Hello!");
		assertEquals("Hello!", player.getName());
	}
	
	@Test
	public void testSetName()
	{
		System.out.println("Testing set name");
		player = new ConsolePlayer("Hello!");
		player.setName("Changed");
		assertEquals("Changed", player.getName());
	}
	
	@Test(expected = NullPointerException.class)
	public void testConstructorError() 
	{
		player = new ConsolePlayer(null);
	}
	@Test(expected = NullPointerException.class)
	public void testSetGetNameNegative() 
	{
		player.setName(null);
	}

}
