package edu.iis.powp.command;

import edu.iis.client.plottermagic.IPlotter;
import edu.iis.powp.adapter.LinePlotterAdapter;
import edu.kis.powp.drawer.panel.DefaultDrawerFrame;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

public class TestCommandComplexFactory {
    public void drawQuadrangle() {
        DrawPanelController controller = new DrawPanelController();
        DefaultDrawerFrame.getDefaultDrawerFrame().setVisible(true);
        IPlotter plotter = new LinePlotterAdapter(controller, LineFactory.getDottedLine());
        PlotterCommand pc = ComplexCommandFactory.drawQuadrangle(20, 50, 120, 150);
        pc.execute(plotter);
        
    }
    
}