import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        String nombre;
        int velomph;
        double kmph;
        char resp;
        
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bienvenido(a). Al Sistema de multas de transito.");

        System.out.print("Favor introduzca su nombre: ");
        nombre = teclado.readLine();


        while ( resp == 's' || 'S');
        {
            System.out.print("Favor introduzca la velocidad en Millas por hora: ");
            velomph = Integer.parseInt(teclado.readLine());

            kmph = velomph * 1.609;

        } 

        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(velomph);

        System.out.println("Si desea continuar ingresando datos presione 'S' ");
        resp = teclado.readLine();


        for (Integer mph1 : lista1) {
            System.out.println(mph1);
        }


        System.out.println("Tu nombre es " + nombre + " y su velocidad ingresada equivalente en Kmh es  " + kmph + " ");

        if (kmph >= 120) {
            System.out.println("Tiene $150 de multa");
        } else if (kmph >= 80) {
            System.out.println("Tienes $50 de multa");
        }
    }
}