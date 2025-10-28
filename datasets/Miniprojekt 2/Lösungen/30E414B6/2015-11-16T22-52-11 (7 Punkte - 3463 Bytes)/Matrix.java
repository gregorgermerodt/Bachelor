import java.util.Arrays;

public class Matrix {

	private int[][] values;

	public Matrix(int[][] initialValues) {
		values=initialValues;

	}

	public void scalarMultiplication(int c) {
		for(int row =0; row< values.length;row++){
			for(int column =0;column< values[row].length;column++ ){
				values[row][column]*=c;
			}
		}

	}

	public void add(Matrix m) {
		for(int row =0; row< values.length;row++){
			for(int column =0;column< values[row].length;column++ ){
				values[row][column]= values[row][column]+m.values[row][column];
			}
		}
	}}