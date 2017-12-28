package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;

public class LinePlotterAdapter implements IPlotter {

	private int startX = 0, startY = 0;
	private DrawPanelController drawPanelController;
	private ILine line;
	
	public LinePlotterAdapter(DrawPanelController drawPanelController, ILine line) {
		 this.drawPanelController = drawPanelController;
		 this.line = line;
		 }
	
	@Override
	public void drawTo(int x, int y) {
		this.line.setStartCoordinates(this.startX, this.startY);
		this.line.setEndCoordinates(x, y);
		this.setPosition(x, y);
		this.drawPanelController.drawLine(line);
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX=x;
		this.startY=y;
		
	}

}