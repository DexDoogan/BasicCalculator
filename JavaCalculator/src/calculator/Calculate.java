package calculator;

public class Calculate {
	private static float answer;
	
	public static float calculate(String[] userCalculation) {
		if(!userCalculation[0].equals("clear")) {
			for(int calculationIndex = 1; calculationIndex<userCalculation.length; calculationIndex += 2) {
				String val2 = userCalculation[calculationIndex + 1];
				String op = userCalculation[calculationIndex];
				if(calculationIndex == 1 && answer == 0) {
					float val1 = Integer.parseInt(userCalculation[calculationIndex - 1]);
					answer = OperatorConversion.operationApplication(val1, op, val2);
				}
				else {
					answer = OperatorConversion.operationApplication(answer, op, val2);
				}
			}
		}
		else {
			answer = 0;
		}
		return answer;	
	}

	public float getAnswer() {
		return answer;
	}

}
