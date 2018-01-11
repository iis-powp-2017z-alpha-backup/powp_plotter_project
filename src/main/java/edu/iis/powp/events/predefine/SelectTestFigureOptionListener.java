package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.command.CommandFactory;

public class SelectTestFigureOptionListener implements ActionListener
{
	public static final int FIGURE_SCRIPT_1 = 0;
	public static final int FIGURE_SCRIPT_2 = 1;
	public static final int RECTANGLE = 2;
	public static final int TRIANGLE = 3;
	
	private int selectedFigure;
	
	public SelectTestFigureOptionListener(int selectedFigure) {
		super();
		this.selectedFigure = selectedFigure;
	}

    @Override
    public void actionPerformed(ActionEvent e)
    {
    	switch(selectedFigure) {
    		case 0:
    			FiguresJoe.figureScript1(Application.getComponent(DriverManager.class).getCurrentPlotter());
    			break;
    		case 1:
    			FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
    			break;
    		case 2:
    			CommandFactory.createRectangle(-50, -50, 100, 100).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    			break;
    		case 3:
    			CommandFactory.createTriangle(0, -50, 100, 150).execute(Application.getComponent(DriverManager.class).getCurrentPlotter());
    			break;
    	}
    }
}
