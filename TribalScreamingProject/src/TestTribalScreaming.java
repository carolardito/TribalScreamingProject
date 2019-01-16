import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTribalScreaming {

	@Test
	void testScream() {
		
		TribalScreaming ts = new TribalScreaming();
		
		String actualResult = ts.scream("Peter");
		
		assertEquals("Peter is amazing", actualResult);
		
	}

}