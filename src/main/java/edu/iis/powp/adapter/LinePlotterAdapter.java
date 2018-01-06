package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;

public class LinePlotterAdapter implements IPlotter 
{
	
	private int startX = 0;
	private int startY = 0;
	private DrawPanelController drawPanelController;
	private ILine iLine;
	
	public LinePlotterAdapter(DrawPanelController drawPanelController, ILine iLine) 
	{
		this.drawPanelController = drawPanelController;
		this.iLine = iLine;
	}

	@Override
	public void drawTo(int x, int y) 
	{
		this.iLine.setStartCoordinates(this.startX, this.startY);
		this.iLine.setEndCoordinates(x, y);
		this.setPosition(x, y);
		this.drawPanelController.drawLine(iLine);
	}

	@Override
	public void setPosition(int x, int y) 
	{
		this.startX=x;
		this.startY=y;
	}

}
