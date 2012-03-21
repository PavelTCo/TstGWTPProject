package com.gwtplatform.client;

import com.gwtplatform.client.ResourceBundle;
import com.google.gwt.core.client.EntryPoint;
import com.gwtplatform.client.gin.ClientGinjector;
import com.google.gwt.core.client.GWT;
import com.gwtplatform.mvp.client.DelayedBindRegistry;

public class TstGWTPProject implements EntryPoint {
	
	/**
	 * Injection of css
	 */
	static {
		ResourceBundle.INSTANCE.css().ensureInjected();
	}

	private final ClientGinjector ginjector = GWT.create(ClientGinjector.class);

	@Override
	public void onModuleLoad() {
		// This is required for Gwt-Platform proxy's generator
		DelayedBindRegistry.bind(ginjector);
	
		ginjector.getPlaceManager().revealCurrentPlace();
	}
}
