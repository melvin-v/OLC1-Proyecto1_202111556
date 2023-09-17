package graficar;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class Graficar {
    public static void barras(LinkedList<String> ejex, LinkedList<String> ejey, String titulo, String tituloX, String tituloY){
        // Crear un conjunto de datos
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < ejex.size(); i++) {
            System.out.println(ejex.get(i) + " " + ejey.get(i));
            dataset.addValue(Double.valueOf(ejey.get(i)), tituloY, ejex.get(i));
        }
        // Crear un gráfico de barras
        JFreeChart chart = ChartFactory.createBarChart(
                titulo, // Título
                tituloX, // Etiqueta del eje X
                tituloY, // Etiqueta del eje Y
                dataset, // Datos
                PlotOrientation.VERTICAL, // Orientación de la gráfica
                true, // Mostrar leyenda
                true, // Usar tooltips
                false // Usar URLs
        );

        // Crear un ChartPanel y agregarlo a un JFrame
        ChartPanel chartPanel = new ChartPanel(chart);
        JFrame frame = new JFrame("Gráfico de Barras");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(chartPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }

    }

