import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Locale;

import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework;
import de.uni_due.s3.jack2.backend.checkers.tracingchecker.framework.TracingFramework.Test;

public class Miniprojekt1Tests {

	private static final String EXERCISE_NAME = "Miniprojekt 1";

	private static final DecimalFormat FORMAT = (DecimalFormat) DecimalFormat
			.getInstance(Locale.UK);

	static {
		FORMAT.applyPattern("#.##");
	}

	private int score;

	public int getResult() {
		return score;
	}

	@Test(name = EXERCISE_NAME + " - Point.Point(double initX, double initY)")
	public void testPointConstructor() throws Exception {
		final double x = 63.52;
		final double y = -692.96;

		final Point p = new Point(x, y);

		final double actualX = (Double) readVariable(p, "x");
		final double actualY = (Double) readVariable(p, "y");

		if (actualX == x && actualY == y) {
			score += 5;
		} else {
			TracingFramework
					.printError(String
							.format("Der Aufruf von Point(%f, %f) sollte dazu führen, dass x=%f und y=%f. Nach Aufruf deines Konstruktors ist x=%f und y=%f.",
									x, y, x, y, actualX, actualY));
		}
	}

	@Test(name = EXERCISE_NAME + " - Point.getX()")
	public void testPointGetX() throws Exception {
		final double x = -593.158;

		final Point p = new Point(0.0, 0.0);
		setVariable(p, "x", x);

		final double actualX = p.getX();

		if (actualX == x) {
			score += 5;
		} else {
			TracingFramework
					.printError(String
							.format("Die Methode Point.getX() liefert einen fehlerhaften Wert zurück (%f)",
									actualX));
		}
	}

	@Test(name = EXERCISE_NAME + " - Point.setX()")
	public void testPointSetX() throws Exception {
		final double x = 4366.958;

		final Point p = new Point(0.0, 0.0);
		p.setX(x);

		final double actualX = (Double) readVariable(p, "x");

		if (actualX == x) {
			score += 5;
		} else {
			TracingFramework
					.printError(String
							.format("Die Methode Point.setX() setzt das Feld Point.y nicht korrekt. Nach dem Aufruf von Point.setX(%f) hat Point.y den Wert %f",
									x, actualX));
		}
	}

	@Test(name = EXERCISE_NAME + " - Point.getY()")
	public void testPointGetY() throws Exception {
		final double y = 439.5;

		final Point p = new Point(0.0, 0.0);
		setVariable(p, "y", y);

		final double actualY = p.getY();

		if (actualY == y) {
			score += 5;
		} else {
			TracingFramework
					.printError(String
							.format("Die Methode Point.getY() liefert einen fehlerhaften Wert zurück (%f)",
									actualY));
		}
	}

	@Test(name = EXERCISE_NAME + " - Point.setY()")
	public void testPointSetY() throws Exception {
		final double y = -546.918;

		final Point p = new Point(0.0, 0.0);
		p.setY(y);

		final double actualY = (Double) readVariable(p, "y");

		if (actualY == y) {
			score += 5;
		} else {
			TracingFramework
					.printError(String
							.format("Die Methode Point.setY() setzt das Feld Point.y nicht korrekt. Nach dem Aufruf von Point.setY(%f) hat Point.y den Wert %f",
									y, actualY));
		}
	}

	@Test(name = EXERCISE_NAME + " - Point.getDistance() #1")
	public void testPointGetDistance1() throws Exception {
		final double x1 = 0.0;
		final double y1 = 0.0;
		final double x2 = 3.0;
		final double y2 = -4.0;
		final double expected = 5.0;

		final Point p1 = new Point(0.0, 0.0);
		setVariable(p1, "x", x1);
		setVariable(p1, "y", y1);

		final Point p2 = new Point(0.0, 0.0);
		setVariable(p2, "x", x2);
		setVariable(p2, "y", y2);

		final double actual = p1.getDistance(p2);

		if (compareValues(expected, actual)) {
			score += 5;
		} else {
			TracingFramework
					.printError(String
							.format("Für die Punkte P1(%f|%f) und P2(%f|%f) sollte die Methode Point.getDistance() %f zurückgeben, sie liefert aber %f",
									x1, y1, x2, y2, expected, actual));
		}
	}

	// @Test(name = EXERCISE_NAME + " - Point.getDistance() #2")
	// public void testPointGetDistance2() throws Exception {
	// final double x1 = -4.5;
	// final double y1 = 2.5;
	// final double x2 = 5.5;
	// final double y2 = -1.0;
	// final double expected = 10.59481;
	//
	// final Point p1 = new Point(0.0, 0.0);
	// setVariable(p1, "x", x1);
	// setVariable(p1, "y", y1);
	//
	// final Point p2 = new Point(0.0, 0.0);
	// setVariable(p2, "x", x2);
	// setVariable(p2, "y", y2);
	//
	// final double actual = p1.getDistance(p2);
	//
	// if (compareValues(expected, actual)) {
	// score += 5;
	// } else {
	// TracingFramework
	// .printError(String
	// .format("Für die Punkte P1(%f|%f) und P2(%f|%f) sollte die Methode Point.getDistance() %f zurückgeben, sie liefert aber %f",
	// x1, y1, x2, y2, expected, actual));
	// }
	// }

	@Test(name = EXERCISE_NAME
			+ " - Circle.Circle(Point initLocation, double initRadius)")
	public void testCircleConstructor() throws Exception {
		final double x = -4.5;
		final double y = 2.5;
		final double radius = 10.0;

		final Point p = new Point(0.0, 0.0);
		setVariable(p, "x", x);
		setVariable(p, "y", y);

		final Circle circle = new Circle(p, radius);

		final Point pActual = (Point) readVariable(circle, "location");
		final double radiusActual = (Double) readVariable(circle, "radius");

		if (pActual == p && radiusActual == radius) {
			score += 5;
		} else {
			TracingFramework
					.printError("Der Konstruktor Circle.Circle(Point initLocation, double initRadius) setzt mindestens eines der Felder location und radius nicht korrekt");
		}
	}

	@Test(name = EXERCISE_NAME + " - Circle.getRadius()")
	public void testCircleGetRadius() throws Exception {
		final double radius = 5.2;

		final Circle c = new Circle(new Point(0.0, 0.0), 0.0);
		setVariable(c, "radius", radius);
		final double actual = c.getRadius();

		if (actual == radius) {
			score += 5;
		} else {
			TracingFramework
					.printError(String
							.format("Die Methode Circle.getRadius() liefert einen fehlerhaften Wert zurück (%f)",
									actual));
		}
	}

	@Test(name = EXERCISE_NAME + " - Circle.setRadius()")
	public void testCircleSetRadius() throws Exception {
		final double radius = 941.57;

		final Circle c = new Circle(new Point(0.0, 0.0), 0.0);
		c.setRadius(radius);

		final double actual = (Double) readVariable(c, "radius");

		if (actual == radius) {
			score += 5;
		} else {
			TracingFramework
					.printError(String
							.format("Die Methode Circle.setRadius() setzt das Feld Circle.radius nicht korrekt. Nach dem Aufruf von Circle.setRadius(%f) hat Circle.radius den Wert %f",
									radius, actual));
		}
	}

	@Test(name = EXERCISE_NAME + " - Circle.getLocation()")
	public void testCircleGetLocation() throws Exception {
		final Point location = new Point(0.0, 0.0);

		final Circle c = new Circle(new Point(0.0, 0.0), 0.0);
		setVariable(c, "location", location);

		final Point actual = c.getLocation();

		if (actual == location) {
			score += 5;
		} else {
			TracingFramework
					.printError(String
							.format("Die Methode Circle.getLocation() liefert einen fehlerhaften Wert zurück (%s)",
									actual));
		}
	}

	@Test(name = EXERCISE_NAME + " - Circle.setRadius()")
	public void testCircleSetLocation() throws Exception {
		final Point location = new Point(0.0, 0.0);

		final Circle c = new Circle(new Point(0.0, 0.0), 0.0);
		c.setLocation(location);

		final Point actual = (Point) readVariable(c, "location");

		if (actual == location) {
			score += 5;
		} else {
			TracingFramework
					.printError(String
							.format("Die Methode Circle.setLocation() setzt das Feld Circle.location nicht korrekt. Nach dem Aufruf von Circle.setLocation(%s) hat Circle.location den Wert %s",
									location, actual));
		}
	}

	@Test(name = EXERCISE_NAME + " - Circle.getDiameter()")
	public void testCircleGetDiameter() throws Exception {
		final double radius = 3.2;
		final Circle c = createCircle(0.0, 0.0, radius);

		final double expected = 2 * radius;
		final double actual = c.getDiameter();

		if (expected == actual) {
			score += 5;
		} else {
			TracingFramework
					.printError(String
							.format("Die Methode Circle.getDiameter() gibt bei einem Radius von %f den Wert %f zurück, sollte jedoch %f zurückgeben",
									radius, actual, expected));
		}
	}

	@Test(name = EXERCISE_NAME + " - Circle.getCircumference()")
	public void testCircleGetCircumference() throws Exception {
		final double radius = 47.16;
		final Circle c = createCircle(0.0, 0.0, radius);

		final double expected = 2 * Math.PI * radius;
		final double actual = c.getCircumference();

		if (expected == actual) {
			score += 5;
		} else {
			TracingFramework
					.printError(String
							.format("Die Methode Circle.getCircumference() gibt bei einem Radius von %f den Wert %f zurück, sollte jedoch %f zurückgeben",
									radius, actual, expected));
		}
	}

	@Test(name = EXERCISE_NAME + " - Circle.getArea()")
	public void testCircleGetArea() throws Exception {
		final double radius = 75.0;
		final Circle c = createCircle(0.0, 0.0, radius);

		final double expected = Math.PI * radius * radius;
		final double actual = c.getArea();

		if (expected == actual) {
			score += 5;
		} else {
			TracingFramework
					.printError(String
							.format("Die Methode Circle.getArea() gibt bei einem Radius von %f den Wert %f zurück, sollte jedoch %f zurückgeben",
									radius, actual, expected));
		}
	}

	@Test(name = EXERCISE_NAME + " - Circle.containsPoint() #1")
	public void testCircleContainsPoint1() throws Exception {
		final double cx = 3.5;
		final double cy = 1.0;
		final double radius = 4.0;
		final double px = 0.0;
		final double py = 0.0;

		final Circle c = createCircle(cx, cy, radius);
		final Point p = createPoint(px, py);

		final boolean expected = true;
		final boolean actual = c.containsPoint(p);

		if (expected == actual) {
			score += 5;
		} else {
			TracingFramework
					.printError(String
							.format("Fehler in der Methode Circle.containsPoint(): Ein Kreis mit Mittelpunkt (%f|%f) und Radius (%f) enthält den Punkt (%f|%f), deine Methode liefert jedoch 'false' zurück",
									cx, cy, radius, px, py));
		}
	}

	@Test(name = EXERCISE_NAME + " - Circle.containsPoint() #2")
	public void testCircleContainsPoint2() throws Exception {
		final double cx = 3.5;
		final double cy = 1.0;
		final double radius = 4.0;
		final double px = -1.0;
		final double py = -1.0;

		final Circle c = createCircle(cx, cy, radius);
		final Point p = createPoint(px, py);

		final boolean expected = false;
		final boolean actual = c.containsPoint(p);

		if (expected == actual) {
			score += 5;
		} else {
			TracingFramework
					.printError(String
							.format("Fehler in der Methode Circle.containsPoint(): Ein Kreis mit Mittelpunkt (%f|%f) und Radius (%f) enthält den Punkt (%f|%f) nicht, deine Methode liefert jedoch 'true' zurück",
									cx, cy, radius, px, py));
		}
	}

	@Test(name = EXERCISE_NAME + " - Circle.containsPoint() #3")
	public void testCircleContainsPoint3() throws Exception {
		final double cx = -12.0;
		final double cy = 10.0;
		final double radius = 1.0;
		final double px = 2.5;
		final double py = 10.0;

		final Circle c = createCircle(cx, cy, radius);
		final Point p = createPoint(px, py);

		final boolean expected = false;
		final boolean actual = c.containsPoint(p);

		if (expected == actual) {
			score += 5;
		} else {
			TracingFramework
					.printError(String
							.format("Fehler in der Methode Circle.containsPoint(): Ein Kreis mit Mittelpunkt (%f|%f) und Radius (%f) enthält den Punkt (%f|%f), deine Methode liefert jedoch 'false' zurück",
									cx, cy, radius, px, py));
		}
	}

	@Test(name = EXERCISE_NAME + " - Circle.containsPoint() #4")
	public void testCircleContainsPoint4() throws Exception {
		final double cx = -12.0;
		final double cy = 10.0;
		final double radius = 1.0;
		final double px = -11.0;
		final double py = 9.0;

		final Circle c = createCircle(cx, cy, radius);
		final Point p = createPoint(px, py);

		final boolean expected = false;
		final boolean actual = c.containsPoint(p);

		if (expected == actual) {
			score += 5;
		} else {
			TracingFramework
					.printError(String
							.format("Fehler in der Methode Circle.containsPoint(): Ein Kreis mit Mittelpunkt (%f|%f) und Radius (%f) enthält den Punkt (%f|%f) nicht, deine Methode liefert jedoch 'true' zurück",
									cx, cy, radius, px, py));
		}
	}

	@Test(name = EXERCISE_NAME + " - Circle.fromPoints() #1")
	public void testCircleFromPoints1() throws Exception {
		final double x1 = 1.0;
		final double y1 = 2.0;
		final double x2 = 5.0;
		final double y2 = 2.0;
		final double radius = 4.0;

		final Point p1 = createPoint(x1, y1);
		final Point p2 = createPoint(x2, y2);

		final Circle c = Circle.fromPoints(p1, p2);

		final double expectedX = x1;
		final double expectedY = y1;

		final Point actualCenter = (Point) readVariable(c, "location");

		if (actualCenter == null) {
			TracingFramework
					.printError("Fehler in der Methode Circle.fromPoints(): Das Feld Circle.location des zurückgegebenen Circle-Objekts hat den Wert null");
			return;
		}

		final double actualX = (Double) readVariable(actualCenter, "x");
		final double actualY = (Double) readVariable(actualCenter, "y");
		final double actualRadius = (Double) readVariable(c, "radius");

		if (actualX == expectedX && actualY == expectedY
				&& compareValues(radius, actualRadius)) {
			score += 5;
		} else {
			TracingFramework
					.printError(String
							.format("Fehler in der Methode Circle.fromPoints(): Der zurückgegebene Kreis sollte den Mittelpunkt (%f|%f) und einen Radius von %f haben. Die Methode gibt jedoch einen Kreis mit dem Mittelpunkt (%f|%f) und dem Radius %f zurück.",
									expectedX, expectedY, radius, actualX,
									actualY, actualRadius));
		}
	}

	@Test(name = EXERCISE_NAME + " - Circle.fromPoints() #2")
	public void testCircleFromPoints2() throws Exception {
		final double x1 = 4.0;
		final double y1 = 4.0;
		final double x2 = 7.0;
		final double y2 = 8.0;
		final double radius = 5.0;

		final Point p1 = createPoint(x1, y1);
		final Point p2 = createPoint(x2, y2);

		final Circle c = Circle.fromPoints(p1, p2);

		final double expectedX = x1;
		final double expectedY = y1;

		final Point actualCenter = (Point) readVariable(c, "location");

		if (actualCenter == null) {
			TracingFramework
					.printError("Fehler in der Methode Circle.fromPoints(): Das Feld Circle.location des zurückgegebenen Circle-Objekts hat den Wert null");
			return;
		}

		final double actualX = (Double) readVariable(actualCenter, "x");
		final double actualY = (Double) readVariable(actualCenter, "y");
		final double actualRadius = (Double) readVariable(c, "radius");

		if (actualX == expectedX && actualY == expectedY
				&& compareValues(radius, actualRadius)) {
			score += 5;
		} else {
			TracingFramework
					.printError(String
							.format("Fehler in der Methode Circle.fromPoints(): Der zurückgegebene Kreis sollte den Mittelpunkt (%f|%f) und einen Radius von %f haben. Die Methode gibt jedoch einen Kreis mit dem Mittelpunkt (%f|%f) und dem Radius %f zurück.",
									expectedX, expectedY, radius, actualX,
									actualY, actualRadius));
		}
	}

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

	private static boolean compareValues(double v1, double v2) {
		final double f1 = Double.valueOf(FORMAT.format(v1));
		final double f2 = Double.valueOf(FORMAT.format(v2));

		return f1 == f2;
	}

	private static Circle createCircle(double x, double y, double radius)
			throws NoSuchFieldException, SecurityException,
			IllegalArgumentException, IllegalAccessException {

		final Point p = createPoint(x, y);

		final Circle circle = new Circle(p, 0.0);
		setVariable(circle, "location", p);
		setVariable(circle, "radius", radius);

		return circle;
	}

	private static Point createPoint(double x, double y)
			throws NoSuchFieldException, SecurityException,
			IllegalArgumentException, IllegalAccessException {

		final Point p = new Point(0.0, 0.0);
		setVariable(p, "x", x);
		setVariable(p, "y", y);

		return p;
	}

	public static void main(String[] args) throws IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Miniprojekt1Tests tests = new Miniprojekt1Tests();

		System.out.println(Miniprojekt1Tests.class.getName());
		System.out.println("------------------------");

		int previousResult = 0;

		for (Method method : Miniprojekt1Tests.class.getMethods()) {
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