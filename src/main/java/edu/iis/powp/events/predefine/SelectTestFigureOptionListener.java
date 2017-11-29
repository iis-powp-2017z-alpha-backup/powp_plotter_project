package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import edu.iis.client.plottermagic.preset.FiguresJane;
import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.adapter.AbstractPlotterAdapter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iss.powp.command.FigureFactory;

public class SelectTestFigureOptionListener implements ActionListener {
	
	public static final String TRAPEZE = "Trapeze";
	public static final String RECTANGLE = "Rectangle";
	public static final String FIGURE_JANE = "Figure Jane";
	public static final String FIGURE_JOE_2 = "Figure Joe 2";
	public static final String FIGURE_JOE_1 = "Figure Joe 1";
	
	private static HashMap<String, Runnable> hash;
	private String test;

	static {
		hash = new HashMap<>();
		hash.put(FIGURE_JOE_1, () -> FiguresJoe.figureScript1(
				Application.getComponent(DriverManager.class).getCurrentPlotter()));
		hash.put(FIGURE_JOE_2, () -> FiguresJoe.figureScript2(
				Application.getComponent(DriverManager.class).getCurrentPlotter()));
		hash.put(FIGURE_JANE, () -> FiguresJane.figureScript( new AbstractPlotterAdapter(0, 0, 
				Application.getComponent(DriverManager.class).getCurrentPlotter())));
		hash.put(RECTANGLE, () -> FigureFactory.drawRectangle(-100, -100, 300, 100).execute(
				Application.getComponent(DriverManager.class).getCurrentPlotter()));
		hash.put(TRAPEZE, () -> FigureFactory.drawTrapeze(-100, 0, 100, 300, 150).execute(
				Application.getComponent(DriverManager.class).getCurrentPlotter()));
	}

	public SelectTestFigureOptionListener(String test) {
		this.test = test;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		hash.get(test).run();
	}

}
