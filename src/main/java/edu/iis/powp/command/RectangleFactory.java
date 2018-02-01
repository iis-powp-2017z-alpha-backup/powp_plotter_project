package edu.iis.powp.command;

public class RectangleFactory {

    public ComplexCommand draw() {
        ComplexCommand command = new ComplexCommand();
        command.add(new CommandSetPosition(0, 0));
        command.add(new CommandDrawLineToPosition(-100, 60));
        command.add(new CommandDrawLineToPosition(100, 60));
        command.add(new CommandDrawLineToPosition(100, -100));
        command.add(new CommandDrawLineToPosition(-100, -100));
        return command;
    }
}
