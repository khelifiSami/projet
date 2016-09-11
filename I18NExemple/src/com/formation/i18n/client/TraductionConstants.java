package com.formation.i18n.client;

import com.google.gwt.i18n.client.Constants;

public interface TraductionConstants extends Constants {
 
	@DefaultStringValue("NumberDefault")
	String number();

	@DefaultStringValue("Author")
	String author();

	@DefaultStringValue("Title")
	String title();

	@DefaultStringValue("Edition")
	String edition();
	
	@DefaultStringValue("Search")
	String search();
	
	@DefaultStringValue("Type de livre")
	String type();
	
}
