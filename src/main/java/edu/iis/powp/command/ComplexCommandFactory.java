package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ComplexCommandFactory {

    public static PlotterCommand drawSquare(int x, int y, int size) {
        List<PlotterCommand> command = new ArrayList<>();
        command.addAll(Arrays.asList (
                new CommandSetPosition(x, y),
                new CommandDrawLineToPosition(x + size, y),
                new CommandDrawLineToPosition(x + size, y + size),
                new CommandDrawLineToPosition(x, y + size),
                new CommandDrawLineToPosition(x, y)

        ));
        return new ComplexCommand(command);
    }
    
    public static PlotterCommand drawQuadrangle(int x, int y, int x1, int y1) {
        List<PlotterCommand> command = new ArrayList<>();
        command.addAll(Arrays.asList (
                new CommandSetPosition(x, y),
                new CommandDrawLineToPosition(x1, y),
                new CommandDrawLineToPosition(x1, y1),
                new CommandDrawLineToPosition(x ,y1),
                new CommandDrawLineToPosition(x, y )
        ));
        return new ComplexCommand(command);
    }
    
        public static PlotterCommand drawTriangle(int x, int y, int x1, int y1, int x2, int y2) {
        List<PlotterCommand> command = new ArrayList<>();
        command.addAll(Arrays.asList (
                new CommandSetPosition(x, y),
                new CommandDrawLineToPosition(x1, y1),
                new CommandDrawLineToPosition(x2, y2),
                new CommandDrawLineToPosition(x ,y)
        ));
        return new ComplexCommand(command);
    }
    
}