package edu.iis.powp.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.iis.client.plottermagic.ClientPlotter;
import edu.iis.client.plottermagic.IPlotter;
import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.adapter.LinePlotterAdapter;
import edu.iis.powp.adapter.MyAdapter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.Context;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.iis.powp.command.FactoryRectangle;
import edu.iis.powp.events.predefine.SelectTestFigureOptionListener;

public class TestPlotSoftPatterns {
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	private static void setupPresetTests(Context context) {
		SelectTestFigureOptionListener selectTestFigureOptionListener = new SelectTestFigureOptionListener();

		context.addTest("Figure Joe 1", selectTestFigureOptionListener);
		context.addTest("Figure Joe 2", new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
			}
		});

		context.addTest("FactoryRectangle", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FactoryRectangle square = new FactoryRectangle();
				square.draw().execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
			}
		});
	}

	private static void setupDrivers(Context context) {
		IPlotter clientPlotter = new ClientPlotter();
		context.addDriver("Client Plotter", clientPlotter);
		Application.getComponent(DriverManager.class).setCurrentPlotter(clientPlotter);

		IPlotter plotter = new MyAdapter();
		context.addDriver("MyAdapter", plotter);

		IPlotter specialLine = new LinePlotterAdapter();
		context.addDriver("SpecialLine", specialLine);

		context.updateDriverInfo();
	}

	IPlotter plotter = new MyAdapter();

	private static void setupLogger(Context context) {
		Application.addComponent(Logger.class);
		context.addComponentMenu(Logger.class, "Logger", 0);
		context.addComponentMenuElement(Logger.class, "Clear log", (ActionEvent e) -> context.flushLoggerOutput());
		context.addComponentMenuElement(Logger.class, "Fine level", (ActionEvent e) -> LOGGER.setLevel(Level.FINE));
		context.addComponentMenuElement(Logger.class, "Info level", (ActionEvent e) -> LOGGER.setLevel(Level.INFO));
		context.addComponentMenuElement(Logger.class, "Warning level",
				(ActionEvent e) -> LOGGER.setLevel(Level.WARNING));
		context.addComponentMenuElement(Logger.class, "Severe level", (ActionEvent e) -> LOGGER.setLevel(Level.SEVERE));
		context.addComponentMenuElement(Logger.class, "OFF logging", (ActionEvent e) -> LOGGER.setLevel(Level.OFF));
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				ApplicationWithDrawer.configureApplication();
				Context context = Application.getComponent(Context.class);

				setupDrivers(context);
				setupPresetTests(context);
				setupLogger(context);
			}

		});
	}

}
