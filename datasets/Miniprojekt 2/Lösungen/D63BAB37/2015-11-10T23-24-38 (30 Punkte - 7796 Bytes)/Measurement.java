import java.util.Arrays;

	public class Measurement {

		private int[] data;

		public Measurement() {

		}

		public void addValue(int value) {
      data[data.length ]=value;
		}

		public void addValues(int[] values) {
			
			for(int i=0;i<values.length;i++){
				data[data.length ]=values[i];
				
			}

		}

		public int getMinimumValue() {
			int miniValue = data[0];
			for(int i=0;i<data.length ;i++){
				if(miniValue>data[i]){
					miniValue=data[i];
				}
			}
			return miniValue;
		}

		public int[] getValuesAboveThreshold(int threshold) {
			int[] AboutValue;
			int j=0;
			for(int i=0;i<data.length ;i++){
				if(data[i]> threshold){
					j++;
					}
			}
				AboutValue=new int [j];
				j=0;
			for(int k=0;k<data.length ;k++){
				if(data[k]> threshold){
					AboutValue[j]=data[k];
					j++;
					}
			}
			
			
			return AboutValue;
			
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
			System.out.println("Hinzuf¨¹gen eines neuen Wertes. m:");
			// Erwartete Ausgabe:
			// [85]
			m.printData();
			
			System.out.println("------------------------------------------------------------------");
			
			m.addValues(new int[] { 58, 78, 61, 72, 93, 81, 79, 78, 75, 81, 93 });
			System.out.println("Hinzuzf¨¹gen einer Menge von Werten. m:");
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
			System.out.println("Messwerte ¨¹ber 78:");
			// Erwartete Ausgabe:
			// [85, 93, 81, 79, 81, 93]
			System.out.println(Arrays.toString(valuesAbove78));
			
			System.out.println("------------------------------------------------------------------");
			
			int[] valuesAbove93 = m.getValuesAboveThreshold(93);
			System.out.println("Messwerte ¨¹ber 93:");
			// Erwartete Ausgabe:
			// []
			System.out.println(Arrays.toString(valuesAbove93));
		}

	}


	
