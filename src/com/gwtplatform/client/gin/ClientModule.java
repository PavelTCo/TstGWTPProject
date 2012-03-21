package com.gwtplatform.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.gwtplatform.client.place.TstGWTPProjectPlaceManager;
import com.gwtplatform.client.core.WelcomePresenter;
import com.gwtplatform.client.core.WelcomeView;
import com.gwtplatform.client.place.DefaultPlace;
import com.gwtplatform.client.place.NameTokens;
import com.gwtplatform.client.core.ErrorPresenter;
import com.gwtplatform.client.core.ErrorView;
import com.gwtplatform.client.place.ErrorPlace;

import com.gwtplatform.client.core.MainPagePresenter;
import com.gwtplatform.client.core.MainPageView;
import com.gwtplatform.client.core.HomePresenter;
import com.gwtplatform.client.core.HomeView;
import com.gwtplatform.client.core.ContactsPresenter;
import com.gwtplatform.client.core.ContactsView;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		
		//Singletons
		install(new DefaultModule(TstGWTPProjectPlaceManager.class));
		
		//Constants
		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.homepage);
		bindConstant().annotatedWith(ErrorPlace.class).to(NameTokens.error);
		
		//Presenters
		bindPresenter(MainPagePresenter.class, MainPagePresenter.MyView.class,MainPageView.class, MainPagePresenter.MyProxy.class);
		bindPresenter(HomePresenter.class, HomePresenter.MyView.class,HomeView.class, HomePresenter.MyProxy.class);
		bindPresenter(WelcomePresenter.class, WelcomePresenter.MyView.class,WelcomeView.class, WelcomePresenter.MyProxy.class);
		bindPresenter(ContactsPresenter.class, ContactsPresenter.MyView.class,ContactsView.class, ContactsPresenter.MyProxy.class);
		bindPresenter(ErrorPresenter.class, ErrorPresenter.MyView.class,ErrorView.class, ErrorPresenter.MyProxy.class);
		
	//	bindPresenterWidget(MainPagePresenter.class,MainPagePresenter.MyView.class, MainMenuView.class);

		



		

		
	}
}
