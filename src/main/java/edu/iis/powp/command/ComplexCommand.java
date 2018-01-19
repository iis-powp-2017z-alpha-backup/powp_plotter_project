+package edu.iis.powp.command;
 +
 +import edu.iis.client.plottermagic.IPlotter;
 +import java.util.List;
 +
 +
 +public class ComplexCommand implements PlotterCommand {
 +    List<PlotterCommand> command;
 +    public ComplexCommand(List<PlotterCommand> command) {
 +        this.command = command;
 +    }
 +
 +    @Override
 +    public void execute(IPlotter ip) {
 +        command.stream().forEach((pc) -> {
 +            pc.execute(ip);
 +        });
 +    }
 +    
 +}