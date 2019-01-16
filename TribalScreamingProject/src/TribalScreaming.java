
public class TribalScreaming {

	public String scream(String name) {
		String finalResult = " is amazing";
		
		//finalResult = name + finalResult;
		if (name == null) {
			finalResult = "You" + finalResult;
		}
		else {
			finalResult = name + finalResult;
			
			if (name.equals(name.toUpperCase())) {
				finalResult = finalResult.toUpperCase();
			}
		}
		
		return finalResult;
		
		
	}

}
