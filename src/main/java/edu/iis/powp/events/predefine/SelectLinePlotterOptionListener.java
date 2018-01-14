package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.adapter.LinePlotterAdapter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

public class SelectLinePlotterOptionListener implements ActionListener {

	public static final String BASIC_LINE = "Basic Line";
	public static final String SPECIAL_LINE = "Special Line";
	public static final String DOTTED_LINE = "Dotted Line";

	private final Map<String, ILine> linesMap = new HashMap<>();

	public SelectLinePlotterOptionListener() {
		linesMap.put(BASIC_LINE, LineFactory.getBasicLine());
		linesMap.put(SPECIAL_LINE, LineFactory.getSpecialLine());
		linesMap.put(DOTTED_LINE, LineFactory.getDottedLine());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		IPlotter plotter = Application.getComponent(DriverManager.class).getCurrentPlotter();
		if (!(plotter instanceof LinePlotterAdapter)) {
			return;
		}

		final LinePlotterAdapter linePlotter = (LinePlotterAdapter) plotter;
		ILine line = linesMap.get(e.getActionCommand());
		if (line != null) {
			linePlotter.setLine(line);
		}

	}

}
