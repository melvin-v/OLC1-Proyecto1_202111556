package instrucciones;

import utilidades.Utils;

import java.util.LinkedList;

public class If implements Instruccion {

    Operacion expr;
    LinkedList<Instruccion> statements;
    LinkedList<Elif> elifs;
    LinkedList<Instruccion> else_statements;

    public If(Operacion expr, LinkedList<Instruccion> statements){
        this.expr = expr;
        this.statements = statements;
    }

    public If(Operacion expr, LinkedList<Instruccion> statements, LinkedList<Instruccion> else_statements){
        this.expr = expr;
        this.statements = statements;
        this.else_statements = else_statements;
    }

    public If(Operacion expr, LinkedList<Instruccion> statements, LinkedList<Elif> elifs, LinkedList<Instruccion> else_statements){
        this.expr = expr;
        this.statements = statements;
        this.elifs = elifs;
        this.else_statements = else_statements;
    }

    @Override
    public String generarCodigo() {
        StringBuilder str = new StringBuilder();

        str.append("if ").append(expr.generarCodigo()).append(":\n");
        for (Instruccion statement : statements) {
            if (statement != null)
                str.append(Utils.addTabs(statement.generarCodigo()));
        }

        if (elifs != null){

            for (Elif elif : elifs) {
                str.append(elif.generarCodigo());
            }

        }

        if (else_statements != null){
            str.append("else:\n");
            for (Instruccion else_statement : else_statements) {
                if (else_statement != null)
                    str.append(Utils.addTabs(else_statement.generarCodigo())).append("\n");
            }

        }

        return str.toString();
    }
}
