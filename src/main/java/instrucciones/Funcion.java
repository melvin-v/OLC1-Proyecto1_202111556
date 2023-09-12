package instrucciones;

import utilidades.Utils;

import java.util.LinkedList;

public class Funcion implements Instruccion{
    String nombre;
    LinkedList<Instruccion> instrucciones;
    public Funcion(String nombre, LinkedList<Instruccion> instrucciones){
        this.nombre = nombre;
        this.instrucciones = instrucciones;
    }

    @Override
    public String generarCodigo() {
        StringBuilder str = new StringBuilder();
        str.append("def ").append(nombre).append("():\n");
        for (Instruccion statement : instrucciones) {
            if (statement != null)
                str.append(Utils.addTabs(statement.generarCodigo())).append("\n");
        }
        return str.toString();
    }
}
