package edu.iis.powp.adapter;

import javax.swing.JPanel;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.Context;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.appext.ApplicationWithDrawer;
import edu.iis.powp.events.predefine.SelectClearPanelOptionListener;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;


/**
 * Plotter adapter to drawer with several bugs. 
 */
public class LinePlotterAdapter extends DrawPanelController implements IPlotter
{ 
    private static boolean isAppCreated = false;
    DrawPanelController cont;
	private int startX = 555, startY = 555;
	ILine line;
	
    public LinePlotterAdapter(ILine line) {
    	this.cont = ApplicationWithDrawer.getDrawPanelController();
    	this.line = line;
	}
    
    
	@Override
    public void setPosition(int x, int y)
    {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void drawTo(int x, int y)
    {
    	ILine line = this.line;
    	
    	line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);
        cont.drawLine(line);
        this.startX= x;
        this.startY = y;
    }

    public String toString()
    {
        return "@Q!$!@$!#@$(*#@&Q(%^*#@";
    }
    
    public void getDrawPanelController()
    {

    }
}
