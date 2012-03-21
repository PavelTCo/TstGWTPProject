package com.gwtplatform.client.core;

import java.util.Iterator;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiChild;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * The general widget to publish panel with other widgets inside like a window <br>
 * 
 * UIBinder usage
 * 
 * <pre>
 * <code>
 *  &ltu:WindowContainer title="{messages.substitutionManagementWindowTitle}">
 * 	 &ltu:windowImage>
 * 	 	&ltg:Image resource="{res.substitutionEditWindowIcon}" />
 * 	 &lt/u:windowImage>
 * 	 &ltu:controllPanel>
 * 	 	...
 * 	 &ltu:contentPanel>
 * 	 	...
 * 	 &lt/u:contentPanel>
 * 	&lt/u:WindowContainer>
 * </code>
 * </pre>
 * .
 * @author Ilya Sviridov
 * 
 */
public class WindowContainer extends Composite implements HasWidgets, HasClickHandlers {
	/**
	 * UiBinder
	 */
	private static WindowContainerUiBinder uiBinder = GWT.create(WindowContainerUiBinder.class);

	/**
	 * Close button
	 */
	@UiField
	PushButton closeBtn;

	/**
	 * Window title label
	 */
	@UiField
	Label titleLbl;

	/**
	 * Buttom controll panel for buttons, so on
	 */
	@UiField
	HorizontalPanel controlPanel;

	/**
	 * Central panel for content
	 */
	@UiField
	SimplePanel contentPanel;

	/**
	 * Panel for window icom
	 */
	@UiField
	SimplePanel windowIconPanel;

	/**
	 * UIBinder
	 * @author Ilya Sviridov
	 *
	 */
	interface WindowContainerUiBinder extends UiBinder<Widget, WindowContainer> {
	}

	/**
	 * Constructor
	 */
	public WindowContainer() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	/**
	 * Adds wiget to content panel
	 */
	public void add(Widget w) {
		contentPanel.add(w);
	}
	
	/**
	 * Clears content panel
	 */
	public void clear() {
		contentPanel.clear();
	}
	
	/**
	 * Widget iterator
	 */
	public Iterator<Widget> iterator() {
		return contentPanel.iterator();
	}
	
	/**
	 * Removes widget
	 */
	public boolean remove(Widget w) {
		return contentPanel.remove(w);
	}
	
	/**
	 * controllPanel UIBinder child element
	 * @param widget widget
	 */
	@UiChild(limit = 1, tagname = "controllPanel")
	public void addControl(Widget widget) {
		controlPanel.add(widget);
	}

	/**
	 * contentPanel UIBinder child element
	 * @param widget widget
	 */
	@UiChild(limit = 1, tagname = "contentPanel")
	public void setContentPanel(Widget widget) {
		contentPanel.add(widget);
	}

	/**
	 * windowImage UIBinder child element
	 * @param widget widget
	 */
	@UiChild(limit = 1, tagname = "windowImage")
	public void setWindowImage(Image image) {
		windowIconPanel.add(image);
	}
	
	/**
	 * Sets title
	 */
	public void setTitle(String title) {
		titleLbl.setText(title);
	}
	
	/**
	 * Adds clickhandler
	 */
	public HandlerRegistration addClickHandler(ClickHandler handler) {
		return closeBtn.addClickHandler(handler);
	}
}
