package edu.iis.powp.command;

public class ComplexBoxCommand {
	
	public static ComplexCommand create() {
		ComplexCommand command = new ComplexCommand();
		command.add(new CommandSetPosition(-5, -5));
		command.add(new CommandDrawLineToPosition(5, -5));
		command.add(new CommandDrawLineToPosition(5, 5));
		command.add(new CommandDrawLineToPosition(-5, 5));
		return command;
	}

}
