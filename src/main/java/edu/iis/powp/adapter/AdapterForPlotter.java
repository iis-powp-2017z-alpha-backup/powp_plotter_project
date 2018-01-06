package edu.iis.powp.adapter;

import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.shape.LineFactory;
import edu.kis.powp.drawer.shape.ILine;

public class AdapterForPlotter implements IPlotter 
{

	private DrawPanelController drawPanelController;
	private int startX = 0, startY = 0;
		
	public AdapterForPlotter(DrawPanelController dpc) 
	{
		this.drawPanelController=dpc;
	}
	    
	@Override
	public void setPosition(int x, int y) 
	{
		this.startX = x;
		this.startY = y;
	}
	
	@Override
	public void drawTo(int x, int y)
	{
		ILine line = LineFactory.getBasicLine();
		line.setStartCoordinates(this.startX, this.startY);
		line.setEndCoordinates(x, y);
		drawPanelController.drawLine(line);
		this.setPosition(x, y);
	}
	
	@Override
	public String toString()
	{
	     return "@Q!$!@$!#@$(*#@&Q(%^*#@";
	}
}
