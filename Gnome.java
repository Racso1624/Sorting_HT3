import java.util.ArrayList;

public class Gnome{

    private Comparable[] almacen;

    
    public Gnome(){almacen = new Comparable[3000];}

    public Comparable[] gnomesort(Comparable[] data){
        int index = 0; 
        while (index < data.length) {
            if (index == 0) 
                index++; 
            if ((data[index].compareTo(data[index - 1]))>0)
                index++; 
            else { 
                Comparable temp = 0;
                temp = data[index]; 
                data[index] = data[index - 1]; 
                data[index - 1] = temp; 
                index--; 
            } 
        } 
        return data;

    }
}