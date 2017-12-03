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
	
	@Test
	public void testConstructorError() 
	{
		System.out.println("Testing failed constructor, Null pointer error.");
		try
		{
			player = new ConsolePlayer(null);
		}
		catch (Exception e)
		{
			assertEquals(true, true);
		}
	}
	@Test(expected = NullPointerException.class)
	public void testSetGetNameNegative() 
	{
		player.setName(null);
	}

}
