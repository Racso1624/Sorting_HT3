import java.util.ArrayList;

public class Gnome<E> implements Comparable{
    
    private ArrayList<E> datos;
    
    public Gnome(){}

    public E[] sort(E data[], int n){
        int index = 0; 
        while (index < n) { 
            if (index == 0) 
                index++; 
            if (data[index] >= data[index - 1]) 
                index++; 
            else { 
                int temp = 0; 
                temp = data[index]; 
                data[index] = data[index - 1]; 
                data[index - 1] = temp; 
                index--; 
            } 
        } 
        return data;

    }

}