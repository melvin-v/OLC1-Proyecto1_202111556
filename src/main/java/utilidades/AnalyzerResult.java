/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import java.util.LinkedList;

import errores.ErrorLexico;
import errores.ErrorSintactico;
import instrucciones.Instruccion;
import instrucciones.Operacion;


/**
 *
 * @author Xhunik
 */
public class AnalyzerResult {
    public LinkedList<ErrorLexico> lexErrors;
    public LinkedList<ErrorSintactico> sintaxErrors;
    
    public AnalyzerResult(LinkedList<ErrorLexico> lexErrors,
                          LinkedList<ErrorSintactico> sintaxErrors){
        this.lexErrors = lexErrors;
        this.sintaxErrors = sintaxErrors;
    }
}