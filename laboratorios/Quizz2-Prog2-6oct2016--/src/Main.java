import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int monedas;
        double usd, eur;

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Bienvenido(a). Favor introduzca cuantos centavos tiene: ");
        monedas = Integer.parseInt(teclado.readLine());

        System.out.println("Convertidor de Centavos");
        System.out.println("Usted tiene: " + monedas + " Centavos.");

        usd = monedas / 100.;
        eur = usd * 0.89;

        System.out.println("USD = $" + usd);
        System.out.println("EUR =  " + eur);



    }
}