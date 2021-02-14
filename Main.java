import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.BufferedWriter;

/** Main*/
public class Main {

    public static void main(String[] args) {

        Burbuja burbuja = new Burbuja();
        Gnome gnome = new Gnome();
        Merge merge = new Merge();
        Quick quick =new Quick();
        Scanner scanner = new Scanner(System.in);

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

        boolean var = false;
        while(var == false){

            System.out.println("\n\nBienvenido al Programa de Sortings");
            System.out.println("Ingrese el numero de Sorting que desea comprobar:");
            System.out.println("1) Bubble Sort");
            System.out.println("2) Gnome Sort");
            System.out.println("3) Merge Sort");
            System.out.println("4) Quick Sort");
            System.out.println("5) Radix Sort");
            System.out.println("6) Salir");

            try {
                
                int opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("\n\nLista de Datos:");
                        for (Comparable comparable : listadatos) {
                            System.out.print(comparable + " ");
                        }
                        
                        Comparable[] ordenados1 = burbuja.bubbleSort(listadatos);
                        System.out.println("\n\nLista de Datos Ordenada:");
                        for (Comparable comparable : ordenados1) {
                            System.out.print(comparable + " ");
                        }
                        break;
                    case 2:
                        System.out.println("\n\nLista de Datos:");
                        for (Comparable comparable : listadatos) {
                            System.out.print(comparable + " ");
                        }
                        
                        Comparable[] ordenados2 = gnome.gnomesort(listadatos);
                        System.out.println("\n\nLista de Datos Ordenada:");
                        for (Comparable comparable : ordenados2) {
                            System.out.print(comparable + " ");
                        }
                        break;
                    case 3:
                        System.out.println("\n\nLista de Datos:");
                        for (Comparable comparable : listadatos) {
                            System.out.print(comparable + " ");
                        }
                        
                        Comparable[] ordenados3 = merge.Mergesort(listadatos, 0, listadatos.length - 1);
                        System.out.println("\n\nLista de Datos Ordenada:");
                        for (Comparable comparable : ordenados3) {
                            System.out.print(comparable + " ");
                        }
                        break;
                    case 4:
                        System.out.println("\n\nLista de Datos:");
                        for (Comparable comparable : listadatos) {
                            System.out.print(comparable + " ");
                        }
                        
                        Comparable[] ordenados4 = quick.quicksort(listadatos,0, listadatos.length - 1);
                        System.out.println("\n\nLista de Datos Ordenada:");
                        for (Comparable comparable : ordenados4) {
                            System.out.print(comparable + " ");
                        }
                        break;
                    case 5:
                        System.out.println("\n\nLista de Datos:");
                        for (Comparable comparable : listadatos) {
                            System.out.print(comparable + " ");
                        }
                        
                        Comparable[] ordenados5 = Radix.radixsort(listadatos, listadatos.length);
                        System.out.println("\n\nLista de Datos Ordenada:");
                        for (Comparable comparable : ordenados5) {
                            System.out.print(comparable + " ");
                        }
                        break;
                    case 6:
                        System.out.println("\n\nSaliendo del programa");
                        var = true;
                        break;
                    default:
                        System.out.println("\n\nOpcion incorrecta, por favor ingresela de nuevo");
                        break;
                }

            } catch (InputMismatchException e) {
                
                System.out.println("\nOpcion Incorrecta, Ingresela de Nuevo");
                scanner.nextLine();

            }
        }

        /*
        System.out.println(bur.bubbleSort(listadatos)[listadatos.length-1]);
        System.out.println(bur.bubbleSort(listadatos)[0]);
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

}