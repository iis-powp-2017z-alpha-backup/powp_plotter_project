package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

public class LinePlotterAdapter implements IPlotter {
	private int startX = 0, startY = 0;

	private ILine line;

	/**
	 * Default basic line
	 */
	public LinePlotterAdapter() {
		this.line = LineFactory.getBasicLine();
	}

	public LinePlotterAdapter(ILine line) {
		super();
		this.line = line;
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void drawTo(int x, int y) {
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);
		this.startX = x;
		this.startY = y;
		ApplicationWithDrawer.getDrawPanelController().drawLine(line);
	}

	public void setLine(ILine line) {
		this.line = line;
	}

	@Override
	public String toString() {
		return "LinePlotterAdapter";
	}
}
