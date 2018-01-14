package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.AbstractPlotter;
import edu.iis.client.plottermagic.IPlotter;

public class JanePlotter extends AbstractPlotter {

	private IPlotter Plotter;

	public JanePlotter(IPlotter Plotter) {
		super(0, 0);
		this.Plotter = Plotter;
	}

	@Override
	public void drawTo(int i, int i1) {
		Plotter.drawTo(i, i1);
	}
}