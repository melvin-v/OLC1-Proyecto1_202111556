package errores;

public class ErrorLexico {
    public String lexema;
    public int row;
    public int col;

    public ErrorLexico(String lexema, int row, int col){
        this.lexema = lexema;
        this.row = row;
        this.col = col;
    }
}
