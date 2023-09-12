package instrucciones;

import utilidades.Utils;

import java.util.LinkedList;

public class Switch implements Instruccion{
    Operacion expr;
    LinkedList<Case> cases;
    LinkedList<Instruccion> else_statements;
    public Switch(Operacion expr, LinkedList<Case> cases){
        this.expr = expr;
        this.cases = cases;
    }

    public Switch(Operacion expr, LinkedList<Case> cases, LinkedList<Instruccion> else_statements){
        this.expr = expr;
        this.cases = cases;
        this.else_statements = else_statements;
    }
    @Override
    public String generarCodigo() {
        StringBuilder str = new StringBuilder();
        str.append("def switch(expr):\n").append("\tswitcher = {\n");
        int i = 1;
        for (Case aCase : cases) {
            str.append(aCase.generarCodigo());
            i++;
        }
        if (else_statements != null) {
            str.append(i).append(": ");
            for (Instruccion else_statement : else_statements) {
                if (else_statement != null)
                    str.append(Utils.addTabs(else_statement.generarCodigo())).append("\n");
            }
        }
        str.append("\t}\n");
        return str.toString();
    }

}
