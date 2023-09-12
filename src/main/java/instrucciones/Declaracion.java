package instrucciones;

import enums.EnumTypes;
import utilidades.Utils;

public class Declaracion implements Instruccion{
    String id;
    EnumTypes type;

    public Declaracion(String id, String type){
        this.id = id;
        this.type = Utils.checkTypes(type);
    }
    @Override
    public String generarCodigo() {
        StringBuilder str = new StringBuilder();

        str.append(id).append(" = ").append("None");

        return str.toString();
    }
}
