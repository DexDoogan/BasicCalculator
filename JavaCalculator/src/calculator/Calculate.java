package calculator;

public class Calculate {
	private static float answer;
	
	public static float calculate(String[] userCalculation) {
		try{
			float val1 = Integer.parseInt(userCalculation[0]);
			for(int calculationIndex = 1; calculationIndex<userCalculation.length; calculationIndex += 2) {
				String val2 = userCalculation[calculationIndex + 1];
				String op = userCalculation[calculationIndex];
				if(calculationIndex == 1) {
					answer = OperatorConversion.operationApplication(val1, op, val2);
				}
				else {
					answer = OperatorConversion.operationApplication(answer, op, val2);
				}
			}
		} catch(Exception e){
			answer = 0;
		}
		return answer;	
	}

	public float getAnswer() {
		return answer;
	}

}
