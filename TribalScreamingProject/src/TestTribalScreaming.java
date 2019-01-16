import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTribalScreaming {

	@Test
	void testScream() {
		
		TribalScreaming ts = new TribalScreaming();
		
		/*String actualResult = ts.scream("Peter");
		
		assertEquals("Peter is amazing", actualResult);
		

		actualResult = ts.scream(null);
		assertEquals("You is amazing", actualResult);
		
		actualResult = ts.scream("PETER");
		assertEquals("PETER IS AMAZING", actualResult);*/
		String[] array = {"Peter", "Jigesha"};
		
		String actualResult = ts.scream(array);
		
		assertEquals("Peter and Jigesha are amazing", actualResult);
	}

}