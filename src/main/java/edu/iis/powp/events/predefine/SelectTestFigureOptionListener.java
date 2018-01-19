package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.ComplexCommandFactory;
import edu.iis.powp.command.PlotterCommand;

public class SelectTestFigureOptionListener implements ActionListener
{
    	private String FiguresJoeExample;
	
	public SelectTestFigureOptionListener() {
		this.FiguresJoeExample = "Figure Joe 1"; // domyslny konstruktor wyswietli pierwsza figure
	}
	
	public SelectTestFigureOptionListener(String figureScript) {
		this.FiguresJoeExample = figureScript;
	}

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(this.FiguresJoeExample.equals("Figure Joe 1"))
        {
            FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
        }
        else if(this.FiguresJoeExample.equals("Figure Joe 2"))
        {
            FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
        }
        else if(this.FiguresJoeExample.equals("Test comm 1"))
        {
            PlotterCommand pc = ComplexCommandFactory.drawQuadrangle(0, 15, -100, -150);
            pc.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
        }
        else if(this.FiguresJoeExample.equals("Test comm 2"))
        {
            PlotterCommand pc = ComplexCommandFactory.drawSquare(20, 20, 200);
            pc.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
        }
        else if(this.FiguresJoeExample.equals("Test comm 3"))
        {
            PlotterCommand pc = ComplexCommandFactory.drawTriangle(20, 40, 40, -180, 200, -90);
            pc.execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
        }
        
    }
}