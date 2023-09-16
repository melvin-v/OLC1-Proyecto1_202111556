package utilidades;

import java.util.HashMap;
import java.util.Map;

public class JSON {
    public Map<String, Object> pares = new HashMap<>();
    public String path;
    public JSON(Map<String, Object> pares, String path){
        this.pares = pares;
        this.path = path;
    }
}
