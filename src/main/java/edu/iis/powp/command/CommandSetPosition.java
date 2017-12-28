package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

public class CommandSetPosition implements PlotterCommand {

	int x;
	int y;
	
	@Override
	public void execute(IPlotter driver) {
		driver.setPosition(x, y);
		
	}

}