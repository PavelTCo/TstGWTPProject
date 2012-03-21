package com.gwtplatform.client.place;

import com.gwtplatform.mvp.client.proxy.PlaceManagerImpl;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.client.place.DefaultPlace;
import com.google.inject.Inject;
import com.google.gwt.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.TokenFormatter;

public class TstGWTPProjectPlaceManager extends PlaceManagerImpl {

	private final PlaceRequest defaultPlaceRequest;
	private final  PlaceRequest errorPlaceRequest;

	@Inject
	public TstGWTPProjectPlaceManager(final EventBus eventBus,
			final TokenFormatter tokenFormatter,
			@DefaultPlace final String defaultPlaceNameToken,
			@ErrorPlace final String errorPlaceNameToken) {
		super(eventBus, tokenFormatter);
		this.defaultPlaceRequest = new PlaceRequest(defaultPlaceNameToken);
		this.errorPlaceRequest = new PlaceRequest (errorPlaceNameToken);
	}
	


	@Override
	public void revealDefaultPlace() {
		revealPlace(defaultPlaceRequest, false);
	}
	
	@Override
	public void revealErrorPlace(String invalidHistoryToken) {
		revealPlace(errorPlaceRequest, false);
	}
}

