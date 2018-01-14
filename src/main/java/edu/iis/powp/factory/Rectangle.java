package edu.iis.powp.factory;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;

public class Rectangle implements Factory {

	@Override
	public ComplexCommand draw() {
		ComplexCommand command = new ComplexCommand();
		command.add(new CommandSetPosition(-50, -50));
		command.add(new CommandDrawLineToPosition(50, -50));
		command.add(new CommandDrawLineToPosition(50, 50));
		command.add(new CommandDrawLineToPosition(-50, 50));
		command.add(new CommandDrawLineToPosition(-50, -50));
		return command;
	}
}