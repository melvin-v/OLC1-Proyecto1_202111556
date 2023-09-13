package instrucciones;

import utilidades.Utils;

import java.util.LinkedList;

public class For implements Instruccion{
    String varId;
    Operacion expr1;
    Operacion expr2;
    int incremental;
    LinkedList<Instruccion> statements;
    public For(String varId, Operacion expr1, Operacion expr2, LinkedList<Instruccion> statements){
        this.varId = varId;
        this.expr1 = expr1;
        this.expr2 = expr2;
        this.statements = statements;
    }

    @Override
    public String generarCodigo(){
        StringBuilder str = new StringBuilder();
        int primero = Integer.parseInt(expr1.generarCodigo()) + 1;
        str.append("for ").append(varId).append(" in range(").append(primero)
                .append(",").append(expr2.right.generarCodigo());

        str.append("):\n");

        for (Instruccion statement : statements) {
            if (statement != null)
                str.append(Utils.addTabs(statement.generarCodigo())).append("\n");
        }

        return str.toString();
    }

}
