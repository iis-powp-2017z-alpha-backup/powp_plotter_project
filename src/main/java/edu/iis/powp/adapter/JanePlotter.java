package edu.iis.powp.adapter;

import edu.iis.client.plottermagic.AbstractPlotter;
import edu.iis.client.plottermagic.IPlotter;

public class JanePlotter extends AbstractPlotter {

    private IPlotter iPlotter;

    public JanePlotter(IPlotter iPlotter) {
        super(0, 0);
        this.iPlotter = iPlotter;
    }

    @Override
    public void drawTo(int i, int i1) {
        iPlotter.drawTo(i, i1);
    }
}