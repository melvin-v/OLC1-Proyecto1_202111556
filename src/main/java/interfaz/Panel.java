package interfaz;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.StringReader;
import java.util.HashMap;
import java.util.LinkedList;

import analizadores.Lexico;
import analizadores.Parser;
import utilidades.AnalyzerResult;
import utilidades.JSON;

import static interfaz.Root.ruta;

public class Panel extends JPanel {
    static JTextArea areaTexto;
    static JPanel panel;
    static LinkedList<JSON> jsons = new LinkedList<>();
    public Panel() {
        panel = new JPanel(new BorderLayout());
        JPanel panelOpciones = new JPanel(new FlowLayout());
        JPanel cajas = new JPanel(new FlowLayout());

        //-----------------------------Opciones---------------------------------

        JLabel label = new JLabel("Seleccione el analizador:");

        // JComboBox para elegir el analizador
        String[] analizadores = {"StatPy", "JSON"};
        JComboBox<String> comboBox = new JComboBox<>(analizadores);


        panelOpciones.add(label);
        panelOpciones.add(comboBox);



        //------------------------- Crear un nuevo área de texto-----------------
        areaTexto = new JTextArea();

        // Establecer el texto y algunas propiedades del área de texto
        areaTexto.setEditable(true);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        areaTexto.setRows(20);
        areaTexto.setColumns(50);
        // Agregar el área de texto a un panel con barra de desplazamiento
        JScrollPane panelTexto = new JScrollPane(areaTexto);
        panelTexto.setBorder(new EmptyBorder(0, 0, 10, 0));
        cajas.add(panelTexto); // Agregar el JScrollPane en lugar del área de texto directamente

        // --------------------------------Crear un JTextPane para mostrar el texto-------------------------
        JTextArea salida = new JTextArea();
        // Establecer el texto y algunas propiedades del área de texto
        salida.setEditable(false);
        salida.setLineWrap(true);
        salida.setWrapStyleWord(true);
        salida.setRows(20);
        salida.setColumns(50);

        // Agregar el área de texto a un panel con barra de desplazamiento
        JScrollPane panelTexto2 = new JScrollPane(salida);
        panelTexto2.setBorder(new EmptyBorder(0, 0, 10, 0));
        cajas.add(panelTexto2); // Agregar el JScrollPane en lugar del área de texto directamente

        add(panelOpciones, BorderLayout.NORTH);
        add(cajas, BorderLayout.CENTER);

        JButton enviarButton = new JButton("Enviar");
        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String analizador = (String) comboBox.getSelectedItem();
                if(analizador.equals("StatPy")){
                    String codigo = areaTexto.getText();
                    try{
                        AnalyzerResult ast = utilidades.Utils.loadFile(codigo);
                        String traduccion = utilidades.Utils.generarCodigo(ast.ast);
                        salida.setText(traduccion);
                        System.out.println("--Analisis StatPy finalizado--");
                    }
                    catch (Exception exception){
                        exception.printStackTrace();
                    }
                }
                else if(analizador.equals("JSON")){
                    String codigo = areaTexto.getText();
                    try{
                        analizadores.json.Lexico scanner = new analizadores.json.Lexico(new StringReader(codigo));
                        analizadores.json.ParserJSON parser = new analizadores.json.ParserJSON(scanner);
                        try {
                            parser.parse();
                        } catch (Exception ex) {
                            throw ex;
                        }
                        JSON json = new JSON(parser.simbolos, ruta);
                        jsons.add(json);
                        for (JSON j : jsons){
                            System.out.println(j.path);
                            j.pares.forEach((k,v) -> {
                                System.out.println(k + " : " + v);
                            });
                        }
                        System.out.println("--Analisis JSON finalizado--");
                    }
                    catch (Exception exception){
                        exception.printStackTrace();
                    }
                }
                else{
                    System.out.println("No se ha seleccionado un analizador");
                }
            }
        });
        panelOpciones.add(enviarButton);
    }
}
