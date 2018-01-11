package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {

	private List<PlotterCommand> commandsList = new ArrayList<>();
	
	public List<PlotterCommand> getCommandsList() {
		return new ArrayList<>(commandsList);
	}
	
	public void addCommand(PlotterCommand command) {
		commandsList.add(command);
	}
	
	public void deleteCommand(int index) {
		commandsList.remove(index);
	}
	
	@Override
	public void execute(IPlotter plotter) {
		for(PlotterCommand command : commandsList) {
			command.execute(plotter);
		}
	}

}
