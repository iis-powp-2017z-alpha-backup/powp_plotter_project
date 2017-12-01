package edu.iis.powp.factory;

import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;

public class RectangleFactory implements IShapeFactory {
	
	@Override
	public ComplexCommand draw() {
		ComplexCommand command = new ComplexCommand();
		command.add(new CommandSetPosition(-60, -40));
		command.add(new CommandDrawLineToPosition(60, -40));
		command.add(new CommandDrawLineToPosition(60, 40));
		command.add(new CommandDrawLineToPosition(-60, 40));
		command.add(new CommandDrawLineToPosition(-60, -40));
		return command;
	}
}
