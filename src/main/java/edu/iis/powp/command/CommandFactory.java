package edu.iis.powp.command;

public class CommandFactory {

	public static ComplexCommand createRectangle(int x, int y, int width, int height) {
		ComplexCommand rectangleCommand = new ComplexCommand();
		rectangleCommand.addCommand(new CommandSetPosition(x, y));
		rectangleCommand.addCommand(new CommandDrawLineToPosition(x + width, y));
		rectangleCommand.addCommand(new CommandDrawLineToPosition(x + width, y + height));
		rectangleCommand.addCommand(new CommandDrawLineToPosition(x, y + height));
		rectangleCommand.addCommand(new CommandDrawLineToPosition(x, y));
		return rectangleCommand;
	}
	
	public static ComplexCommand createTriangle(int x, int y, int basis, int height) {
		ComplexCommand triangleCommand = new ComplexCommand();
		triangleCommand.addCommand(new CommandSetPosition(x, y));
		triangleCommand.addCommand(new CommandDrawLineToPosition(x + (basis / 2), y));
		triangleCommand.addCommand(new CommandDrawLineToPosition(x , y + height));
		triangleCommand.addCommand(new CommandDrawLineToPosition(x - (basis / 2), y));
		triangleCommand.addCommand(new CommandDrawLineToPosition(x, y));
		return triangleCommand;
	}
}
