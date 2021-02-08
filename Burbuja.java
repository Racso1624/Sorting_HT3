import java.lang.reflect.Array;

public class Burbuja<E> implements Comparable<E> {
    
    private Array<E> datos;
    
    public Burbuja(){}

    public void bubbleSort(E[] array){
        int n = array.length;
        while (n > 0)
        {
            int lastModifiedIndex = 0;
            for (int currentIndex = 1; currentIndex < n; currentIndex++)
            { 
                if (array[currentIndex - 1].compareTo(array[currentIndex]) > 0)
                {
                    E temp = array[currentIndex - 1];
                    array[currentIndex - 1] = array[currentIndex];
                    array[currentIndex] = temp;
                    lastModifiedIndex = currentIndex;
                }
            }
            n = lastModifiedIndex;
        }
    }