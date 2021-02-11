import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;

/** Main*/
public class Main {

    public static void main(String[] args) {

        Burbuja bur = new Burbuja();
        Gnome gnome = new Gnome();
        Merge me = new Merge();
        Quick qu=new Quick();
        Radix rad=new Radix();

        Comparable[] listadatos = new Comparable[3000];
        
        try {
            File file = new File("Datos.txt");
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i=0; i<3000; i++){
                Integer num = (int) (Math.random()* 100) + 1;
                String numero = num.toString();
                bw.write(numero);
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            File obj = new File("Datos.txt");
            Scanner myReader = new Scanner(obj);
            int contador =0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                int numero = Integer.parseInt(data);
                listadatos[contador]=numero;
                contador++;
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            e.printStackTrace();
        }

        /*
        System.out.println(bur.bubbleSort(listadatos)[listadatos.length-1]);
        System.out.println(bur.bubbleSort(listadatos)[0]);
         */

        /*
        System.out.println(gnome.gnomesort(listadatos)[listadatos.length-1]);
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

}