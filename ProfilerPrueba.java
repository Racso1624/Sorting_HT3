public class ProfilerPrueba {

    public static void main(String[] args) {

        Burbuja burbuja = new Burbuja();
        Gnome gnome = new Gnome();
        Merge merge = new Merge();
        Quick quick = new Quick();

        Comparable[] listadatos = new Comparable[3000];
        for (int i = 0; i < 3000; i++) {
            Integer num = (int) (Math.random() * 100) + 1;
            listadatos[i] = num;
        }

        System.out.println(burbuja.bubbleSort(listadatos)[listadatos.length-1]);
        System.out.println(burbuja.bubbleSort(listadatos)[0]);

    }

        /*
        System.out.println(burbuja.bubbleSort(listadatos)[listadatos.length-1]);
        System.out.println(burbuja.bubbleSort(listadatos)[0]);
        */

        /*
        System.out.println(gnome.gnomesort(listadatos)[listadatos.length - 1]);
        System.out.println(gnome.gnomesort(listadatos)[0]);
        */


        /*
        System.out.println((me.Mergesort(listadatos,0, listadatos.length-1))[listadatos.length-1]);
        System.out.println((me.Mergesort(listadatos,0, listadatos.length-1))[0]);
        */

        /*
        System.out.println(qu.quicksort(listadatos,0, listadatos.length-1)[listadatos.length-1]);
        System.out.println(qu.quicksort(listadatos,0, listadatos.length-1)[0]);
         */


        /*
        System.out.println(rad.radixsort(listadatos,listadatos.length)[listadatos.length-1]);
        System.out.println(rad.radixsort(listadatos,listadatos.length)[0]);
         */

}
