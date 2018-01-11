package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;

public class LinePlotterAdapter implements IPlotter {

	private DrawPanelController drawPanelController;
	private ILine line;
	private int startX = 0, startY = 0;
	
	public LinePlotterAdapter(DrawPanelController drawPanelController, ILine line) {
		super();
		this.drawPanelController = drawPanelController;
		this.line = line;
	}
	
	@Override
	public void drawTo(int x, int y) {
    	line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);

		drawPanelController.drawLine(line);
		setPosition(x, y);
	}

	@Override
	public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
	}

}
