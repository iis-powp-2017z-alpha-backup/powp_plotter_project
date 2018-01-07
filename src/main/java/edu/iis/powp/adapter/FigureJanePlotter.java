package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.AbstractPlotter;
import edu.iis.client.plottermagic.IPlotter;

public class FigureJanePlotter extends AbstractPlotter {

    private IPlotter iPlotter;

    public FigureJanePlotter(IPlotter iPlotter) {
        super(0, 0);
        this.iPlotter = iPlotter;
    }

    @Override
    public void drawTo(int x, int y) {
        iPlotter.drawTo(x, y);
    }
}
