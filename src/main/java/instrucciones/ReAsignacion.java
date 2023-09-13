package instrucciones;

public class ReAsignacion implements Instruccion{
    String id;
    Operacion op;

    public ReAsignacion(String id, Operacion op){
        this.id = id;
        this.op = op;
    }

    @Override
    public String generarCodigo() {
        StringBuilder str = new StringBuilder();

        str.append(id).append(" = ").append(op.generarCodigo());

        return str.toString();
    }
}
