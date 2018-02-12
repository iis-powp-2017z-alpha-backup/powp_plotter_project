package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;


	/**
 	* Plotter adapter to drawer with several bugs. 
 	*/
	/*
 	zad 3.2.5
 	Warto gdy uzywanie instejacej klasy jest niemozliwe ze wzgledu na niekompatybilny interfejs
	*/
public class DrawerAdapter implements IPlotter {

    private int startX = 0, startY = 0;
    private DrawPanelController drawPanelController;

    public DrawerAdapter(DrawPanelController drawPanelController) {
        super();
        this.drawPanelController = drawPanelController;
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void drawTo(int x, int y) {
        ILine line = LineFactory.getBasicLine();
    	line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);

        drawPanelController.drawLine(line);
		this.setPosition(x, y);
    }

    @Override
    public String toString() {
    	        return "DriverAdapter";    }
}
