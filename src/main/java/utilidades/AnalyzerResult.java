/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import java.util.LinkedList;
import java.util.Map;

import errores.ErrorLexico;
import errores.ErrorSintactico;
import instrucciones.Instruccion;
import instrucciones.Operacion;



public class AnalyzerResult {
    public LinkedList<Instruccion> ast;
    public LinkedList<ErrorLexico> lexErrors;
    public LinkedList<ErrorSintactico> sintaxErrors;
    public Map<String, String> simbolos;
    public LinkedList<String> barraPalabras;
    public LinkedList<String> barraValores;
    public String barraTitulo;
    public String barraTituloX ;
    public String barraTituloY;
    
    public AnalyzerResult(LinkedList<Instruccion> ast, LinkedList<ErrorLexico> lexErrors, LinkedList<ErrorSintactico> sintaxErrors, Map<String, String> simbolos, LinkedList<String> barraPalabras, LinkedList<String> barraValores, String barraTitulo, String barraTituloX, String barraTituloY) {
        this.ast = ast;
        this.lexErrors = lexErrors;
        this.sintaxErrors = sintaxErrors;
        this.simbolos = simbolos;
        this.barraPalabras = barraPalabras;
        this.barraValores = barraValores;
        this.barraTitulo = barraTitulo;
        this.barraTituloX = barraTituloX;
        this.barraTituloY = barraTituloY;
    }
}
