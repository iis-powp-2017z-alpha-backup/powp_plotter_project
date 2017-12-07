package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;

public class CommandSetPosition implements PlotterCommand {

	private int x,y;
	public CommandSetPosition(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public void execute(IPlotter adapter) {
		// TODO Auto-generated method stub
		adapter.setPosition(x, y);
	}

}
