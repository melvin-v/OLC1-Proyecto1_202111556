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
        this.incremental = 1;
        this.statements = statements;
    }

    @Override
    public String generarCodigo(){
        StringBuilder str = new StringBuilder();

        str.append("for ").append(varId).append(" in range(").append(expr1.generarCodigo())
                .append(",").append(expr2.generarCodigo());

        if (incremental != 0)
            str.append(",").append(incremental);

        str.append("):\n");

        for (Instruccion statement : statements) {
            if (statement != null)
                str.append(Utils.addTabs(statement.generarCodigo())).append("\n");
        }

        return str.toString();
    }

}
