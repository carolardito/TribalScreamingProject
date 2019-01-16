
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
		String namesResult = "", result = "";
		int posUpper = 999;
		
		
		for (int i = 0; i < name.length; i++) {
			
			if (name[i].equals(name[i].toUpperCase())) {
				posUpper = i;
			}
			
			if (posUpper == 999 || posUpper != i) {
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
		}
		
		if (name.length == 2 && posUpper != 999) {
			finalResult = " is amazing";
		}
		
		result = namesResult + finalResult;
		if (posUpper != 999) {
			
			result = result + ". " + name[posUpper] + " ALSO!";
		}
		
		return result;
		
		
	}

}
