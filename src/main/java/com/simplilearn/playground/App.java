package com.simplilearn.playground;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import com.simplilearn.playground.dao.StatistikDAO;
import com.simplilearn.playground.model.Statistik;

public class App extends JFrame {
    private static final long serialVersionUID = 1L;

    public App(String title, JFreeChart chart) {
        super(title);

        // Tambahkan chart ke panel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        setContentPane(chartPanel);
    }

    private static DefaultCategoryDataset createCategoryDataset(List<Statistik> statistikList) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (Statistik statistik : statistikList) {
            dataset.addValue(statistik.getNilai(), "Penjualan", statistik.getBulan());
        }
        return dataset;
    }

    private static DefaultPieDataset createPieDataset(List<Statistik> statistikList) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (Statistik statistik : statistikList) {
            dataset.setValue(statistik.getBulan(), statistik.getNilai());
        }
        return dataset;
    }

    public static void main(String[] args) {
        StatistikDAO statistikDAO = new StatistikDAO();
        List<Statistik> statistikList = statistikDAO.getAllStatistik();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih cara menampilkan data statistik:");
        System.out.println("1. Bar Chart");
        System.out.println("2. Line Chart");
        System.out.println("3. Pie Chart");
        System.out.print("Masukkan pilihan (1/2/3): ");

        int pilihan = scanner.nextInt();
        JFreeChart chart = null;

        switch (pilihan) {
            case 1:
                chart = ChartFactory.createBarChart(
                        "Penjualan Bulanan", // Judul
                        "Bulan", // Kategori X
                        "Penjualan (dalam juta)", // Nilai Y
                        createCategoryDataset(statistikList)
                );
                break;

            case 2:
                chart = ChartFactory.createLineChart(
                        "Penjualan Bulanan", // Judul
                        "Bulan", // Kategori X
                        "Penjualan (dalam juta)", // Nilai Y
                        createCategoryDataset(statistikList)
                );
                break;

            case 3:
                chart = ChartFactory.createPieChart(
                        "Penjualan Bulanan", // Judul
                        createPieDataset(statistikList), // Dataset
                        true, // Legend
                        true, // Tooltips
                        false // URLs
                );
                
                // Menampilkan jumlah & persentase pada masing-masing slice
                PiePlot plot = (PiePlot) chart.getPlot();
                plot.setLabelGenerator(new StandardPieSectionLabelGenerator(
                        "{0}: {1} juta ({2})", // Format label
                        new DecimalFormat("0"), // Format jumlah
                        new DecimalFormat("0.00%") // Format persentase
                ));
                break;

            default:
                System.out.println("Pilihan tidak valid. Program selesai.");
                scanner.close();
                return;
        }

        scanner.close();

        // Tampilkan frame sesuai pilihan
        JFreeChart finalChart = chart;
        SwingUtilities.invokeLater(() -> {
            App example = new App("Contoh Chart dengan JDBC", finalChart);
            example.setSize(800, 600);
            example.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            example.setVisible(true);
        });
    }
}
