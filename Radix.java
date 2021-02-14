import java.util.*; 
  
public class Radix {
  
    
    /** 
     * @param arr
     * @param n
     * @return int
     */
    public static int getMax(Comparable[] arr, int n)
    { 
        int mx = (int) arr[0];
        for (int i = 1; i < n; i++) 
            if ((int)arr[i] > mx)
                mx = (int) arr[i];
        return mx; 
    } 
  
    
    /** 
     * @param arr
     * @param n
     * @param exp
     */
    public static void countSort(Comparable[] arr, int n, int exp)
    { 
        int output[] = new int[n]; // output array 
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count, 0); 
  
        for (i = 0; i < n; i++) 
            count[((int)arr[i] / exp) % 10]++;
  

        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 

        for (i = n - 1; i >= 0; i--) { 
            output[count[((int)arr[i] / exp) % 10] - 1] = (int)arr[i];
            count[((int)arr[i] / exp) % 10]--;
        } 
  

        for (i = 0; i < n; i++) 
            arr[i] = output[i]; 
    } 
  
    
    /** 
     * @param arr
     * @param n
     * @return Comparable[]
     */
    public static Comparable[] radixsort(Comparable[] arr, int n)
    { 
        int m = getMax(arr, n);

        for (int exp = 1; m / exp > 0; exp *= 10) 
            countSort(arr, n, exp);

        return arr;
    } 
  

}