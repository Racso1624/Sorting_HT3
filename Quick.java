public class Quick{
    public Comparable[] quicksort(Comparable[] A, int izq, int der) {

        Comparable pivote=A[izq]; // tomamos primer elemento como pivote
        int i=izq;         // i realiza la búsqueda de izquierda a derecha
        int j=der;         // j realiza la búsqueda de derecha a izquierda
        Comparable aux;

        while(i < j){                          // mientras no se crucen las búsquedas
            while(A[i].compareTo(pivote)<0  && i < j) i++; // busca elemento mayor que pivote
            while(A[j].compareTo(pivote)>0) j--;           // busca elemento menor que pivote
            if (i < j) {                        // si no se han cruzado
                aux= A[i];                      // los intercambia
                A[i]=A[j];
                A[j]=aux;
            }
        }

        A[izq]=A[j];      // se coloca el pivote en su lugar de forma que tendremos
        A[j]=pivote;      // los menores a su izquierda y los mayores a su derecha

        if(izq < j-1)
            quicksort(A,izq,j-1);          // ordenamos subarray izquierdo
        if(j+1 < der)
            quicksort(A,j+1,der);          // ordenamos subarray derecho

        return A;
    }
}
