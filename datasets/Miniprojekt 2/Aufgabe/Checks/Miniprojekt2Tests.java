import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

public class Miniprojekt2Tests {

	private static final String EXERCISE_NAME = "Miniprojekt 2";

	private int score;

	public int getResult() {
		return score;
	}

	// ------------------- Measurement

	@Test(name = EXERCISE_NAME + " - Measurement-Konstruktor")
	public void testMeasurementConstructor() throws Exception {
		final Measurement m = new Measurement();

		final int[] expectedData = (int[]) readVariable(m, "data");

		if (expectedData == null) {
			printFormattedError("Der Aufruf des Measurement-Konstruktors sollte Measurement.data initialisieren, tatsächlich ist Measurement.data jedoch null");
		} else if (expectedData.length != 0) {
			printFormattedError(
					"Der Aufruf des Measurement-Konstruktors hat Measurement.data initialisiert, jedoch ist die Länge des Arrays %d (erwartet wurde Länge von %d)",
					expectedData.length, 0);
		} else {
			score += 2;
		}
	}

	@Test(name = EXERCISE_NAME + " - Measurement.addValue() #1")
	public void testMeasurementAddValue1() throws Exception {
		final Measurement m = createMeasurement();

		m.addValue(10);

		final int[] expectedData = new int[] { 10 };
		final int[] actualData = (int[]) readVariable(m, "data");

		if (Arrays.equals(expectedData, actualData)) {
			score += 3;
		} else {
			printFormattedError(
					"Nach dem Aufruf von addValue(10) auf ein Measurement-Objekt ohne Messwerte sollte data folgendermaßen aussehen: %s. Nach dem Aufruf deiner Implementierung sieht data jedoch wie folgt aus: %s",
					Arrays.toString(expectedData), Arrays.toString(actualData));

		}
	}

	@Test(name = EXERCISE_NAME + " - Measurement.addValue() #2")
	public void testMeasurementAddValue2() throws Exception {
		final Measurement m = createMeasurement();

		final int[] initialData = new int[] { 5, 9 };
		setVariable(m, "data", initialData);

		m.addValue(14);

		final int[] expectedData = new int[] { 5, 9, 14 };
		final int[] actualData = (int[]) readVariable(m, "data");

		if (Arrays.equals(expectedData, actualData)) {
			score += 3;
		} else {
			printFormattedError(
					"Nach dem Aufruf von addValue(14) auf ein Measurement-Objekt mit den Messwerten %s sollte data folgendermaßen aussehen: %s. Nach dem Aufruf deiner Implementierung sieht data jedoch wie folgt aus: %s",
					Arrays.toString(initialData),
					Arrays.toString(expectedData), Arrays.toString(actualData));

		}
	}

	@Test(name = EXERCISE_NAME + " - Measurement.addValues() #1")
	public void testMeasurementAddValues1() throws Exception {
		final Measurement m = createMeasurement();

		m.addValues(new int[] { 9, 1 });

		final int[] expectedData = new int[] { 9, 1 };
		final int[] actualData = (int[]) readVariable(m, "data");

		if (Arrays.equals(expectedData, actualData)) {
			score += 5;
		} else {
			printFormattedError(
					"Nach dem Aufruf von addValues(new int[] { 9, 1 }) auf ein Measurement-Objekt ohne Messwerte sollte data folgendermaßen aussehen: %s. Nach dem Aufruf deiner Implementierung sieht data jedoch wie folgt aus: %s",
					Arrays.toString(expectedData), Arrays.toString(actualData));

		}
	}

	@Test(name = EXERCISE_NAME + " - Measurement.addValues() #2")
	public void testMeasurementAddValues2() throws Exception {
		final Measurement m = createMeasurement();

		final int[] initialData = new int[] { 1, 8 };
		setVariable(m, "data", initialData);

		m.addValues(new int[] { 5, 2, 4 });

		final int[] expectedData = new int[] { 1, 8, 5, 2, 4 };
		final int[] actualData = (int[]) readVariable(m, "data");

		if (Arrays.equals(expectedData, actualData)) {
			score += 5;
		} else {
			printFormattedError(
					"Nach dem Aufruf von addValues(new int[] { 5, 2, 4 }) auf ein Measurement-Objekt mit den Messwerten %s sollte data folgendermaßen aussehen: %s. Nach dem Aufruf deiner Implementierung sieht data jedoch wie folgt aus: %s",
					Arrays.toString(initialData),
					Arrays.toString(expectedData), Arrays.toString(actualData));

		}
	}

	@Test(name = EXERCISE_NAME + " - Measurement.getMinimumValue() #1")
	public void testMeasurementGetMinimumValue1() throws Exception {
		final Measurement m = createMeasurement();

		final int[] initialData = new int[] { 40, -5, 3, 18 };
		setVariable(m, "data", initialData);

		final int expectedMinimum = -5;
		final int actualMinimum = m.getMinimumValue();

		if (expectedMinimum == actualMinimum) {
			score += 5;
		} else {
			printFormattedError(
					"Für ein Measurement-Objekt mit den Messwerten %s sollte getMinimumValue() %d zurückgeben. Deine Implementierung gibt %d zurück.",
					Arrays.toString(initialData), expectedMinimum,
					actualMinimum);
		}
	}
	
	@Test(name = EXERCISE_NAME + " - Measurement.getMinimumValue() #2")
	public void testMeasurementGetMinimumValue2() throws Exception {
		final Measurement m = createMeasurement();

		final int[] initialData = new int[] { -2, -2, 3, 1 };
		setVariable(m, "data", initialData);

		final int expectedMinimum = -2;
		final int actualMinimum = m.getMinimumValue();

		if (expectedMinimum == actualMinimum) {
			score += 5;
		} else {
			printFormattedError(
					"Für ein Measurement-Objekt mit den Messwerten %s sollte getMinimumValue() %d zurückgeben. Deine Implementierung gibt %d zurück.",
					Arrays.toString(initialData), expectedMinimum,
					actualMinimum);
		}
	}	

	@Test(name = EXERCISE_NAME + " - Measurement.getValuesAboveThreshold() #1")
	public void testMeasurementGetValuesAboveThreshold1() throws Exception {
		final Measurement m = createMeasurement();

		final int[] initialData = new int[] { -4, 12, 47, 18, 1 };
		setVariable(m, "data", initialData);

		final int threshold = 1;
		final int[] expected = new int[] { 12, 47, 18 };
		final int[] actual = m.getValuesAboveThreshold(threshold);

		if(actual == null) {
			printFormattedError(
					"Für ein Measurement-Objekt mit den Messwerten %s sollte getValuesAboveThreshold(%d) die folgenden Werte zurückgeben: %s. Deine Methode gibt null zurück. (Die Reihenfolge der Elemente spielt keine Rolle.)",
					initialData, threshold, Arrays.toString(expected));
			
			return;
		}
		
		Arrays.sort(expected);
		Arrays.sort(actual);

		if (Arrays.equals(expected, actual)) {
			score += 4;
		} else {
			printFormattedError(
					"Für ein Measurement-Objekt mit den Messwerten %s sollte getValuesAboveThreshold(%d) die folgenden Werte zurückgeben: %s. Deine Methode gibt %d zurück. (Die Reihenfolge der Elemente spielt keine Rolle.)",
					initialData, threshold, Arrays.toString(expected),
					Arrays.toString(actual));
		}
	}

	@Test(name = EXERCISE_NAME + " - Measurement.getValuesAboveThreshold() #2")
	public void testMeasurementGetValuesAboveThreshold2() throws Exception {
		final Measurement m = createMeasurement();

		final int[] initialData = new int[] { -4, 12, 47, 18, 1 };
		setVariable(m, "data", initialData);

		final int threshold = 50;
		final int[] expected = new int[] {};
		final int[] actual = m.getValuesAboveThreshold(threshold);

		if(actual == null) {
			printFormattedError(
					"Für ein Measurement-Objekt mit den Messwerten %s sollte getValuesAboveThreshold(%d) die folgenden Werte zurückgeben: %s. Deine Methode gibt null zurück. (Die Reihenfolge der Elemente spielt keine Rolle.)",
					initialData, threshold, Arrays.toString(expected));
			
			return;
		}
		
		Arrays.sort(expected);
		Arrays.sort(actual);

		if (Arrays.equals(expected, actual)) {
			score += 4;
		} else {
			printFormattedError(
					"Für ein Measurement-Objekt mit den Messwerten %s sollte getValuesAboveThreshold(%d) die folgenden Werte zurückgeben: %s. Deine Methode gibt %d zurück. (Die Reihenfolge der Elemente spielt keine Rolle.)",
					initialData, threshold, Arrays.toString(expected),
					Arrays.toString(actual));
		}
	}

	@Test(name = EXERCISE_NAME + " - Measurement.getValuesAboveThreshold() #3")
	public void testMeasurementGetValuesAboveThreshold3() throws Exception {
		final Measurement m = createMeasurement();

		final int threshold = 1;
		final int[] expected = new int[] {};
		final int[] actual = m.getValuesAboveThreshold(threshold);

		if(actual == null) {
			printFormattedError(
					"Für ein Measurement-Objekt ohne Messwerte sollte getValuesAboveThreshold(%d) die folgenden Werte zurückgeben: %s. Deine Methode gibt null zurück. (Die Reihenfolge der Elemente spielt keine Rolle.)",
					threshold, Arrays.toString(expected));
			
			return;
		}
		
		Arrays.sort(expected);
		Arrays.sort(actual);

		if (Arrays.equals(expected, actual)) {
			score += 4;
		} else {
			printFormattedError(
					"Für ein Measurement-Objekt ohne Messwerte sollte getValuesAboveThreshold(%d) die folgenden Werte zurückgeben: %s. Deine Methode gibt %d zurück. (Die Reihenfolge der Elemente spielt keine Rolle.)",
					threshold, Arrays.toString(expected),
					Arrays.toString(actual));
		}
	}

	// ------------------- Matrix

	@Test(name = EXERCISE_NAME + " - Matrix-Konstruktor")
	public void testMatrixConstructor() throws Exception {
		final int[][] values = new int[][] { { 1, 0 }, { 0, 1 } };

		final Matrix m = new Matrix(values);

		final int[][] actualValues = (int[][]) readVariable(m, "values");

		if (actualValues == values) {
			score += 1;
		} else {
			printFormattedError("Der Konstruktor der Klasse Matrix sollte das als Parameter übergeben Array dem Feld values zuweisen. Nach dem Aufruf deiner Implementierung verweist values jedoch nicht auf dasselbe Array, wie initialValues.");
		}
	}

	@Test(name = EXERCISE_NAME + " - Matrix.scalarMultiplication() #1")
	public void testMatrixScalarMultiplication1() throws Exception {
		final int[][] init = new int[][] { { 2, 3, 2 }, { -2, -3, -4 } };
		final int[][] initialValues = new int[][] { { 2, 3, 2 }, { -2, -3, -4 } };

		final Matrix m = createMatrix();
		setVariable(m, "values", init);

		final int c = 3;

		m.scalarMultiplication(c);

		final int[][] expectedValues = new int[][] { { 6, 9, 6 },
				{ -6, -9, -12 } };
		final int[][] actualValues = (int[][]) readVariable(m, "values");

		if (Arrays.deepEquals(expectedValues, actualValues)) {
			score += 4;
		} else {
			printFormattedError(
					"Nach dem Aufruf von scalarMultiplication(%d) auf eine Matrix %s sollte die Matrix wie folgt aussehen: %s. Nach dem Aufruf deiner Implementierung sieht die Matrix so aus: %s",
					c, printMatrix(initialValues), printMatrix(expectedValues),
					printMatrix(actualValues));
		}
	}

	@Test(name = EXERCISE_NAME + " - Matrix.scalarMultiplication() #2")
	public void testMatrixScalarMultiplication2() throws Exception {
		final int[][] init = new int[][] { { 2, 3, 2 }, { -2, -3, -4 } };
		final int[][] initialValues = new int[][] { { 2, 3, 2 }, { -2, -3, -4 } };

		final Matrix m = createMatrix();
		setVariable(m, "values", init);

		final int c = 0;

		m.scalarMultiplication(c);

		final int[][] expectedValues = new int[][] { { 0, 0, 0 }, { 0, 0, 0 } };
		final int[][] actualValues = (int[][]) readVariable(m, "values");

		if (Arrays.deepEquals(expectedValues, actualValues)) {
			score += 4;
		} else {
			printFormattedError(
					"Nach dem Aufruf von scalarMultiplication(%d) auf eine Matrix %s sollte die Matrix wie folgt aussehen: %s. Nach dem Aufruf deiner Implementierung sieht die Matrix so aus: %s",
					c, printMatrix(initialValues), printMatrix(expectedValues),
					printMatrix(actualValues));
		}
	}

	@Test(name = EXERCISE_NAME + " - Matrix.scalarMultiplication() #3")
	public void testMatrixScalarMultiplication3() throws Exception {
		final int[][] init = new int[][] { { 1, 2, 3 }, { 4, 5, 6 },
				{ 7, 8, 9 } };
		final int[][] initialValues = new int[][] { { 1, 2, 3 }, { 4, 5, 6 },
				{ 7, 8, 9 } };

		final Matrix m = createMatrix();
		setVariable(m, "values", init);

		final int c = -1;

		m.scalarMultiplication(c);

		final int[][] expectedValues = new int[][] { { -1, -2, -3 },
				{ -4, -5, -6 }, { -7, -8, -9 } };
		final int[][] actualValues = (int[][]) readVariable(m, "values");

		if (Arrays.deepEquals(expectedValues, actualValues)) {
			score += 4;
		} else {
			printFormattedError(
					"Nach dem Aufruf von scalarMultiplication(%d) auf eine Matrix %s sollte die Matrix wie folgt aussehen: %s. Nach dem Aufruf deiner Implementierung sieht die Matrix so aus: %s",
					c, printMatrix(initialValues), printMatrix(expectedValues),
					printMatrix(actualValues));
		}
	}

	@Test(name = EXERCISE_NAME + " - Matrix.add() #1")
	public void testMatrixAdd1() throws Exception {
		final int[][] mInit = new int[][] { { 1, 2 }, { 3, 4 } };
		final int[][] mInitialValues = new int[][] { { 1, 2 }, { 3, 4 } };

		final int[][] nInit = new int[][] { { 2, 4 }, { 6, 8 } };
		final int[][] nInitialValues = new int[][] { { 2, 4 }, { 6, 8 } };

		final Matrix m = createMatrix();
		final Matrix n = createMatrix();

		setVariable(m, "values", mInit);
		setVariable(n, "values", nInit);

		m.add(n);

		final int[][] expected = new int[][] { { 3, 6 }, { 9, 12 } };
		final int[][] actual = (int[][]) readVariable(m, "values");

		if (Arrays.deepEquals(expected, actual)) {
			score += 5;
		} else {
			printFormattedError(
					"Nach dem Aufruf von add() auf eine Matrix %s mit der folgenden Matrix als Parameter: %s sollte die Matrix wie folgt aussehen: %s. Nach dem Aufruf deiner Implementierung sieht die Matrix so aus: %s",
					printMatrix(mInitialValues), printMatrix(nInitialValues),
					printMatrix(expected), printMatrix(actual));
		}
	}

	@Test(name = EXERCISE_NAME + " - Matrix.add() #2")
	public void testMatrixAdd2() throws Exception {
		final int[][] mInit = new int[][] { { 2, 3 }, { 0, -1 } };
		final int[][] mInitialValues = new int[][] { { 2, 3 }, { 0, -1 } };

		final int[][] nInit = new int[][] { { -1, -3 }, { 0, 2 } };
		final int[][] nInitialValues = new int[][] { { -1, -3 }, { 0, 2 } };

		final Matrix m = createMatrix();
		final Matrix n = createMatrix();

		setVariable(m, "values", mInit);
		setVariable(n, "values", nInit);

		m.add(n);

		final int[][] expected = new int[][] { { 1, 0 }, { 0, 1 } };
		final int[][] actual = (int[][]) readVariable(m, "values");

		if (Arrays.deepEquals(expected, actual)) {
			score += 5;
		} else {
			printFormattedError(
					"Nach dem Aufruf von add() auf eine Matrix %s mit der folgenden Matrix als Parameter: %s sollte die Matrix wie folgt aussehen: %s. Nach dem Aufruf deiner Implementierung sieht die Matrix so aus: %s",
					printMatrix(mInitialValues), printMatrix(nInitialValues),
					printMatrix(expected), printMatrix(actual));
		}
	}

	@Test(name = EXERCISE_NAME + " - Matrix.getColumnVector() #1")
	public void testMatrixGetColumnVector1() throws Exception {
		final int[][] init = new int[][] { { 1, 2, 3 }, { 4, 5, 6 },
				{ 7, 8, 9 }, { 10, 11, 12 } };
		final int[][] initialValues = new int[][] { { 1, 2, 3 }, { 4, 5, 6 },
				{ 7, 8, 9 }, { 10, 11, 12 } };

		final Matrix m = createMatrix();
		setVariable(m, "values", init);

		final int column = 0;

		final int[] expected = new int[] { 1, 4, 7, 10 };
		final int[] actual = m.getColumnVector(column);

		if (Arrays.equals(expected, actual)) {
			score += 5;
		} else {
			printFormattedError(
					"Der Aufruf von getColumnVector(%d) auf eine Matrix %s sollte %s zurückgeben. Deine Implementierung gibt %s zurück.",
					column, printMatrix(initialValues),
					Arrays.toString(expected), Arrays.toString(actual));
		}
	}

	@Test(name = EXERCISE_NAME + " - Matrix.getColumnVector() #2")
	public void testMatrixGetColumnVector2() throws Exception {
		final int[][] init = new int[][] { { 1, 2, 0 }, { 2, 1, -1 },
				{ 2, 0, 1 } };
		final int[][] initialValues = new int[][] { { 1, 2, 0 }, { 2, 1, -1 },
				{ 2, 0, 1 } };

		final Matrix m = createMatrix();
		setVariable(m, "values", init);

		final int column = 1;

		final int[] expected = new int[] { 2, 1, 0 };
		final int[] actual = m.getColumnVector(column);

		if (Arrays.equals(expected, actual)) {
			score += 5;
		} else {
			printFormattedError(
					"Der Aufruf von getColumnVector(%d) auf eine Matrix %s sollte %s zurückgeben. Deine Implementierung gibt %s zurück.",
					column, printMatrix(initialValues),
					Arrays.toString(expected), Arrays.toString(actual));
		}
	}

	@Test(name = EXERCISE_NAME + " - Matrix.IsEqualTo() #1")
	public void testMatrixIsEqualTo1() throws Exception {
		final int[][] mInit = new int[][] { { 2, 3 }, { 0, -1 } };
		final int[][] mInitialValues = new int[][] { { 2, 3 }, { 0, -1 } };

		final int[][] nInit = new int[][] { { 2, 3 }, { 0, -1 }, { 0, 0 } };
		final int[][] nInitialValues = new int[][] { { 2, 3 }, { 0, -1 },
				{ 0, 0 } };

		final Matrix m = createMatrix();
		final Matrix n = createMatrix();

		setVariable(m, "values", mInit);
		setVariable(n, "values", nInit);

		final boolean expected = false;
		final boolean actual = m.isEqualTo(n);

		if (expected == actual) {
			score += 4;
		} else {
			printFormattedError(
					"Der Aufruf von isEqualTo() auf eine Matrix %s mit einer Matrix %s als Parameter sollte %b zurückgeben. Deine Implementierung gibt %b zurück.",
					printMatrix(mInitialValues), printMatrix(nInitialValues),
					expected, actual);
		}
	}

	@Test(name = EXERCISE_NAME + " - Matrix.IsEqualTo() #2")
	public void testMatrixIsEqualTo2() throws Exception {
		final int[][] mInit = new int[][] { { 2, 3 }, { 0, -1 } };
		final int[][] mInitialValues = new int[][] { { 2, 3 }, { 0, -1 } };

		final int[][] nInit = new int[][] { { 2, 3, 0 }, { 0, -1, 0 } };
		final int[][] nInitialValues = new int[][] { { 2, 3, 0 }, { 0, -1, 0 } };

		final Matrix m = createMatrix();
		final Matrix n = createMatrix();

		setVariable(m, "values", mInit);
		setVariable(n, "values", nInit);

		final boolean expected = false;
		final boolean actual = m.isEqualTo(n);

		if (expected == actual) {
			score += 4;
		} else {
			printFormattedError(
					"Der Aufruf von isEqualTo() auf eine Matrix %s mit einer Matrix %s als Parameter sollte %b zurückgeben. Deine Implementierung gibt %b zurück.",
					printMatrix(mInitialValues), printMatrix(nInitialValues),
					expected, actual);
		}
	}

	@Test(name = EXERCISE_NAME + " - Matrix.IsEqualTo() #3")
	public void testMatrixIsEqualTo3() throws Exception {
		final int[][] mInit = new int[][] { { 2, 3, 1 }, { 0, -1, 3 },
				{ 4, -1, 4 }, { 8, 9, 12 } };
		final int[][] mInitialValues = new int[][] { { 2, 3, 1 }, { 0, -1, 3 },
				{ 4, -1, 4 }, { 8, 9, 12 } };

		final int[][] nInit = new int[][] { { 2, 3, 1 }, { 0, -1, 3 },
				{ 4, -1, 4 }, { 8, 9, 12 } };
		final int[][] nInitialValues = new int[][] { { 2, 3, 1 }, { 0, -1, 3 },
				{ 4, -1, 4 }, { 8, 9, 12 } };

		final Matrix m = createMatrix();
		final Matrix n = createMatrix();

		setVariable(m, "values", mInit);
		setVariable(n, "values", nInit);

		final boolean expected = true;
		final boolean actual = m.isEqualTo(n);

		if (expected == actual) {
			score += 4;
		} else {
			printFormattedError(
					"Der Aufruf von isEqualTo() auf eine Matrix %s mit einer Matrix %s als Parameter sollte %b zurückgeben. Deine Implementierung gibt %b zurück.",
					printMatrix(mInitialValues), printMatrix(nInitialValues),
					expected, actual);
		}
	}

	@Test(name = EXERCISE_NAME + " - Matrix.transpose() #1")
	public void testMatrixTranspose1() throws Exception {
		final int[][] init = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
		final int[][] initialValues = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };

		final Matrix m = createMatrix();
		setVariable(m, "values", init);

		m.transpose();

		final int[][] expected = new int[][] { { 1, 4 }, { 2, 5 }, { 3, 6 } };
		final int[][] actual = (int[][]) readVariable(m, "values");

		if (Arrays.deepEquals(expected, actual)) {
			score += 5;
		} else {
			printFormattedError(
					"Der Aufruf von transpose() auf eine Matrix %s sollte die Matrix wie folgt umwandeln: %s. Nach dem Aufruf deiner Implementierung sieht deine Matrix so aus: %s",
					printMatrix(initialValues), printMatrix(expected),
					printMatrix(actual));
		}
	}

	@Test(name = EXERCISE_NAME + " - Matrix.transpose() #2")
	public void testMatrixTranspose2() throws Exception {
		final int[][] init = new int[][] { { 1, 2, 3, 4 } };
		final int[][] initialValues = new int[][] { { 1, 2, 3, 4 } };

		final Matrix m = createMatrix();
		setVariable(m, "values", init);

		m.transpose();

		final int[][] expected = new int[][] { { 1 }, { 2 }, { 3 }, { 4 } };
		final int[][] actual = (int[][]) readVariable(m, "values");

		if (Arrays.deepEquals(expected, actual)) {
			score += 5;
		} else {
			printFormattedError(
					"Der Aufruf von transpose() auf eine Matrix %s sollte die Matrix wie folgt umwandeln: %s. Nach dem Aufruf deiner Implementierung sieht deine Matrix so aus: %s",
					printMatrix(initialValues), printMatrix(expected),
					printMatrix(actual));
		}
	}

	@Test(name = EXERCISE_NAME + " - Matrix.transpose() #3")
	public void testMatrixTranspose3() throws Exception {
		final int[][] init = new int[][] { { 1, 0, 0, 0 }, { 0, 1, 0, 0 },
				{ 0, 0, 1, 0 }, { 0, 0, 0, 1 } };
		final int[][] initialValues = new int[][] { { 1, 0, 0, 0 },
				{ 0, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 } };

		final Matrix m = createMatrix();
		setVariable(m, "values", init);

		m.transpose();

		final int[][] expected = new int[][] { { 1, 0, 0, 0 }, { 0, 1, 0, 0 },
				{ 0, 0, 1, 0 }, { 0, 0, 0, 1 } };
		final int[][] actual = (int[][]) readVariable(m, "values");

		if (Arrays.deepEquals(expected, actual)) {
			score += 5;
		} else {
			printFormattedError(
					"Der Aufruf von transpose() auf eine Matrix %s sollte die Matrix wie folgt umwandeln: %s. Nach dem Aufruf deiner Implementierung sieht deine Matrix so aus: %s",
					printMatrix(initialValues), printMatrix(expected),
					printMatrix(actual));
		}
	}

	// -------------------

	private static Object readVariable(Object object, String name)
			throws NoSuchFieldException, SecurityException,
			IllegalArgumentException, IllegalAccessException {

		final Field field = object.getClass().getDeclaredField(name);
		field.setAccessible(true);
		final Object value = field.get(object);
		field.setAccessible(false);

		return value;
	}

	private static void setVariable(Object object, String name, Object value)
			throws NoSuchFieldException, SecurityException,
			IllegalArgumentException, IllegalAccessException {
		final Field field = object.getClass().getDeclaredField(name);
		field.setAccessible(true);
		field.set(object, value);
		field.setAccessible(false);
	}

	private static Measurement createMeasurement() throws NoSuchFieldException,
			SecurityException, IllegalArgumentException, IllegalAccessException {
		final Measurement measurement = new Measurement();

		setVariable(measurement, "data", new int[0]);

		return measurement;
	}

	private static Matrix createMatrix() throws NoSuchFieldException,
			SecurityException, IllegalArgumentException, IllegalAccessException {

		final int[][] values = new int[][] {};
		final Matrix matrix = new Matrix(values);

		setVariable(matrix, "values", values);

		return matrix;
	}

	private static String printMatrix(final int[][] values)
			throws NoSuchFieldException, SecurityException,
			IllegalArgumentException, IllegalAccessException {

		StringBuilder sb = new StringBuilder();
		sb.append(String.format("<br />%dx%x:<br />", values.length,
				values[0].length));

		for (int[] row : values) {
			sb.append(Arrays.toString(row));
			sb.append("<br />");
		}

		return sb.toString();
	}

	private static void printFormattedError(final String format,
			final Object... args) {
		TracingFramework.printError(String.format(format, args));
	}

	public static void main(String[] args) throws IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Miniprojekt2Tests tests = new Miniprojekt2Tests();

		System.out.println(Miniprojekt2Tests.class.getName());
		System.out.println("------------------------");

		int previousResult = 0;

		for (Method method : Miniprojekt2Tests.class.getMethods()) {
			if (method.isAnnotationPresent(Test.class)) {
				method.invoke(tests);
				final int result = tests.getResult() - previousResult;
				previousResult = tests.getResult();
				System.out.println(method.getName() + ":\t" + result);
			}
		}

		System.out.println("------------------------");
		System.out.println("Summe: " + tests.getResult());
	}
}
