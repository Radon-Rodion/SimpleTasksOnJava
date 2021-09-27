package fundamentals.task2;

import fundamentals.task2.control.AreaFittingControl;

public class Main {
	public static void main(String[] args) {
		AreaFittingControl control = new AreaFittingControl();
		System.out.println(control.checkInsideArea(2,-1)); //true
		System.out.println(control.checkInsideArea(7, -2)); //false
		System.out.println(control.checkInsideArea(0, 3)); //true
	}
}
