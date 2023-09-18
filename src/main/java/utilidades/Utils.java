/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utilidades;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import analizadores.Lexico;
import analizadores.Parser;
import enums.EnumTypes;
import instrucciones.Instruccion;
import instrucciones.Operacion;
import errores.ErrorLexico;
import errores.ErrorSintactico;


public class Utils {

        public static AnalyzerResult loadFile(String input) throws Exception{
               Lexico scanner = new Lexico(new StringReader(input));
               Parser parser = new Parser(scanner);
               try {
                   parser.parse();
               } catch (Exception ex) {
                   throw ex;
               }
               return new AnalyzerResult(parser.AST, scanner.lexicalErrors, scanner.tokens, parser.errores, parser.simbolos, parser.barraPalabras,
                       parser.barraValores, parser.barraTitulo, parser.barraTituloX, parser.barraTituloY, parser.piePalabras, parser.pieValores, parser.pieTitulo);
           }



           public static String generarCodigo(LinkedList<Instruccion> ast){
               StringBuilder str = new StringBuilder();

               LinkedList<Instruccion> funciones = new LinkedList<>();
               LinkedList<Instruccion> mainStatements = new LinkedList<>();

               for (Instruccion statement : ast) {
                   if (statement != null){
                       String className = statement.getClass().getSimpleName();
                       if ( "Funcion".equals(className)){
                           funciones.add(statement);
                       } else {
                           mainStatements.add(statement);
                       }
                   }
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
                   case "int" -> {
                       return EnumTypes.NUM;
                   }
                   case "string" -> {
                       return EnumTypes.STR;
                   }
                   case "bool" -> {
                       return EnumTypes.BOOL;
                   }
                   case "char" -> {
                       return EnumTypes.CHAR;
                   }
                   case "double" -> {
                       return EnumTypes.DOUBLE;
                   }
                   default -> throw new AssertionError();
               }
           }

           public static String viewTypes(EnumTypes type){
               switch (type) {
                   case BOOL -> {
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
    public static String strs(String input) {
        String str = input.substring(1, input.length() - 1);
        return str;
    }

}
