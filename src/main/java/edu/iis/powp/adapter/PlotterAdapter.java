package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.AbstractPlotter;
import edu.iis.client.plottermagic.IPlotter;


/**
 * Similar to object adapter
 * 
 * Proxy?
 * 
 * @author  KosinskiR
 *
 */
public class PlotterAdapter extends AbstractPlotter {

	private final IPlotter plotter;

	public PlotterAdapter(IPlotter plotter) {
		super(0, 0);
		this.plotter = plotter;
	}

	@Override
	public void drawTo(int arg0, int arg1) {
		plotter.drawTo(arg0, arg1);
	}

	@Override
	public String toString() {
		return "PlotterAdapter";
	}

}
