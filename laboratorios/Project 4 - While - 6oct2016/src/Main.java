public class Main {

    public static void main(String[] args) {
	int contador = 1;

    while (contador <=10) {
        System.out.println("Contador va por: " + contador);
        contador++;
    }

    contador = 1; //reinicia el contador

    do{
        System.out.println("Nuevo Contador va por: " + contador);
        contador++;
      } while (contador < 11);

        for (int i = 1; i < 11; i++) {
            System.out.println(" Contador: " + i);
        }
    }
}
