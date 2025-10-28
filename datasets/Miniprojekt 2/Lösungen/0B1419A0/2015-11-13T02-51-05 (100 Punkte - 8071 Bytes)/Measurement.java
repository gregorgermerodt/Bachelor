import java.util.Arrays;

public class Measurement {

	private int[] data;

	public Measurement() {
		this.data = new int[] {};
	}

	public void addValue(int value) {
		int[] newArr = new int[this.data.length + 1];
		for (int i = 0; i < this.data.length; i++)
		{
			newArr[i] = this.data[i];
		}
		newArr[newArr.length-1] = value;
		this.data = newArr;
	}

	public void addValues(int[] values) {
		int[] newArr = new int[this.data.length + values.length];
		int valuesCount = 0;
		for (int i = 0; i < newArr.length; i++)
		{
			if(i<this.data.length)
			{
				newArr[i] = this.data[i];
			}
			else
			{
				newArr[i] = values[valuesCount];
				valuesCount++;
			}
		}
		this.data = newArr;
	}

	public int getMinimumValue() {
		int minValue = Integer.MAX_VALUE;
		for (int i = 0; i < this.data.length; i++)
		{
			if(minValue > this.data[i])
			{
				minValue = this.data[i];
			}
		}
		return minValue;
	}

	public int[] getValuesAboveThreshold(int threshold) {
		//counter for number of values above threshold
		int counter = 0;
		int[] tmpData = new int[this.data.length];
		for (int i = 0; i < this.data.length; i++)
		{
			if(this.data[i]>threshold)
			{
				tmpData[counter] = this.data[i];
				counter++;
			}
		}
		int[] newData = new int[counter];
		for (int j = 0; j < newData.length; j++)
		{
			newData[j] = tmpData[j];
		}
		return newData;
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
