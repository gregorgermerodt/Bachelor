import java.util.Arrays;

public class Measurement {

	private int[] data;
    
	public Measurement() {
		data = new int [0];
	}

	public void addValue(int value) {
		int[]newData = new int[data.length+1];
		for(int index = 0 ; index < data.length ; index++)//index=i
		{
			newData[index] = data[index];
		}
       
        newData[data.length] = value;
        data = newData;
	}

	public void addValues(int[] values) {
		int[]newData = new int [data.length + values.length];
		for(int index=0 ; index<data.length ; index++){
			newData[index] = data[index];
		}
		for(int index = 0 ; index < values.length ; index++){
			newData[data.length+index] = values[index];
		}
         data = newData;
	}

	public int getMinimumValue() {
		int min = data[0];
		for (int index = 0 ; index < data.length ; index++)
		{
			if (data[index] < min)
			{
				min = data[index];
			}
	
		}
		return min;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		int[] temp = new int[0];
		int[] newData;
		for (int index = 0 ; index < data.length ; index++){
			if (data[index]>threshold)
			{
				newData = new int[temp.length+1];
				for(int j = 0 ; j < temp.length ; j++)
				{
					newData[j] = temp[j];
				}
				newData[temp.length] = data[index];
				temp = newData;
			}
		}
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
