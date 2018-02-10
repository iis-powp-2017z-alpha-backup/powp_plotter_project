package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

import javax.sound.sampled.Line;

public class LinePlotterAdapter extends DrawerAdapter implements IPlotter {
    private int startX = 0, startY = 0;
    private ILine line;

    public LinePlotterAdapter() {
        super();
        this.line = LineFactory.getBasicLine();
    }

    public LinePlotterAdapter(ILine line) {
        super();
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
        line.setStartCoordinates(this.startX, this.startY);
        line.setEndCoordinates(x, y);

        drawLine(line);
        this.setPosition(x, y);
    }

}