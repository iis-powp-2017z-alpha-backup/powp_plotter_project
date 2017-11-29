package edu.iss.powp.command;

import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand{

	private List<PlotterCommand> list;
	
	public ComplexCommand(List<PlotterCommand> list) {
		this.list = list;
	}

	@Override
	public void execute(IPlotter plotter) {
		for (PlotterCommand plotterCommand : list) {
			plotterCommand.execute(plotter);
		}
	}
}
