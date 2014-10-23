
public class Operation 
{	
	// -1 >> no thing , 0 >> + , 1 >> - , 2 >> x , 3 >> /
	private double operand_1;
	private double operand_2;
	private int operation;
	private String equation;
	
	public Operation(double operand_1 , double operand_2 , int operation)
	{
		this.operation = operation;
		this.operand_1 = operand_1;
		this.operand_2 = operand_2;
		equation = "";
	}
	
	public double evaluate()
	{
		switch(operation)
		{
			case 0: // +
					equation = operand_1 + " + " + operand_2;
					return (operand_1 + operand_2);
			case 1: // -
					equation = operand_1 + " - " + operand_2;
					return (operand_1 - operand_2);
			case 2: // x
					equation = operand_1 + " x " + operand_2;
					return (operand_1 * operand_2);
			case 3: // /
					equation = operand_1 + " / " + operand_2;	
					return (operand_1 / operand_2);
		}
		return 0;
	}
	
	public String getEquation()
	{
		return equation;
	}
	
	
	
	

}
