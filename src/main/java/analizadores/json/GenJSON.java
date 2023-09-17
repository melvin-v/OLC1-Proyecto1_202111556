package analizadores.json;

public class GenJSON {
    public static void main(String[] args) {
    compilar();
}

    private static void compilar(){

        try {
            String ruta = "src/main/java/analizadores/json/";
            //ruta donde tenemos los archivos con extension .jflex y .cup
            String opcFlex[] = { ruta + "lexicoJSON.flex", "-d", ruta};
            jflex.Main.generate(opcFlex);
            String opcCUP[] = { "-destdir", ruta, "-parser", "ParserJSON", ruta + "sintacticoJSON.cup" };
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
