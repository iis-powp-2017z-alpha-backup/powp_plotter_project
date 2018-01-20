package edu.iis.powp.appext;

import edu.iis.powp.adapter.LinePlotterAdapter;
import edu.iis.powp.app.Application;
import edu.iis.powp.app.Context;
import edu.iis.powp.app.DriverManager;
import edu.iis.powp.events.predefine.SelectClearPanelOptionListener;
import edu.iis.powp.events.predefine.SelectLineTypeForDrawerListener;
import edu.kis.powp.drawer.panel.DrawPanelController;

/**
 * Application.
 */
public class ApplicationWithDrawer {

    private static boolean isAppCreated = false;
	
    /**
     * Startup configuration.
     */
	public synchronized static void configureApplication()
	{
	    if (!isAppCreated)
	    {
	    	isAppCreated = true; 
	        
	    	Application.configureApplication();
	    	
	        Application.addComponent(DriverManager.class);
	        Application.addComponent(Context.class);
	        
	        Context context = Application.getComponent(Context.class);
	        
	        setupDrawerPlugin(context);
	        
	        context.setVisibility(true);	
	    }
	}

	/**
	 * Setup Drawer Plugin and add to context.
	 * 
	 * @param context Application context.
	 */
	private static void setupDrawerPlugin(Context context) {    
		
		SelectClearPanelOptionListener selectClearPanelOptionListener = new SelectClearPanelOptionListener();
		Application.addComponent(LinePlotterAdapter.class);
		context.addComponentMenu(LinePlotterAdapter.class, "Draw Panel", 0);
		context.addComponentMenuElement(LinePlotterAdapter.class, "Clear Panel", selectClearPanelOptionListener);
		getDrawPanelController().initialize(context.getFreePanel());
		
		SelectLineTypeForDrawerListener selectLineTypeListener = new SelectLineTypeForDrawerListener();

		context.addComponentMenuElement(LinePlotterAdapter.class, "Set basic line", selectLineTypeListener);
		context.addComponentMenuElement(LinePlotterAdapter.class, "Set special line", selectLineTypeListener);
	}

	 /**
     * Get controller of application drawing panel.
     * 
     * @return drawPanelController.
     */
	public static DrawPanelController getDrawPanelController() {
		return Application.getComponent(LinePlotterAdapter.class);
	}
}
