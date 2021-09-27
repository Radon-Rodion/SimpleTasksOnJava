package fundamentals.task1;
import fundamentals.task1.control.ExpressionCalcControl;

public class Main {
	public static void main(String[] args) {
		ExpressionCalcControl control = new ExpressionCalcControl();
		System.out.println(control.calc(1.23,-4.56));
		System.out.println(control.calc(0,0)); 			//0.5
		System.out.println(control.calc(73.25,-24.06));
	}
}
