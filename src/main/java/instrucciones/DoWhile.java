package instrucciones;

import java.util.LinkedList;

public class DoWhile implements Instruccion{
    LinkedList<Instruccion> instrucciones;
    Operacion expr;
    public DoWhile(LinkedList<Instruccion> instrucciones, Operacion expr){
        this.instrucciones = instrucciones;
        this.expr = expr;
    }
    @Override
    public String generarCodigo(){
        StringBuilder str = new StringBuilder();
        str.append("While True\n");
        for (Instruccion instruccion : instrucciones) {
            if (instruccion != null)
                str.append("\t").append(instruccion.generarCodigo()).append("\n");
        }
        str.append("if (").append(expr.generarCodigo()).append(")\n\tbreak");
        return str.toString();
    }
}
