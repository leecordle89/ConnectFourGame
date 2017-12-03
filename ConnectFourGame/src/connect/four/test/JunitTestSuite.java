package connect.four.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
   BoardTest.class,
   ConsolePlayerTest.class,
   TestGame.class,
   GUITests.class
})

public class JunitTestSuite {   
} 
