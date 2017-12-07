package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;

public class CommandDrawLineToPosition implements PlotterCommand {

	private int x,y;
	public CommandDrawLineToPosition(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public void execute(IPlotter adapter) {
		adapter.drawTo(x, y);
	}

}
