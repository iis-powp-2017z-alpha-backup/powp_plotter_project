package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.AbstractPlotter;
import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

public class PlotterAdapter extends AbstractPlotter{

	public PlotterAdapter(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub

	}
	@Override
	public void drawTo(int arg0, int arg1) {
		ILine line = LineFactory.getBasicLine();
		line.setStartCoordinates(this.getX(), this.getY());
		line.setEndCoordinates(arg0, arg1);
		setPosition(arg0, arg1);
		DrawPanelController draw = new DrawPanelController();
		draw.drawLine(line);
		// TODO Auto-generated method stub
	}

}
