package com.gwtplatform.client.core;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class ContactsView extends ViewImpl implements ContactsPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, ContactsView> {
	}

	@Inject
	public ContactsView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
