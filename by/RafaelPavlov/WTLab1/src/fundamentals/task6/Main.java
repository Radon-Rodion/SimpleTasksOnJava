package fundamentals.task6;

import java.util.Arrays;

import fundamentals.task6.control.MatrixCreationControl;

public class Main {
	public static void main(String[] args) {
		MatrixCreationControl control = new MatrixCreationControl();
		try {
			int[][] matrix = control.toSquareMatrix(new int[] {1});
			System.out.println(Arrays.deepToString(matrix));
			
			matrix = control.toSquareMatrix(new int[] {9, 8, 7, 6});
			System.out.println(Arrays.deepToString(matrix));
		} catch (RuntimeException e) {
			e.printStackTrace();
			return;
		}
	}
}
