package org.almansa.designpattern.gof.structural.composite.fastlookup;

public interface URLHandlerResolver {
	boolean support(String url);
	
	Object getHandlerName(String url);
}