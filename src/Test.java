import java.util.Scanner;


public class Test {

	/**
	 * Method if expression is valid
	 * @param expression
	 * @return boolean
	 */
	
	public static boolean checkExp(String expression) {
		for (int i=0; i<expression.length(); i++){
			if(((int)expression.charAt(i)<48 || (int)expression.charAt(i)>57)&&((int)expression.charAt(i)!=43 && (int)expression.charAt(i)!=45)){
				return false;
			}
		}
		return true;
		
	}
	
	/**
	 * Test method
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		MathCal mathCal = new MathCal();
		System.out.println("Enter mathematical expression: ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		if(checkExp(str)==true){
			System.out.println(mathCal.getIntResult(str));
		}else{
			System.out.println("Value is not mathematical expression!");
		}
		System.out.println(mathCal.getStringResult(mathCal.getIntResult(str)));

	}

}
