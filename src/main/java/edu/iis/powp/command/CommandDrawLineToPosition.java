package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandDrawLineToPosition implements PlotterCommand {

	int x, y;
	
	public CommandDrawLineToPosition(int x, int y) {
		this.x = x;
		this.y = y;
		// TODO Auto-generated constructor stub
	}
	public void execute(IPlotter plotter) {
		plotter.drawTo(x, y);
		// TODO Auto-generated method stub	
	}

}
