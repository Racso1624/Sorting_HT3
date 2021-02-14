/******************************************************************
 Pruebas.java
 Autor: Diego Franco / Oscar Lopez

 Clase de puebasJunit, tiene el fin de analizar el codigo y su
 correcto funcionamiento.
 ******************************************************************/
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class PruebasUnitarias {
    
    Burbuja burbuja = new Burbuja();
    Gnome gnome = new Gnome();
    Merge merge = new Merge();
    Quick quick = new Quick();

    @Test
    public void pruebaBubble(){

        Comparable[] lista = {4, 2, 1, 3};
        Comparable[] ordenado = burbuja.bubbleSort(lista);
        String vacio = "";
        for (Comparable comparable : ordenado) {
            vacio += comparable.toString();
        }
        assertEquals("1234", vacio);

    }

    @Test
    public void pruebaGnome(){

        Comparable[] lista = {4, 2, 1, 3};
        Comparable[] ordenado = gnome.gnomesort(lista);
        String vacio = "";
        for (Comparable comparable : ordenado) {
            vacio += comparable.toString();
        }
        assertEquals("1234", vacio);

    }

    @Test
    public void pruebaMerge(){

        Comparable[] lista = {4, 2, 1, 3};
        Comparable[] ordenado = merge.Mergesort(lista, 0, lista.length - 1);
        String vacio = "";
        for (Comparable comparable : ordenado) {
            vacio += comparable.toString();
        }
        assertEquals("1234", vacio);

    }

    @Test
    public void pruebaQuick(){

        Comparable[] lista = {4, 2, 1, 3};
        Comparable[] ordenado = quick.quicksort(lista, 0, lista.length - 1);
        String vacio = "";
        for (Comparable comparable : ordenado) {
            vacio += comparable.toString();
        }
        assertEquals("1234", vacio);

    }

    @Test
    public void pruebaRadix(){

        Comparable[] lista = {4, 2, 1, 3};
        Comparable[] ordenado = Radix.radixsort(lista, lista.length);
        String vacio = "";
        for (Comparable comparable : ordenado) {
            vacio += comparable.toString();
        }
        assertEquals("1234", vacio);

    }

}
