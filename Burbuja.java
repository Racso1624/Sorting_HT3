/******************************************************************
 Burbuja.java
 Autor: Diego Franco / Oscar Lopez

 Tipo de ordenamiento por el metodo BURBUJA.
 ******************************************************************/
import java.lang.reflect.Array;

public class Burbuja{

    /** Metodo constructor*/
    public Burbuja(){}

    /** 
     * @param array
     * @return Comparable[]
     */
    /** Metodo que ordena el listado de valores que se le haya ingresado
     * de menor a mayor, con el use del compareTo.*/
    public Comparable[] bubbleSort(Comparable[] array){
        int n = array.length;
        while (n > 0)
        {
            int lastModifiedIndex = 0;
            for (int currentIndex = 1; currentIndex < n; currentIndex++)
            { 
                if (array[currentIndex - 1].compareTo(array[currentIndex]) > 0)
                {
                    Comparable temp = array[currentIndex - 1];
                    array[currentIndex - 1] = array[currentIndex];
                    array[currentIndex] = temp;
                    lastModifiedIndex = currentIndex;
                }
            }
            n = lastModifiedIndex;
        }

        return array;
    }
}