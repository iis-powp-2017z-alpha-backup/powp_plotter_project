package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.iis.powp.adapter.LinePlotterAdapter;
import edu.iis.powp.app.Application;
import edu.kis.powp.drawer.panel.DrawPanelController;
import edu.kis.powp.drawer.shape.LineFactory;

public class SelectLineTypeForDrawerListener implements ActionListener
{

    @Override
    public void actionPerformed(ActionEvent e)
    {
    	LinePlotterAdapter controller = Application.getComponent(LinePlotterAdapter.class);
    	System.out.println(e.getActionCommand());
    	String command = e.getActionCommand();
    	switch (command)
    	{
    		case "Set basic line":
    			controller.setLineType(LineFactory.getBasicLine());
    			break;
    		case "Set special line":
    			controller.setLineType(LineFactory.getSpecialLine());
    			break;
    		default:
    			System.err.println("Not recognize line type! ");
    	
    	}
        
    }
}

