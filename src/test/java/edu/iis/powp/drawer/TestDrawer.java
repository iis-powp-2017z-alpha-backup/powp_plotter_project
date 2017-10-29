package edu.iis.powp.drawer;

import edu.kis.powp.drawer.panel.DefaultDrawerFrame;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.ILine;
import edu.kis.powp.drawer.shape.LineFactory;

/**
 * Drawer test.
 * 
 * @author Dominik
 */
public class TestDrawer
{
   
    
    public static void main(String[] args)
    {
        DrawPanelController controller = new DrawPanelController();
        DefaultDrawerFrame.getDefaultDrawerFrame().setVisible(true);
        ILine line = LineFactory.getBasicLine();
        line.setStartCoordinates(300, 100);
        line.setEndCoordinates(60, 250);
        ILine line1 = LineFactory.getBasicLine();
        line1.setStartCoordinates(60, 250);
        line1.setEndCoordinates(0, -130);
        controller.drawLine(line);

    }
}
