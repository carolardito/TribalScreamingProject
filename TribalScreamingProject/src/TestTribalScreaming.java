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
		System.out.println(actualResult);
		
		String[] array2 = {"Peter", "Jigesha", "Marcos"};
		actualResult = ts.scream(array2);
		assertEquals("Peter, Jigesha and Marcos are amazing", actualResult);
		System.out.println(actualResult);
		
		String[] array3 = {"Peter", "JIGESHA"};
		String actualResult1 = ts.scream(array3);
		assertEquals("Peter is amazing. JIGESHA ALSO!", actualResult1);
		System.out.println(actualResult1);
		
		String[] array4 = {"Peter", "JIGESHA", "Marcos"};
		 actualResult1 = ts.scream(array4);
		assertEquals("Peter and Marcos are amazing. JIGESHA ALSO!", actualResult1);
		System.out.println(actualResult1);
		
		String[] array5 = {"JIGESHA", "Peter", "Marcos", "Albert"};
		 actualResult1 = ts.scream(array5);
		assertEquals("Peter, Marcos and Albert are amazing. JIGESHA ALSO!", actualResult1);
		System.out.println(actualResult1);
	}

}