package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

/**
odp adapter 3.2.5
Adaptera klasy najelpiej wykorzystać, gdy skorzystanie z istnjejącej klasy jest niemożliwe z powodu spójnego inferfejsu. 
*/
/**
 * Plotter adapter to drawer with several bugs.
 */

public class Adapter implements IPlotter {

	private int X = 0, Y = 0;
	private DrawPanelController drawPanelController;

	public Adapter(DrawPanelController drawPanelController) {
		super();
		this.drawPanelController = drawPanelController;
	}

	@Override
	public void setPosition(int x, int y) {
		this.X = x;
		this.Y = y;
	}

	@Override
	public void drawTo(int x, int y) {
		ILine line = LineFactory.getBasicLine();
		line.setStartCoordinates(this.X, this.Y);
		line.setEndCoordinates(x, y);

		drawPanelController.drawLine(line);
		this.setPosition(x, y);
	}

	@Override
	public String toString() {
		return "DriverAdapter";
	}
}