package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJane;
import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.adapter.PlotterAdapter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

public class SelectTestFigureOptionListener implements ActionListener {

	public static final String FIGURE_JOE_1 = "Figure Joe 1";

	public static final String FIGURE_JOE_2 = "Figure Joe 2";

	public static final String FIGURE_JANE = "Figure Jane";

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case FIGURE_JOE_1: {
			FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
			break;
		}
		case FIGURE_JOE_2: {
			FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
			break;
		}
		case FIGURE_JANE: {
			FiguresJane.figureScript(
					new PlotterAdapter(Application.getComponent(DriverManager.class).getCurrentPlotter()));
		}
		}

	}
}
