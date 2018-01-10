package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.client.plottermagic.preset.FiguresJane;
import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.CommandDrawLineToPosition;
import edu.iis.powp.command.CommandSetPosition;
import edu.iis.powp.command.ComplexCommand;
import edu.iis.powp.command.PlotterCommand;
import edu.iis.powp.adapter.*;

public class SelectTestFigureOptionListener implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e)
    {
    	System.out.println(e.getActionCommand());
    	switch (e.getActionCommand())
    	{
	    	case "Figure Joe 1":
	    		FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
	    		break;
	    	case "Figure Joe 2":
	    		FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
	    		break;
	    	case "Figure Jane":
	    		FiguresJane.figureScript(new AdapterPlotterForJaneScripts(Application.getComponent(DriverManager.class).getCurrentPlotter()));
	    		break;
	    	case "Command pattern example":
	    		commandTest(Application.getComponent(DriverManager.class).getCurrentPlotter());
	    		break;
	    	default:
	    		System.err.println("Test not found.");
    	}
        //
    }
    
    void commandTest(IPlotter plotterSimulator)
    {
    	ComplexCommand complexCommand = new ComplexCommand();
    	complexCommand.add(new CommandSetPosition(0, 0));
    	complexCommand.add(new CommandDrawLineToPosition(2, 80));
    	complexCommand.executeCommands(plotterSimulator);
    	//PlotterCommand setPosition = new CommandSetPosition(0, 0);
		//PlotterCommand drawLineToPosition = new CommandDrawLineToPosition(2, 80);
		//setPosition.execute(plotterSimulator);
		//drawLineToPosition.execute(plotterSimulator);
    }
}
