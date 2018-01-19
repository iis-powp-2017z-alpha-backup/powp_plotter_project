package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

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
        
    }
}