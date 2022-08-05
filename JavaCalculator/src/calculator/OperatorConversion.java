package calculator;

public class OperatorConversion {
	private static float operationValue;
	
	public static float operationApplication(Float val1, String operator, String val2){{
		float num2 = Integer.parseInt(val2);
		if(operator.equals("*")) {
			operationValue = (val1*num2);
		}
		else if(operator.equals("/")) {
			operationValue = (val1/num2);
		}
		else if(operator.equals("-")) {
			operationValue = (val1-num2);
		}
		else if(operator.equals("+")) {
			operationValue = (val1+num2);
		}
		return operationValue;
	}
	}

	public float getOperationValue() {
		return operationValue;
	}
}
