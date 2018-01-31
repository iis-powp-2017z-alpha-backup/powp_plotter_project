package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;

public class LinePlotterAdapter implements IPlotter {

	private int startX = 0, startY = 0;
	private ILine iLine;
	private DrawPanelController drawPanelController;

	public LinePlotterAdapter(DrawPanelController drawPanelController, ILine line) {
		this.drawPanelController = drawPanelController;
		this.iLine = line;
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void drawTo(int x, int y) {
		iLine.setStartCoordinates(this.startX, this.startY);
		iLine.setEndCoordinates(x, y);
		this.setPosition(x, y);
		this.drawPanelController.drawLine(iLine);

	}

	public String toString() {
		return "LinePlotterAdapter";
	}
}
