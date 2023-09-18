package interfaz;
import errores.ErrorLexico;
import utilidades.Token;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.LinkedList;

import static interfaz.Panel.areaTexto;

public class Root extends JFrame implements ActionListener {
    private String currentFile = null;
    JMenuItem abrir;
    JMenuItem g;
    JMenuItem gC;
    JMenuItem rTokens;
    JMenuItem rLexico;
    static String ruta;
    static LinkedList<ErrorLexico> erroresJSON = new LinkedList<>();
    static LinkedList<ErrorLexico> erroresStatpy;
    static LinkedList<Token> tokensJSON = new LinkedList<>();
    static LinkedList<Token> tokensStatpy;

    public Root() {
        setBounds(300, 100, 1500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("StatPy");

        Panel panel = new Panel();
        add(panel);

        JMenuBar menuBar = new JMenuBar();

        JMenu archivo = new JMenu("Archivo");

        abrir = new JMenuItem("Abrir");
        g = new JMenuItem("Guardar");
        gC = new JMenuItem("Guardar como");

        archivo.add(abrir);
        archivo.add(g);
        archivo.add(gC);

        abrir.addActionListener(this);
        g.addActionListener(this);
        gC.addActionListener(this);

        menuBar.add(archivo);
        setJMenuBar(menuBar);

        JMenu reportes = new JMenu("Reportes");
        rTokens = new JMenuItem("Reporte de Tokens");
        rLexico = new JMenuItem("Reporte de Errores Lexicos");
        rTokens.addActionListener(this);
        rLexico.addActionListener(this);
        reportes.add(rTokens);
        reportes.add(rLexico);
        menuBar.add(reportes);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == abrir) {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                try {
                    // Leer el contenido del archivo
                    BufferedReader reader = new BufferedReader(new FileReader(fileChooser.getSelectedFile()));
                    String line = null;
                    StringBuilder sb = new StringBuilder();
                    while ((line = reader.readLine()) != null) {
                        sb.append(line);
                        sb.append("\n");
                    }
                    reader.close();
                    String content = sb.toString();

                    // Establecer el contenido del JTextArea
                    areaTexto.setText(content);
                    currentFile = fileChooser.getSelectedFile().getAbsolutePath();
                    ruta = fileChooser.getSelectedFile().getName();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        } else if (e.getSource() == g) {
            if (currentFile != null) {
                try {
                    // Guardar el contenido en el archivo actual
                    BufferedWriter writer = new BufferedWriter(new FileWriter(currentFile));
                    writer.write(areaTexto.getText());
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                // Si no se ha especificado un archivo actual, muestra un cuadro de diálogo "Guardar como"
                guardarComo();
            }
        } else if (e.getSource() == gC) {
            guardarComo();
        }
        else if (e.getSource() == rTokens){
            try {
                System.out.println("llego");
                utilidades.Reportes.HTMLTokens(tokensStatpy, tokensJSON);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        else if (e.getSource() == rLexico){
            try {
                System.out.println("llego error");
                utilidades.Reportes.HTMLErrores(erroresStatpy, erroresJSON);
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    private void guardarComo() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                // Guardar el contenido en el archivo seleccionado
                BufferedWriter writer = new BufferedWriter(new FileWriter(fileChooser.getSelectedFile()));
                writer.write(areaTexto.getText());
                writer.close();
                currentFile = fileChooser.getSelectedFile().getAbsolutePath();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}



