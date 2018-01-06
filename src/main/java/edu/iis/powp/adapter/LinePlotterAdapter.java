package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

public class LinePlotterAdapter implements IPlotter {

    private int startX = 0, startY = 0;
    private ILine line;
    private DrawPanelController drawPanelController;

    public LinePlotterAdapter(DrawPanelController drawPanelController) {
        super();
        this.line = LineFactory.getDottedLine();
        this.drawPanelController = drawPanelController;
    }

    public LinePlotterAdapter(DrawPanelController drawPanelController, ILine line) {
        super();
        this.line = line;
        this.drawPanelController = drawPanelController;
    }

    @Override
    public void setPosition(int x, int y) {
        this.startX = x;
        this.startY = y;
    }

    @Override
    public void drawTo(int x, int y) {
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);

        drawPanelController.drawLine(line);
        this.setPosition(x, y);
    }

}
