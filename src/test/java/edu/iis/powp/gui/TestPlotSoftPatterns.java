package edu.iis.powp.gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.iis.client.plottermagic.ClientPlotter;
import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.adapter.Adapter;
import edu.iis.powp.adapter.LinePlotterAdapter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.Context;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.iis.powp.events.predefine.SelectTestFigureOptionListener;
import edu.kis.powp.drawer.shape.LineFactory;

public class TestPlotSoftPatterns {

	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	private static void setupPresetTests(Context context) {
		SelectTestFigureOptionListener selectTestFigureOptionListener = new SelectTestFigureOptionListener();

		context.addTest("Figure Joe 1", selectTestFigureOptionListener);
		context.addTest("Figure Joe 2", selectTestFigureOptionListener);
		context.addTest("Figure Jane", selectTestFigureOptionListener);
	}

	private static void setupDrivers(Context context) {
		IPlotter clientPlotter = new ClientPlotter();
		context.addDriver("Client Plotter", clientPlotter);
		Application.getComponent(DriverManager.class).setCurrentPlotter(clientPlotter);

		IPlotter plotter = new Adapter(ApplicationWithDrawer.getDrawPanelController());
		context.addDriver("Buggy Simulator", plotter);

		IPlotter linePlotter = new LinePlotterAdapter(ApplicationWithDrawer.getDrawPanelController(),
				LineFactory.getBasicLine());
		context.addDriver("Basic Line Simulator", linePlotter);

		IPlotter dottedPlotter = new LinePlotterAdapter(ApplicationWithDrawer.getDrawPanelController(),
				LineFactory.getDottedLine());
		context.addDriver("Dotted Line Simulator", dottedPlotter);

		IPlotter specialPlotter = new LinePlotterAdapter(ApplicationWithDrawer.getDrawPanelController(),
				LineFactory.getSpecialLine());
		context.addDriver("Special Line Simulator", specialPlotter);

		context.updateDriverInfo();
	}

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
