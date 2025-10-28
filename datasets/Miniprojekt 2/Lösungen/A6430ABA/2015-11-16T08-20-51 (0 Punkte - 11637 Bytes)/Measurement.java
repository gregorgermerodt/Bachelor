import java.util.Arrays;

public class Measurement {

	private int[] data;
	 
    /*
     * Aufgabe 1
     *
     * beachtet "this" nicht - hier kann man es weglassen
     *
     * Was this genau bedeutet und wieso man diesen Operator
     * verwendet wird noch sp�ter deutlich
     */
   
    // a)
    public Measurement()
    {      
         
            this.data = new int[0];
    }
   
    // b)
    public void addValue(int value)
    {      
           
            if(data.length == 0)
            {
                    
                    int[] data2 = {value};
                    
                    data = data2;
            
            }else
            {      
                    
                    int[] data2 = new int[this.data.length+1];
                   
                   
                    for(int i = 0; i < this.data.length; i++)
                    {
                            data2[i] = this.data[i];
                          
                            if(i == this.data.length-1) {
                                    data2[i+1]=value;
                            }
                    }
                   
                   
                    data = data2;
                   
            }
    }
   
    // c)
    public void addValues(int[] values)
    {
            int[] data2 = new int[this.data.length+values.length];
           
            
            if(values == null)
            {
            
            }else
            {      
                    
                            if(i == data.length) {
                                   
                                    for(int j = i, k = 0; j < data2.length; j++, k++)
                                    {
                                            data2[j] = values[k];
                                    }
                            }else
                            {
                                    data2[i] = data[i];
                            }
                    }
            }
           
            data = data2;
    }

    // d)
    public int getMinimumValue()
    {      
            int minValue = data[0];
           
            
            for(int i = 0; i < this.data.length; i++) {
                   
                    if(data[i] < minValue)
                    {
                            minValue = data[i];
                    }
            }
           
            return minValue;
    }
   
    // e)
    public int[] getValuesAboveThreshold(int threshold)
    {
            
            if(threshold == 0)
            {
                    return null;
            }else
            {      
                    
                    int counter = 0;
                   
                    int[] temp = new int[data.length];
            
                    for(int i = 0; i < this.data.length; i++)
                    {      
                           
                            if(data[i] > threshold)
                            {      
                                  
                                    temp[counter] = data[i];
                                    counter++;
                            }
                    }
                   
                    
                    int[] newThreshold = new int[counter];
              
                    for(int i = 0; i < newThreshold.length; i++)
                    {
                            newThreshold[i] = temp[i];
                    }
                   
           
                    return newThreshold;
            }
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
