package graficar;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import java.util.LinkedList;

public class Graficar {
    public static void barras(LinkedList<String> ejex, LinkedList<String> ejey, String titulo, String tituloX, String tituloY){
        // Crear un conjunto de datos
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (String s : ejex) {
            dataset.addValue(Double.parseDouble(s), titulo, s);
        }
    }

    }

