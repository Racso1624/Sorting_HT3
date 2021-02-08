import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;

/** Main*/
public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> listadatos = new ArrayList<Integer>();
        
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
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                int numero = Integer.parseInt(data);
                listadatos.add(numero);
                
            }

            Integer[] datos = listadatos.toArray(new Integer[0]);

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            e.printStackTrace();
        }

        
    }
    
}
