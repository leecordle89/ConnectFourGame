package connect.four.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import connect.four.gui.GUI;
import connect.four.gui.GUIPiece;
import connect.four.gui.GUIPlayer;
import connect.four.gui.GameOverPanel;
import connect.four.gui.GamePanel;
import connect.four.gui.MainMenuPanel;

public class GUITests {

	GUI gui;
	GamePanel tester;

	@Before
	public void setUp() throws Exception {
		gui = new GUI();
	}

	@After
	public void tearDown() throws Exception {
		gui = null;
	}

	@Test
	public void testGamePanelConstructor() {
		System.out.println("Testing Computer enabled GamePanel");
		tester = new GamePanel(gui,true);
		
		System.out.println("Testing Computer disabled GamePanel");
		tester = new GamePanel(gui, false);
	}

	@Test
	public void testGameOverPanelConstructor() {
		System.out.println("Testing GameOverPanel() Constructor");
		tester = new GamePanel(gui,true);
		
		GameOverPanel sample = new GameOverPanel(gui, "PlayerOne");
	}
	
	@Test
	public void testGUIPieceConstructor() {
		System.out.println("Testing GUIPiece() with value 0");
		GUIPiece sample = new GUIPiece(0);
		
		System.out.println("Testing GUIPiece() with value 1");
		sample = new GUIPiece(1);
	}
	
	@Test
	public void testGUIPlayer() {
		System.out.println("Testing GUIPlayer()");
		GamePanel sample = new GamePanel(gui, true);
		GUIPlayer sampleTesting = new GUIPlayer("Play One", sample);
		
		assertEquals("Play One", sampleTesting.getName());
	}
	@Test
	public void testMainMenuPanelConstructor() {
		System.out.println("Testing Computer enabled GamePanel");
		MainMenuPanel testing = new MainMenuPanel(gui);
	}

}
