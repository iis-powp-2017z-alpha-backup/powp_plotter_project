package edu.iis.powp.adapter;

import java.util.ArrayList;
import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {
	List<PlotterCommand> commandList = new ArrayList<PlotterCommand>();
	
	public ComplexCommand()
	{
		
	}
	
	public void addCommand(PlotterCommand command)
	{
		commandList.add(command);
	}
	public void execute(IPlotter adapter) {
		for(PlotterCommand command:commandList)
		{
			command.execute(adapter);
		}
	}
	
}
