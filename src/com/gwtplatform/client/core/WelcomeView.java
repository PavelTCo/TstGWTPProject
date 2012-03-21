package com.gwtplatform.client.core;

import java.util.List;


import com.gwtplatform.client.core.MutableListHandler;
import com.gwtplatform.client.core.WelcomeView.TableStyle;
import com.gwtplatform.client.Messages;
import com.gwtplatform.client.core.WelcomeView.TableResources;
import com.gwtplatform.client.core.WindowContainer;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.ViewImpl;
import com.gwtplatform.mvp.rebind.GinjectorInspector;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.inject.client.assistedinject.GinFactoryModuleBuilder;
import com.google.gwt.resources.client.DataResource;
import com.google.gwt.resources.client.ClientBundle.Source;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.MultiSelectionModel;
import com.google.gwt.view.client.ProvidesKey;
import com.google.inject.Inject;

public class WelcomeView<T> extends ViewImpl implements WelcomePresenter.MyView {

	private final Widget widget;
	
	/**
	 * Window container {@link WindowContainer}
	 */
	@UiField
	WindowContainer windowContainer;
	
	/**
	 * Key provider
	 */
	ProvidesKey<T> keyProvider;

	/**
	 * Data provider
	 */
	ListDataProvider<T> listDataProvider = new ListDataProvider<T>();
	
	/**
	 * Selection model
	 */
	MultiSelectionModel<T> selectionModel;

	/**
	 * Data handler
	 */
	MutableListHandler<T> sortHandler;
	
	/**
	 * Messages
	 */
	private static Messages messages = GWT.create(Messages.class);

	/**
	 * Create button
	 */
	@UiField
	PushButton createButton;

	/**
	 * Update button
	 */
	@UiField
	PushButton updateButton;

	/**
	 * Delete button
	 */
	@UiField
	PushButton deleteButton;

	/**
	 * Ok button
	 */
	@UiField
	PushButton okButton;

	/**
	 * Table
	 */
	@UiField(provided = true)
	CellTable<T> table = new CellTable<T>(10000, TableResources.INSTANCE);

	/**
	 * Tab panel
	 */
	@UiField
	TabPanel tabPanel;

	public interface Binder extends UiBinder<Widget, WelcomeView> {
	}
	
	/**
	 * The resources applied to the table.
	 */
	interface TableResources extends CellTable.Resources {
		/**
		 * Resource instance
		 */
		public static TableResources INSTANCE = GWT.create(TableResources.class);

		/**
		 * CSS styles. Based on default
		 */
		@Source({ CellTable.Style.DEFAULT_CSS, "com/gwtplatform/client/SubstitutionManagementTable.css" })
		TableStyle cellTableStyle();

		/**
		 * Table header background image resource
		 */
		@Source("com/gwtplatform/client/table_heading_bg.gif")
		DataResource tableHeaderBackground();

		/**
		 * First column background image
		 * 
		 * @return
		 */
		@Source("com/gwtplatform/client/cell_bg.gif")
		DataResource firstColumnBackground();
	}
	
	/**
	 * The styles applied to the table.
	 */
	interface TableStyle extends CellTable.Style {
	}

	@Inject
	public WelcomeView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
	
	/**
	 * Puts data to view
	 * 
	 * @param items
	 */
	public void setData(List<T> items) {
		listDataProvider.setList(items);
		sortHandler.setData(listDataProvider.getList());
		table.setRowCount(items.size());
	}

	/**
	 * Wires with presenter
	 * 
	 * @param presenter
	 */
//	public void setPresenter(SubstitutionManagementView.Presenter<T> presenter) {
//		this.presenter = presenter;
//	}

	/**
	 * Create button event handler
	 * 
	 * @param event
	 */
	@UiHandler("createButton")
	void onCreateButtonClick(ClickEvent event) {
//		presenter.onCreateAction();
	
	}

	/**
	 * Update button event handler
	 * 
	 * @param event
	 */
	@UiHandler("updateButton")
	void onUpdateButtonClick(ClickEvent event) {
//		presenter.onUpdateAction();
		updateButton.setEnabled(true);
	}

	/**
	 * Delete button event handler
	 * 
	 * @param event
	 */
	@UiHandler("deleteButton")
	void onDeleteButtonClick(ClickEvent event) {
//		presenter.onDeleteAction();
	}
	
	/**
	 * Window close handler. For now do nothing real.
	 * @param event
	 */
	@UiHandler("windowContainer")
	void onWindowContainerClick(ClickEvent event) {
		Window.alert(messages.notDefined());
	}

	/**
	 * OK button handler. For now do nothing real.
	 * @param event
	 */
	@UiHandler("okButton")
	void onOkClick(ClickEvent event) {
		Window.alert(messages.notDefined());
	}
}
