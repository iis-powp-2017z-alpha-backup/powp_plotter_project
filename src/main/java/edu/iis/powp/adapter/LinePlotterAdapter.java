package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;
import edu.kis.powp.drawer.shape.line.AbstractLine;

public class LinePlotterAdapter extends DrawPanelController implements IPlotter {

	private int startX = 0, startY = 0;
	private ILine iLine;

	public LinePlotterAdapter() {
		super();
		iLine = LineFactory.getBasicLine();
	}
	
	public LinePlotterAdapter(AbstractLine line) {
		super();
		iLine = line;
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
		drawLine(iLine);

	}

	public String toString() {
		return "LinePlotterAdapter";
	}
}
