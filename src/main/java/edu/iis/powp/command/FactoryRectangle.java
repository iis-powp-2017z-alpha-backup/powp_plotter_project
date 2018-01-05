package edu.iis.powp.command;

public class FactoryRectangle {

	public ComplexCommand draw() {
		ComplexCommand command = new ComplexCommand();
		command.add(new CommandSetPosition(-20, -20));
		command.add(new CommandDrawLineToPosition(-20, 60));
		command.add(new CommandDrawLineToPosition(20, 60));
		command.add(new CommandDrawLineToPosition(20, -20));
		command.add(new CommandDrawLineToPosition(-20, -20));
		return command;
	}
}
