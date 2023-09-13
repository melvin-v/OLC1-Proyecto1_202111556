package instrucciones;

import enums.EnumTypes;
import utilidades.Utils;

public class Asignacion implements Instruccion{
    String id;
    EnumTypes type;
    Operacion expr;

    public Asignacion(String id, String type, Operacion expr){
        this.id = id;
        this.type = Utils.checkTypes(type);
        this.expr = expr;
    }
    @Override
    public String generarCodigo() {
        StringBuilder str = new StringBuilder();

        str.append(id).append(" = ").append(expr.generarCodigo());

        return str.toString();
    }
}
