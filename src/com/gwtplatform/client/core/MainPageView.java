package com.gwtplatform.client.core;

import com.gwtplatform.client.core.MainPagePresenter.MyView;
import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class MainPageView extends ViewImpl implements MyView {
	  private static MainPageViewUiBinder uiBinder = GWT.create(MainPageViewUiBinder.class);
	  interface MainPageViewUiBinder extends UiBinder<Widget, MainPageView> {}

	  public final Widget widget;
	  
	  @UiField FlowPanel mainContentPanel;
	  public MainPageView() {
	    widget = uiBinder.createAndBindUi(this);
	  }

	  @Override
	  public Widget asWidget() {
	    return widget;
	  }

	  @Override
	  public void setInSlot(Object slot, Widget content) {
	    if (slot == MainPagePresenter.TYPE_SetMainContent) {
	      setMainContent(content);
	    } else {
	      super.setInSlot(slot, content);
	    }
	  }

	  private void setMainContent(Widget content) {
	    mainContentPanel.clear();
	    
	    if (content != null) {
	      mainContentPanel.add(content);
	    }
	  }
	}