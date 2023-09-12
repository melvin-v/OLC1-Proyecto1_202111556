package instrucciones;

import utilidades.Utils;

import java.util.LinkedList;

public class Elif implements Instruccion {
    Operacion expr;
    LinkedList<Instruccion> statements;

    public Elif(Operacion expr, LinkedList<Instruccion> statements){
        this.expr = expr;
        this.statements = statements;
    }

    @Override
    public String generarCodigo() {
        StringBuilder str = new StringBuilder();

        str.append("elif ").append(expr.generarCodigo()).append(":\n");
        for (Instruccion statement : statements) {
            if (statement != null)
                str.append(Utils.addTabs(statement.generarCodigo())).append("\n");
        }

        return str.toString();
    }
}
