package instrucciones;

import utilidades.Utils;

import java.util.LinkedList;

public class While implements Instruccion{
    Operacion expr;
    LinkedList<Instruccion> statements;

    public While(Operacion expr, LinkedList<Instruccion> statements){
        this.expr = expr;
        this.statements = statements;
    }

    public While(Operacion expr){
        this.expr = expr;
    }
    @Override
    public String generarCodigo(){
        StringBuilder str = new StringBuilder();

        str.append("while ").append(expr.generarCodigo()).append(":\n");
        for (Instruccion statement : statements) {
            if (statement != null)
                str.append(Utils.addTabs(statement.generarCodigo())).append("\n");
        }

        return str.toString();
    }
}
