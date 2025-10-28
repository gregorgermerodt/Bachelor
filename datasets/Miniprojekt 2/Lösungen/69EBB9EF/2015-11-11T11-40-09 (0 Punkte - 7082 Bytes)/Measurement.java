import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
	data = new int(0);

	}

	public void addValue(int value) {
	init[] temp = new init(data.lenght+1);
	for(int = 0; i < data.lenght; i++){
	temp{i} = data{i};}
	temp{temp.lenght-1} = value;
	data = temp;

	}

	public void addValues(int[] values) {
	int[] temp = new int[data.lenght+values.lenght);
	for(int i = 0; i < data.lenght; i = i + 1) {

	addValue(values[i]);}

	}

	public int getMinimumValue() {
	int min = data[0];
	for(int i = 0; i < data.lenght; i++)
	{if (min > data[i])
	{min = data[i];}}
	return min;	
	}

	public int[] getValuesAboveThreshold(int threshold) {
	int[] temp = new int[0];
	int anzahl = 0;
	for(int i = 0; i < data.lenght; i ++)
	{if (data[i] > threshold)
	{anzahl++;}}
	if(anzahl == 0)
	{return temp;}
	temp = new int(anzahl);
	int index = 0;
	for(int i = 0; i < data.lenght; i++)
	{if(data[i] > threshold)
	{temp[index] = data[i];
	index++;}}
	return temp;
		
	}

	// --------------------------------------------------------------
	
	public void printData() {
		System.out.println(Arrays.toString(data));
	}

	public static void main(String[] args) {
		Measurement m = new Measurement();
		System.out.println("Neues Measurement-Objekt m erzeugt. m:");
		// ErwarteteAusgabe:
		// []
		m.printData();

		System.out.println("------------------------------------------------------------------");
		
		m.addValue(85);
		System.out.println("Hinzufügen eines neuen Wertes. m:");
		// Erwartete Ausgabe:
		// [85]
		m.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
		System.out.println("Hinzuzfügen einer Menge von Werten. m:");
		// Erwartete Ausgabe:
		// [85, 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93]
		m.printData();
		
		System.out.println("------------------------------------------------------------------");
		
		int minimumValue = m.getMinimumValue();
		System.out.println("Minimaler Wert der Messreihe m:");
		// Erwartete Ausgabe: 58
		System.out.println(minimumValue);
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove78 = m.getValuesAboveThreshold(78);
		System.out.println("Messwerte über 78:");
		// Erwartete Ausgabe:
		// [85, 93, 81, 79, 81, 93]
		System.out.println(Arrays.toString(valuesAbove78));
		
		System.out.println("------------------------------------------------------------------");
		
		int[] valuesAbove93 = m.getValuesAboveThreshold(93);
		System.out.println("Messwerte über 93:");
		// Erwartete Ausgabe:
		// []
		System.out.println(Arrays.toString(valuesAbove93));
	}

}
