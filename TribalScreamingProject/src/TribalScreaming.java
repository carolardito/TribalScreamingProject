
public class TribalScreaming {

	public String scream(String name[]) {
		/*String finalResult = " is amazing";
		
		//finalResult = name + finalResult;
		if (name == null) {
			finalResult = "You" + finalResult;
		}
		else {
			finalResult = name + finalResult;
			
			if (name.equals(name.toUpperCase())) {
				finalResult = finalResult.toUpperCase();
			}
		}*/
		
		String finalResult = " are amazing";
		String namesResult = "";
		
		for (int i = 0; i < name.length; i++) {
			if (namesResult.isEmpty()) {
				namesResult = name[i];
			}
			else if (i < name.length-1) {
				namesResult += ", " + name[i];
			}
			else {
				namesResult += " and " + name[i];
			}
		}
		
		return namesResult + finalResult;
		
		
	}

}
