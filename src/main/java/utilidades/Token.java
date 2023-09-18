package utilidades;

public class Token {
    public String tipo;
    public String lexema;
    public String linea;
    public String columna;

    public Token(String tipo, String lexema, int linea, int columna){
        this.tipo = tipo;
        this.lexema = lexema;
        this.linea = linea+"";
        this.columna = columna+"";
    }
}
