package instrucciones;

public class SentenciaBreak implements Instruccion{
    @Override
    public String generarCodigo(){
       StringBuilder str = new StringBuilder();
       str.append("break");
       return str.toString();
    }
}
