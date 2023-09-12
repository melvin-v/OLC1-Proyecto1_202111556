package analizadores;
public class Generador {
    public static void main(String[] args) {
        compilar();
    }

    private static void compilar(){

        try {
            String ruta = "src/main/java/analizadores/";
            //ruta donde tenemos los archivos con extension .jflex y .cup
            String opcFlex[] = { ruta + "lexicoStatPy.flex", "-d", ruta };
            jflex.Main.generate(opcFlex);
            String opcCUP[] = { "-destdir", ruta, "-parser", "Parser", ruta + "sintacticoStatPy.cup" };
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}