package instrucciones;

import java.util.LinkedList;

public class Case implements Instruccion{
    Operacion expr;
    LinkedList<Instruccion> statements;
    boolean breakStatement;

    public Case(Operacion expr, LinkedList<Instruccion> statements, boolean breakStatement){
        this.expr = expr;
        this.statements = statements;
        this.breakStatement = breakStatement;
    }

    @Override
    public String generarCodigo() {
        StringBuilder str = new StringBuilder();

            str.append(expr.generarCodigo()).append(": ");
            for (Instruccion statement : statements) {
                if (statement != null)
                    str.append("\t").append(statement.generarCodigo()).append("\n");
            }
            if (breakStatement) {
                str.append("break");
            }
            str.append(",\n");



        return str.toString();
    }
}
