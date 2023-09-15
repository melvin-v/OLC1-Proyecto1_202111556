package instrucciones;

public class ImprimirExpresion implements Instruccion{
    Operacion opr;
    public ImprimirExpresion(Operacion opr){
        this.opr = opr;
    }
    @Override
    public String generarCodigo(){
       StringBuilder str = new StringBuilder();
       str.append(opr.generarCodigo());
       return str.toString();
    }
}
