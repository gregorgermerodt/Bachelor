
import java.util.Arrays;

public class Measurement {


	
		private int[] data;

		public Measurement() {
			data = new int [0];
		}

		public void addValue(int value) {
			int [] neu = new int[data.length+1];
			int n = neu.length-1;
			neu [n] = value;
			
			for(int x = 0; x<n; x++){
				
				neu[x]=data[x];
				
			}
			data=neu;
			
			
			
		}

		public void addValues(int[] values) {
			
			int m = values.length;
			for(int y=0;y<m;y++){
				
				addValue(values[y]);
			}

		}

		public int getMinimumValue() {
			
			int min = data[0];
			int n = data.length;
			for(int x=0;x<n;x++){
				
				if(data[x]<min)
					{
					min = data[x];
					}
			}
			return min;
			}
		

		public int[] getValuesAboveThreshold(int threshold) {
			int [] valueabove =new int[0];
			int n = data.length;
			int länge=0;
			int count=0;
			
			for(int x=0;x<n;x++)
			{
				if(data[x]>threshold)
				{
					länge++;
				}
				valueabove = new int[länge];
			}
			
			for(int x=0;x<n;x++)
			{
				if(data[x]>threshold){
					valueabove[count] =data[x];
					count++;
				}
			}
			return valueabove;
			
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

