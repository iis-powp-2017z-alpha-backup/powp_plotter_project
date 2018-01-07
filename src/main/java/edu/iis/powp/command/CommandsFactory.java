package edu.iis.powp.command;

public class CommandsFactory {

    public static ComplexCommand getRectantgle() {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new CommandSetPosition(-100, -100));
        complexCommand.addCommand(new CommandDrawLineToPosition(100, -100));
        complexCommand.addCommand(new CommandDrawLineToPosition(100, 100));
        complexCommand.addCommand(new CommandDrawLineToPosition(-100, 100));
        complexCommand.addCommand(new CommandDrawLineToPosition(-100, -100));
        return complexCommand;
    }

    public static ComplexCommand getTriangle() {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new CommandSetPosition(-100, -100));
        complexCommand.addCommand(new CommandDrawLineToPosition(100, -100));
        complexCommand.addCommand(new CommandDrawLineToPosition(0, 100));
        complexCommand.addCommand(new CommandDrawLineToPosition(-100, -100));
        return complexCommand;
    }
}
