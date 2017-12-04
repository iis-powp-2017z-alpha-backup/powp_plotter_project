package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;


/**
 * Plotter adapter to drawer with several bugs. 
 */
public class LinePlotterAdapter extends DrawPanelController implements IPlotter
{ 
	private int startX = 0, startY = 0;
	private ILine line = LineFactory.getBasicLine();
    public LinePlotterAdapter() {
		super();
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
    	line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);
        setPosition(x, y);
		drawLine(line);
    }

    @Override
    public String toString()
    {
        return "@Q!$!@$!#@$(*#@&Q(%^*#@";
    }
    
    
    public void clearPanel()
    {
    	System.out.println("Clearing panel!");
        super.clearPanel();
    }
    
    public void setLineType (ILine line)
    {
    	this.line = line;
    }
    
    public ILine getLine() {
    	return line;
    }
}
