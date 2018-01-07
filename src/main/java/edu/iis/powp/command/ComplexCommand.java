package edu.iis.powp.command;

import java.util.ArrayList;
import java.util.List;

import edu.iis.client.plottermagic.IPlotter;

public class ComplexCommand implements PlotterCommand {

    private List<PlotterCommand> commands;

    public ComplexCommand() {
        this.commands = new ArrayList<>();
    }

    public ComplexCommand(List<PlotterCommand> commands) {
        this.commands = commands;
    }

    @Override
    public void execute(IPlotter plotter) {
        for (Object command : commands) {
            ((PlotterCommand) command).execute(plotter);
        }
    }

    public void addCommand(PlotterCommand plotterCommand) {
        commands.add(plotterCommand);
    }
}
