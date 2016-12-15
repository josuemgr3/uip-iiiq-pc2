import java.util.Map;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> mapA = new HashMap<String, Integer>();
	    //Map mapA = new HashMap();
        //Map MapB = new TreeMap();

       /* mapA.put("key1","value1");
        mapA.put("key2","value2");
        mapA.put("key3","value3");*/
        mapA.put("Abuelo",100);
        mapA.put("Padre",50);
        mapA.put("Hijo",25);

        Object elemento = mapA.get("Abuelo");
        System.out.println("Abuelo: " + elemento);

        mapA.remove("Padre");

        for (String llave : mapA.keySet()){
                int valor = mapA.get(llave);
                System.out.println(llave + " : " + valor);
        }
    }
}
