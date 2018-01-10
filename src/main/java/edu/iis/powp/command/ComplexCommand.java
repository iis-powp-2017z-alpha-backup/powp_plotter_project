package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;

import java.util.Vector;

public class ComplexCommand implements PlotterCommand {

    Vector<PlotterCommand> plotterCommands = new Vector<PlotterCommand>();

    public void add(PlotterCommand command) {
        plotterCommands.add(command);
    }

    @Override
    public void execute(IPlotter plotter) {
        for (PlotterCommand plotterCommandIterator : plotterCommands) {
            plotterCommandIterator.execute(plotter);
        }
    }
}
