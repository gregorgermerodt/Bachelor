import java.util.Arrays;

	public class Measurement {

		private int[] data;
		private int x,y,z;

		public Measurement() {
           data = new int[x];
           x = 0;
		}
		public void addValues(int value) {
           for (x = 1; data.length ;x++)
			data[x] = value;
           
		}

		public void addValues(int[] values) {
            values = new int [y];
            for (x = 0;;x++)
			    z = x+y;
            	data = data + values;  
		}

		public int getMinimumValue() {
			for(y=x+1;y<x;y++){
				if (data[x]>data[y]){
					z = data[x];
					data[x] = data[y];
					data[y] = z;
				}
			}
			return -1;
			
		}

		public int[] getValuesAboveThreshold(int threshold) {
			return null;
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


