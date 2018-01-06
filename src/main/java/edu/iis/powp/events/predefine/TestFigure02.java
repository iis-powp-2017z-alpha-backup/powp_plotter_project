package edu.iis.powp.events.predefine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.app.Application;


public class TestFigure02 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		FiguresJoe.figureScript2(Application.getComponent(DriverManager.class).getCurrentPlotter());
	}

}
