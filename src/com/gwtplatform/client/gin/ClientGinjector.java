package com.gwtplatform.client.gin;

import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.inject.client.GinModules;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.gwtplatform.client.gin.ClientModule;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.google.inject.Provider;
import com.gwtplatform.client.core.WelcomePresenter;
import com.gwtplatform.client.core.ErrorPresenter;
import com.gwtplatform.client.core.MainPagePresenter;
import com.gwtplatform.client.core.HomePresenter;
import com.gwtplatform.client.core.ContactsPresenter;

@GinModules({ DispatchAsyncModule.class, ClientModule.class })
public interface ClientGinjector extends Ginjector {

	PlaceManager getPlaceManager();
	EventBus getEventBus();
	
	Provider<MainPagePresenter> getMainPagePresenter();
	AsyncProvider<HomePresenter> getHomePresenter();
	Provider<ErrorPresenter> getErrorPresenter();
	AsyncProvider<WelcomePresenter> getWelcomePresenter();
	AsyncProvider<ContactsPresenter> getContactsPresenter();
	
	


	
}
