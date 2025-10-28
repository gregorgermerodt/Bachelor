import java.util.Arrays;
public class Measurement
{
    private int[] data;
    public Measurement()
    {
        data = new int[0];
    }    
    public void addValue(int value)
    {
        int[] data = new int[this.data.length+1];
        for(int i = 0; i<this.data.length; i++)
        {
            data[i] = this.data[i];
        }
        data[this.data.length] = value;
        this.data = data;
    }
    public void addValues(int[] values)
    {
        int[] d = new int[this.data.length+values.length];
        int a = 0;
        for(int i = 0; i<this.data.length; i++)
        {
            d[i] = this.data[i];
        }
        for(int i = this.data.length; a<values.length; i++)
        {
            d[i] = values[a];
            a++;
        }
        this.data = d;
    }
    public int getMinimumValue()
    {
        int a = Integer.MAX_VALUE;
        for(int i = 1; i<this.data.length; i++)
        {
            if(data[i]<a)
            {
                a = data[i];
            }
        }
        return a;
    }
    public int[] getValuesAboveThreshold(int threshold)
    {
        int b = 0;
        int[] z = new int[0];
        for(int i = 0; i<this.data.length; i++)
        {
            if(this.data[i]>threshold)
            {
                b++;
                int[] d = new int[b];
                for(int j=0; j<z.length;j++)
                {
                    d[j] = z[j];
                }
                d[b-1] = data[i];
                z = d;
            }
        }
        return z;
    }
    // --------------------------------------------------------------
    
    public void printData()
    {
        System.out.println(Arrays.toString(data));
    }
    public static void main(String[] args)
    {
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