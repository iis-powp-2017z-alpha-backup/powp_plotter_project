
package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.IPlotter;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

public class LinePlotterAdapter extends MyAdapter implements IPlotter {

    private int startX = 0, startY = 0;
    private ILine mline;

    public LinePlotterAdapter() {
        super();
        mline = LineFactory.getBasicLine();
    }

    public LinePlotterAdapter(ILine line) {
        super();
        mline = line;
    }

    @Override
    public void setPosition(int x, int y) {
        startX = x;
        startY = y;
    }

    @Override
    public void drawTo(int x, int y) {
        mline.setStartCoordinates(this.startX, this.startY);
        mline.setEndCoordinates(x, y);

        drawLine(mline);
        this.setPosition(x, y);
    }

}
