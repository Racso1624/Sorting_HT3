/******************************************************************
 Quick.java
 Autor: Diego Franco / Oscar Lopez

 Tipo de ordenamiento por el metodo QUICK.
 ******************************************************************/
public class Quick
{
    
    /** 
     * @param arr
     * @param low
     * @param high
     * @return int
     */
    /** Metodo que ordena el listado de valores que se le haya ingresado
     * de menor a mayor, con el use del compareTo.*/
    int partition(Comparable[] arr, int low, int high)
    {
        Comparable pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j].compareTo(pivot)<0)
            {
                i++;


                Comparable temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Comparable temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }


    
    /** 
     * @param arr
     * @param low
     * @param high
     * @return Comparable[]
     */
    /** Metodo que llama al quick para realizar el ordenamiento
     * enviandole los parametros necesarios para que lo realice.*/
    public Comparable[] quicksort(Comparable[] arr, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(arr, low, high);


            quicksort(arr, low, pi-1);
            quicksort(arr, pi+1, high);
        }

        return arr;
    }
}

