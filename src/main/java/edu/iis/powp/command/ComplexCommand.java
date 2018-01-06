package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;
import java.util.List;

public class ComplexCommand implements PlotterCommand 
{
	private List<PlotterCommand> inLine;
		
	public List<PlotterCommand> getInLine() 
	{
		return inLine;
	}
	
	public void setInLine(List<PlotterCommand> inLine) 
	{
		this.inLine = inLine;
	}
	
	public ComplexCommand(List<PlotterCommand> inLine) 
	{
		super();
		this.inLine = inLine;
	}

	@Override
	public void execute(IPlotter driver) 
	{
		for(Object command : inLine)
		{
			((PlotterCommand)command).execute(driver);
		}
	}

}
