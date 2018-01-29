package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import edu.iis.powp.command.CommandFactory;
import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;

public class SelectTestFigureOptionListener implements ActionListener
{
		private int figure;
	 	
	 	public SelectTestFigureOptionListener(int figure) 
	 	{
	 		this.figure = figure;
	 	}	

    @Override
    public void actionPerformed(ActionEvent e)
    {
    	    	if(figure == 1)
    		     	{
    		     		FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
    		     	}
    		     	else if(figure == 2)
    		     	{
    		     		  FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
    		     	}
    		     	else if(figure == 3)
    		     	{
    		     		  CommandFactory.createRectangle(-50, -50, 100, 200).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    		     	}
    		     	else if(figure == 4)
    		     	{
    		     		  CommandFactory.createTriangle(0, 150, -150, 50).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    		     	}  
    	    	}
}