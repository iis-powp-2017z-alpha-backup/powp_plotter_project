package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand {
	List <PlotterCommand> commands = new ArrayList<PlotterCommand>();
	
	public void add(PlotterCommand command)
	{
		commands.add(command);
	}
	public void executeCommands(IPlotter plotter)
	{
		for (PlotterCommand plotterCommand : commands) {
			plotterCommand.execute(plotter);
		}
	}
}
