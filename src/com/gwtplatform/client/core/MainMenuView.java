package com.gwtplatform.client.core;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class MainMenuView extends Composite {
	  private static MainMenuUiBinder uiBinder = GWT.create(MainMenuUiBinder.class);
	  interface MainMenuUiBinder extends UiBinder<Widget, MainMenuView> {}
	  
	  public MainMenuView() {
	    initWidget(uiBinder.createAndBindUi(this));
	  }
	}
