import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook gb1, gb2;  

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		 gb1 = new GradeBook (5); 
		 gb2 = new GradeBook (5); 
		 gb1.addScore(88.0);
		 gb1.addScore(78.0); 
		 gb2.addScore(71.0); 
		 gb2.addScore(91.0); 
	}

	@AfterEach
	void tearDown() throws Exception {
		gb1 = null; 
		gb2 = null; 
	}

	@Test	
	void testAddScore() {
		assertTrue((gb1.toString()).equals("88.0 78.0 ")); 
		assertTrue((gb2.toString()).equals("71.0 91.0 ")); 
	}
	
	@Test
	void testSum() {
		assertEquals(166, gb1.sum(), .01); 
		assertEquals(162, gb2.sum(), .01); 
	}
	
	@Test
	void testMinimum() {
		assertEquals(78.0, gb1.minimum(), .01); 
		assertEquals(71.0, gb2.minimum(), .01); 
	}
	
	@Test
	void testFinalScore() {
		assertEquals(88.0, gb1.finalScore(), .01); 
		assertEquals(91.0, gb2.finalScore(), .01); 
	}

}
