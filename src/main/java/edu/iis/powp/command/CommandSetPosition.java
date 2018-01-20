package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandSetPosition implements PlotterCommand {

	int x, y;
	public CommandSetPosition(int x, int y) {
		this.x = x;
		this.y = y;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void execute(IPlotter plotter) {
		plotter.setPosition(x, y);
		// TODO Auto-generated method stub	
	}

}
