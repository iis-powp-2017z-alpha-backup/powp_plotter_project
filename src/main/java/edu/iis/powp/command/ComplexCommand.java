package edu.iis.powp.command;

import java.util.Stack;
import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {

	Stack<PlotterCommand> commands = new Stack<PlotterCommand>();

	public void add(PlotterCommand command) {
		commands.push(command);
	}

	public void delete() {
		if (!commands.isEmpty()) {
			commands.pop();
		} else {
			System.out.println("Stack is empty.");
		}
	}

	@Override
	public void execute(IPlotter plotter) {
		for (PlotterCommand plottercommand : commands) {
			plottercommand.execute(plotter);
		}
	}
}