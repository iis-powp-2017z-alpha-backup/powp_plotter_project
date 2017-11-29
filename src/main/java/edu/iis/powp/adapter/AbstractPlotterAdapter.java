package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.AbstractPlotter;
import edu.iis.client.plottermagic.IPlotter;

public class AbstractPlotterAdapter extends AbstractPlotter implements IPlotter {

	IPlotter plotter;
	
	public AbstractPlotterAdapter(int x, int y) {
		super(x, y);
		plotter = new DrawPlotterAdapter();
	}
	
	public AbstractPlotterAdapter(int x, int y, IPlotter plotter) {
		super(x, y);
		this.plotter = plotter;
	}

	@Override
	public void drawTo(int arg0, int arg1) {
		plotter.setPosition(super.getX(), super.getY());
		plotter.drawTo(arg0, arg1);
		super.setPosition(arg0, arg1);
	}

}
