public class Merge {
    
    public void merge(Comparable[] arr, int l, int m, int r)
    {

        int n1 = m - l + 1;
        int n2 = r - m;
 

        Comparable[] L = new Comparable[n1];
        Comparable[] R = new Comparable[n2];
 

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 


        int i = 0, j = 0;
 
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j])>0) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 

    public Comparable[] Mergesort(Comparable[] arr, int l, int r)
    {
        if (l < r) {
  
            int m =l+ (r-l)/2;

            Mergesort(arr, l, m);
            Mergesort(arr, m + 1, r);
 
            merge(arr, l, m, r);
        }

        return arr;
    }

}

