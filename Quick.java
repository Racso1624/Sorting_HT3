public class Quick
{
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

