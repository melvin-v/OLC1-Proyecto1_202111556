package utilidades;

import errores.ErrorLexico;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;

public class Reportes {
    public static void HTMLErrores(LinkedList<ErrorLexico> erroresStatpy, LinkedList<ErrorLexico> erroresJSON) throws IOException {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {

            String path = "Reporte_errores_StatPy.html";
            fichero = new FileWriter(path);
            pw = new PrintWriter(fichero);

            //Comenzamos a escribir el html
            pw.println("<html>");
            pw.println("<head><title>REPORTE DE ERRORES</title></head>");
            pw.println("<body>");
            pw.println("<div align=\"center\">");
            pw.println("<h1>Reporte de Errores</h1>");
            pw.println("<br></br>");
            pw.println("<table border=1>");
            pw.println("<tr>");
            pw.println("<td>ERROR</td>");
            pw.println("<td>DESCRIPCION</td>");
            pw.println("<td>FILA</td>");
            pw.println("<td>COLUMNA</td>");
            pw.println("</tr>");

            for (ErrorLexico err : erroresStatpy) {
                pw.println("<tr>");
                pw.println("<td>" + err.tipo + "</td>");
                pw.println("<td>" + err.descripcion + "</td>");
                pw.println("<td>" + err.linea + "</td>");
                pw.println("<td>" + err.columna + "</td>");
                pw.println("</tr>");
            }
            pw.println("</table>");
            pw.println("</div");

            pw.println("<div align=\"center\">");
            pw.println("<h1>Reporte de Errores</h1>");
            pw.println("<br></br>");
            pw.println("<table border=1>");
            pw.println("<tr>");
            pw.println("<td>ERROR</td>");
            pw.println("<td>DESCRIPCION</td>");
            pw.println("<td>FILA</td>");
            pw.println("<td>COLUMNA</td>");
            pw.println("</tr>");

            for (ErrorLexico err : erroresJSON) {
                pw.println("<tr>");
                pw.println("<td>" + err.tipo + "</td>");
                pw.println("<td>" + err.descripcion + "</td>");
                pw.println("<td>" + err.linea + "</td>");
                pw.println("<td>" + err.columna + "</td>");
                pw.println("</tr>");
            }
            pw.println("</table>");
            pw.println("</div");
            pw.println("</body>");
            pw.println("</html>");
            Desktop.getDesktop().open(new File(path));


        } catch (Exception e) {
        } finally {
            if (fichero != null) {
                fichero.close();
            }
        }
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void HTMLTokens(LinkedList<Token> tokenStatpy, LinkedList<Token> tokenJSON) throws IOException {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try {

            String path = "Reporte_errores_StatPy.html";
            fichero = new FileWriter(path);
            pw = new PrintWriter(fichero);

            //Comenzamos a escribir el html
            pw.println("<html>");
            pw.println("<head><title>REPORTE DE TOKENS</title></head>");
            pw.println("<body>");
            pw.println("<div align=\"center\">");
            pw.println("<h1>Reporte de Errores</h1>");
            pw.println("<br></br>");
            pw.println("<table border=1>");
            pw.println("<tr>");
            pw.println("<td>TOKEN</td>");
            pw.println("<td>LEXEMA</td>");
            pw.println("<td>LINEA</td>");
            pw.println("<td>COLUMNA</td>");
            pw.println("</tr>");

            for (Token token : tokenStatpy) {
                pw.println("<tr>");
                pw.println("<td>" + token.tipo + "</td>");
                pw.println("<td>" + token.lexema + "</td>");
                pw.println("<td>" + token.linea + "</td>");
                pw.println("<td>" + token.columna + "</td>");
                pw.println("</tr>");
            }
            pw.println("</table>");
            pw.println("</div");

            pw.println("<div align=\"center\">");
            pw.println("<h1>Reporte de Errores</h1>");
            pw.println("<br></br>");
            pw.println("<table border=1>");
            pw.println("<tr>");
            pw.println("<td>TOKEN</td>");
            pw.println("<td>LEXEMA</td>");
            pw.println("<td>LINEA</td>");
            pw.println("<td>COLUMNA</td>");
            pw.println("</tr>");

            for (Token token : tokenStatpy) {
                pw.println("<tr>");
                pw.println("<td>" + token.tipo + "</td>");
                pw.println("<td>" + token.lexema + "</td>");
                pw.println("<td>" + token.linea + "</td>");
                pw.println("<td>" + token.columna + "</td>");
                pw.println("</tr>");
            }
            pw.println("</table>");
            pw.println("</div");
            pw.println("</body>");
            pw.println("</html>");
            Desktop.getDesktop().open(new File(path));


        } catch (Exception e) {
        } finally {
            if (fichero != null) {
                fichero.close();
            }
        }
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
