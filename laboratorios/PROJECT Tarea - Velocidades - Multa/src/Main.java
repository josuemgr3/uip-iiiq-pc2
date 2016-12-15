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
        int resp = 0;

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bienvenido(a). Al Sistema de multas de transito.");

        System.out.print("Favor introduzca su nombre: ");
        nombre = teclado.readLine();

        int mph = 0;
        while ( resp == 0 ){

            System.out.print("Favor introduzca la velocidad en Millas por hora: ");
            velomph = Integer.parseInt(teclado.readLine());




            mph = velomph;

            System.out.print("Si desea continuar presione 0, si desea finalizar presione 1: ");
            resp = Integer.parseInt(teclado.readLine());}

            List<Integer> lista1 = new ArrayList<>();
            lista1.add(mph);

            kmph = mph * 1.609 ;

             for (Integer entero : lista1) {
            System.out.println(entero);
                                         }

         System.out.println("Tu nombre es " + nombre + " y su velocidad ingresada equivalente en Kmh es  " + kmph + " ");

            if (kmph >= 120) {
                System.out.println("Tiene $150 de multa");
            } else if (kmph >= 80) {
                System.out.println("Tienes $50 de multa");
            }

        }
}
