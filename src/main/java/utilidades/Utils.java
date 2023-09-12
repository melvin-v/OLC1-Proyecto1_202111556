/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utilidades;

import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;

//import analizadores.Lexico;
//import analizadores.Parser;
import enums.EnumTypes;
import instrucciones.Instruccion;
import instrucciones.Operacion;
import errores.ErrorLexico;
import errores.ErrorSintactico;

/**
 *
 * @author Xhunik
 */
public class Utils {
    /*
        public static AnalyzerResult loadFile(String input) throws Exception{
               Lexico scanner = new Lexico(new StringReader(input));
               Parser parser = new Parser(scanner);
               try {
                   parser.parse();
               } catch (Exception ex) {
                   throw ex;
               }
               return new AnalyzerResult(scanner.lexicalErrors, parser.errores);
           }

*/

           public static String generarCodigo(LinkedList<Instruccion> ast){
               StringBuilder str = new StringBuilder();

               LinkedList<Instruccion> methods = new LinkedList<>();
               LinkedList<Instruccion> mainStatements = new LinkedList<>();

               for (Instruccion statement : ast) {
                   if (statement != null){
                       String className = statement.getClass().getSimpleName();
                       if ( "Procedure".equals(className) || "Function".equals(className)){
                           methods.add(statement);
                       } else {
                           mainStatements.add(statement);
                       }
                   }
               }

               for (Instruccion method : methods) {
                   str.append(method.generarCodigo()).append("\n");
               }


               str.append("def main():\n");
               for (Instruccion statement : mainStatements) {
                   str.append(addTabs(statement.generarCodigo())).append("\n");
               }
               str.append("if __name__ == '__main__':\n");
               str.append("\tmain()");
               return str.toString();
           }


           public static EnumTypes checkTypes(String type){
               type = type.toLowerCase();
                switch (type) {
                   case "numero" -> {
                       return EnumTypes.NUM;
                   }
                   case "cadena" -> {
                       return EnumTypes.STR;
                   }
                   case "boolean" -> {
                       return EnumTypes.BOOLEAN;
                   }
                   case "caracter" -> {
                       return EnumTypes.CHAR;
                   }
                   default -> throw new AssertionError();
               }
           }

           public static String viewTypes(EnumTypes type){
               switch (type) {
                   case BOOLEAN -> {
                       return "bool";
                   }
                   case CHAR -> {
                       return "str";
                   }
                   case NUM -> {
                       return "float";
                   }
                   case STR -> {
                       return "str";
                   }
                   default -> throw new AssertionError();
               }
           }

           /**
            *
            * @param input the value of input
            * @return
            */
    public static String addTabs(String input) {
        StringBuilder str = new StringBuilder();
        List<String> lines = input.lines().toList();
        for (String line : lines) {
            str.append("\t").append(line).append("\n");
        }
        return str.toString();
    }
}
