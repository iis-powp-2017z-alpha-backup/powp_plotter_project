package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandSetPosition implements PlotterCommand {

	private int x, y;
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public void execute(IPlotter plotter) {
		plotter.setPosition(x, y);
	}

}
