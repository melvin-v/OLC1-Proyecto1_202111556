package instrucciones;

public class Imprimir implements Instruccion{
    String texto;
    String id;
    public Imprimir(String texto){
        this.texto = texto;
    }
    public Imprimir(String texto, String id){
        this.texto = texto;
        this.id = id;
    }
    @Override
    public String generarCodigo(){
       StringBuilder str = new StringBuilder();
       if (id != null)
           str.append("print(\"").append(texto).append("\", ").append(id).append(")\n");
       else {
           str.append("print(\"").append(texto).append("\")");
       }
       return str.toString();
    }
}
