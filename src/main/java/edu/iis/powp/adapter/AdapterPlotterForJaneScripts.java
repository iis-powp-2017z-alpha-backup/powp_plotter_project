package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.AbstractPlotter;
import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;
import edu.iis.powp.adapter.LinePlotterAdapter;

public class AdapterPlotterForJaneScripts extends AbstractPlotter {

	private int startX = 0, startY = 0;
	LinePlotterAdapter linePlotterAdapter; 
	public AdapterPlotterForJaneScripts(int x, int y) {
		super(x, y);	
	}
	
	public AdapterPlotterForJaneScripts(IPlotter linePlotterAdapter) {
		super(0,0);
		this.linePlotterAdapter = (LinePlotterAdapter)linePlotterAdapter;
	}
    @Override
    public void drawTo(int x, int y)
    {
    	linePlotterAdapter.getLine().setStartCoordinates(this.startX, this.startY);
    	linePlotterAdapter.getLine().setEndCoordinates(x, y);
        setPosition(x, y);
        linePlotterAdapter.drawLine(linePlotterAdapter.getLine());
    }

    @Override
    public String toString()
    {
        return "@Q!$!@$!#@$(*#@&Q(%^*#@";
    }
    
    
    public void clearPanel()
    {
    	System.out.println("Clearing panel!");
        clearPanel();
    }
}
