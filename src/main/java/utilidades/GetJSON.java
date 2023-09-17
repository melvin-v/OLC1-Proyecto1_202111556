package utilidades;
import static interfaz.Panel.jsons;
public class GetJSON {
public static String getJSON(String archivo, String simbolo){
        for (JSON json : jsons) {
            if (json.path.equals(archivo)){
                return json.pares.get(simbolo);
            }
        }
        return "";
    }
}
