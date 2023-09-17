package utilidades;
import java.util.Map;

public class JSON {
    public Map<String, String> pares;
    public String path;
    public JSON(Map<String, String> pares, String path){
        this.pares = pares;
        this.path = path;
    }
}
