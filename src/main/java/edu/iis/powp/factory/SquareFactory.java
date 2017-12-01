package edu.iis.powp.factory;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;

public class SquareFactory implements IShapeFactory {

	@Override
	public ComplexCommand draw() {
		ComplexCommand command = new ComplexCommand();
		command.add(new CommandSetPosition(-40, -40));
		command.add(new CommandDrawLineToPosition(40, -40));
		command.add(new CommandDrawLineToPosition(40, 40));
		command.add(new CommandDrawLineToPosition(-40, 40));
		command.add(new CommandDrawLineToPosition(-40, -40));
		return command;
	}

}
