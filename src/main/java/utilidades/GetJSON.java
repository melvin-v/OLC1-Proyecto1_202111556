package utilidades;
import static interfaz.Panel.jsons;
public class GetJSON {
public static String getJSON(String archivo, String simbolo){
        for (JSON json : jsons) {
            if (json.path.equals(archivo)){
                System.out.println("--------Viendo getJSON--------");
                System.out.println("Archivo: " + archivo);
                System.out.println("Simbolo: " + simbolo);
                System.out.println("Valor: " + json.pares.get(simbolo));
                System.out.println(json.pares);
                System.out.println("--------Fin getJSON--------");
                return json.pares.get(simbolo);
            }
        }
        return "";
    }
}
