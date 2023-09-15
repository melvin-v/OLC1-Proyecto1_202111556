package instrucciones;

import enums.EnumTerminals;

import java.util.LinkedList;

public class Imprimir implements Instruccion{
    LinkedList<ImprimirExpresion> lista;
    public Imprimir(LinkedList<ImprimirExpresion> lista){
        this.lista = lista;
    }
    @Override
    public String generarCodigo(){
       StringBuilder str = new StringBuilder();
       str.append("print(\"");
       for (ImprimirExpresion instruccion : lista) {
           if (instruccion.opr.typeTerminal == EnumTerminals.STR) {
               str.append(instruccion.generarCodigo());
           } else{
                str.append(instruccion.generarCodigo());
           }
           str.append(" + ");
       }
       str.delete(str.length()-3, str.length());
       str.append("\")");
       return str.toString();
    }
}
