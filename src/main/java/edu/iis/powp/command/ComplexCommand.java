package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;
import java.util.List;

public class ComplexCommand implements PlotterCommand {
    private List<PlotterCommand> command;
    public ComplexCommand(List<PlotterCommand> command) {
        super();
        this.command = command;
    }

    @Override
    public void execute(IPlotter ip) {
        command.stream().forEach((pc) -> {
            pc.execute(ip);
        });
    }
    
}