package edu.iis.powp.command;

public class ShapeFactory {
    public static ComplexCommand getRectantgleCommands(){
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new CommandSetPosition(-100, -100));
        complexCommand.addCommand(new CommandDrawLineToPosition(100, -100));
        complexCommand.addCommand(new CommandDrawLineToPosition(100, 100));
        complexCommand.addCommand(new CommandDrawLineToPosition(-100, 100));
        complexCommand.addCommand(new CommandDrawLineToPosition(-100, -100));
        return complexCommand;
    }

    public static ComplexCommand getTriangleCommands() {
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.addCommand(new CommandSetPosition(-100, -100));
        complexCommand.addCommand(new CommandDrawLineToPosition(100, -100));
        complexCommand.addCommand(new CommandDrawLineToPosition(0, 100));
        complexCommand.addCommand(new CommandDrawLineToPosition(-100, -100));
        return complexCommand;
    }
}