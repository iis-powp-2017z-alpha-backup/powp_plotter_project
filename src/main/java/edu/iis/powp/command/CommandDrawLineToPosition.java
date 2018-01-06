package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandDrawLineToPosition implements PlotterCommand 
{
	int x , y;
	
	@Override
	public void execute(IPlotter driver) 
	{
		driver.drawTo(x, y);
	}
}
