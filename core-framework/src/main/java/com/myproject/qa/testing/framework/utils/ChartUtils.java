package com.myproject.qa.testing.framework.utils;

import java.awt.image.BufferedImage;
import java.util.Map;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class ChartUtils {

	public static <T> byte[] generatePieChartInBytes(Map<String, T> keyValues) throws Exception {
		DefaultPieDataset dataSet = new DefaultPieDataset();
		for(Map.Entry<String, T> entry : keyValues.entrySet()){
			dataSet.setValue(entry.getKey(), (Number)entry.getValue());
		}
		PieSectionLabelGenerator labelGenerator = new StandardPieSectionLabelGenerator("{0} = {1} ({2})");

		JFreeChart chart = ChartFactory.createPieChart(" ", dataSet);

		PiePlot plot = (PiePlot) chart.getPlot();
		plot.setSectionPaint("Passed", java.awt.Color.GREEN);
		plot.setSectionPaint("Failed", java.awt.Color.RED);
		plot.setSectionPaint("Skipped", java.awt.Color.YELLOW);
		plot.setLabelGenerator(labelGenerator);
		BufferedImage pdfImage = chart.createBufferedImage(500, 300);
		return ImageUtils.bufferedImageToByteArray(pdfImage);

	}


}
