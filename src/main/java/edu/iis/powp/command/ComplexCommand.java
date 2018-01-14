package edu.iis.powp.command;

import java.util.Stack;

public class ComplexCommand {

	Stack<PlotterCommand> commandsStack;

	public void add(PlotterCommand command) {
		commandsStack.push(command);
	}

	public PlotterCommand undo() {
		if (commandsStack.isEmpty()) {
			return null;
		}
		return commandsStack.pop();
	}

}
