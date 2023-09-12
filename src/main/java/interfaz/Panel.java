package interfaz;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import utilidades.AnalyzerResult;
import utilidades.Utils;

public class Panel extends JPanel {
    static JTextArea areaTexto;
    static JPanel panel;
    public Panel() {
        panel = new JPanel(new BorderLayout());
        JPanel panelOpciones = new JPanel(new FlowLayout());
        JPanel cajas = new JPanel(new FlowLayout());

        //-----------------------------Opciones---------------------------------

        JLabel label = new JLabel("Seleccione el analizador:");

        // JComboBox para elegir el analizador
        String[] analizadores = {"StatPy", "JSON"};
        JComboBox<String> comboBox = new JComboBox<>(analizadores);

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
                        System.out.println("--Analisis finalizado--");
                    }
                    catch (Exception exception){
                        exception.printStackTrace();
                    }
                }
                else if(analizador.equals("JSON")){
                    String codigo = areaTexto.getText();
                    try{
                        //Scanner scanner = new Scanner(new java.io.StringReader(codigo));
                        //Sintactico sintactico = new Sintactico(scanner);
                        //sintactico.parse();
                        System.out.println("--Analisis finalizado--");
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
        panelOpciones.add(label);
        panelOpciones.add(comboBox);
        panelOpciones.add(enviarButton);


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

        cajas.add(areaTexto);


        // --------------------------------Crear un JTextPane para mostrar el texto-------------------------
        JTextArea salida = new JTextArea();
        salida.setBackground(Color.BLACK);
        // Establecer el texto y algunas propiedades del área de texto
        salida.setEditable(false);
        salida.setLineWrap(true);
        salida.setWrapStyleWord(true);
        salida.setRows(20);
        salida.setColumns(50);

        // Agregar el área de texto a un panel con barra de desplazamiento
        JScrollPane panelTexto2 = new JScrollPane(salida);
        panelTexto2.setBorder(new EmptyBorder(0, 0, 10, 0));

        cajas.add(salida);

        this.add(panel);



        panel.add(panelOpciones, BorderLayout.NORTH);
        panel.add(cajas, BorderLayout.SOUTH);
    }
}
